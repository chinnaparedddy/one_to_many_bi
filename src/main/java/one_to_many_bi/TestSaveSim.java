package one_to_many_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveSim {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = new Mobile();
		mobile.setName("Vivo");
		mobile.setCost(25874);

		Sim sim =new Sim();
		sim.setProvider("Airtel");
		sim.setType("5g");
		sim.setMobile(mobile);
		
		Sim sim1 =new Sim();
		sim1.setProvider("Airtel");
		sim1.setType("5g");
		sim1.setMobile(mobile);
		
		Sim sim2 =new Sim();
		sim2.setProvider("Airtel");
		sim2.setType("5g");
		sim2.setMobile(mobile);
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
	}
}
