package br.com.cod3r.app.calculo.interno;

import java.util.Arrays;

public class OperacoesAritmeticas {

	public double soma(double... numeros) {
		return Arrays.stream(numeros).reduce(0.0, (total, numeroAtual) -> total + numeroAtual);
	}
	
}
