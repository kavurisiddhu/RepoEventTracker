package com.fdmf.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fdmf.web.DAO.EventsDetails;
import com.fdmf.web.DAO.EventsListResponse;
import com.fdmf.web.DAO.GetEventsListReq;
import com.fdmf.web.DAO.ListEvents;
import com.fdmf.web.utils.GitHubClient;
import com.fdmf.web.utils.TransformUtils;

@Controller
public class HomeController {
	

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		return "hello";

	}

	
	@RequestMapping(value="/ajax/getEventsList", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  EventsListResponse getEventsList(@RequestBody GetEventsListReq getEventsListReq){
		EventsListResponse eventsListResponse;
		System.out.println("Request json is ");
		System.out.println(getEventsListReq.toString());
		GitHubClient gitHubClient=new GitHubClient();
		ListEvents lstEvents=gitHubClient.getEventList(getEventsListReq);
		TransformUtils transformUtils=new TransformUtils();
		eventsListResponse=transformUtils.convertWebToUIEventsList(lstEvents);
		for(EventsDetails event: eventsListResponse.getEventDetails()) {
			System.out.println(event.toString());
		}
		
		return eventsListResponse;
	}

}