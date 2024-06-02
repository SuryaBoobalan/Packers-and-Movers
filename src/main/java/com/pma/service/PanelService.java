package com.pma.service;

import java.util.List;

import com.pma.Entity.Panel;


public interface PanelService {
	
	public String addPanel(Panel Panel);
	
	public Panel findPanel(int PanelId);
	
	public String updatePanel(Panel Panel);
	
	public String deletePanel(int id);
	
	public List<Panel> getAllPanel();
}
