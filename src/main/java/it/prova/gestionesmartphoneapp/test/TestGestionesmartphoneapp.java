package it.prova.gestionesmartphoneapp.test;

import it.prova.gestionesmartphoneapp.dao.EntityManagerUtil;
import it.prova.gestionesmartphoneapp.model.Smartphone;
import it.prova.gestionesmartphoneapp.service.AppService;
import it.prova.gestionesmartphoneapp.service.MyServiceFactory;
import it.prova.gestionesmartphoneapp.service.SmartphoneService;

public class TestGestionesmartphoneapp {

	public static void main(String[] args) {

		SmartphoneService smartphoneServiceInstance = MyServiceFactory.getSmartphoneServiceInstance();
		AppService appServiceInstance = MyServiceFactory.getAppServiceInstance();
		
		try {
			
			
			
			
			testInserimentoNuovoSmartphone(smartphoneServiceInstance);
			
			
			
			
			
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			// questa è necessaria per chiudere tutte le connessioni quindi rilasciare il
			// main
			EntityManagerUtil.shutdown();
		}

	
	}

	private static void testInserimentoNuovoSmartphone(SmartphoneService smartphoneServiceInstance) throws Exception {
		System.out.println(".......testInserimentoNuovoBrano inizio.............");

		Smartphone smartphoneDaInserire = new Smartphone("Apple","XS",120,2);
		smartphoneServiceInstance.inserisciNuovo(smartphoneDaInserire);
		if (smartphoneDaInserire.getId() == null)
			throw new RuntimeException("testInserimentoNuovoBrano fallito ");

		System.out.println(".......testInserimentoNuovoBrano fine: PASSED.............");
	}
	
}
