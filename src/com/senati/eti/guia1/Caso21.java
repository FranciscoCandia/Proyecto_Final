package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese gasto: ");
		float gasto= sc.nextFloat();
		
		float dscto = 0.12f;
		float nuevo_gasto = gasto*(1-dscto);
		
		System.out.println("\nResultados");
		System.out.println("----------");
		System.out.println("Gasto.........: "+ gasto);
		System.out.println("Descuento.....: "+ dscto*100 + " %");
		System.out.println("Nuevo Gasto...: "+ nuevo_gasto);

	}
}