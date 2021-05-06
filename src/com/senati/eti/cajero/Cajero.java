package com.senati.eti.cajero;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arrcodigo = {"000-123", "000-456", "000-789", "000-159", "000-212"};
		int[] contraseñas= {0000, 1234, 4586, 2591, 4856};
		String[] arrnombre = {"Joe Castillo", "Rosa Flores", "Carlos Benavides",
							"Sara Montes", "Juan Santos"};
		float[] arrsaldo= {300, 750, 900, 1100, 0};
		
		String codigo="", opc1="Si", opc_Op="Si", cliente="";
		int contra=0, nr=0, opc2=0, opc3=0, opc4=0, monto=0, monto1=0, transf=0;
		
		
		while (opc1.equals("Si")) {
			nr++;
			System.out.println("----------------------");
			System.out.println(" BIENVENIDO AL CAJERO ");
			System.out.println("      AUTOMÁTICO      ");
			System.out.println("----------------------");
			System.out.print("Ingrese número de tarjeta: ");
			codigo=sc.nextLine();
			System.out.println("----------------------");
			int posicion=-1;
			for (int i=0; i<arrcodigo.length; i++) {
				if (arrcodigo[i].equals(codigo)) {
					posicion=i;
					break;}
			}
			if (posicion==-1) {
				System.out.println("Tarjeta no válida");
				System.out.println("----------------------");
				break;}
			else {
				System.out.print("Ingrese Contraseña: ");
				contra=sc.nextInt();
				System.out.println("----------------------");
				if (contra!=contraseñas[posicion]) {
					System.out.println("Contraseña Incorrecta");
					System.out.println("----------------------");
					break;}
				else {
						System.out.println("Bienvenido(a) "+arrnombre[posicion]);
					while (opc_Op.equals("Si")) {
						System.out.println("-------------------");
						System.out.println("    Operaciones");
						System.out.println("-------------------");
						System.out.println("1. Ver Saldo ");
						System.out.println("2. Retirar   ");
						System.out.println("3. Depósitar   ");
						System.out.println("4. Transferir");
						System.out.println("5. Pago de Servicios  ");
						System.out.println("-------------------");
						System.out.print("¿Qué operación realizará?: ");
						opc2=sc.nextInt();
						System.out.println("-------------------");
						switch(opc2) {
							case 1:
								System.out.println("Saldo: "+arrsaldo[posicion]);
								break;
							
							case 2:
								if (arrsaldo[posicion]==0) {
									System.out.println("Saldo insuficiente");
									break;}
								else {
									System.out.println("Saldo a Retirar");
									System.out.println("---------------");
									System.out.println("1. 400.00");
									System.out.println("2. 200.00");
									System.out.println("3. 100.00");
									System.out.println("4. 50.00");
									System.out.println("5. Otra cantidad");
									System.out.println("---------------");
									System.out.print("Opción elegida: ");
									opc3=sc.nextInt();
									System.out.println("---------------");
									switch (opc3) {
										case 1:
											if (arrsaldo[posicion]<400) {
												System.out.println("Saldo insuficiente");
												break;}
											else {
												System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
												arrsaldo[posicion]=arrsaldo[posicion]-400;
												System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
												break;}	
										case 2:
											System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
											arrsaldo[posicion]=arrsaldo[posicion]-200;
											System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
											break;
										case 3:
											System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
											arrsaldo[posicion]=arrsaldo[posicion]-100;
											System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
											break;
										case 4:
											System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
											arrsaldo[posicion]=arrsaldo[posicion]-50;
											System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
											break;
										case 5:
											System.out.print("Ingrese Monto: ");
											monto=sc.nextInt();
											System.out.println("-------------------");
											System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
											arrsaldo[posicion]=arrsaldo[posicion]-monto;
											System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
											break;}
									break;}
							case 3:
								System.out.println("Saldo a Depósitar");
								System.out.println("-----------------");
								System.out.println("1. 400.00");
								System.out.println("2. 200.00");
								System.out.println("3. 100.00");
								System.out.println("4. 50.00");
								System.out.println("5. Otra cantidad");
								System.out.println("---------------");
								System.out.print("Opción elegida: ");
								opc4=sc.nextInt();
								System.out.println("---------------");
								switch (opc4) {
									case 1:
										System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
										arrsaldo[posicion]=arrsaldo[posicion]+400;
										System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
										break;
									case 2:
										System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
										arrsaldo[posicion]=arrsaldo[posicion]+200;
										System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
										break;
									case 3:
										System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
										arrsaldo[posicion]=arrsaldo[posicion]+100;
										System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
										break;
									case 4:
										System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
										arrsaldo[posicion]=arrsaldo[posicion]+50;
										System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
										break;
									case 5:
										System.out.print("Ingrese Monto: ");
										monto1=sc.nextInt();
										System.out.println("-------------------");
										System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
										arrsaldo[posicion]=arrsaldo[posicion]+monto1;
										System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
										break;}
								break;
								
							case 4:
								sc.nextLine();
								System.out.print("Cliente.............: ");
								cliente=sc.nextLine();
								System.out.print("Saldo a transferir..: ");
								transf=sc.nextInt();
								System.out.println("-------------------");
								System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
								arrsaldo[posicion]=arrsaldo[posicion]-transf;
								System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
								System.out.println("\n****Transferencia exitosa****");
								break;
								
							}
							System.out.println("-------------------");
							sc.nextLine();
							System.out.print("¿Realizará otra operación? [Si|No]: ");
							opc_Op=sc.nextLine();
										
							}	
						}
						
						System.out.println("-------------------");
						sc.nextLine();
						System.out.print("¿Realizará otra operación? [Si|No]: ");
						opc_Op=sc.nextLine();}
				
						while (opc_Op.equals("No")) {
							System.out.println("-------------------");
							sc.nextLine();
							System.out.print("¿Desea continuar? [Si|No]: ");
							opc1=sc.nextLine();
							break;}
				}
			
		while (opc1.equals("No")) {
			System.out.println("* * * * * * * * * * * * * ");
			System.out.println("Gracias por su preferencia");
			System.out.println("* * * * * * * * * * * * * ");
			break;}
	}
}

	


