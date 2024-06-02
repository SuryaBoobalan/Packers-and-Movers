package com.pma.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pma.Entity.Destination;
import com.pma.dao.DestinationDao;
import com.pma.service.DestinationService;
@Service
@Transactional
public class DestinationServiceImplement implements DestinationService {
	
	DestinationDao udao;
	
	
	
	public DestinationServiceImplement(DestinationDao udao) {
		super();
		this.udao = udao;
	}

	@Override
	public String addDestination(Destination Destination) {
		
		return udao.addDestination(Destination);
	}

	@Override
	public Destination findDestination(int id) {
		
		return udao.findDestination(id);
	}

	@Override
	public String updateDestination(Destination Destination) {
		
		return udao.updateDestination(Destination);
	}

	@Override
	public String deleteDestination(int id) {
		
		return udao.deleteDestination(id);
	}

	@Override
	public List<Destination> getAllDestination() {
		return udao.getAllDestination();
	}

}
