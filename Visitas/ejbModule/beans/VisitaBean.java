package beans;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Visita;

@Stateful
public class VisitaBean {

	@PersistenceContext(unitName = "EntityManager")
	private EntityManager em;
	private int visitas = 0;
	
	public void add() {
		visitas++;
		Visita v = new Visita();
		v.setDate(new Date());
		em.persist(v);
	}
	
	public Date getLast() {
		List<Visita> vs = em.createQuery("from Visita").getResultList();
		
		if (visitas == 0) {
			return null;
		}
		
		return vs.get(visitas - 1).getDate();
	}
	
}
