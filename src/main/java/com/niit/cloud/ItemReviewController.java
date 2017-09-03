package com.niit.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCircuitBreaker
@EnableHystrix
public class ItemReviewController {
    @Autowired
	private ItemReview itemReview;
	 @RequestMapping(value = "/itemreview")
	 public String getItemReview(){
	    return itemReview.getReview();
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
