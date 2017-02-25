package org.bhavneshgugnani.springboot.topic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.bhavneshgugnani.springboot.topic.TopicRepository;
import org.bhavneshgugnani.springboot.vo.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepo;

	public List<Topic> getAllTopics() {
		ArrayList<Topic> topics = new ArrayList<Topic>();
		this.topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		return (Topic) this.topicRepo.findOne(id);
	}

	public void addTopic(Topic topic) {
		this.topicRepo.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topic.setId(id);
		this.topicRepo.save(topic);
	}

	public void deleteTopic(String id) {
		this.topicRepo.delete(id);
	}
}