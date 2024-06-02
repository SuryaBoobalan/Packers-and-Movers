package com.pma.daoimp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pma.Entity.Origin;
import com.pma.dao.OriginDao;

import jakarta.persistence.EntityManager;

@Repository
public class OriginDaoImplement implements OriginDao
{

	public OriginDaoImplement(EntityManager eMan) {
		this.eMan = eMan;
		
	}
	
	EntityManager eMan;

	@Override
	public String addOrigin(Origin Origin) {
		eMan.persist(Origin);
		return "Origin Saved";
	}
	
	

	@Override
	public Origin findOrigin(int id) {
		
		return eMan.find(Origin.class, id);
	}

	@Override
	public String updateOrigin(Origin Origin) {
		eMan.persist(Origin);
		return "Object Saved Successfully";
	}

	@Override
	public String deleteOrigin(int id) {
		Origin obj = eMan.find(Origin.class, id);
		eMan.remove(obj);
		return "Origin Deleted";
	}

	@Override
	public List<Origin> getAllOrigin() {
		return eMan.createQuery("from Origin").getResultList();
	}
	
	

}
