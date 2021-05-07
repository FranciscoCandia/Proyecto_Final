package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota...: ");
		int nota = sc.nextInt();
		
		String estado="";
		
		if (nota>=0 && nota<8) {
			estado="Sin palabras";}
		else if (nota>=8 && nota<11) {
			estado="Malo";}
		else if (nota>=11 && nota<15) {
			estado="Regular";}
		else if (nota>=15 && nota<18) {
			estado="Notable";}
		else if (nota>=18 && nota<=20) {
			estado="Excelente";}
		
		System.out.println("\nResultados");
		System.out.println("----------");
		System.out.println("Estado obtenido: "+estado);
	}
}
