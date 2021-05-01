package com.senati.eti.guia3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String nombre="", rpta="S", nom_mayor="", nom_menor="", nom_min="";
		int num_reg=0, cont=0;
		float sueldo=0, bono=0, porcentaje=0, neto=0, dscto=0;
		float neto_mayor=0, neto_menor=0, mayor_min=0;
		
		while (rpta.equals("S")) {
			num_reg++;
			System.out.println("******************************");
			System.out.println("Registro de Empleados ("+num_reg+")");
			System.out.println("******************************");
			System.out.print("Empleado...........: ");
			nombre= sc.nextLine();
			System.out.print("Horas trabajadas...: ");
			int horas = sc.nextInt();
			System.out.print("Tarifa por hora....: ");
			int tarifa = sc.nextInt();
			System.out.print("Minutos de tardanza: ");
			int minutos = sc.nextInt();
			
			sueldo=horas*tarifa;
			porcentaje=horas/80f;
						
			if (horas<=50)
				bono=0*sueldo;
			if (horas>50 && horas<=60)
				bono=0.02f*sueldo;
			if (horas>60 && horas<=70)
				bono=0.08f*sueldo;
			if (horas>70 && horas<=80)
				bono=0.13f*sueldo;
			if (horas>80)
				bono=0.15f*sueldo;
			
			if (minutos<=15)
				dscto=0*sueldo;
			if (minutos>15 && minutos<=30)
				dscto=(0.003f*sueldo)*minutos;
			if (minutos>30)
				dscto=(0.005f*sueldo)*minutos;
			
			if (minutos>mayor_min) {
				mayor_min=minutos;
				nom_min=nombre;}
			if (porcentaje*100>90)
				cont++;
			
			neto=(sueldo+bono)-dscto;
			
			if (num_reg==1)
				neto_menor=neto;
			if (neto<neto_menor) {
				neto_menor=neto;
				nom_menor=nombre;}
			if (neto>neto_mayor) {
				neto_mayor=neto;
				nom_mayor=nombre;}
						
			System.out.println("******************");
			System.out.println("    RESULTADOS  ");
			System.out.println("******************");
			System.out.println("Sueldo bruto..: "+sueldo);
			System.out.println("Bonificación..: "+bono);
			if (dscto==0)
				System.out.println("Descuento.....: "+dscto);
			else
				System.out.println("Descuento.....: "+df.format(dscto));
			System.out.println("Sueldo neto...: "+neto);
			System.out.println("% Alcanzado...: "+df.format(porcentaje*100)+"%");
			System.out.println("******************");
			
			sc.nextLine();// Reinicio del búffer
			System.out.print  ("¿Nuevo empleado? [S/N]: ");
			rpta = sc.nextLine();
		}
		
		if (rpta.equals("N"))
			System.out.println("\n-----------------");
			System.out.println("--R E S U M E N--");
			System.out.println("-----------------");
			System.out.println("Número de empleados: "+num_reg);
			System.out.println("Sueldo neto mayor: "+neto_mayor+" le pertenece a "+nom_mayor);
			System.out.println("Sueldo neto menor: "+neto_menor+" le pertenece a  "+nom_menor);
			System.out.println("Empleado con la mayor cantidad de minutos de tardanza: "+nom_min+" ("+mayor_min+" min.)");
			System.out.println("Cantidad de empleados con del 90% de la meta: "+cont);
	}
}
