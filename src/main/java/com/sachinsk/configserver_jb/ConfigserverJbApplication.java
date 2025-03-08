package com.sachinsk.configserver_jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverJbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverJbApplication.class, args);
	}

}
