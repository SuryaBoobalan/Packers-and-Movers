package com.pma.daoimp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pma.Entity.Destination;
import com.pma.dao.DestinationDao;

import jakarta.persistence.EntityManager;

@Repository
public class DestinationDaoImplement implements DestinationDao
{
	
	
	public DestinationDaoImplement(EntityManager eMan) {
		this.eMan = eMan;
		
	}
	
	EntityManager eMan;

	@Override
	public String addDestination(Destination Destination) {
		eMan.persist(Destination);
		return "Destination Saved";
	}
	
	

	@Override
	public Destination findDestination(int id) {
		
		return eMan.find(Destination.class, id);
	}

	@Override
	public String updateDestination(Destination Destination) {
		eMan.persist(Destination);
		return "Object Saved Successfully";
	}

	@Override
	public String deleteDestination(int id) {
		Destination obj = eMan.find(Destination.class, id);
		eMan.remove(obj);
		return "Destination Deleted";
	}

	@Override
	public List<Destination> getAllDestination() {
		return eMan.createQuery("from Destination").getResultList();
	}
	
}
