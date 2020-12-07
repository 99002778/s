  package com.boat.scheduler;


	
	import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.boat.bean.BoatData;


	@EnableScheduling
	@Component
	@SuppressWarnings("unused")
	public class BoatSimulator {
		 
		 

	    Logger logger = LoggerFactory.getLogger(BoatSimulator.class);

	   

	 


	    
	     @Scheduled(initialDelayString="${TIMEOUT_SCHEDULER_INTIAL_DELAY}",
	     fixedRateString="${TIMEOUT_SCHEDULER_DELAY}")
	     
	    /* @Scheduled(fixedDelay = 10000, initialDelay = 10000) */
	     public void fixedDelaySch() {
	          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	          Date now = new Date();
	          String strDate = sdf.format(now);
	          System.out.println("Fixed Delay scheduler:: " + strDate);
	       }
	    

	 
	  
	    
	    
	    
	    
	    
	}


