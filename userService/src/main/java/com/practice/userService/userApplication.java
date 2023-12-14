package com.practice.userService;

import com.practice.userService.core.Employee;
import com.practice.userService.db.EmployeeDao;
import com.practice.userService.resources.UserResource;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;

public class userApplication extends Application<userConfiguration> {

	public static void main(final String[] args) throws Exception {
		new userApplication().run(new String[] { "server", "config.yml" });
	}

	@Override
	public String getName() {
		return "user";
	}

	@Override
	public void initialize(final Bootstrap<userConfiguration> bootstrap) {
		bootstrap.addBundle(hibernate);
	}

	@Override
	public void run(final userConfiguration configuration, final Environment environment) {
		EmployeeDao employeeDao = new EmployeeDao(hibernate.getSessionFactory());
		environment.jersey().register(new UserResource(employeeDao));
	}

	private final HibernateBundle<userConfiguration> hibernate = new HibernateBundle<userConfiguration>(
			Employee.class) {
		@Override
		public DataSourceFactory getDataSourceFactory(userConfiguration configuration) {
			return configuration.getDataSourceFactory();
		}
	};

}
