package it.prova.gestionesmartphoneapp.dao.smartphone;

import java.util.List;

import javax.persistence.EntityManager;

import it.prova.gestionesmartphoneapp.model.Smartphone;

public class SmartphoneDAOImpl implements SmartphoneDAO {

	private EntityManager entityManager;

	@Override
	public List<Smartphone> list() throws Exception {
		return entityManager.createQuery("from Smartphone", Smartphone.class).getResultList();
	}

	@Override
	public Smartphone get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Smartphone input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		input = entityManager.merge(input);
	}

	@Override
	public void insert(Smartphone input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(input);
	}

	@Override
	public void delete(Smartphone o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override

	public void deleteSmartphoneAfterDisinstallTwoApps(Long idSmartphone) throws Exception {
		entityManager.createNativeQuery("delete from smartphone_app c where c.smartphone_id = :idInput")
				.setParameter("idInput", idSmartphone).executeUpdate();
		entityManager.createNativeQuery("delete from smartphone s where s.id = :idInput ")
				.setParameter("idInput", idSmartphone).executeUpdate();

	}

	@Override
	public void updateVersioneOS(Long idSmartphone) throws Exception {
		entityManager.createNativeQuery("update smartphone a set a.versioneOS = a.versioneOS + 1 where id = ?1")
		.setParameter(1, idSmartphone).executeUpdate();
	}

}
