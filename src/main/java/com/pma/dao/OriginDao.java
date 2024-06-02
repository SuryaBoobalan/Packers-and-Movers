package com.pma.dao;

import java.util.List;

import com.pma.Entity.Origin;

public interface OriginDao {
	

	public String addOrigin(Origin Origin);
	
	public Origin findOrigin(int id);
	
	public String updateOrigin(Origin Origin);
	
	public String deleteOrigin(int id);
	
	public List<Origin> getAllOrigin();
}
