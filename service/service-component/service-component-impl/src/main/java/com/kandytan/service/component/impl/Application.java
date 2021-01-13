package com.kandytan.service.component.impl;

import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableLeafServer
@ImportResource(locations={"classpath:springContext.xml"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
