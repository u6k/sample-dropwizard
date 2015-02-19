
package jp.gr.java_conf.u6k.sample_dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloApplication extends Application<HelloConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloApplication().run(args);
    }

    @Override
    public String getName() {
        return "sample-dropwizard";
    }

    @Override
    public void initialize(Bootstrap<HelloConfiguration> bootstrap) {
    }

    @Override
    public void run(HelloConfiguration config, Environment env) throws Exception {
        env.jersey().register(new HelloResource(config.getTemplate()));
        env.healthChecks().register("alive", new AliveHealthCheck());
    }

}
