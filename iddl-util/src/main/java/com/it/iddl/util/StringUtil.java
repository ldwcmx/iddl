/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-util
 */
package com.it.iddl.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * @author sihai
 *
 */
public class StringUtil extends StringUtils {
	
	public static final String NL=System.getProperty("line.separator");
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String trim(String str){
		if(str!=null){
			return str.trim();
		}
		return null;
	}

	/**
	 * Determines whether or not the sting 'searchIn' contains the string
	 * 'searchFor', disregarding case and leading whitespace
	 * 
	 * @param searchIn
	 *            the string to search in
	 * @param searchFor
	 *            the string to search for
	 * 
	 * @return true if the string starts with 'searchFor' ignoring whitespace
	 */
	public static boolean startsWithIgnoreCaseAndWs(String searchIn,
			String searchFor) {
		return startsWithIgnoreCaseAndWs(searchIn, searchFor, 0);
	}

	/**
	 * Determines whether or not the sting 'searchIn' contains the string
	 * 'searchFor', disregarding case and leading whitespace
	 * 
	 * @param searchIn
	 *            the string to search in
	 * @param searchFor
	 *            the string to search for
	 * @param beginPos
	 *            where to start searching
	 * 
	 * @return true if the string starts with 'searchFor' ignoring whitespace
	 */
	public static boolean startsWithIgnoreCaseAndWs(String searchIn,
			String searchFor, int beginPos) {
		if (searchIn == null) {
			return searchFor == null;
		}

		int inLength = searchIn.length();

		for (; beginPos < inLength; beginPos++) {
			if (!Character.isWhitespace(searchIn.charAt(beginPos))) {
				break;
			}
		}

		return startsWithIgnoreCase(searchIn, beginPos, searchFor);
	}

	/**
	 * Determines whether or not the string 'searchIn' contains the string
	 * 'searchFor', dis-regarding case starting at 'startAt' Shorthand for a
	 * String.regionMatch(...)
	 * 
	 * @param searchIn
	 *            the string to search in
	 * @param startAt
	 *            the position to start at
	 * @param searchFor
	 *            the string to search for
	 * 
	 * @return whether searchIn starts with searchFor, ignoring case
	 */
	public static boolean startsWithIgnoreCase(String searchIn, int startAt,
			String searchFor) {
		return searchIn.regionMatches(true, startAt, searchFor, 0, searchFor
				.length());
	}

