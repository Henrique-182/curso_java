package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "abc";

	private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

	public double soma(double... numeros) {
		Logger.info("Somando...");
		return operacoesAritmeticas.soma(numeros);
	}

	public String getId() {
		return id;
	}
	
}
