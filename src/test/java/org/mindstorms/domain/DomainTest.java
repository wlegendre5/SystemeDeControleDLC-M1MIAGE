package org.mindstorms.domain;

import org.mindstorms.domain.lumiere.SimulateurLum;
import org.mindstorms.infrastructure.XMLParser;

import junit.framework.TestCase;

public class DomainTest extends TestCase {

	
/**
 * TU-D1 : Test create simulateur de lumiere de test pour TU-D2, TU-D3 et TU-D4
 * @throws Exception 
 */
	public void testCreateTestLum() throws Exception { 
		XMLParser xml = new XMLParser();
		String id = "9";
		String type = "test";
		String isAllume = "false";
		String intensite = "0";
		SimulateurLum sl = new SimulateurLum(id, type, isAllume, intensite);
		xml.addLumiere(sl);
		xml.save();	
		assertTrue( true );
	}	
	
/**
 * TU-D2 : Test allumage lumiere
 * @throws Exception 
 */
	public void testAllumerLumiere() throws Exception { 
		XMLParser xml = new XMLParser();
		SimulateurLum sl = xml.getLumiere("9");
		sl.allumer();
		assert(sl.getIsAllume() == "true");
	}
	
/**
 * TU-D3 : Test changement intensite lumiere
 * @throws Exception 
 */
	public void testChangIntLumiere() throws Exception {
		XMLParser xml = new XMLParser();
		SimulateurLum sl = xml.getLumiere("9");
		String intens = "8";
		sl.setIntensite(intens);
		assert(sl.getIntensite() == "8");
	}

/**
 * TU-D4 : Test extinction lumiere
 * @throws Exception 
 */
	public void testEteindreLumiere() throws Exception {
		XMLParser xml = new XMLParser();
		SimulateurLum sl = xml.getLumiere("9");
		sl.eteindre();
		assert(sl.getIsAllume() == "false");
	}
	
	
	
	
}

