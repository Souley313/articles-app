package dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(ignoreResourceNotFound = true, value = "classpath:application.properties")
public class ArticlesBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticlesBackApplication.class, args);
	}

}
