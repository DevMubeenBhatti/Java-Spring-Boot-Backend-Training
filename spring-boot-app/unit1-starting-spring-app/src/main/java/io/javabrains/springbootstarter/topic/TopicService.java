package io.javabrains.springbootstarter.topic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService implements ItopicService {
	private List<Topic> topics =new ArrayList<> (Arrays.asList(
			new Topic("Spring", "Spring Framwork", "Spring Framework Description"),
			new Topic("java","Spring Framwork", "Spring Framework Description"),
			new Topic("javaScript", "Spring Framwork", "Spring Framework Description"),
			new Topic("HTML", "HTML Spring Framwork", "HTML Spring Framework Description")
			));
	
	@Override
	public List<Topic> getAllTopics(){
		return topics;
	}
	@Override
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	@Override
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	@Override
	public void updateTopic(String id, Topic topic) {
		for(int i=0; i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	@Override
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
//	@Override
//	public List<Topic> getAllTopics() {
//		// TODO Auto-generated method stub
//		return topics;
//	}
}
