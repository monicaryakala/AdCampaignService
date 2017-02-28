package com.comcast.campaign.campaign;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

//Resources
@Produces({"application/json","application/xml"})
public interface AdCampaign {
    @GET
    @Path("/User/{partner_id}/")
	List<User> getUser(@PathParam("partner_id") String partner_id);
    
	@POST
	@Path("/User")
	Response addUser(User Campaign);
	
	@GET
	@Path("/User/GETall")
	Map<String,  List<User>> getAllUsers();
}
