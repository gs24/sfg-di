package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
//		String greeting = myController.sayHello();
//		System.out.println(greeting);

		System.out.println("-----------Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-----------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------Setter");
		SetterInjectorController setterInjectorController = (SetterInjectorController)ctx.getBean("setterInjectorController");
		System.out.println(setterInjectorController.getGreeting());

		System.out.println("-----------Constructor");
		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController)ctx.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());

		System.out.println("-----------Profile Bean");
		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

	}

}
