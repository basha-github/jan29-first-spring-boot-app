package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	@RequestMapping("/hyd/greetings/hello")
	public String m1(@RequestParam String username){
		
		return "hello "+username+" how r u ?";
		
	}
	
	
	@RequestMapping("/find/max")
	public MaxMin m1(@RequestParam int a, int b,int c){
		int max=0,min=0;
		
		if(a>b) {
			max=a;
			min=b;
		}
		else {
			max=b;
			min=a;
		}
		if(c>max) max = c;
		if(c<min) min=c;
		
		MaxMin maxMin = new MaxMin(max,min);
		
		
		return maxMin;
		
	}
	
	
	
}
