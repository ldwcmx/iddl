/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.pipeline.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iacrqq.util.StringUtil;
import com.it.iddl.common.pipeline.DataBus;
import com.it.iddl.common.pipeline.Handler;
import com.it.iddl.common.pipeline.HandlerContext;
import com.it.iddl.common.pipeline.Pipeline;

/**
 * 默认的管线
 * @author sihai
 *
 */
public class DefaultPipeline implements Pipeline {

	private Log logger = LogFactory.getLog(DefaultPipeline.class);
	
	private volatile DefaultHandlerContext head;
	private volatile DefaultHandlerContext tail;
	private final Map<String, DefaultHandlerContext> name2ctx = new HashMap<String, DefaultHandlerContext>(4);
	private final Object _name2ctx_lock_ = new Object();
	
	@Override
	public void addAfter(String baseName, String name, Handler handler) {
		synchronized(_name2ctx_lock_) {
			validateName(name);
			DefaultHandlerContext baseCtx = name2ctx.get(baseName);
			if(null == baseCtx) {
				throw new IllegalArgumentException(String.format("Can not found HandlerContext for name:%s", baseName));
			}
			
			if(baseCtx == tail) {
				addTail(name, handler);
			} else {
				DefaultHandlerContext ctx = new DefaultHandlerContext(baseCtx, baseCtx.next, name, handler);
				baseCtx.next.prev = ctx;
				baseCtx.next = ctx;
				name2ctx.put(name, ctx);
			}
		}
	}

	@Override
	public void addBefore(String baseName, String name, Handler handler) {
		synchronized(_name2ctx_lock_) {
			validateName(name);
			DefaultHandlerContext baseCtx = name2ctx.get(baseName);
			if(null == baseCtx) {
				throw new IllegalArgumentException(String.format("Can not found HandlerContext for name:%s", baseName));
			}
			
			if(baseCtx == head) {
				addHead(name, handler);
			} else {
				DefaultHandlerContext ctx = new DefaultHandlerContext(baseCtx.prev, baseCtx, name, handler);
				baseCtx.prev.next = ctx;
				baseCtx.prev = ctx;
				name2ctx.put(name, ctx);
			}
		}
	}

	@Override
	public void addHead(String name, Handler handler) {
		synchronized(_name2ctx_lock_) {
			validateName(name);
			DefaultHandlerContext ctx = new DefaultHandlerContext(null == head ? null : head.prev, head, name, handler);
			if(null != head) {
				head.prev = ctx;
			}
			name2ctx.put(name, ctx);
			head = ctx;
		}
	}

	@Override
	public void addTail(String name, Handler handler) {
		synchronized(_name2ctx_lock_) {
			validateName(name);
			DefaultHandlerContext ctx = new DefaultHandlerContext(tail, null, name, handler);
			if(null != tail) {
				tail.next = ctx;
			}
			name2ctx.put(name, ctx);
			tail = ctx;
		}
	}

	@Override
	public Handler get(String name) {
		synchronized(_name2ctx_lock_) {
			DefaultHandlerContext ctx = name2ctx.get(name);
			return null == ctx ? null : ctx.handler;
		}
	}

	@Override
	public HandlerContext getContext(Handler handler) {
		
		if(null == handler) {
			throw new IllegalArgumentException("Parameter handler must not be null");
		}
		synchronized(_name2ctx_lock_) {
			if(name2ctx.isEmpty()) {
				return null;
			}
			DefaultHandlerContext ctx = head;
			while(null != ctx) {
				if(ctx.getHandler() == handler) {
					return ctx;
				}
				ctx = ctx.next;
			}
			
			return null;
		}
	}

	@Override
	public HandlerContext getContext(String name) {
		
		if(StringUtil.isBlank(name)) {
			throw new IllegalArgumentException("Parameter name must not be blank");
		}
		synchronized(_name2ctx_lock_) {
			return name2ctx.get(name);
		}
	}

	@Override
	public HandlerContext getContext(Class<? extends Handler> handlerType) {
		if(null == handlerType) {
			throw new IllegalArgumentException("Parameter handlerType must not be null");
		}
		synchronized(_name2ctx_lock_) {
			if(name2ctx.isEmpty()) {
				return null;
			}
			
			DefaultHandlerContext ctx = head;
			while(null != ctx) {
				if(handlerType.isAssignableFrom(ctx.getHandler().getClass())) {
					return ctx;
				}
				ctx = ctx.next;
			}
			
			return null;
		}
	}

	@Override
	public Handler getHead() {
		synchronized(_name2ctx_lock_) {
			return null == head ? null : head.getHandler();
		}
	}

	@Override
	public Handler getTail() {
		synchronized(_name2ctx_lock_) {
			return null == tail ? null : tail.getHandler();
		}
	}

	@Override
	public void remove(Handler handler) {
		synchronized(_name2ctx_lock_) {
			remove((DefaultHandlerContext)getContext(handler));
		}
	}

