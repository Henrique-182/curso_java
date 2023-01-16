module app.calculo {
	
	requires app.logging;
	requires app.api;

	exports br.com.cod3r.app.calculo;
	// exports br.com.cod3r.app.calculo.interno to app.financeiro, app.logging;
	
	opens br.com.cod3r.app.calculo to app.financeiro;
	
	provides br.com.cod3r.app.Calculadora with br.com.cod3r.app.calculo.CalculadoraImpl;
}