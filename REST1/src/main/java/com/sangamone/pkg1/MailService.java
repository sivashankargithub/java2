package com.sangamone.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired
	JavaMailSender jms;
	
	
	@Value("${spring.mail.username}")
	private String fromMail;
		
	public void sendMail(MailModel mm) {
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom(fromMail);     //who
		smm.setTo(mm.getToMail()); //whom
		smm.setSubject(mm.getSubject()); //subject
		smm.setText(mm.getMsg());  //body
		jms.send(smm);
	
	}


}
