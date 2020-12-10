package com.boat.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.boat.bean.BoatData;
//import com.ltts.exve.carsim.bean.VehicleSimulationAudi;
@Service	
public class BoatService {
	
	
	Map<Integer,BoatData> boatMap = new HashMap<Integer, BoatData>();

	public BoatService() {
	super();
	// TODO Auto-generated constructor stub
	}

	@Autowired
	private KafkaTemplate<String, BoatData> kafkaTemplate;

	 

	private static final String TOPIC = "BoatData";

	 

	public void postBoatdata(BoatData boatdata) {
	// TODO Auto-generated method stub
	boatMap.put(boatdata.getId(),boatdata);
	// System.out.println(boatMap);
	kafkaTemplate.send(TOPIC, boatdata);

	}
	 

	 


	public String post() {

	 

	kafkaTemplate.send(TOPIC, new BoatData(101,"4533","35c","2hr","5lph","2500km"));

	 

	return "Published successfully";
	}

	 
	

}
