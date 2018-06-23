package org.mindstorms.utils;

import junit.framework.TestCase;

public class UtilsTest extends TestCase {

/**
 * TU-U1 : Test instance minuteur
 * @throws Exception 
 */
	public void testMinuteur() throws Exception { 
		Minuteur min = new Minuteur();
		assert(min.now() == System.currentTimeMillis());
	}
}
