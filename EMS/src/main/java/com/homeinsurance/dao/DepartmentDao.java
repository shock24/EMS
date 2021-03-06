package com.homeinsurance.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.homeinsurance.entities.Department;

public class DepartmentDao {

	private SessionFactory factory;
	
	public DepartmentDao() {
		// TODO Auto-generated constructor stub
	}
	
	public DepartmentDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public List<Department> getDepartments(){
		List<Department> departments = null;
		try{
			String query = "from Department";
			Session session = this.factory.openSession();
			Query q = session.createQuery(query);
			departments = q.getResultList();
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		
		return departments;
	}
	
	public Department deleteDepartmentById(int id)
	{
		Department d =null;
		try{
			String query = "delete from Department where deptId = :id";
			Session session = this.factory.openSession();
			Transaction tx = session.beginTransaction();
			Query q = session.createQuery(query);
			q.setParameter("id", id);
			q.executeUpdate();
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return d;
	}
	
	public Department getDepartmentById(int id)
	{
		Department d = null;
		try {
			String query = "from Department where deptId = :id";
			Session hibernateSession = this.factory.openSession();
			Query q = hibernateSession.createQuery(query);
			q.setParameter("id", id);
			d = (Department)q.uniqueResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return d;
	}
}
