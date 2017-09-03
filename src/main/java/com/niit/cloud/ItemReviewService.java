package com.niit.cloud;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ItemReviewService implements ItemReview{

	@Override
	@HystrixCommand(fallbackMethod="getFromCache")
	public String getReview() {
		// TODO Auto-generated method stub
		
		//return "Hi";
		throw new RuntimeException("Runtime Error Message");
	}
	
	public String getFromCache()
	{
		return "Data returned from Cache";
	}

}
