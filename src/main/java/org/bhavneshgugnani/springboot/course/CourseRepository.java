package org.bhavneshgugnani.springboot.course;

import java.util.List;
import org.bhavneshgugnani.springboot.vo.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> findByTopicId(String var1);
}