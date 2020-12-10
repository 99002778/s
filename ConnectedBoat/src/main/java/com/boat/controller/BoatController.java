package com.boat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.boat.bean.BoatData;
import com.boat.services.BoatService;

@RestController
public class BoatController {
	@Autowired
	BoatService boatservice;

	@GetMapping("/boat/get")
	public String getController()
	{
	return "I am in get";
	}

	@PostMapping("/boat/post")
	public String postController(@RequestBody BoatData boatdata)
	{
	System.out.println("in post");
	boatservice.postBoatdata(boatdata);
	return"sucessfully posted";

	}

	@Autowired
	private KafkaTemplate<String, BoatData> kafkaTemplate;

	 

	private static final String TOPIC = "BoatData";

	 

	@GetMapping("/publish")
	public String post() {

	 

	kafkaTemplate.send(TOPIC, new BoatData(101,"4500","35c","2hr","5lph","2500km"));
	//kafkaTemplate.send(TOPIC, new BoatData());

	 

	return "Published successfully";
	}
}
