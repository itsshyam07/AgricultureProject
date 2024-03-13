package com.backend.Agriculture;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({//enable spring boot to auto-configure the application context
    com.backend.Agriculture.utils.FileUploadProperties.class
})
public class AgricultureApplication{

	public static void main(String[] args) {
		SpringApplication.run(AgricultureApplication.class, args);
	}



}
