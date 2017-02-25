package org.bhavneshgugnani.springboot.course;

import java.util.List;
import org.bhavneshgugnani.springboot.course.CourseService;
import org.bhavneshgugnani.springboot.vo.Course;
import org.bhavneshgugnani.springboot.vo.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@RequestMapping(value = { "/topics/{id}/courses" })
	public List<Course> getAllCourses(@PathVariable String id) {
		return this.courseService.getAllCourses(id);
	}

	@RequestMapping(value = { "/topics/{topicId}/courses/{id}" })
	public Course getCourse(@PathVariable(value = "id") String id) {
		return this.courseService.getCourse(id);
	}

	@RequestMapping(value = { "/topics/{topicId}/courses/{id}" }, method = { RequestMethod.POST })
	public void addCourse(@RequestBody Course course, @PathVariable(value = "topicId") String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		this.courseService.addCourse(course);
	}

	@RequestMapping(value = { "/topics/{topicId}/course/{id}" }, method = { RequestMethod.PUT })
	public void updateTopic(@PathVariable(value = "id") String id, @RequestBody Course course,
			@PathVariable(value = "topicId") String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		this.courseService.updateCourse(id, course);
	}

	@RequestMapping(value = { "/topics/{topicId}/course/{id}" }, method = { RequestMethod.DELETE })
	public void deleteTopic(String id) {
		this.courseService.deleteTopic(id);
	}
}