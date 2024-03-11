package com.tasktorch.techend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TaskTorchApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskTorchApplication.class, args);
	}

}
