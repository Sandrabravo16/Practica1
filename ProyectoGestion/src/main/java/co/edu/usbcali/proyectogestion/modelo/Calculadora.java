package co.edu.usbcali.proyectogestion.modelo;

public class Calculadora {

	public double calculaRaiz(double indice, double radicando) {
		double resultado = Math.pow(radicando, 1.0 / indice);
		return resultado;
	}

}
