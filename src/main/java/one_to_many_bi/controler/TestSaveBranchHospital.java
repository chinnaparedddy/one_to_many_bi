package one_to_many_bi.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_many_bi.Branch;
import one_to_many_bi.Hospital;

public class TestSaveBranchHospital {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch1 = new Branch();
		branch1.setName("BTM branch");
		branch1.setState("Karnataka");
		branch1.setCountry("INDIA");
		branch1.setPhone(11223366);

		Branch branch2 = new Branch();
		branch2.setName("marathahalli branch");
		branch2.setState("Karnataka");
		branch2.setCountry("INDIA");
		branch2.setPhone(11445566);

		Branch branch3 = new Branch();
		branch3.setName("KR market branch");
		branch3.setState("Karnataka");
		branch3.setCountry("INDIA");
		branch3.setPhone(11223388);
		
		Hospital hospital=new Hospital();
		hospital.setName("Manipal");
		hospital.setWebSite("www.manipal.com");
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
	}
}
