package com.springJPA;

import org.springframework.data.repository.CrudRepository;

import com.main.model.Topic;

public interface TopicRepository extends CrudRepository<Topic,Integer> 
{

}
