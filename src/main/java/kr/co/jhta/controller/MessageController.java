package kr.co.jhta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {
	
	@RequestMapping("/adminsendmessagebox")
	public String adminSendEmailBox() {
		return "administer/adminsendmessagebox";
	}
	
	@RequestMapping("/adminrecmessagebox")
	public String adminRecieveEmailBox() {
		return "administer/adminrecmessagebox";
	}
	
	@RequestMapping("/adminmessageform")
	public String adminMessageForm() {
		return "administer/adminmessageform";
	}
}
