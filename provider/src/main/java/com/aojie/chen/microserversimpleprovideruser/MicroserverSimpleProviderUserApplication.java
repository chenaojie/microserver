package com.aojie.chen.microserversimpleprovideruser;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MicroserverSimpleProviderUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserverSimpleProviderUserApplication.class, args);
	}
}
