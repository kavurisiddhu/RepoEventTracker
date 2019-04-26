package com.fdmf.web.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fdmf.web.DAO.Event;
import com.fdmf.web.DAO.EventsDetails;
import com.fdmf.web.DAO.EventsListResponse;
import com.fdmf.web.DAO.ListEvents;

public class TransformUtils {
	public EventsListResponse convertWebToUIEventsList(ListEvents lstEvents){
		List<EventsDetails> eventsDetailsList=null;
		EventsListResponse eventsListResponse=new EventsListResponse();
		eventsDetailsList=new ArrayList<EventsDetails>();
		EventsDetails eventsDetails=new EventsDetails();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/d/y H:m:s");
		String dateString = formatter.format(new Date());
		for(Event event: lstEvents.getEventsLst()) {
			eventsDetails.setId(event.getId());
			eventsDetails.setType(event.getType());
			eventsDetails.setCreated_at(formatter.format(event.getCreated_at()));
			eventsDetails.setDescription(event.getPayload().getDescription());
			eventsDetails.setMaster_branch(event.getPayload().getMaster_branch());
			eventsDetails.setPusher_type(event.getPayload().getPusher_type());
			eventsDetailsList.add(eventsDetails);
		}
		eventsListResponse.setEventDetails(eventsDetailsList);
		return eventsListResponse;
	}
}
