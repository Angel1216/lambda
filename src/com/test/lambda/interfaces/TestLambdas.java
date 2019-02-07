package com.test.lambda.interfaces;

public class TestLambdas {
	
	public static void main(String[] args){
		
		int x = 23;
		int y = 27;
		
		// Se implementa el metodo de la interfaz con una expresion Lambda
		IFuncionLambda funcionLambda = (a, b) -> {
			a = a * 2;
			b = b * 2;
			
			int c = (a + b) * 2;
			System.out.println(c);
		};
		
		// Se utiliza el metodo de la interface, con la implementacion personalizada,
		// enviandole los valores de x y y
		funcionLambda.suma(x, y);
	}

}
