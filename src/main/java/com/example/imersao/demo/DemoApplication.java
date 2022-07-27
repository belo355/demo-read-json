package com.example.imersao.demo;

import com.example.imersao.demo.util.UtilServiceConsulta;
import com.example.imersao.demo.util.UtilServiceFilm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(DemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example.imersao.demo");
		context.refresh();
		UtilServiceFilm UtilServiceFilm = context.getBean(UtilServiceFilm.class);
		UtilServiceFilm.run();
	}
}