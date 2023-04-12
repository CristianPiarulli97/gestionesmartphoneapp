package it.prova.gestionesmartphoneapp.dao.smartphone;

import it.prova.gestionesmartphoneapp.dao.IBaseDAO;
import it.prova.gestionesmartphoneapp.model.Smartphone;

public interface SmartphoneDAO extends IBaseDAO<Smartphone>{

	public void deleteSmartphoneAfterDisinstallTwoApps(Long idSmartphone) throws Exception;
	
	public void updateVersioneOS(Long idSmartphone) throws Exception;
	
	

}
