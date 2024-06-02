package com.pma.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pma.Entity.Origin;
import com.pma.dao.OriginDao;
import com.pma.service.OriginService;

@Service
@Transactional
public class OriginServiceImplement implements OriginService {

	
	OriginDao udao;
	
	
	
	public OriginServiceImplement(OriginDao udao) {
		super();
		this.udao = udao;
	}

	@Override
	public String addOrigin(Origin Origin) {
		
		return udao.addOrigin(Origin);
	}

	@Override
	public Origin findOrigin(int id) {
		
		return udao.findOrigin(id);
	}

	@Override
	public String updateOrigin(Origin Origin) {
		
		return udao.updateOrigin(Origin);
	}

	@Override
	public String deleteOrigin(int id) {
		
		return udao.deleteOrigin(id);
	}

	@Override
	public List<Origin> getAllOrigin() {
		return udao.getAllOrigin();
	}

}
