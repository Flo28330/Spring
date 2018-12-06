package fr.wildcodeschool.thewizardproject.controller;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.name.Gandalf;



public class App {
	
	public void start() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Gandalf gandalf = context.getBean("gandalf", Gandalf.class);
        context.close();
		
        System.out.println("");
        System.out.println("******************");
       	System.out.println(gandalf.changeDress());
        System.out.println("******************");
        System.out.println(gandalf.giveAdvice());

    }
}
