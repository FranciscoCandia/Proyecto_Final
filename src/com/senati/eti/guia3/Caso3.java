package com.senati.eti.guia3;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		int x=1;
		int producto=1;
		
		if (n>7) 
			System.out.println("El número es superior de 7");
		else if (n<1)
			System.out.println("El número es inferior a 1");
		else 
			while (x<=n) {
				producto *= x;
				if (x<n)
					System.out.print(x+" x ");
				else if (x==n)
					System.out.print(x+" = "+ producto);
				
			
			x++;
		}
	}

}
