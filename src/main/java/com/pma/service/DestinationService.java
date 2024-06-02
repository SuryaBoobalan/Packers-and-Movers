package com.pma.service;

import java.util.List;

import com.pma.Entity.Destination;

public interface DestinationService {

	public String addDestination(Destination Destination);
	
	public Destination findDestination(int DestinationId);
	
	public String updateDestination(Destination Destination);
	
	public String deleteDestination(int id);
	
	public List<Destination> getAllDestination();
}
