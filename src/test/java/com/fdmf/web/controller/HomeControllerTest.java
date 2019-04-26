package com.fdmf.web.controller;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fdmf.web.DAO.EventsListResponse;
import com.fdmf.web.DAO.GetEventsListReq;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestBeanConfig.class)
public class HomeControllerTest {
	
	@Autowired
	HomeController homeController;
	
	@Test
	public void getEventsList_Test() {
		GetEventsListReq listReq=new GetEventsListReq();
		listReq.setUser("kavurisiddhu");
		listReq.setRepo("RepoEventTracker");
		listReq.setEventName("CreateEvent");
		
		EventsListResponse res=homeController.getEventsList(listReq);
		assertNotNull(res);
	}
}
