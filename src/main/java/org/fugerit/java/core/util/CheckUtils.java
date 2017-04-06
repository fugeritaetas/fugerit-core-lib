package org.fugerit.java.core.util;

/*
 * 
 *
 * @author Morozko
 *
 */
public class CheckUtils {

	public static final boolean isTrue( Object obj ) {
		String value = String.valueOf( obj );
		return "1".equalsIgnoreCase( value ) || "true".equalsIgnoreCase( value );
	}
	
	public static final boolean isEmpty( String s ) {
		return s == null || s.trim().length() == 0;
	}
	
	
}
