package com.comcast.campaign.campaign;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

public class AdCampaignImpl implements AdCampaign {
	private long currentId = 7;
	Map<Long, User> users = new HashMap<Long, User>();

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
		Long id = Long.parseLong(partner_id);
		User getuserId = users.get(id);
		return getuserId;
	}

	public Response addUser(User User) {
		System.out.println("invoking addUser...." + User.getPartner_id());
		User.setPartner_id(++currentId);
		users.put(User.getPartner_id(), User);
		return Response.ok().build();
	}

}
