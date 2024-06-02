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

import com.pma.Entity.Invoice;
import com.pma.service.InvoiceService;

@RestController
@RequestMapping("/api/rest/")
@CrossOrigin("http://localhost:3000")

public class InvoiceController {
	
	private InvoiceService service;
	
	
	
	public InvoiceController(InvoiceService service) {
		this.service = service;
	}

	@PostMapping("/Invoice")
	public String addInvoice(@RequestBody Invoice Invoice)
	
	{
		System.out.println(Invoice);
		return service.addInvoice(Invoice);
	}
	
	@GetMapping("/Invoice/{InvoiceId}")
	public Invoice findInvoice(@PathVariable("InvoiceId") final int InvoiceId)
	{
		return service.findInvoice(InvoiceId);
	}
	
	@PutMapping("/Invoice")
	public String updateInvoice(@RequestBody Invoice Invoice)
	{
		return service.updateInvoice(Invoice);
	}
	
	@DeleteMapping("/Invoice/{InvoiceId}")
	public String deleteInvoice(@PathVariable("InvoiceId") final int InvoiceId)
	{
		return service.deleteInvoice(InvoiceId);
	}
	
}
