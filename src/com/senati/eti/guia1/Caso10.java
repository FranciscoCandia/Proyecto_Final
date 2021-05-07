package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, r, p ;
		
		System.out.print("Radio...: ");
		r = sc.nextInt();
		a = ((r * r) * 3.14f);
		p = (2* r * 3.14f) ;
		
		
		System.out.println("------------");
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Área de un círculo..: " + a);
		System.out.println("Perímetro...........: " + p);
		
		
		

	}

}