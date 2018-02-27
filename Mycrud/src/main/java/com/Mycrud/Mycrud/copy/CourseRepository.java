package com.Mycrud.Mycrud.copy;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface  CourseRepository extends CrudRepository <Course,String>
{
	public List<String> findById(String id);
}
