package com.pma.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "origin")
public class Origin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long originId;

    private String floorNo;
    private String liftService;
    private String truckParking;
    private String pickupdate;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user; // One-to-One relationship with User

	public Long getOriginId() {
		return originId;
	}

	public void setOriginId(Long originId) {
		this.originId = originId;
	}

	public String getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}

	public String getLiftService() {
		return liftService;
	}

	public void setLiftService(String liftService) {
		this.liftService = liftService;
	}

	public String getTruckParking() {
		return truckParking;
	}

	public void setTruckParking(String truckParking) {
		this.truckParking = truckParking;
	}

	public String getPickupdate() {
		return pickupdate;
	}

	public void setPickupdate(String pickupdate) {
		this.pickupdate = pickupdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Origin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Origin(Long originId, String floorNo, String liftService, String truckParking, String pickupdate,
			User user) {
		super();
		this.originId = originId;
		this.floorNo = floorNo;
		this.liftService = liftService;
		this.truckParking = truckParking;
		this.pickupdate = pickupdate;
		this.user = user;
	}

	
    
}