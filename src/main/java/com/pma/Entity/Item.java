package com.pma.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String product;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user; // Many-to-One relationship with User


	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Item(Long itemId, String product, int quantity, User user) {
		super();
		this.itemId = itemId;
		this.product = product;
		this.quantity = quantity;
		this.user = user;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

    
}
