package org.mindstorms.domain.lumiere;

public class SimulateurLum {

	private String id;
	private String type;
	private String isAllume;
	private String intensite;
	
	
	public SimulateurLum(String i, String t, String isA, String inten) {
		this.id = i;
		this.type = t;
		this.isAllume = isA;
		this.intensite = inten;
	}
	
	@Override
	public String toString() {
		return id + ";" + type + ";" + isAllume + ";" + intensite;
	}

	public String getId() {
		return id;
	}
	public void setId(String i) {
		this.id = i;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String t) {
		this.type = t;
	}
	public String getIsAllume() {
		return isAllume;
	}
	
	public void setIsAllume(String isA) {
		this.isAllume = isA;
	}
	
	public String getIntensite() {
		return intensite;
	}
	
	public void setIntensite(String i) {
		this.intensite = i;
	}
	
	public void allumer() {
		this.isAllume = "true";		
	}
	
	public void eteindre() {
		this.isAllume = "false";		
	}
}
