package com.fdmf.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fdmf.web.DAO.EventsDetails;
import com.fdmf.web.DAO.EventsListResponse;
import com.fdmf.web.DAO.GetEventsListReq;
import com.fdmf.web.DAO.ListEvents;
import com.fdmf.web.services.GetEventService;
import com.fdmf.web.utils.TransformUtils;

@Controller
public class HomeController {
	
	@Autowired
	private GetEventService getEventService;
	
	@Autowired
	private TransformUtils transformUtils;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		return "home";

	}

	
	@RequestMapping(value="/ajax/getEventsList", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  EventsListResponse getEventsList(@RequestBody GetEventsListReq getEventsListReq){
		EventsListResponse eventsListResponse=null;
		try {
		ListEvents lstEvents=getEventService.getEventList(getEventsListReq);
		eventsListResponse=transformUtils.convertWebToUIEventsList(lstEvents);
		for(EventsDetails event: eventsListResponse.getEventDetails()) {
			System.out.println(event.toString());
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return eventsListResponse;
	}

}