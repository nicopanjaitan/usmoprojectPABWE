package usmoPABWE.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usmoPABWE.model.Registrator;
import usmoPABWE.service.RegistratorService;

@Service
public class RegistratorDao implements RegistratorService {

	private EntityManagerFactory emf;
	
	//injetion menggunakan setter
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	//Membutuhkan injeksi EntityManagerFacory
	@Override
	public List<Registrator> listRegistrator() {
		
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Registrator", Registrator.class).getResultList();
	}
	
	@Override
	public Registrator saveOrUpdate (Registrator registrator) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Registrator saved = em.merge(registrator);
		em.getTransaction().commit();
		return saved;
	}
	
	@Override
	public void deleteRegistrator(Integer id) {
		EntityManager em  = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Registrator.class, id));
		em.getTransaction().commit();
	}
	
	@Override
	public Registrator getId(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Registrator.class, id);
	}
	
	
}