	/**
	 * Returns the given string, with comments removed
	 * 
	 * @param src
	 *            the source string
	 * @param stringOpens
	 *            characters which delimit the "open" of a string
	 * @param stringCloses
	 *            characters which delimit the "close" of a string, in
	 *            counterpart order to <code>stringOpens</code>
	 * @param slashStarComments
	 *            strip slash-star type "C" style comments
	 * @param slashSlashComments
	 *            strip slash-slash C++ style comments to end-of-line
	 * @param hashComments
	 *            strip #-style comments to end-of-line
	 * @param dashDashComments
	 *            strip "--" style comments to end-of-line
	 * @return the input string with all comment-delimited data removed
	 */
	public static String stripComments(String src, String stringOpens,
			String stringCloses, boolean slashStarComments,
			boolean slashSlashComments, boolean hashComments,
			boolean dashDashComments) {
		if (src == null) {
			return null;
		}

		StringBuffer buf = new StringBuffer(src.length());

		// It's just more natural to deal with this as a stream
		// when parsing..This code is currently only called when
		// parsing the kind of metadata that developers are strongly
		// recommended to cache anyways, so we're not worried
		// about the _1_ extra object allocation if it cleans
		// up the code

		StringReader sourceReader = new StringReader(src);

		int contextMarker = Character.MIN_VALUE;
		boolean escaped = false;
		int markerTypeFound = -1;

		int ind = 0;

		int currentChar = 0;

		try {
			while ((currentChar = sourceReader.read()) != -1) {

				if (false && currentChar == '\\') {
					escaped = !escaped;
				} else if (markerTypeFound != -1 && currentChar == stringCloses.charAt(markerTypeFound)
						&& !escaped) {
					contextMarker = Character.MIN_VALUE;
					markerTypeFound = -1;
				} else if ((ind = stringOpens.indexOf(currentChar)) != -1
						&& !escaped && contextMarker == Character.MIN_VALUE) {
					markerTypeFound = ind;
					contextMarker = currentChar;
				}

				if (contextMarker == Character.MIN_VALUE && currentChar == '/'
						&& (slashSlashComments || slashStarComments)) {
					currentChar = sourceReader.read();
					if (currentChar == '*' && slashStarComments) {
						int prevChar = 0;
						while ((currentChar = sourceReader.read()) != '/'
								|| prevChar != '*') {
							if (currentChar == '\r') {

								currentChar = sourceReader.read();
								if (currentChar == '\n') {
									currentChar = sourceReader.read();
								}
							} else {
								if (currentChar == '\n') {

									currentChar = sourceReader.read();
								}
							}
							if (currentChar < 0)
								break;
							prevChar = currentChar;
						}
						continue;
					} else if (currentChar == '/' && slashSlashComments) {
						while ((currentChar = sourceReader.read()) != '\n'
								&& currentChar != '\r' && currentChar >= 0)
							;
					}
				} else if (contextMarker == Character.MIN_VALUE
						&& currentChar == '#' && hashComments) {
					// Slurp up everything until the newline
					while ((currentChar = sourceReader.read()) != '\n'
							&& currentChar != '\r' && currentChar >= 0)
						;
				} else if (contextMarker == Character.MIN_VALUE
						&& currentChar == '-' && dashDashComments) {
					currentChar = sourceReader.read();

					if (currentChar == -1 || currentChar != '-') {
						buf.append('-');

						if (currentChar != -1) {
							buf.append(currentChar);
						}

						continue;
					}

					// Slurp up everything until the newline

					while ((currentChar = sourceReader.read()) != '\n'
							&& currentChar != '\r' && currentChar >= 0)
						;
				}

				if (currentChar != -1) {
					buf.append((char) currentChar);
				}
			}
		} catch (IOException ioEx) {
			// we'll never see this from a StringReader
		}

		return buf.toString();
	}

	/**
	 *
	 * @param s
	 * @param suffix
	 * @return
	 */
	public static boolean endsWithIgnoreCase(String s, String suffix) {
		return s.regionMatches(true, s.length() - suffix.length(), suffix, 0, suffix.length());
	}

	/**
	 * 
	 * @param s
	 * @param oldPattern
	 * @param newPattern
	 * @return
	 */
	public static String replaceIgnoreCase(String s, String oldPattern, String newPattern) {
		return Pattern.compile(oldPattern, Pattern.CASE_INSENSITIVE).matcher(s).replaceAll(newPattern);
	}
	
	
	/**
	 * 获得第一个start，end之间的字串， 不包括start，end本身。返回值已做了trim
	 * @param sql
	 * @param start
	 * @param end
	 * @return
	 */
	public static String getBetween(String sql, String start, String end) {
		int index0 = sql.indexOf(start);
		if (index0 == -1) {
			return null;
		}
		int index1 = sql.indexOf(end, index0);
		if (index1 == -1) {
			return null;
		}
		return sql.substring(index0 + start.length(), index1).trim();
	}
	
	
	/**
	 * 只做一次切分
	 * @param str
	 * @param splitor
	 * @return
	 */
	public static String[] twoPartSplit(String str, String splitor) {
		if (splitor != null) {
			int index = str.indexOf(splitor);
			if(index!=-1){
			    String first = str.substring(0, index);
			    String sec = str.substring(index + splitor.length());
		        return new String[]{first,sec};
			}else{
				return new String[] { str };
			}
		} else {
			return new String[] { str };
		}
	}
	
