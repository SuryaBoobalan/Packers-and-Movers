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

import com.pma.Entity.Destination;
import com.pma.service.DestinationService;

@RestController
@CrossOrigin("http://localhost:3000")

@RequestMapping("/api/rest/")
public class DestinationController {

	private DestinationService service;
	
	
	
	public DestinationController(DestinationService service) {
		this.service = service;
	}

	@PostMapping("/Destination")
	public String addDestination(@RequestBody Destination Destination)
	
	{
		System.out.println(Destination);
		return service.addDestination(Destination);
	}
	
	@GetMapping("/Destination/{destinationId}")
	public Destination findDestination(@PathVariable("destinationId") final int destinationId)
	{
		return service.findDestination(destinationId);
	}
	
	@PutMapping("/Destination")
	public String updateDestination(@RequestBody Destination Destination)
	{
		return service.updateDestination(Destination);
	}
	
	@DeleteMapping("/Destination/{destinationId}")
	public String deleteDestination(@PathVariable("destinationId") final int destinationId)
	{
		return service.deleteDestination(destinationId);
	}
	
}
