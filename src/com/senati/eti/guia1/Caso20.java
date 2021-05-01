package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese precio de venta: ");
		float precio= sc.nextFloat();
		
		float incremento = 0.42f;
		float nuevo_precio = precio*(1+incremento);
		
		System.out.println("\nResultados");
		System.out.println("----------");
		System.out.println("Precio.........: "+ precio);
		System.out.println("Incremento.....: "+ incremento*100 + " %");
		System.out.println("Nuevo Precio...: "+ nuevo_precio);
		
	}
}