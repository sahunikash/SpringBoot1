package com.main.model.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Topic;
import com.springJPA.TopicRepository;



@Service
public class TopicService
{
	@Autowired
	TopicRepository topicrepository;

	List<Topic> topics = new ArrayList( Arrays.asList(
				
				new Topic(1,"SpringBoot","SpringBoot Description"),
				new Topic(2,"java","Code$adv Description"),
				new Topic(3,"Hibernate","hibernate description")
	                                 ));
	
	
	
	public List<Topic> getallTopics()
	{
		//return topics;
		
		List<Topic> topics = new ArrayList<>();
		topicrepository.findAll().forEach(topics::add);
		return topics;
	}
	
	
	public Topic getTopic(int id)
	{
		for(Topic t:topics) {
			if(t.getId()==id)
				return t;
		}
		return null;
				
	}
	
	
	public void addTopic(Topic topic)
	{
		topicrepository.save(topic);
		
	}


	public void UpdateTopic(Topic topic ,int id) 
	{
		
		for(Topic t : topics)
		{
			if(t.getId()==id)
			{
				topics.set(id, topic);
			}
		}
	}


	public void deleteTopic(int id) {
		
		for(Topic t : topics)
		{
			if(t.getId()==id)
			{
			    topics.remove(id);
			}
		}
		
		
	}
	
}