package com.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Basic {
	
	public static void main(String[] args){
	
		new Basic().iteracionesBasicas();
//		new Basic().iteracionesFilterCollect();
//		new Basic().iteracionesFiltros();
        
	}
	
	public void iteracionesBasicas(){
		// Ciclo normal
		for (Integer numero : Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) {
			System.out.print(numero + " ");
		}
        
        System.out.println(" -- ");

		// imprimir una lista utilizando expresiones lambda en Java 8
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			.forEach(n -> System.out.print(n + " "));
		
		System.out.println(" -- ");
		
		// otra forma utilizando expresiones Lambdas
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			.forEach(System.out::println);
	}
	
	public void iteracionesFilterCollect() {
		
		System.out.println(" ---------------------------------- ");
		
		ArrayList<Integer> mayores = new ArrayList<Integer>();
		mayores.add(1);
		mayores.add(13);
		mayores.add(5);
		mayores.add(8);
		
		for(Integer aux : mayores){
			if(aux > 5)
				System.out.println(aux);
		}
		
		System.out.println(" ---------------------------------- ");
		
		ArrayList<Integer> mayoresB = (ArrayList<Integer>) Arrays.asList(1,13,5,8)
			.stream()	// se crea el stream
			.filter(x -> x > 5)  // Filtro para obtener los números mayores a 5 y dentro se utiliza la expresión lambda (x -> x > 5)
			.collect( Collectors.toCollection(() -> new ArrayList<Integer>()));  // pone los elementos que se filtró dentro de una nueva lista, dentro se utiliza una expresión lambda
		
		mayoresB.forEach((x) -> System.err.println(x));
		
		System.out.println(" ---------------------------------- ");
		
	}
	
	public void iteracionesFiltros(){
		
		Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 67.0)
		.stream()
		.filter(x -> x > 4)
		.forEach(x -> {System.err.println(x);});
		
	}
}

