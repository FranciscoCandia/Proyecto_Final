package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0,num2=0,num3=0,num4=0;
		
		System.out.print("Ingrese primer n�mero...: ");
		num1=sc.nextInt();
		System.out.print("Ingrese segundo n�mero..: ");
		num2=sc.nextInt();
		System.out.print("Ingrese tercer n�mero...: ");
		num3=sc.nextInt();
		System.out.print("Ingrese cuarto n�mero...: ");
		num4=sc.nextInt();
		
		System.out.println("\nResultado");
		System.out.println("---------");
		
		if (num1==num2 && num1==num3 && num1==num4) {
			System.out.println("Todos los n�meros son iguales");
		}
		else if(num1<num2 && num1<num3 && num1<num4) {
			System.out.println("El primer n�mero es el menor");}
		else if(num2<num1 && num2<num3 && num2<num4) {
			System.out.println("El segundo n�mero es el menor");}
		else if(num3<num2 && num3<num1 && num3<num4) {
			System.out.println("El tercero n�mero es el menor");}
		else if(num4<num2 && num4<num1 && num4<num3) {
			System.out.println("El cuarto n�mero es el menor");}

	}
}