package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1=0,num2=0, rpta1=0, rpta2=0, rpta3=0;
		
		System.out.print("Ingrese primer número..: ");
		num1=sc.nextFloat();
		System.out.print("Ingrese segundo número.: ");
		num2=sc.nextFloat();
		
		rpta1=(num1+num2)/2;
		rpta2=num1*(1+0.2f);
		rpta3=num2*(1-0.3f);
		
		System.out.println("--------------");
		System.out.println("  Resultados  ");
		System.out.println("--------------");
		System.out.println("Resultado 1...: "+rpta1);
		System.out.println("Resultado 2...: "+rpta2);
		System.out.println("Resultado 3...: "+rpta3);
		

	}

}
