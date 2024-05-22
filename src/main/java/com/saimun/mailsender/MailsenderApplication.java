package com.saimun.mailsender;

import com.saimun.mailsender.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailsenderApplication implements CommandLineRunner {

	@Autowired
	private MailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(MailsenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String report = generateReport();
		mailService.sendSimpleMail("mdtashin1921@gmail.com", "this is dsdf",
				"ut as the writer of Forbes Edge, a newsletter that aims to give you career advice and " +
						"inspiration, would I really be able to draw comparisons to the success of world-class athletes " +
						"making hundreds of millions of dollars to the challenges and responsibilities that us 9-to-5ers " +
						"face each week?\n" +
				"To be honest, I didn’t have to think too hard about it. Sure, I might not have been blessed with the " +
						"ability to throw a 98-mph fastball like Shohei Ohtani or dunk a basketball like LeBron James, but there are lessons to be learned in how they, and other athletes, leveraged their talents to become some of the most financially successful individuals on and off the field.");

	}

	private String generateReport() {
		return "this is report for sending mail";
	}
}
