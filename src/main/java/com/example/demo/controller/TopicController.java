package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;
@RestController
public class TopicController {
  @GetMapping("/topics/values")
public List<List<String>> getAllTopicValues() {
    List<Topic> topics = List.of(
        new Topic("spring", "Spring Framework", "Spring Framework Description"),
        new Topic("java", "Core Java", "Core Java Description"),
        new Topic("javascript", "Javascript", "Javascript Description")
    );

    return topics.stream()
                 .map(t -> List.of(t.getId(), t.getName(), t.getDescription()))
                 .toList();
}

}
