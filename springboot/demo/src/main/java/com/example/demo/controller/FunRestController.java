package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello()
	{
		return "Hello Boss!! The time on server is "+ LocalDateTime.now();
	}
}
