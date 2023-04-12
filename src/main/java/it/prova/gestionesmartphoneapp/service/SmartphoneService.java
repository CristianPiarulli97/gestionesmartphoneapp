package it.prova.gestionesmartphoneapp.service;

import it.prova.gestionesmartphoneapp.dao.smartphone.SmartphoneDAO;
import it.prova.gestionesmartphoneapp.model.Smartphone;

public interface SmartphoneService {

	void setSmartphoneDAO(SmartphoneDAO smartphoneDAOInstance);

	public void inserisciNuovo(Smartphone smartphoneInstance) throws Exception ;
	
}
