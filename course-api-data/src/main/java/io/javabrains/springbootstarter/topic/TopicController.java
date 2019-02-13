package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	int b;
	@Autowired	
	private TopicService topService;

	 @RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{ 
		return topService.getAllTopics();

	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		int a;
		a = b+1;
		return topService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) //convert the JSON data to Topic
	{
		topService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) //convert the JSON data to Topic
	{
		topService.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@RequestBody Topic topic, @PathVariable String id) //convert the JSON data to Topic
	{
		topService.deleteTopic(id,topic);
	}

}
