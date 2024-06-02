package com.pma.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pma.Entity.Origin;
import com.pma.service.OriginService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/rest/")
public class OriginController {
	private OriginService service;
	
	
	
	public OriginController(OriginService service) {
		this.service = service;
	}

	@PostMapping("/Origin")
	public String addOrigin(@RequestBody Origin Origin)
	
	{
		System.out.println(Origin);
		return service.addOrigin(Origin);
	}
	
	@GetMapping("/Origin/{originId}")
	public Origin findOrigin(@PathVariable("originId") final int originId)
	{
		return service.findOrigin(originId);
	}
	
	@PutMapping("/Origin")
	public String updateOrigin(@RequestBody Origin Origin)
	{
		return service.updateOrigin(Origin);
	}
	
	@DeleteMapping("/Origin/{originId}")
	public String deleteOrigin(@PathVariable("originId") final int originId)
	{
		return service.deleteOrigin(originId);
	}
	
	

}
