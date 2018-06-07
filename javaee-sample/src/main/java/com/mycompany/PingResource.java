package com.mycompany;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ping")
public class PingResource {
	
	@GET
	public String get() {
		return "Hello world!!!!";
	}

}
