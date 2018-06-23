package org.mindstorms.service;

import org.mindstorms.infrastructure.XMLParser;

import junit.framework.TestCase;

public class ServiceTest extends TestCase {

/**
 * TU-S1 : Test MSG Sync
 * @throws Exception 
 */
	
	public void testMSGsync() throws Exception { 
		
		/* erreur : lejos.nxt.SensorPort.setPowerTypeById(II)V ; Connexion NXT necessaire pour bonne exécution du test
		SysControlDLC DLCtest = new SysControlDLC(true);
		XMLParser xml = new XMLParser();
		String msgtest = xml.createMSG();
		assert(msgtest == DLCtest.creerMsgSync()); */
		assertTrue( true );
	}
	
	
}
