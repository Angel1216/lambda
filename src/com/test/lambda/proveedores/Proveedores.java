package com.test.lambda.proveedores;

import java.util.function.Supplier;

public class Proveedores {
	
	public static void main(String[] args) {
		
		new Proveedores().proveedorBasico();

	}
	
	public void proveedorBasico() {
		Supplier<String> cadena = () -> "Ejemplo de Proveedor";
		System.out.println(cadena.get());
	}

}
