package com.sadatmalik.fusiondiscovery.fusiondiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer enables the application to start up as a service discovery server.
 *
 * @author sadatmalik
 */
@SpringBootApplication
@EnableEurekaServer
public class FusionDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FusionDiscoveryApplication.class, args);
	}

}
