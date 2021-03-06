package com.fdmf.web.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmf.web.DAO.Event;
import com.fdmf.web.DAO.EventsDetails;
import com.fdmf.web.DAO.EventsListResponse;
import com.fdmf.web.DAO.GetEventsListReq;
import com.fdmf.web.DAO.ListEvents;

@Service
public class TransformUtils {
	public EventsListResponse convertWebToUIEventsList(ListEvents lstEvents){
		List<EventsDetails> eventsDetailsList=null;
		EventsListResponse eventsListResponse=new EventsListResponse();
		eventsDetailsList=new ArrayList<EventsDetails>();
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/d/y H:m:s");
		String dateString = formatter.format(new Date());
		if (null != lstEvents && null != lstEvents.getEventsLst() && lstEvents.getEventsLst().size() > 0) {
			for (Event event : lstEvents.getEventsLst()) {
				EventsDetails eventsDetails=new EventsDetails();
				eventsDetails.setId(event.getId());
				eventsDetails.setType(event.getType());
				eventsDetails.setCreated_at(formatter.format(event.getCreated_at()));
				eventsDetails.setDescription(event.getPayload().getDescription());
				eventsDetails.setMaster_branch(event.getPayload().getMaster_branch());
				eventsDetails.setPusher_type(event.getPayload().getPusher_type());
				if(null!=event.getPayload().getCommits() && 0<event.getPayload().getCommits().length) {
					eventsDetails.setCommitMessage(event.getPayload().getCommits()[0].getMessage());
					eventsDetails.setCommittedBy(event.getPayload().getCommits()[0].getAuthor().getName());
				}
				eventsDetails.setCommittedTo(event.getPayload().getRef());
				
				eventsDetails.setRef_type(event.getPayload().getRef_type());
				eventsDetailsList.add(eventsDetails);
			}
			eventsListResponse.setEventDetails(eventsDetailsList);
		}else if(null!=lstEvents) {
			eventsListResponse.setErrorCode(lstEvents.getErrorCode());
			eventsListResponse.setErrorDesc(lstEvents.getErrorDesc());
		}
		
		return eventsListResponse;
	}
	
	 public String buildURL(GetEventsListReq getEventsListReq){
	        StringBuilder sb=new StringBuilder();
	        sb.append(Constants.BASE_URL);
	        sb.append(getEventsListReq.getUser());
	        sb.append("/");
	        sb.append(getEventsListReq.getRepo());
	        sb.append("/");
	        sb.append(Constants.EVENTS);

	        return sb.toString();
	    }
}
