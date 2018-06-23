package org.mindstorms.infrastructure;
import java.util.ArrayList;

import org.mindstorms.domain.lumiere.*;

public class ConfigCour {


	private String id_config;
	private String nom;
	private String lumiereList;
	
	
	public ConfigCour(String id_config, String nom, String lumList) {
		
		super();
		this.id_config = id_config;
		this.nom = nom;
		this.lumiereList = lumList;
	}
	
	public String getId_config() {
		return id_config;
	}
	public void setId_config(String id_config) {
		this.id_config = id_config;
	}
	@Override
	public String toString() {
		return id_config + ";" + nom + ";" + lumiereList;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLumiereList() {
		return lumiereList;
	}
	public void setLumiereList(String lumiereList) {
		this.lumiereList = lumiereList;
	}
	
}
