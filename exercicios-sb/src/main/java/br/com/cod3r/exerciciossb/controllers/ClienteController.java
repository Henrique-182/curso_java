package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(1, "Henrique", "123.456.789-00");
	}
	
	@GetMapping("/{id}") // variável
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Ricardo", "987.654.321-00");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Marina", "111.222.333-00");
	}
}
