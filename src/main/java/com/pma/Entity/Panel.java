package com.pma.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Panel {
	
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panelId;
	private String userName;
	private String userNumber;
	private String userOrigin;
	private String userDestination;
	private String userEmail;
	private double estimate;
	private int itemCount;
	private String miles;
	
	@OneToOne
    @JoinColumn(name = "userId")
	private User user;

	public int getPanelId() {
		return panelId;
	}

	public void setPanelId(int panelId) {
		this.panelId = panelId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserOrigin() {
		return userOrigin;
	}

	public void setUserOrigin(String userOrigin) {
		this.userOrigin = userOrigin;
	}

	public String getUserDestination() {
		return userDestination;
	}

	public void setUserDestination(String userDestination) {
		this.userDestination = userDestination;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public double getEstimate() {
		return estimate;
	}

	public void setEstimate(double estimate) {
		this.estimate = estimate;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getMiles() {
		return miles;
	}

	public void setMiles(String miles) {
		this.miles = miles;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Panel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Panel(int panelId, String userName, String userNumber, String userOrigin, String userDestination,
			String userEmail, double estimate, int itemCount, String miles, User user) {
		super();
		this.panelId = panelId;
		this.userName = userName;
		this.userNumber = userNumber;
		this.userOrigin = userOrigin;
		this.userDestination = userDestination;
		this.userEmail = userEmail;
		this.estimate = estimate;
		this.itemCount = itemCount;
		this.miles = miles;
		this.user = user;
	}
	
	
	
	
	
}
