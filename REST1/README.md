# Send Mail
### Steps
Step 1: Create Spring Starter Project then select type: Maven (not Gradle), Java version: 17, Language: Java 

1. Create MailModel.java
2. Create MailService.java
3. Create MailController.java
4. Edit application.properties

5. MailModel.java
      public class MailModel {
	      private String toMail;
	      private String subject;
	      private String msg;
  }
  Right click-Source-Generate Getters and Setters. Save file.

6. MailService.java
   @Service
   public class MailService {
	   @Autowired
	   JavaMailSender jms;
	   public void sendMail() {
		   SimpleMailMessage smm=new SimpleMailMessage();
		   smm.setFrom("sendername@gmail.com");
		   smm.setTo("recipientname@gmail.com");
		   smm.setSubject("Test Subject");
		   smm.setText("Hello Body");
		   jms.send(smm);
	   }
}
7. MailController.java
      @RestController
      public class MailController {
	      @Autowired
	      MailService ms;
	
	      @PostMapping("/mail")
	      public String testMail() {
		      ms.sendMail();
		      return "Success";
	}
}

8.application.properties
   spring.mail.host=smtp.gmail.com
   spring.mail.port=587
   spring.mail.username=sendername@gmail.com
   spring.mail.password=password
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true

9. Run Spring Boot Project
10. In Postman create a POST request with URL http://localhost:8080/mail and Send. Check for Response "Success". Check if email has been received.
11. Before checking into Github please remove password.
   