	/**
	 * 
	 * @param str
	 * @param splitor
	 * @return
	 */
	public static List<String> split2List(String str, String splitor){
		List<String> re=new ArrayList<String>();
		String[] strs=twoPartSplit(str,splitor);
		if(strs.length==2){
			re.add(strs[0]);
			re.addAll(split2List(strs[1],splitor));
		}else{
			re.add(strs[0]);
		}
		return re;
	}
	
	/**
	 * 去除第一个start,end之间的字符串，包括start,end本身
	 * 
	 * @param sql
	 * @param start
	 * @param end
	 * @return
	 */
	public static String removeBetweenWithSplitor(String sql, String start,
			String end) {
		int index0 = sql.indexOf(start);
		if (index0 == -1) {
			return sql;
		}
		int index1 = sql.indexOf(end, index0);
		if (index1 == -1) {
			return sql;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(sql.substring(0, index0));
		sb.append(" ");
		sb.append(sql.substring(index1 + end.length()));
		return sb.toString();
	}

	/**
	 * 将所有/t/s/n等空白符全部替换为空格，并且去除多余空白 各种不同实现的比较测试，参见：TStringUtilTest
	 */
	public static String fillTabWithSpace(String str) {
		if (str == null) {
			return null;
		}

		str = str.trim();
		int sz = str.length();
		StringBuilder buffer = new StringBuilder(sz);

		int index = 0, index0 = -1, index1 = -1;
		for (int i = 0; i < sz; i++) {
			char c = str.charAt(i);
			if (!Character.isWhitespace(c)) {
				if (index0 != -1) {
					// if (!(index0 == index1 && str.charAt(i - 1) == ' ')) {
					if (index0 != index1 || str.charAt(i - 1) != ' ') {
						buffer.append(str.substring(index, index0)).append(" ");
						index = index1 + 1;
					}
				}
				index0 = index1 = -1;
			} else {
				if (index0 == -1) {
					index0 = index1 = i; // 第一个空白
				} else {
					index1 = i;
				}
			}
		}

		buffer.append(str.substring(index));

		return buffer.toString();
	}
	
	
	
	public static final String DEFAULT_ENCODE = "utf-8";

	public static final String EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	public static Pattern EMAIL_REGEX = Pattern.compile(EMAIL);

	public static final String PHONE = "^(13[4,5,6,7,8,9]|15[0,8,9,1,7]|188|187)\\d{8}$";
	public static Pattern PHONE_REGEX = Pattern.compile(PHONE);

	// Length
	// -----------------------------------------------------------------------
	public static final int length(String str, String encode)
	{
		if (isEmpty(str))
		{
			return 0;
		}

		try
		{
			return str.getBytes(encode).length;
		}
		catch (UnsupportedEncodingException e)
		{
			throw new RuntimeException(e);
		}
	}

	public static final int length(String str)
	{
		return length(str, DEFAULT_ENCODE);
	}

	// Email
	// -----------------------------------------------------------------------
	public static final boolean isEmail(String str)
	{
		if (isBlank(str))
		{
			return false;
		}
		
		return EMAIL_REGEX.matcher(str).matches();
	}

	// 二行制转字符串
	public static final String byte2Hex(byte[] b)
	{
		StringBuilder hs = new StringBuilder();
		String stmp = "";
		for (int n = 0; n < b.length; n++)
		{
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
			{
				hs.append("0").append(stmp);
			}
			else
			{
				hs.append(stmp);
			}
		}
		return hs.toString().toUpperCase();
	}
	
	public static final String formatTitle(String title, int maxLength)
	{
		return String.format("%s %s", substring(title, 0, maxLength), length(title) > maxLength ? "......" : "");
	}
	
	public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }

        return str.toUpperCase();
    }
	
	public static String toLowerCase(String str) {
        if (str == null) {
            return null;
        }

        return str.toLowerCase();
    }
}
