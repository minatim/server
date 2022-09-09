package com.timeline.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
@RequestMapping("/server")
public class UserController {
	private static final String server = "server";

	@GetMapping("/test")
	@RateLimiter(name = server)
	public ResponseEntity<String> generateToken(){
		System.out.println("--inside Server--");
		return new ResponseEntity<String>("server called sucessfully--", HttpStatus.OK);
	}
	@GetMapping("/demo")
	public ResponseEntity<String> demo(){
			System.out.println("---working----");
			return new ResponseEntity<String>("sucess--", HttpStatus.OK);
		}
	}

