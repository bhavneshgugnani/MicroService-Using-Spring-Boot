package org.bhavneshgugnani.springboot.course;

import java.io.Serializable;
import java.util.List;
import org.bhavneshgugnani.springboot.course.CourseRepository;
import org.bhavneshgugnani.springboot.vo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepo;

	public List<Course> getAllCourses(String topicId) {
		return this.courseRepo.findByTopicId(topicId);
	}

	public Course getCourse(String id) {
		return (Course) this.courseRepo.findOne(id);
	}

	public void addCourse(Course course) {
		this.courseRepo.save(course);
	}

	public void updateCourse(String id, Course course) {
		course.setId(id);
		this.courseRepo.save(course);
	}

	public void deleteTopic(String id) {
		this.courseRepo.delete(id);
	}
}