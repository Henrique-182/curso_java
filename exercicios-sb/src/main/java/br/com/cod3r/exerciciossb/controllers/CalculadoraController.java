package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

	@GetMapping(path = "/somar/{x}/{y}")
	public String somar(@PathVariable int x, @PathVariable int y) {
		return x + " + " + y + " = " + (x + y);
	}

	@GetMapping(path = "/subtrair")
	public String subtrair(@RequestParam(name = "x") int x, @RequestParam(name = "y") int y) {
		return x + " - " + y + " = " + (x - y);
	}
}
