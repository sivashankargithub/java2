package com.sangamone.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	@Autowired
	MailService ms;
	
	@PostMapping("/sendMail")
	public String testMail(@RequestBody MailModel mm1) {
		ms.sendMail(mm1);
		return "Mail sent successfully";
	}

}
