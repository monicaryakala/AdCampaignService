package com.comcast.campaign.campaign;

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
    @Path("/users/{partner_id}/")
	User getUser(@PathParam("partner_id") String partner_id);
    
	@POST
	@Path("/users")
	Response addUser(User User);
	
}
