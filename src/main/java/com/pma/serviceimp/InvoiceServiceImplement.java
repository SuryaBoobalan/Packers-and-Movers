package com.pma.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pma.Entity.Invoice;
import com.pma.dao.InvoiceDao;
import com.pma.service.InvoiceService;

@Service
@Transactional
public class InvoiceServiceImplement implements InvoiceService{
	
	InvoiceDao udao;
	
	
	
	public InvoiceServiceImplement(InvoiceDao udao) {
		super();
		this.udao = udao;
	}

	@Override
	public String addInvoice(Invoice Invoice) {
		
		return udao.addInvoice(Invoice);
	}

	@Override
	public Invoice findInvoice(int id) {
		
		return udao.findInvoice(id);
	}

	@Override
	public String updateInvoice(Invoice Invoice) {
		
		return udao.updateInvoice(Invoice);
	}

	@Override
	public String deleteInvoice(int id) {
		
		return udao.deleteInvoice(id);
	}


	@Override
	public List<Invoice> getAllInvoice() {
		
		return udao.getAllInvoice();
	}
}
