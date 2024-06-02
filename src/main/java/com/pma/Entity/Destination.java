package com.pma.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "destination")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int destinationId;

    private String floorNo;
    private String doorstepToVehicle;
    
    @OneToOne
    @JoinColumn(name = "userId")
    private User user; // One-to-One relationship with User

	public int getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

	public String getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}

	public String getDoorstepToVehicle() {
		return doorstepToVehicle;
	}

	public void setDoorstepToVehicle(String doorstepToVehicle) {
		this.doorstepToVehicle = doorstepToVehicle;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Destination() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destination(int destinationId, String floorNo, String doorstepToVehicle, User user) {
		super();
		this.destinationId = destinationId;
		this.floorNo = floorNo;
		this.doorstepToVehicle = doorstepToVehicle;
		this.user = user;
	}

	
    
}
