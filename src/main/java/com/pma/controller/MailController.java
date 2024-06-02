package com.pma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pma.service.MailService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/rest/")
public class MailController {
	
	

	@Autowired
	MailService serv;

	@PostMapping("/sendEmailOTP")
	public String sendOTPEmail(@RequestParam("email")String email, @RequestParam("name") String name, @RequestParam("estimate") String estimate, @RequestParam("origin") String origin, @RequestParam("destination") String destination ){
		String toMail = email;
		String subject = "Packers and Movers - Estimation Confirmation";
		
		String body = "Dear " + name + ", Thank you for considering Packers and Movers, your Request for the service shipping packages from " + origin + " to " + destination + " has been considered, The Estimated Amount for the "
				+ "service is ₹" + estimate + ". you will be contacted by our business team with next 2 hours."
				+ " Thanks & regards - Packers and Movers";
		try {
			serv.sendMail(toMail, subject, body);
			return "Mail Sent Successfully";
		}catch(Exception e) {
			return "Mail Send Failure";
		}

	}
}
