package com.test.lambda.predicados;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Predicados {
	
	public static void main(String[] args){
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		System.out.println(" -- Numeros Pares -- ");
		evaluarEnteros(lista, x -> x%2 == 0 );
		
		System.out.println(" -- Numeros Impares -- ");
		evaluarEnteros(lista, l -> l%2 == 1);
		
		System.out.println(" -- Numeros Mayores a 5 -- ");
		evaluarEnteros(lista, k -> k > 5);
		
		System.out.println(" -- Evaluar Cadenas -- ");
		evaluarCadenas();
	}
	
	public static void evaluarEnteros(List<Integer> lista, Predicate<Integer> predicado){
		
		for(Integer n : lista){
			if(predicado.test(n)){
				System.out.println(n + " ");
			}
		}
		System.out.println();
		
		System.out.println(" ------------------------ ");
		
		lista
			.stream()
			.filter(n -> predicado.test(n))
			.forEach(n -> System.out.println(n));
	}
	
	public static void evaluarCadenas(){
		
      Predicate<String> predicate = (s) -> s.length() > 0;
      
      //evalua si la cadena "predicado" es mayor a 0
      System.out.println(predicate.test("predicado")); // true
      //niega la valor de la evaulación
      System.out.println(predicate.negate().test("predicado")); // false
      
	}
	
}
