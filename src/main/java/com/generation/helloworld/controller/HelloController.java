package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String getHello() {
		return "Hello World!";
	}

	@GetMapping("/bsm")
	public String getBsm () {
		return "Atenção aos detalhes, persistência e proatividade!";
	}
	
	@GetMapping("/obj")
	public String getObj () {
		return "Terminar meu módulo de inglês e aprender a utilizar o Spring!";
	}
}
