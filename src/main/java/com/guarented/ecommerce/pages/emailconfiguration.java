package com.guarented.ecommerce.pages;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
public class emailconfiguration {

	public void emailconfigurationmethod() throws EmailException{
	Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("nareshnavaneethu@gmail.com", "navanetH%"));
		email.setSSLOnConnect(true);
		email.setFrom("abc@gmail.com");
		email.setSubject("order information");
		email.setMsg("order success ");
		email.addTo("naresh@guarented.com");
		email.send();
		System.out.println("email sent successfully");
		

}
	

}
