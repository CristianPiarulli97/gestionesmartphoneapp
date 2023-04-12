package it.prova.gestionesmartphoneapp.dao.app;

import it.prova.gestionesmartphoneapp.dao.IBaseDAO;
import it.prova.gestionesmartphoneapp.model.App;

public interface AppDAO extends IBaseDAO<App> {

	void updateVersioneEDataAggiornamento(Long idApp) throws Exception;
	
	public App findByNome(String nome) throws Exception;
	
}
