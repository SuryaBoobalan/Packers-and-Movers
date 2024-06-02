package com.pma.dao;

import java.util.List;

import com.pma.Entity.Invoice;

public interface InvoiceDao {
	
	public String addInvoice(Invoice Invoice);
	
	public Invoice findInvoice(int id);
	
	public String updateInvoice(Invoice Invoice);
	
	public String deleteInvoice(int id);
	
	public List<Invoice> getAllInvoice();
}
