package resources;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@path("/demo")
public class CustomerDetailsResource {

	@GET
	@path("/details")
	@Produces(MediaType.APPLICATION_XML)
	public Response getdetails() {

		
		return  Response.ok("vinay").build();
		
	}

}
