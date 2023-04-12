package it.prova.gestionesmartphoneapp.test;

import antlr.collections.List;
import it.prova.gestionesmartphoneapp.dao.EntityManagerUtil;
import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.Smartphone;
import it.prova.gestionesmartphoneapp.service.AppService;
import it.prova.gestionesmartphoneapp.service.MyServiceFactory;
import it.prova.gestionesmartphoneapp.service.SmartphoneService;
import java.time.LocalDate;


public class TestGestionesmartphoneapp {

	public static void main(String[] args) {

		SmartphoneService smartphoneServiceInstance = MyServiceFactory.getSmartphoneServiceInstance();
		AppService appServiceInstance = MyServiceFactory.getAppServiceInstance();
		
		
		 
		try {
			
			
//			System.out.println("nella tabella Smartphone sono presenti " +smartphoneServiceInstance.listAllSmartphone().size() + " elementi." );
//			testInserisciNuovo(smartphoneServiceInstance);
//			System.out.println("nella tabella Smartphone sono presenti " +smartphoneServiceInstance.listAllSmartphone().size() + " elementi." );
//			
//			testAggiorna(smartphoneServiceInstance);
//			System.out.println("nella tabella Smartphone sono presenti " +smartphoneServiceInstance.listAllSmartphone().size() + " elementi." );

//			testInserisciNuovaApp(appServiceInstance);
//			System.out.println("nella tabella App sono presenti " + appServiceInstance.listAllApps().size() + " elementi." );
			
			
		//	testInserimentoNuovoSmartphone(smartphoneServiceInstance);
			
		//	testInserisciNuovaApp(appServiceInstance);
			
			
			
			
			
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
		
		Smartphone smartphoneDaInserire = new Smartphone("Samsung","13",134,3);
		smartphoneServiceInstance.inserisciNuovo(smartphoneDaInserire);
		if (smartphoneDaInserire.getId() == null)
			throw new RuntimeException("testInserimentoNuovoBrano fallito ");

		System.out.println(".......testInserimentoNuovoBrano fine: PASSED.............");
	}
	
	private static void testInserisciNuovaApp(AppService appServiceInstance) throws Exception {
		System.out.println(".......testInserisciNuovaApp inizio.............");

		App appInstance = new App("Instagram", LocalDate.of(2023, 01, 01), LocalDate.of(2023, 4, 12), 14);
		appServiceInstance.inserisciNuovo(appInstance);
		if (appInstance.getId() == null)
			throw new RuntimeException("testInserisciNuovaApp fallito ");

		System.out.println(".......testInserisciNuovaApp fine.............");
	}
	
	
}
