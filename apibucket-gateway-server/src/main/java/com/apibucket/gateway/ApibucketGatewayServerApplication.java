package com.apibucket.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
@EnableConfigurationProperties
public class ApibucketGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApibucketGatewayServerApplication.class, args);
	}
}
