package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private String name1=null;

    @RequestMapping("/greeting")
    @ResponseBody
      
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) throws ResourceNotFoundException {
    	//String str = name1.toString();
    	
    	if (name1 == null) {
			throw new ResourceNotFoundException("Employee Name cannot be NULL");
		}
    	
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    //
    

}
