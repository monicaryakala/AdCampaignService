package com.comcast.campaign.campaign;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

public class AdCampaignImpl implements AdCampaign {
	//private long currentId = 7;
	Map<String, User> users = new HashMap<String, User>();

//	public AdCampaignImpl() {
//		init();
//	}
//
//	final void init() {
//		User user = new User();
//		user.setPartner_id(currentId);
//		user.setAd_content("its a campaign");
//		user.setDuration(2000);
//		users.put(user.getPartner_id(), user);
//
//	}

	public User getUser(String partner_id) {
		System.out.println("inovking getUser...." + partner_id);
		//Long id = Long.parseLong(partner_id);
		User getuserId = users.get(partner_id);
		return getuserId;
	}

	public Response addUser(User User) {
		//User.setPartner_id(++currentId);
		Response response = null;
		if(users.get(User.getPartner_id()) == null){
			System.out.println("invoking addUser...." + User.getPartner_id()+" "+User.getDuration()+"    "+User.getAd_content());
			users.put(User.getPartner_id(), User);
			response =  Response.ok(User).build();
		}else{
			System.out.println("****invoking addCampaign already existing******* " + User.getPartner_id());
			response = Response.notModified().build();
		}
		return response;
	}
	

}
