package com.senati.eti.guia1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Monto 1: ");
		float monto1= sc.nextFloat();
		System.out.print("Monto 2: ");
		float monto2= sc.nextFloat();
		System.out.print("Monto 3: ");
		float monto3= sc.nextFloat();
		
		float suma=monto1+monto2+monto3;
		
		float calculo1 = (monto1/5f) + (0.2f*monto2);
		float calculo2 = (0.6f*monto3)/2;
		float calculo3 = suma * (1-0.08f);
		
		System.out.println("\nResultados");
		System.out.println("----------");
		System.out.println("Cálculo 1...: "+df.format(calculo1));
		System.out.println("Cálculo 2...: "+df.format(calculo2));
		System.out.println("Cálculo 3...: "+calculo3);
	}
}