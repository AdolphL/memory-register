package com.adolph.memory;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringApplication {

      public static void main(String[] args) {
          new SpringApplicationBuilder(SpringApplication.class)
                  .web(WebApplicationType.SERVLET).run(args);
      }

}
