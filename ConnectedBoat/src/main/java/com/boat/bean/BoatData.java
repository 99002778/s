package com.boat.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoatData {
	private Integer id;
	private String engine_rpm;
	private String engine_coolant_temp;
	private String run_time_since_engine_start;
	private String engine_fuel_rate;
	private String odometer;

}
