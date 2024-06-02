package com.pma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pma.Entity.Panel;
import com.pma.service.PanelService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/rest/")
public class PanelController {
	
	
private PanelService service;
	
	
	
	public PanelController(PanelService service) {
		this.service = service;
	}

	@PostMapping("/Panel")
	public String addPanel(@RequestBody Panel Panel)
	
	{
		System.out.println(Panel);
		return service.addPanel(Panel);
	}
	
	@GetMapping("/Panel/{PanelId}")
	public Panel findPanel(@PathVariable("PanelId") final int PanelId)
	{
		return service.findPanel(PanelId);
	}
	
	@GetMapping("/Panel")
	public List<Panel> findAllPanel()
	{
		return service.getAllPanel();
	}
	
	@PutMapping("/Panel")
	public String updatePanel(@RequestBody Panel Panel)
	{
		return service.updatePanel(Panel);
	}
	
	@DeleteMapping("/Panel/{PanelId}")
	public String deletePanel(@PathVariable("PanelId") final int PanelId)
	{
		return service.deletePanel(PanelId);
	}
}
