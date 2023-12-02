package sample.demo.FirstProject;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import sample.demo.FirstProject.resources.MainResource;

public class DemoApplication extends Application<DemoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "Demo";
    }

    @Override
    public void initialize(final Bootstrap<DemoConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DemoConfiguration configuration,
                    final Environment environment) {
    	environment.jersey().register(new MainResource());
        // TODO: implement application
    }

}
