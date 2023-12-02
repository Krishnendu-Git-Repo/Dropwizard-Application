package sample.demo.FirstProject.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class MainResource {
	
	@GET
	@Path("/name")
	public String getName() {
		return "Welcome to SentientGeeks";
	}

}
