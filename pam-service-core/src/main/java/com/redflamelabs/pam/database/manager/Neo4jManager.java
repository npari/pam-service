package com.redflamelabs.pam.database.manager;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Database manager, and configuration setup for Neo4j.
 * Created by kavinarasu on 6/7/17.
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "com.redflamelabs.pam.repositories")
@EnableTransactionManagement
public class Neo4jManager {

    private static final String HTTP_DRIVER = "org.neo4j.ogm.drivers.http.driver.HttpDriver";
    private static final String DATA_MODELS = "com.redflamelabs.pam.models";

    @Autowired
    Neo4jConfiguration neo4jConfiguration;

    @Bean
    public org.neo4j.ogm.config.Configuration configuration() {
        org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
        config.driverConfiguration()
                .setDriverClassName(HTTP_DRIVER)
                .setURI(neo4jConfiguration.getUri()).setCredentials(neo4jConfiguration.getUsername(), neo4jConfiguration.getPassword());
        return config;
    }

    @Bean
    public SessionFactory getSessionFactory() {
        return new SessionFactory(configuration(), DATA_MODELS);
    }

    @Bean
    public Neo4jTransactionManager transactionManager() {
        return new Neo4jTransactionManager(getSessionFactory());
    }

}
