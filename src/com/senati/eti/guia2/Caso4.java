package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0,num2=0,num3=0,num4=0;
		
		System.out.print("Ingrese primer número...: ");
		num1=sc.nextInt();
		System.out.print("Ingrese segundo número..: ");
		num2=sc.nextInt();
		System.out.print("Ingrese tercer número...: ");
		num3=sc.nextInt();
		System.out.print("Ingrese cuarto número...: ");
		num4=sc.nextInt();
		
		System.out.println("\nResultado");
		System.out.println("---------");
		
		if (num1==num2 && num1==num3 && num1==num4) {
			System.out.println("Todos los números son iguales");
		}
		else if(num1<num2 && num1<num3 && num1<num4) {
			System.out.println("El primer número es el menor");}
		else if(num2<num1 && num2<num3 && num2<num4) {
			System.out.println("El segundo número es el menor");}
		else if(num3<num2 && num3<num1 && num3<num4) {
			System.out.println("El tercero número es el menor");}
		else if(num4<num2 && num4<num1 && num4<num3) {
			System.out.println("El cuarto número es el menor");}

	}
}