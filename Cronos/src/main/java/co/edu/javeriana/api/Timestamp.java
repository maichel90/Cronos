package co.edu.javeriana.api;

import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/timestamp")
public class Timestamp {

	@GET
	@Produces({"application/xml", "application/json","text/plain"})
	public Long obtenerTimeStampTEXT() {
		Calendar c = Calendar.getInstance();
		return c.getTimeInMillis()/1000;
	}

}
