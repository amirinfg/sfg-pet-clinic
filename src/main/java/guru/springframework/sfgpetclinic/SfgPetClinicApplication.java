package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.controllers.ConstructorInjectedController;
import guru.springframework.sfgpetclinic.controllers.MyController;
import guru.springframework.sfgpetclinic.controllers.PropertyInjectedController;
import guru.springframework.sfgpetclinic.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgPetClinicApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

        System.out.println("-------primary bean");
        System.out.println(myController.sayHello());


        System.out.println("---------- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");


        System.out.println("---------- Setter");
        System.out.println(propertyInjectedController.getGreeting());
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--------Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


    }



}
