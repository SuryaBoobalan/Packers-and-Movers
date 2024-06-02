package com.pma.service;

import java.util.List;

import com.pma.Entity.Invoice;

public interface InvoiceService {
	
	public String addInvoice(Invoice Invoice);
	
	public Invoice findInvoice(int InvoiceId);
	
	public String updateInvoice(Invoice Invoice);
	
	public String deleteInvoice(int id);
	
	public List<Invoice> getAllInvoice();
}
