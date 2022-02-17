package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String getHello() {
		return "Hello Turma 44!";
	}

	@GetMapping("/objetivos")
	public String objetivos() {
		return "<b>Objetivo de aprendizagem da semana:</b>" 
				+ "<br /> " 
				+ "<br /> Finalizar meu terceiro módulo de inglês e conseguir me desenvolver na GeneratiOn!!";
	}
	
	@GetMapping("/bsm")
	public String habilidades() {
			
		return  "<b>Mentalidades</b>"
	             + "<br /> "
	             + "<br /> Orientação ao futuro"
				 + "<br /> Responsabilidade pessoal"
	             + "<br /> Mentalidade de crescimento"
	             + "<br /> Persistência"
	             + "<br /> "
	             + "<br /> <b>Habilidades</b>"
	             + "<br /> "
	             + "<br /> Trabalho em equipe"
	             + "<br /> Atenção aos detalhes"
	             + "<br /> Proatividade"
				 +  "<br /> Comunicação";
	}
	 
}
