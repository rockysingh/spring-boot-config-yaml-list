package com.rockysingh.config.list;

import com.rockysingh.config.list.config.StudentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
@EnableConfigurationProperties
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ApplicationContext context = new SpringApplicationBuilder(Application.class).run(args);
		StudentConfig studentConfig = context.getBean(StudentConfig.class);

		studentConfig.getStudentList().forEach(
				student -> {
					System.out.println("name:" + student.getName());
				}
		);
	}
}
