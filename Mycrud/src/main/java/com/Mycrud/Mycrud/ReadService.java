package com.Mycrud.Mycrud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadService
{
	
	
	@Autowired
	ReadRepository read;
	
	public List<Read> getAllTopics()
	{
		
		List<Read> topics=new ArrayList <>();
		
		read.findAll().forEach(topics::add);
		return topics;
		
		
		
	}
	
	
	public void add(Read topic) 
	{
		
		
		read.save(topic);
	}

	public void update(String id,Read topic) 
	{
		
		read.save(topic);
		
		
		
	}

	public void deleteById(String id) 
	{
		read.delete(id);
		
	}

	public Read getTopic(String id) {
		// TODO Auto-generated method stub
		return read.findOne(id);
	}

		/*private List<Read> topics=new ArrayList<>(Arrays.asList(new Read("1","sahib"),new Read("2","raja"),new Read("3","ishu")));
		public List<Read> getAllTopics()
		{
			return topics;
		}
		
		public Read getTopic(String id)
		{
			return  (Read) topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();
		}

		public void add(Read topic) 
		{
			topics.add(topic);
		}

		public void update(String id,Read topic) {
			
			
			for(int i=0;i<topics.size();i++)
			{
				Read t=topics.get(i);
				if(t.getId().equals(id))action
				{
					topics.set(i, topic);
					
				}
			}
			
		}

		public void deleteById(String id) 
		{
			for(int i=0;i<topics.size();i++)
			{
				Read l=topics.get(i);
				if(l.getId().equals(id))
				{
					topics.remove(i);
				}
			}
			
		}
*/
}
