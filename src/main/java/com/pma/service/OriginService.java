package com.pma.service;

import java.util.List;

import com.pma.Entity.Origin;

public interface OriginService {
	
	public String addOrigin(Origin Origin);
	
	public Origin findOrigin(int OriginId);
	
	public String updateOrigin(Origin Origin);
	
	public String deleteOrigin(int id);
	
	public List<Origin> getAllOrigin();
}
