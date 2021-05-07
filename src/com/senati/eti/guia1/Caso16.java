package com.senati.eti.guia1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas........: ");
		float ht = sc.nextFloat();
		System.out.print("Ingrese tarifa por hora.........: ");
		float th = sc.nextFloat();
		
		float valor = ht * th;
		float bono = (float) (valor * 0.05) ;
		float total = valor + bono;
		float dolar = (float) (total / 3.24);
		
		System.out.println("------------");
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Sueldo............: " + df.format(valor));
		System.out.println("Bono..............: " + df.format(bono));
		System.out.println("Total.............: " + df.format(total));
		System.out.println("Total en dólares..: " + df.format(dolar));

	}
}