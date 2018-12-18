package usmoPABWE.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usmoPABWE.model.Question;
import usmoPABWE.service.QuestionService;

@Service
public class QuestionDao implements QuestionService {

	private EntityManagerFactory emf;
	
	//injetion menggunakan setter
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	//Membutuhkan injeksi EntityManagerFacory
	@Override
	public List<Question> listQuestion() {
		
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Question", Question.class).getResultList();
	}
	
	@Override
	public Question saveOrUpdate (Question question) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Question saved = em.merge(question);
		em.getTransaction().commit();
		return saved;
	}
	
	@Override
	public void deleteQuestion(Integer id) {
		EntityManager em  = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Question.class, id));
		em.getTransaction().commit();
	}
	
	@Override
	public Question getId(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Question.class, id);
	}
	
	
}