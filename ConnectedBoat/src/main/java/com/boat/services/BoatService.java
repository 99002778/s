package com.boat.services;

import java.util.HashMap;
import java.util.Map;

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

	public void postBoatdata(BoatData boatdata) {
		// TODO Auto-generated method stub
		boatMap.put(boatdata.getId(),boatdata);
		System.out.println(boatMap);
		
	}
	

}
