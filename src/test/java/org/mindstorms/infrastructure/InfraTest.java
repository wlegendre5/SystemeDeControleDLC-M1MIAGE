package org.mindstorms.infrastructure;

import javax.xml.parsers.ParserConfigurationException;

import junit.framework.*;
import org.mindstorms.domain.lumiere.*;
import org.mindstorms.domain.user.*;

public class InfraTest 
extends TestCase
{
/**
 * Create the test case
 *
 * @param testName name of the test case
 */
public InfraTest( String testName )
{
    super( testName );
}

/**
 * @return the suite of tests being tested
 */
public static Test suite()
{
    return new TestSuite( InfraTest.class );
}

/**
 * TU-I1 : Test manipualtion temporalités dans fichier .xml persisté
 * @throws Exception 
 */
	public void testTemporalites() throws Exception { 
		XMLParser xml = new XMLParser();
		String t1 = "1";
		String t2 = "2";
		String t3 = "3";
		xml.setT1(t1);
		xml.setT2(t2);
		xml.setT3(t3);
		xml.save();
		assertEquals(xml.getT1(),"1");
		assertEquals(xml.getT2(),"2");
		assertEquals(xml.getT3(),"3");
	}
	
/**
 * TU-I2 : Test manipualtion configuration courante dans fichier .xml persisté
 * @throws Exception 
 */
	public void testConfCourante() throws Exception {
		XMLParser xml = new XMLParser();
		String id = "1";
		String nom = "name";
		String listLumiere = "list";
		ConfigCour conf = new ConfigCour(id, nom, listLumiere);
		xml.setconfCourante(conf);
		xml.save();
		ConfigCour getconf = xml.getconfCourante();
		assertEquals(getconf.getId_config(), id);
		assertEquals(getconf.getLumiereList(), listLumiere);
		assertEquals(getconf.getNom(), nom);
	}

	
/**
 * TU-I3 : Test manipualtion configuration admin dans fichier .xml persisté
 * @throws Exception 
 */
	
	public void testConfAdmin() throws Exception {
		XMLParser xml = new XMLParser();
		String id = "2";
		String nom = "name";
		String listLumiere = "list";
		String isS = "false";
		ConfigStandard conf = new ConfigStandard(id, nom, listLumiere, isS);
		xml.addconfAdmin(conf);
		xml.save();		
		ConfigStandard getconf = xml.getConfAdmin(conf);
		assertEquals(getconf.getId_config(), id);
		assertEquals(getconf.getNom(), nom);
		assertEquals(getconf.getLumiereList(), listLumiere);
		assertEquals(getconf.getIsStandard(), isS); 
		xml.deleteconfAdmin("2");
	}
	
/**
 * TU-I4 : Test manipualtion user administrateur dans fichier .xml persisté
 * @throws Exception 
 */
	
	public void testUserAdmin() throws Exception {
		XMLParser xml = new XMLParser();
		String id = "1";
		String login = "login";
		String mdp = "mdp";
		String isAdmin = "true";
		User adminTest = new User(id, login, mdp, isAdmin);
		xml.setAdmin(adminTest);
		xml.save();		
		User getUser = xml.getAdmin();
		assertEquals(getUser.getId(), id);
		assertEquals(getUser.getLogin(), login);
		assertEquals(getUser.getMDP(), mdp);
	}

	
/**
 * TU-I5 : Test manipualtion lumières dans fichier .xml persisté
 * @throws Exception 
 */
	
	public void testLumiere() throws Exception {
		XMLParser xml = new XMLParser();
		String id = "5";
		String type = "type";
		String isAllume = "false";
		String intensite = "true";
		SimulateurLum sl = new SimulateurLum(id, type, isAllume, intensite);
		xml.addLumiere(sl);
		xml.save();		
		SimulateurLum slget = xml.getLumiere("5");
		assertEquals(slget.getIsAllume(), isAllume);
		assertEquals(slget.getType(), type);
		assertEquals(slget.getIntensite(), intensite);
		xml.deleteLumiere(sl);
	}



}
