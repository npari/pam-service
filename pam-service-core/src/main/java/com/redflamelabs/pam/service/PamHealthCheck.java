package com.redflamelabs.pam.service;

import com.codahale.metrics.health.HealthCheck;

/**
 * Basic health check for service
 *
 * Created by kavinarasu on 6/3/17.
 */
public class PamHealthCheck extends HealthCheck {

    protected Result check() throws Exception {
        return Result.healthy();
    }
}
