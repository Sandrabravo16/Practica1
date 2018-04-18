package co.edu.usbcali.proyectogestion.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.usbcali.proyectogestion.modelo.Calculadora;

public class Prueba {

	@Test
	public void test() {
		Calculadora calculadora = new Calculadora();
		double indice = 2;
		double radicando = 5;
		double resultado = calculadora.calculaRaiz(indice, radicando);
		System.out.println("La raíz es:"+resultado);
	}

}
