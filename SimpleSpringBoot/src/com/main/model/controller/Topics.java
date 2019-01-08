package com.main.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Topic;
import com.main.model.services.TopicService;

@RestController
public class Topics 
{


	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> topics()
	{
		return topicservice.getallTopics();
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable int id)
	{
		return topicservice.getTopic(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value=("/topics"))
	public void addTopic(@RequestBody Topic topic)
	{
		topicservice.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/topics/{id}"))
	public void updateTopic(@RequestBody Topic topic , @PathVariable int id)
	{
		topicservice.UpdateTopic(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value=("/topics/{id}"))
	public void deleteTopic(@PathVariable int id)
	{
		topicservice.deleteTopic(id);
	}
	
	
}

