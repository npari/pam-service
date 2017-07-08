package com.redflamelabs.pam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

/**
 * Main class for running the application
 *
 * Created by kavinarasu on 6/6/17.
 */
@SpringBootApplication
@EnableNeo4jRepositories
public class PamServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(PamServiceApp.class, args);
    }
}
