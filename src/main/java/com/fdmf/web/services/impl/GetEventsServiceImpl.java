package com.fdmf.web.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fdmf.web.DAO.Event;
import com.fdmf.web.DAO.GetEventsListReq;
import com.fdmf.web.DAO.ListEvents;
import com.fdmf.web.services.GetEventService;
import com.fdmf.web.utils.TransformUtils;

@Service
public class GetEventsServiceImpl implements GetEventService{

	@Autowired
	TransformUtils transformUtils;
	
	public ListEvents getEventList(GetEventsListReq getEventsListReq) {
		RestTemplate restTemplate = new RestTemplate();
        String uri = transformUtils.buildURL(getEventsListReq);
        ListEvents lstEvents=new ListEvents();
        List<Event> filteredEvents=new ArrayList<Event>();
        Event[] events = restTemplate.getForObject(uri, Event[].class);
        for (Event event : events) {
            if (getEventsListReq.getEventName().equalsIgnoreCase(event.getType())) {
                filteredEvents.add(event);
            }
        }
        lstEvents.setEventsLst(filteredEvents);
        return lstEvents;
	}

}
