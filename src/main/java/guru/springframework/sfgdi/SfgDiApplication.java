package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		/*run, this is actually going to turn back a application context*/
//		SpringApplication.run(SfgDiApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//I can actually ask that context for an instance of my controller
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();

		System.out.println(greeting);

	}

}
