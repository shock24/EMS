package com.homeinsurance.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.homeinsurance.entities.Department;
import com.homeinsurance.entities.Regulation;

public class RegulationDao {

	private SessionFactory factory;
	
	public RegulationDao(SessionFactory factory) {
		this.factory = factory;
	}
	
	public List<Regulation> getAllRegulations(int deptId){
		List<Regulation> allRegulations = null;
		try{
			String query = "from Regulation as r where r.department.deptId = :id";
			Session session = this.factory.openSession();
			Query q = session.createQuery(query);
			q.setParameter("id", deptId);
			allRegulations = q.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return allRegulations;
	}
	public Regulation deleteRegulationById(int id)
	{
		Regulation r =null;
		try{
			String query = "delete from Regulation where regId = :id";
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
		return r;
	}
	
	public int getDepartmentOfRegulation(int id)
	{
		int d= 0;
		try{
			String query = "select r.department.deptId from Regulation as r where r.regId = :id";
			Session session = this.factory.openSession();
			Query q = session.createQuery(query);
			q.setParameter("id", id);
			d = (int) q.uniqueResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return d;
	}
	

}
