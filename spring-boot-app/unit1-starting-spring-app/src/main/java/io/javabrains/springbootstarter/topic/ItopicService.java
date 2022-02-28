package io.javabrains.springbootstarter.topic;

import java.util.List;

public interface ItopicService {
	public List<Topic> getAllTopics();
	public Topic getTopic(String id);
	public void addTopic(Topic topic);
	public void updateTopic(String id, Topic topic);
	public void deleteTopic(String id);
}
