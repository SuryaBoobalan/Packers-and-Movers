package com.pma.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;

    private String fromLocation;
    private String toLocation;
    private double estimateAmount;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user; // One-to-One relationship with User


	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public double getEstimateAmount() {
		return estimateAmount;
	}

	public void setEstimateAmount(double estimateAmount) {
		this.estimateAmount = estimateAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Invoice(Long invoiceId, String fromLocation, String toLocation, double estimateAmount, User user) {
		super();
		this.invoiceId = invoiceId;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.estimateAmount = estimateAmount;
		this.user = user;
	}

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
