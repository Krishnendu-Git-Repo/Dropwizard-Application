package com.practice.userService;

import io.dropwizard.core.Configuration;
import io.dropwizard.db.DataSourceFactory;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public class userConfiguration extends Configuration {
	
	@Valid
	@NotNull
	private DataSourceFactory database = new DataSourceFactory();

	@JsonProperty("database")
	public DataSourceFactory getDataSourceFactory() {
		if (Objects.isNull(database))
			database = new DataSourceFactory();
		return database;
	}

	@JsonProperty("database")
	public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
		this.database = dataSourceFactory;
	}
}
