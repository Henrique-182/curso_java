package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		Calculadora calculadora = ServiceLoader.load(Calculadora.class).findFirst().get();
		
		System.out.println(calculadora.soma(2, 3, 4));
		
		try {
			Field fieldId = calculadora.getClass().getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calculadora, "xyz");
			fieldId.setAccessible(false);
			
			System.out.println(calculadora.getId());
		} catch (Exception e) {
		}
	}	
}
