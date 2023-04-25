package com.jsp.dao;

	import java.util.List;
	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;
	import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jsp.dto.Student;
	@Component
	public class StudentDao {
		
		public Student saveEmployee(Student e) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("vinay");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(e);
			et.commit();
			return e;
		}

		public Student getDetailsById(int id) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("vinay");
			EntityManager em = emf.createEntityManager();
			Student e = em.find(Student.class, id);
			return e;
		}

		public List<Student> getallDetails() {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("vinay");
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select u from Student u");
			List<Student> list = q.getResultList();
			return list;
		}

		public Student updateStudent(Student s) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("vinay");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			Student e1 = em.find(Student.class, s.getId());
			em.merge(s);
			et.commit();
			return s;
		}

		public Student deleteStudent(int id) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("vinay");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			Student s=em.find(Student.class, id);
			em.remove(s);
			et.commit();
			return s;
		}
		/*
		 * public static void main(String[] args) { /*e.setEmp_salary(100); e.setId(1);
		 * e.setName("vin");
		 * 
		 * 
		 * List<Employee> e=p.getallDetails();
		 * 
		 * 
		 * //p.updateEmployee(1); //p.saveEmployee(e);
		 * 
		 * // System.out.println(e.getName()); EmployeeDao p=new EmployeeDao();
		 * EntityManager em=p.getem(); Query
		 * q=em.createQuery("select u from Employee u where emp_name=?1");
		 * q.setParameter(1, "viny"); List<Employee> e=q.getResultList(); for(Employee
		 * u: e) { System.out.println(u.getId()+" "+u.getName()+" "+u.getEmp_salary());
		 * }
		 */

		// }*/

	}


