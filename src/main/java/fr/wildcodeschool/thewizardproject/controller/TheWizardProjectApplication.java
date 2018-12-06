package fr.wildcodeschool.thewizardproject.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheWizardProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheWizardProjectApplication.class, args);
        App myApp = new App();
        myApp.start();
    }
	}


