package br.com.cod3r.calculadora.modelo;

public class Memoria {
	
	private static final Memoria instancia = new Memoria();
	
	private String textoAtual = "";

	private Memoria() {
		
	}

	public static Memoria getInstancia() {
		return instancia;
	}

	public String getTextoAtual() {
		return textoAtual;
	}

	public String setTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	
}
