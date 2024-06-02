package com.pma.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pma.Entity.Panel;
import com.pma.dao.PanelDao;
import com.pma.service.PanelService;

@Service
@Transactional
public class PanelServiceImplement implements PanelService {

	PanelDao udao;

	public PanelServiceImplement(PanelDao udao) {
		super();
		this.udao = udao;
	}

	@Override
	public String addPanel(Panel Panel) {

		return udao.addPanel(Panel);
	}

	@Override
	public Panel findPanel(int id) {

		return udao.findPanel(id);
	}

	@Override
	public String updatePanel(Panel Panel) {

		return udao.updatePanel(Panel);
	}

	@Override
	public String deletePanel(int id) {

		return udao.deletePanel(id);
	}

	@Override
	public List<Panel> getAllPanel() {
		return udao.getAllPanel();
	}
}
