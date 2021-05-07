package com.senati.eti.guia5;

import java.util.ArrayList;
import java.util.Scanner;
import com.senati.eti.model.Publicacion;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Publicacion objPub1 = new Publicacion("Los Perros Hambrientos","Ciro Alegría",1);
		Publicacion objPub2 = new Publicacion("Tradiciones Peruanas","Ricardo Palma",1);
		Publicacion objPub3 = new Publicacion("Infromática Global","Bill Gates",2);
		Publicacion objPub4 = new Publicacion("Los Heraldo Negros","César Vallejo",1);
		
		Publicacion objPub5=null;
		String tit="",aut="";
		int tipo=0;
		
		System.out.println("REGISTRO DE LIBROS Y REVISTAS");
		System.out.println("-----------------------------");
		System.out.print("Titulo....: ");
		tit=sc.nextLine();
		System.out.print("Autor.....: ");
		aut=sc.nextLine();
		System.out.print("Tipo [1|2]: ");
		tipo=sc.nextInt();
		
		objPub5 = new Publicacion(tit, aut, tipo);
		ArrayList<Publicacion> arrPublicacion= new ArrayList<Publicacion>();
		
		arrPublicacion.add(objPub1);
		arrPublicacion.add(objPub2);
		arrPublicacion.add(objPub3);
		arrPublicacion.add(objPub4);
		arrPublicacion.add(objPub5);
		
		System.out.println("\nLISTA DE PUBLICACIONES");
		System.out.println("======================");
		System.out.println("");
		
		String patron="%-4s %-24s %-18s %-13s";
		System.out.println(String.format(patron, "N.", "Título", "Autor","Tipo"));
		System.out.println(String.format(patron, "==", "======", "=====","===="));
		for(int x=0;x<arrPublicacion.size();x++) {
			System.out.println(String.format(patron,(x+1),
					arrPublicacion.get(x).getTitulo(),
					arrPublicacion.get(x).getAutor(),
					arrPublicacion.get(x).MostrarTipo()));
		}
		
	}

}
