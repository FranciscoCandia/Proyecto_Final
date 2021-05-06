package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String nombre="";
		float tarifa=0, min=0, importe=0, bono=0, dscto=0, meta=0, horas=0;
		
		System.out.print("Empleado: ");
		nombre=sc.nextLine();
		System.out.print("Horas trabajadas: ");
		horas=sc.nextFloat();
		System.out.print("Tarifa por hora: ");
		tarifa=sc.nextFloat();
		System.out.print("Minutos de tardanza: ");
		min=sc.nextFloat();
		
		importe=tarifa*horas;
		
		if (horas>60) 
			bono=importe*0.13f;
		else
			bono=importe*0.04f;
		
		if (min>15)
			dscto=importe*0.03f;
		else
			dscto=importe*0;
		
		meta=(horas/70)*100;
		
		System.out.println("\n*****************");
		System.out.println("   RESULTADOS    ");
		System.out.println("*****************");
		System.out.println("Trabajador........: "+nombre);
		System.out.println("Horas trabajadas..: "+horas);
		System.out.println("Tarifa por hora...: "+tarifa);
		System.out.println("Importe...........: "+importe);
		System.out.println("Bono..............: "+df.format(bono));
		if (dscto==0)
			System.out.println("Descuento.........: "+dscto);
		else
			System.out.println("Descuento.........: "+df.format(dscto));
		System.out.println("Meta Alcanzada....: "+df.format(meta)+"%");
	}

}
