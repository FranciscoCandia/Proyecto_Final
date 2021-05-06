package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Operacion="";
		int opc=0;
		float num1=0, num2=0, rpta=0;
		
		System.out.print("Primer número: ");
		num1=sc.nextFloat();
		System.out.print("Segundo número: ");
		num2=sc.nextFloat();
		System.out.print("Operación [1-6]: ");
		opc=sc.nextInt();
		
		switch (opc) {
			case 1:
				Operacion="Suma";
				rpta=num1+num2;
				break;
			case 2:
				Operacion="Resta";
				rpta=num1-num2;
				break;
			case 3:
				Operacion="Producto";
				rpta=num1*num2;
				break;
			case 4:
				if (num2!=0) {
					Operacion="División";
					rpta=num1/num2;}
				else {
					Operacion="No es posible hallar la división";
					rpta=0.00f;}
				break;
			case 5:
				if (num2!=0) {
					Operacion="Resto entero";
					rpta=num1%num2;}
				else {
					Operacion="No es posible hallar el resto entero";
					rpta=0.00f;}
				break;
			case 6:
				Operacion="Promedio";
				rpta=(num1+num2)/2;
				break;
			default:
				Operacion="Operación no encontrada";
				rpta=0.00f;}
		
		System.out.println("\n*****************");
		System.out.println("   RESULTADOS    ");
		System.out.println("*****************");
		System.out.println("Número 1....: "+num1);
		System.out.println("Número 2....: "+num2);	
		System.out.println("Operación...: "+Operacion);
		System.out.println("Resultado...: "+rpta);
	}
}
