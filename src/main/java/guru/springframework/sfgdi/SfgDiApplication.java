package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PetController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/*so through this, now we are overriding the spring boot default of looking in just
* that home package where the main class lives and now we are telling it to look here and in this other package*/
@ComponentScan(basePackages = {"guru.springframework.sfgdi","guru.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		/*run, this is actually going to turn back a application context*/
//		SpringApplication.run(SfgDiApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//I can actually ask that context for an instance of my controller

		//******For dependency injection with spring framework*******
		System.out.println("-------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------- Setter");
		SetterInjectedController setterInjectionController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("-------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("--------- Primary bean");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("--------- Using Profile");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("--------- LifeCycle beans");
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

	}

}
