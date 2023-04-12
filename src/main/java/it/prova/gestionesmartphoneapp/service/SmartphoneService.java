package it.prova.gestionesmartphoneapp.service;

import java.util.List;

import it.prova.gestionesmartphoneapp.dao.smartphone.SmartphoneDAO;
import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.Smartphone;

public interface SmartphoneService {

	void setSmartphoneDAO(SmartphoneDAO smartphoneDAOInstance);

	
	
	public List<Smartphone> listAllSmartphone() throws Exception;
	
	public Smartphone caricaSingoloElemento(Long id) throws Exception;
	
	public void aggiorna(Smartphone smartphoneInstance) throws Exception;
	
	public void inserisciNuovo(Smartphone smartphoneInstance) throws Exception;
	
	public void rimuovi(Long idSmartphone) throws Exception;
	
	public void aggiungiApp (Smartphone smartphoneEsistente, App appInstance) throws Exception;
	
	public Smartphone caricaSmartphoneSingoloConApps(Long id) throws Exception;
	
	public void rimuoviAppDaSmartphone(Long idSmartphone, Long idApp) throws Exception;
	
	public void rimozioneSmartphoneConDueApp(Long idSmartphone) throws Exception;
	
	public void aggiornaVersioneOS(Long idSmartphone) throws Exception;
	
	
}
