package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private AtomicInteger integer=new AtomicInteger();

	@RequestMapping("/hello")
	public Map<String, Object> hello() {
		Map<String, Object> data = new HashMap<>();
		int count = integer.incrementAndGet();
		data.put("count", count);
		data.put("time", System.currentTimeMillis());
		return data;
	}
}
