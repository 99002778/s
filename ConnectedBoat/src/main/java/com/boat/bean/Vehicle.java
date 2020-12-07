package com.boat.bean;

import org.springframework.context.annotation.Scope;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Scope("singleton")
public class Vehicle {
	//general vehicle properties
	private String hin;
	private String engine_status;
	private Double latitude;
	private Double longitude;
	private Integer engine_coolant_temperature;
	private Integer engine_rpm;
	private Long run_time_since_engine_start = 0L;
	private Double engine_fuel_rate = 2000.0;
	private Double calculated_engine_load;
	private Double engine_percent_torque_data;
	private Long odometer = 250L;
	private String timestamp;
	private boolean flag = false;

}
