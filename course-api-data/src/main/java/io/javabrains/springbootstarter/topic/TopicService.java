package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "spring framework", "spring framework description"),
					new Topic("java", "java framework", "java framework description"),
					new Topic("javaScript", "javaScript framework", "javaScript framework description")));

	public List<Topic> getAllTopics() {
		topicRepository.findAll();
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);

	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id, Topic topic) {
		topics.removeIf(t -> t.getId().equals(id));

	}
}