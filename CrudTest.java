import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CrudTest 
{
public static void main (String args[])
{
	System.out.println("Trying to read persisatnce.xml file");
	
EntityManagerFactory emf =Persistence.createEntityManagerFactory("MyJPA");

EntityManager em=emf.createEntityManager();

EntityTransaction et = em.getTransaction();

System.out.println("Trying to create record");

Employee theemp= new Employee();
theemp.setEmployeeNumber(101);
theemp.setName("Jack");
theemp.setJob("Manager");
theemp.setJoiningDate(LocalDate.of(2022, 04, 01));
theemp.setSalary(50000);

et.begin();
em.persist(theemp);
et.commit();
System.out.println("Created the record");

}
}
