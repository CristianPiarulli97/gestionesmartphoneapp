package it.prova.gestionesmartphoneapp.service;

import java.util.List;

import javax.persistence.EntityManager;

import it.prova.gestionesmartphoneapp.dao.EntityManagerUtil;
import it.prova.gestionesmartphoneapp.dao.app.AppDAO;
import it.prova.gestionesmartphoneapp.dao.smartphone.SmartphoneDAO;
import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.Smartphone;

public class SmartphoneServiceImpl implements SmartphoneService {

	private SmartphoneDAO smartphoneDAO;
	private AppDAO appDAO;
	
	@Override
	public void setSmartphoneDAO(SmartphoneDAO smartphoneDAO) {
			this.smartphoneDAO=smartphoneDAO;		
	}		
	
	public void setAppDAO(AppDAO appDAO) {
		this.appDAO = appDAO;

	}

	
	public void inserisciNuovo(Smartphone smartphoneInstance) throws Exception {
		// questo è come una connection
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			// questo è come il MyConnection.getConnection()
			entityManager.getTransaction().begin();

			// uso l'injection per il dao
			smartphoneDAO.setEntityManager(entityManager);

			// eseguo quello che realmente devo fare
			smartphoneDAO.insert(smartphoneInstance);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}
	}


	@Override
	public List<Smartphone> listAllSmartphone() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Smartphone caricaSingoloElemento(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void aggiorna(Smartphone smartphoneInstance) throws Exception {
		
			// questo è come una connection
			EntityManager entityManager = EntityManagerUtil.getEntityManager();

			try {
				// questo è come il MyConnection.getConnection()
				entityManager.getTransaction().begin();

				// uso l'injection per il dao
				smartphoneDAO.setEntityManager(entityManager);

				// eseguo quello che realmente devo fare
				smartphoneDAO.update(smartphoneInstance);

				entityManager.getTransaction().commit();
			} catch (Exception e) {
				entityManager.getTransaction().rollback();
				e.printStackTrace();
				throw e;
			} finally {
				EntityManagerUtil.closeEntityManager(entityManager);
			}
		
	}


	@Override
	public void rimuovi(Long idSmartphone) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void aggiungiApp(Smartphone smartphoneEsistente, App appInstance) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Smartphone caricaSmartphoneSingoloConApps(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void rimuoviAppDaSmartphone(Long idSmartphone, Long idApp) throws Exception {
		
			EntityManager entityManager = EntityManagerUtil.getEntityManager();
			try {
				entityManager.getTransaction().begin();

				// injection
				smartphoneDAO.setEntityManager(entityManager);

				smartphoneDAO.deleteSmartphoneAfterDisinstallTwoApps(idSmartphone);

				entityManager.getTransaction().commit();
			} catch (Exception e) {
				entityManager.getTransaction().rollback();
				e.printStackTrace();
				throw e;
			} finally {
				EntityManagerUtil.closeEntityManager(entityManager);
			}		
	}


	@Override
	public void rimozioneSmartphoneConDueApp(Long idSmartphone) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void aggiornaVersioneOS(Long idSmartphone) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}


