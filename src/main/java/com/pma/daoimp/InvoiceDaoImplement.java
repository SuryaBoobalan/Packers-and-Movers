package com.pma.daoimp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pma.Entity.Invoice;
import com.pma.dao.InvoiceDao;

import jakarta.persistence.EntityManager;

@Repository
public class InvoiceDaoImplement implements InvoiceDao{
	
	public InvoiceDaoImplement(EntityManager eMan) {
		this.eMan = eMan;
		
	}
	
	EntityManager eMan;

	@Override
	public String addInvoice(Invoice Invoice) {
		eMan.persist(Invoice);
		return "Invoice Saved";
	}
	
	

	@Override
	public Invoice findInvoice(int id) {
		
		return eMan.find(Invoice.class, id);
	}

	@Override
	public String updateInvoice(Invoice Invoice) {
		eMan.persist(Invoice);
		return "Object Saved Successfully";
	}

	@Override
	public String deleteInvoice(int id) {
		Invoice obj = eMan.find(Invoice.class, id);
		eMan.remove(obj);
		return "Invoice Deleted";
	}

	@Override
	public List<Invoice> getAllInvoice() {
		return eMan.createQuery("from Invoice").getResultList();
	}
	
	

}
