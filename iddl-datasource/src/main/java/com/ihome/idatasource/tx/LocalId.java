/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.ihome.idatasource.tx;

/**
 *  LocalId is a wrapper for a long value that identifies a transaction within 
 *  a JBoss server. This implementation is immutable and serializable at 
 *  runtime.
 *
 *  @author <a href="reverbel@ime.usp.br">Francisco Reverbel</a>
 *  @version $Revision: 57208 $
 */
public class LocalId
   implements java.io.Externalizable
{
   static final long serialVersionUID = 2076780468014328911L;
   /**
    *  Long value that identifies a transaction within a JBoss server.
    *  This is really a sequence number generated by the XidFactory.
    */
   private long value;


   // Static --------------------------------------------------------

   public static void toByteArray(long localIdValue, byte[] dst, int dstBegin)
   {
      dst[dstBegin + 0] = (byte)(0xff & (localIdValue >>> 56));
      dst[dstBegin + 1] = (byte)(0xff & (localIdValue >>> 48));
      dst[dstBegin + 2] = (byte)(0xff & (localIdValue >>> 40));
      dst[dstBegin + 3] = (byte)(0xff & (localIdValue >>> 32));
      dst[dstBegin + 4] = (byte)(0xff & (localIdValue >>> 24));
      dst[dstBegin + 5] = (byte)(0xff & (localIdValue >>> 16));
      dst[dstBegin + 6] = (byte)(0xff & (localIdValue >>>  8));
      dst[dstBegin + 7] = (byte)(0xff & (localIdValue >>>  0));
   }

   public static long fromByteArray(byte[] src, int srcBegin) 
   {
      return ((long)(src[srcBegin + 0] & 0xff) << 56)
	 | ((long)(src[srcBegin + 1] & 0xff) << 48)
	 | ((long)(src[srcBegin + 2] & 0xff) << 40)
	 | ((long)(src[srcBegin + 3] & 0xff) << 32)
	 | ((long)(src[srcBegin + 4] & 0xff) << 24)
	 | ((long)(src[srcBegin + 5] & 0xff) << 16)
	 | ((long)(src[srcBegin + 6] & 0xff) << 8)
	 | ((long)(src[srcBegin + 7] & 0xff));
   }

   // Constructors --------------------------------------------------

   /**
    * No-arg constructor for Externalizable support.
    */
   public LocalId()
   {
   }
   
   /**
    *  Create a new instance. This constructor is public <em>only</em>
    *  to get around a class loader problem; it should be package-private.
    */
   public LocalId(long value)
   {
      this.value = value;
   }

   public LocalId(XidImpl xid)
   {
      this(xid.getLocalIdValue());
   }

   // Public --------------------------------------------------------

   public long getValue()
   {
      return value;
   }

   /**
    *  Compare for equality.
    */
   public boolean equals(Object obj)
   {
      return (obj instanceof LocalId) ? (value == ((LocalId)obj).value) 
                                      : false;
   }

   public int hashCode()
   {
      return (int)value;
   }
   
   // Externalizable implementation ---------------------------------
   public void writeExternal(java.io.ObjectOutput out)
      throws java.io.IOException
   {
      out.writeLong(value);
   }
   
   public void readExternal(java.io.ObjectInput in)
      throws java.io.IOException, ClassNotFoundException
   {
      value = in.readLong();
   }

}

