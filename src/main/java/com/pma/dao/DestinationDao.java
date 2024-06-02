package com.pma.dao;

import java.util.List;

import com.pma.Entity.Destination;

public interface DestinationDao {


	public String addDestination(Destination Destination);
	
	public Destination findDestination(int id);
	
	public String updateDestination(Destination Destination);
	
	public String deleteDestination(int id);
	
	public List<Destination> getAllDestination();
}
