package com.redflamelabs.pam.database.manager;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Configuration for Neo4j
 *
 * Created by kavinarasu on 6/7/17.
 */
@Component
@ConfigurationProperties("neo4j")
public class Neo4jConfiguration {

    private String username;
    private String password;
    private String uri;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
