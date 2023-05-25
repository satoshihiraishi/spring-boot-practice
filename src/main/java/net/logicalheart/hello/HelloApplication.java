package net.logicalheart.hello;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.boot.Banner.Mode;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HelloApplication.class, args);
		//System.out.println("Hello World!");
		SpringApplication app = new SpringApplication(HelloApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}

}
