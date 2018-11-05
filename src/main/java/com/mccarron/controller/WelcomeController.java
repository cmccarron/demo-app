package com.mccarron.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mccarron.model.Greeting;

@RestController
@RequestMapping("/")
public class WelcomeController {
	@RequestMapping
	public Greeting index(@RequestParam(required = false) String name, HttpServletRequest request) {
		return Greeting.builder().message(String.format("Hello, %s", Optional.ofNullable(name).orElse(request.getRemoteHost()))).build();
	}
}
