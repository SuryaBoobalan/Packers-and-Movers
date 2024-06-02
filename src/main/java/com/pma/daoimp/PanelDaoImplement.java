package com.pma.daoimp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pma.Entity.Panel;
import com.pma.dao.PanelDao;

import jakarta.persistence.EntityManager;

@Repository
public class PanelDaoImplement implements PanelDao {
	
	public PanelDaoImplement(EntityManager eMan) {
		this.eMan = eMan;
		
	}
	
	EntityManager eMan;

	@Override
	public String addPanel(Panel Panel) {
		eMan.persist(Panel);
		return "Panel Saved";
	}
	
	

	@Override
	public Panel findPanel(int id) {
		
		return eMan.find(Panel.class, id);
	}

	@Override
	public String updatePanel(Panel Panel) {
		eMan.persist(Panel);
		return "Object Saved Successfully";
	}

	@Override
	public String deletePanel(int id) {
		Panel obj = eMan.find(Panel.class, id);
		eMan.remove(obj);
		return "Panel Deleted";
	}



	@Override
	public List<Panel> getAllPanel() {
		return eMan.createQuery("from Panel").getResultList();
	}
}
