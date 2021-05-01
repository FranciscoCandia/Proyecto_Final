package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre="", producto="", pago="";
		int c=0, precio=0, importe=0;
		float dscto=0, incrmto=0;
				
		System.out.print("Ingrese cliente: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese producto [TB/LT/MN/IM]: ");
		producto=sc.nextLine();
		System.out.print("Ingrese cantidad: ");
		c=sc.nextInt();
		sc.nextLine();
		System.out.print("Ingrese forma de pago [C1/C2]: ");
		pago=sc.nextLine();
		
		switch (producto) {
			case "TB":
				precio=350;
				producto="Tablet";
				break;
			case "LT":
				precio=2300;
				producto="Laptop";
				break;
			case "MN":
				precio=850;
				producto="Monitor";
				break;
			case "IM":
				precio=680;
				producto="Impresora";
				break;
			default:
				break;				
		}	
		importe = precio*c;
		
		System.out.println("\n    RESULTADOS    ");
		System.out.println("------------------");
		System.out.println("Cliente........: "+nombre);
		System.out.println("Producto.......: "+producto);
		System.out.println("Precio.........: "+precio);
		System.out.println("Cantidad.......: "+c);
		System.out.println("Importe........: "+importe);
		
		switch (pago) {
			case "C1":
				dscto=0.05f*importe;
				pago="Contado";
				System.out.println("Forma de pago..: "+pago);
				System.out.println("Descuento......: "+dscto);
				System.out.println("Total a pagar..: "+(importe-dscto));
				break;
			case "C2":
				incrmto=0.12f*importe;
				pago="Crédito";
				System.out.println("Forma de pago..: "+pago);
				System.out.println("Incremento.....: "+incrmto);
				System.out.println("Total a pagar..: "+(importe+incrmto));
				break;
			default:
				break;
		}
	}
}