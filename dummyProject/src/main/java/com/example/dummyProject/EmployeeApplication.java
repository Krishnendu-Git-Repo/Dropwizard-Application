package com.example.dummyProject;

import com.example.dummyProject.resources.EmployeeResource;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class EmployeeApplication extends Application<EmployeeConfiguration> {

    public static void main(final String[] args) throws Exception {
        new EmployeeApplication().run(args);
    }

    @Override
    public String getName() {
        return "Employee";
    }

    @Override
    public void initialize(final Bootstrap<EmployeeConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final EmployeeConfiguration configuration,
                    final Environment environment) {
    	environment.jersey().register(new EmployeeResource());
        // TODO: implement application
    }

}
