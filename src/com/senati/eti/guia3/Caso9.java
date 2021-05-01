package com.senati.eti.guia3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String nombre="", rpta="S", estado="", nom_mayor="", nom_menor="";
		int num_reg=0, con_ctf=0, sin_ctf=0;
		float prom=0, pa=0, prom_mayor=0, prom_menor=0;
		
		while (rpta.equals("S")) {
			num_reg++;
			System.out.println("---------------");
			System.out.println("Registro "+num_reg+":");
			System.out.println("---------------");
			System.out.print("Nombre de alumno: ");
			nombre= sc.nextLine();
			System.out.print("Nota 1: ");
			int nota1 = sc.nextInt();
			System.out.print("Nota 2: ");
			int nota2 = sc.nextInt();
			System.out.print("Nota 3: ");
			int nota3 = sc.nextInt();
			System.out.print("Asistencia [1-12]: ");
			float na = sc.nextInt();
			
			prom = nota1*0.2f + nota2*0.3f + nota3*0.5f;
			pa = na/12*100;
			
			if (prom>=13 && pa>=70) {
				estado="Obtiene Certificado";
				con_ctf++;}
			else {
				estado="Sin Certificado";
				sin_ctf++;}
			
			if (num_reg==1)
				prom_menor=prom;
			if (prom<prom_menor) {
				prom_menor=prom;
				nom_menor=nombre;}
			if (prom>prom_mayor) {
				prom_mayor=prom;
				nom_mayor=nombre;}
								
			System.out.println("--------------");
			System.out.println("--RESULTADOS--");
			System.out.println("--------------");
			System.out.println("Promedio....: "+prom);
			System.out.println("Asistencia..: "+df.format(pa) + " %");
			System.out.println("Estado......: "+estado);
			
			sc.nextLine();// Reinicio del búffer
			System.out.println("--------------");
			System.out.print("¿Registrar otro? [S/N]: ");
			rpta = sc.nextLine();
		}
		
		if (rpta.equals("N"))
			System.out.println("\n-----------------");
			System.out.println("--R E S U M E N--");
			System.out.println("-----------------");
			System.out.println("Número de alumnos: "+num_reg);
			System.out.println("Mayor Promedio: "+prom_mayor+" le pertenece a "+nom_mayor);
			System.out.println("Menor Promedio: "+prom_menor+" le pertenece a "+nom_menor);
			System.out.println("Número de alumnos certificados...: "+con_ctf);
			System.out.println("Número de alumnos sin certificado: "+sin_ctf);
	}

}