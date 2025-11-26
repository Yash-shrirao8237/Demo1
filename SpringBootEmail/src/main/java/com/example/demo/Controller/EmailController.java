package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;    
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@Autowired
	JavaMailSender javaMailSender;
	
	
	@GetMapping("/sendEmail")
	public void sendEmail()
	{
		SimpleMailMessage m =new SimpleMailMessage();
		m.setTo("yashdshrirao@gmail.com");
		m.setFrom("yashdshrirao@gmail.com");
		m.setSubject("AVsoft spring Boot email");
		m.setText("hii this is from avsoft");
		javaMailSender.send(m);
	}
}
