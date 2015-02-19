
package jp.gr.java_conf.u6k.sample_dropwizard;

import com.codahale.metrics.health.HealthCheck;

public class AliveHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }

}
