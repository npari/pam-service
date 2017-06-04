package com.redflamelabs.pam.service;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by kavinarasu on 6/3/17.
 */
public class PamApplication extends Application<PamServiceConfiguration> {

    /**
     * The main application which runs the PAM service
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        new PamApplication().run(args);
    }


    /**
     * The dropwizard specific run configuration where all the resources used are to be registered
     * @param pamServiceConfiguration the configuration specified in the config file
     * @param environment the dropwizard environment object
     * @throws Exception service will quit if the run configuration fails
     */
    public void run(PamServiceConfiguration pamServiceConfiguration, Environment environment) throws Exception {
        environment.healthChecks().register("health", new PamHealthCheck());
    }
}
