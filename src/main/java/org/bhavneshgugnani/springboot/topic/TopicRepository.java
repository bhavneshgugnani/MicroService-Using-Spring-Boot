package org.bhavneshgugnani.springboot.topic;

import org.bhavneshgugnani.springboot.vo.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}