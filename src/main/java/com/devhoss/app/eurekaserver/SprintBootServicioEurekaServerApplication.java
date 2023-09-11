package com.devhoss.app.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SprintBootServicioEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootServicioEurekaServerApplication.class, args);
	}

}
