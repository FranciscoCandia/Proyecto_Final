package com.senati.eti.guia4;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float suma=0, c;
		int num_par=0, num_impar=0;
		
		Integer[] num = new Integer[5];
		c=num.length;
		
		for (int x=0; x<num.length; x++) {
			System.out.print("Número "+(x+1)+": ");
			num[x] = sc.nextInt();
			suma=num[x]+suma;}
		
		for (int i=0; i<num.length; i++) {
			if (num[i]%2==0) 
				num_par++;
			else
				num_impar++;}
		
		System.out.println("\n----------------");
		System.out.println("   RESULTADOS   ");
		System.out.println("----------------");
		System.out.println("Cantidad de números pares....: "+num_par);
		System.out.println("Cantidad de números impares..: "+num_impar);
		System.out.println("Promedio de los números......: "+(suma/c));		
	}
}
