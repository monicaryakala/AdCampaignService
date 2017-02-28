package com.comcast.campaign.campaign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.core.Response;

public class AdCampaignImpl implements AdCampaign {

	Map<String, List<User>> campaign = new HashMap<String, List<User>>();

	public List<User> getUser(String partner_id) {
		System.out.println("inovking getUser...." + partner_id);
	   List<User> list = campaign.get(partner_id);
		return list;
	}

	public Response addUser(User Campaign) {
		//Response response = null;
		if (campaign.get(Campaign.getPartner_id()) == null) {
			System.out.println("invoking addUser...." + Campaign.getPartner_id() + " " + Campaign.getDuration() + "    "
					+ Campaign.getAd_content());
			ArrayList<User> camplist = new ArrayList<User>();
			camplist.add(Campaign);
			//camplist.add(Campaign);
			campaign.put(Campaign.getPartner_id(), camplist);
			//response = Response.ok(Campaign).build();
		} else {
			System.out.println("****invoking addCampaign already existing******* " + Campaign.getPartner_id());
			campaign.get(Campaign.getPartner_id()).add(Campaign);
			//response = Response.notModified().build();
		}
		return Response.ok(Campaign).build();
	}

	@Override
	public Map<String, List<User>> getAllUsers() {
	System.out.println("invoking all the Campaign............");
	for(Entry<String, List<User>> entry : campaign.entrySet())
    {   
         System.out.println(entry.getKey() + " : " +entry.getValue());
    }

		return campaign;
	}

}
