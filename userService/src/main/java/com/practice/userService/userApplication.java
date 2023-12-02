package com.practice.userService;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class userApplication extends Application<userConfiguration> {

    public static void main(final String[] args) throws Exception {
        new userApplication().run(args);
    }

    @Override
    public String getName() {
        return "user";
    }

    @Override
    public void initialize(final Bootstrap<userConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final userConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
