package tz.go.rita.di.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tz.go.rita.di.di.Controllers.MyController;


@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		
		//MyController myController = (MyController) ctx.getBean("myController");
		MyController myController = (MyController) ctx.getBean("myController");
		
		String greeting = myController.sayHello();
		
		System.out.println(greeting);
	}

}
