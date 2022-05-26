package one_to_many_bi.controler;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_many_bi.Mobile;

public class TestDeleteMobile {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile=entityManager.find(Mobile.class,1);
		if(mobile!=null) {
			entityTransaction.begin();
			entityManager.remove(mobile);
			entityTransaction.commit();
		}else {
			System.out.println("no mobile found with given id");
		}
	}
}

