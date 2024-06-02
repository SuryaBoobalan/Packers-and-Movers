package com.pma.dao;

import java.util.List;

import com.pma.Entity.Panel;



public interface PanelDao {
	
	public String addPanel(Panel panel);
	
	public Panel findPanel(int id);
	
	public String updatePanel(Panel panel);
	
	public String deletePanel(int id);
	
	public List<Panel> getAllPanel();
}
