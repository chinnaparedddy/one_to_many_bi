package one_to_many_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospetalAndBranch {
	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		
		hospital.setName("Savera");
		hospital.setWebSite("www.kimsh.com");
		
		Branch branch=new Branch();
		branch.setName("save1");
		branch.setAddress("Anantapur highway");
		branch.setHospital(hospital);
		Branch branch1=new Branch();
		branch1.setName("save2");
		branch1.setAddress("Anantapur main");
		branch1.setHospital(hospital);
		Branch branch2=new Branch();
		branch2.setName("save");
		branch2.setAddress("Tower clock");
		branch2.setHospital(hospital);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
	}

}
