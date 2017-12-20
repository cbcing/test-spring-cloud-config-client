package com.cbcing.testspringcloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TestSpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringCloudConfigClientApplication.class, args);
	}
}
