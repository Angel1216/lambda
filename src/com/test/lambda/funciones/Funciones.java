package com.test.lambda.funciones;

import java.util.function.Function;

public class Funciones {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> suma = x -> x + 8;
		System.out.println("La suma de 5 + 8: " + suma.apply(5));
		
		Function<Integer, Integer> suma2 = y -> y + 10;
		System.out.println("La suma de 5 + 10: " + suma2.apply(5));
		
		Function<String, Integer> tamanioCadena = (str) -> str.length();
		String cadena = "AngelML1231";
		System.out.println("El tamaño de la cadena es: " + tamanioCadena.apply(cadena) + " caracteres");
	}

}
