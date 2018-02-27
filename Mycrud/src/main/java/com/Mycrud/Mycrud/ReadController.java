package com.Mycrud.Mycrud;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadController 
{
	@Autowired
	private ReadService readservice;
	
	@RequestMapping("/read")
	public List<Read> getAllTopics()
	{
		return readservice.getAllTopics();
	}
	
	@RequestMapping("/read/{id}")
	public Read getTopic(@PathVariable String id)
	{
		return readservice.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void add(@RequestBody Read topic)
	{
		readservice.add(topic);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/update/{id}")
	public void update(@RequestBody Read topic,@PathVariable String id)
	{
		readservice.update(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public void delete(@PathVariable String id)
	{
		readservice.deleteById(id);
	}
	
}
