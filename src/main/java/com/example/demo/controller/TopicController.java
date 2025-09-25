package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;
@RestController
public class TopicController {
  @Autowired
  private TopicService topicService;


  @GetMapping("/topics/values")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }
    
  @GetMapping("/topics/values/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
}
