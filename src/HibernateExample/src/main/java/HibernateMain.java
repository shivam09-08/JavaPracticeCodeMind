import java.util.List;

import org.hibernate.Session;

import jakarta.persistence.Query;

public class HibernateMain {

	public static void main(String[] args) {
		System.out.println("This is hibernate Example ");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		Employee emp= new Employee();
		emp.setEmpid(234);
		emp.setEmp_name("abhi");
		emp.setEmp_password("confuse");
		emp.setEmp_salary(12000);
		emp.setEmp_age(26);
		
////		session.save(emp);
//		System.out.println(emp);
		
		Employee loadData = 
		session.load(Employee.class, 234);
		System.out.println(" Using load method" +loadData);
		
		Employee loadData1 = 
				session.get(Employee.class, 234);
				System.out.println("Using get method" +loadData1);
	
				Query query=session.createQuery("from Employee");//here persistent class name is Emp  
				List list=((org.hibernate.query.Query) query).list();  
				
				System.out.println(list);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
	}

//	private static void findAllStudentsWithCriteriaQuery() {
//		Object List;
//		List<Student> findAllStudentsWithCriteriaQuery() {
//		    CriteriaBuilder cb = session.getCriteriaBuilder();
//		    CriteriaQuery<Student> cq = cb.createQuery(Employee.class);
//		    Root<Student> rootEntry = cq.from(Employee.class);
//		    CriteriaQuery<Employee> all = cq.select(rootEntry);
//
//		    TypedQuery<Student> allQuery = session.createQuery(all);
//		    return allQuery.getResultList();
//		}
	}


