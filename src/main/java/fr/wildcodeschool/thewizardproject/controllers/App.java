package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.WizardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public void start() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myBook = context.getBean("theWizard", WizardInterface.class);

        context.close();
        System.out.println("");
        System.out.println("******************");
        System.out.println(myBook.giveAdvice());
        System.out.println("******************");
        System.out.println(myBook.changeDress());

    }
}
