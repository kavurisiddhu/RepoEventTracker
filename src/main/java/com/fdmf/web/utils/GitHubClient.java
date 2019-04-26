package com.fdmf.web.utils;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fdmf.web.DAO.Event;
import com.fdmf.web.DAO.GetEventsListReq;
import com.fdmf.web.DAO.ListEvents;

@Component
public class GitHubClient {

    public ListEvents getEventList(GetEventsListReq getEventsListReq) {
    	
    	RestTemplate restTemplate = new RestTemplate();
        String uri = buildURL(getEventsListReq);
        ListEvents lstEvents=new ListEvents();
        List<Event> filteredEvents=new ArrayList<Event>();
        Event[] events = restTemplate.getForObject(uri, Event[].class);
        //System.out.println("Total events recorded are " + events.length);
        for (Event event : events) {
            if (getEventsListReq.getEventName().equalsIgnoreCase(event.getType())) {
                filteredEvents.add(event);
            }
        }
        lstEvents.setEventsLst(filteredEvents);
        return lstEvents;
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