	@Override
	public Handler remove(String name) {
		synchronized(_name2ctx_lock_) {
			DefaultHandlerContext ctx = (DefaultHandlerContext)getContext(name);
			if(ctx == null) {
				return null;
			}
			remove(ctx);
			return ctx.getHandler();
		}
	}

	@Override
	public <T extends Handler> T remove(Class<T> handlerType) {
		synchronized(_name2ctx_lock_) {
			DefaultHandlerContext ctx = (DefaultHandlerContext)getContext(handlerType);
			if(ctx == null) {
				return null;
			}
			remove(ctx);
			return (T)ctx.getHandler();
		}
	}

	@Override
	public Handler removeHead() {
		synchronized(_name2ctx_lock_) {
			DefaultHandlerContext ctx = head;
			if(ctx == null) {
				return null;
			}
			remove(ctx);
			return ctx.getHandler();
		}
	}

	@Override
	public Handler removeTail() {
		synchronized(_name2ctx_lock_) {
			DefaultHandlerContext ctx = tail;
			if(ctx == null) {
				return null;
			}
			remove(ctx);
			return ctx.getHandler();
		}
	}

	@Override
	public void replace(Handler oldHandler, String newName, Handler newHandler) {
		synchronized(_name2ctx_lock_) {
			DefaultHandlerContext oldCtx = (DefaultHandlerContext)getContext(oldHandler);
			DefaultHandlerContext prev = oldCtx.prev;
			remove(oldCtx);
			if(prev == null) {
				addHead(newName, newHandler);
			} else {
				addAfter(prev.getName(), newName, newHandler);
			}
		}
	}

	@Override
	public Handler replace(String oldName, String newName, Handler newHandler) {
		synchronized(_name2ctx_lock_) {
			DefaultHandlerContext oldCtx = (DefaultHandlerContext)getContext(newName);
			DefaultHandlerContext prev = oldCtx.prev;
			remove(oldCtx);
			if(prev == null) {
				addHead(newName, newHandler);
			} else {
				addAfter(prev.getName(), newName, newHandler);
			}
			return oldCtx.getHandler();
		}
	}

	@Override
	public <T extends Handler> T replace(Class<T> oldHandlerType,
			String newName, Handler newHandler) {
		synchronized(_name2ctx_lock_) {
			DefaultHandlerContext oldCtx = (DefaultHandlerContext)getContext(oldHandlerType);
			DefaultHandlerContext prev = oldCtx.prev;
			remove(oldCtx);
			if(prev == null) {
				addHead(newName, newHandler);
			} else {
				addAfter(prev.getName(), newName, newHandler);
			}
			return (T)oldCtx.getHandler();
		}
	}

	@Override
	public void startFlow(DataBus dataBus) throws SQLException {
		synchronized(_name2ctx_lock_) {
			if(null == head){
				logger.warn("The pipeline contains no handlers" );
				return;
			}
			
			head.handleDown(head, dataBus);
		}
	}
	
	/**
	 * 校验handler的name,请持有_name2ctx_lock_锁
	 * @param name
	 */
	private void validateName(String name) {
		
		if(StringUtil.isBlank(name)) {
			throw new IllegalArgumentException("Name for Handler must not be null");
		}
		
		if(name2ctx.containsKey(name)) {
			throw new IllegalArgumentException("Name for Handler must not be duplicated");
		}
	}
	
	/**
	 * 移除节点,请持有_name2ctx_lock_锁
	 * @param ctx
	 */
	private void remove(DefaultHandlerContext ctx) {
		if(null == ctx) {
			return;
		}
		
		if(ctx == head) {
			head = head.next;
		} else if(ctx == tail) {
			tail = tail.prev;
		} else {
			ctx.next.prev = ctx.prev;
			ctx.prev.next = ctx.next;
		}
		name2ctx.remove(ctx.getName());
	}

	/**
	 * 默认的处理器上下文，主要的执行动作在此处流转
	 * @author sihai
	 *
	 */
	private class DefaultHandlerContext implements HandlerContext {
		
		volatile DefaultHandlerContext prev;
		volatile DefaultHandlerContext next;
		private final String name;
		private final Handler handler;
		
		public DefaultHandlerContext(DefaultHandlerContext prev, DefaultHandlerContext next, String name, Handler handler) {
			this.prev = prev;
			this.next = next;
			this.name = name;
			this.handler = handler;
		}
		
		@Override
		public void flowNext(DataBus dataBus) throws SQLException {
			DefaultHandlerContext realNext = next;
            if(null == realNext){
            	return;
            }
        
            handleDown(realNext, dataBus);
		}
		
		public void handleDown(DefaultHandlerContext realNext, DataBus dataBus) throws SQLException{
			realNext.getHandler().handleDown(dataBus);
            realNext.flowNext(dataBus);
		}

		@Override
		public Handler getHandler() {
			return handler;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public Pipeline getPipeLine() {
			return DefaultPipeline.this;
		}
	}
}
