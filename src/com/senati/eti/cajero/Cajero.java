package com.senati.eti.cajero;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arrcodigo = {"000-123", "000-456", "000-789", "000-159", "000-212"};
		int[] contraseñas= {8008, 1234, 4586, 2591, 4856};
		String[] arrnombre = {"Joe Castillo", "Rosa Flores", "Carlos Benavides",
							"Sara Montes", "Juan Santos"};
		float[] arrsaldo= {300, 750, 900, 1100, 0};
		
		String codigo="", opc1="SI", opc_Op="SI", cliente="";
		int contra=0, opc2=0, opc3=0, opc4=0, monto=0, monto1=0, transf=0;
		int posicion2=-1, temp=0, temp1=0, temp2=0, temp3=0, x=1;
		int accion1=0,accion2=0,accion3=0,accion4=0,accion6=0, t=1;
		int contra1=0,contra2=0, a=1;
		
			System.out.println("-------------------------");
			System.out.println("  BIENVENIDO AL CAJERO   ");
			System.out.println("       AUTOMÁTICO        ");
			System.out.println("-------------------------");
			System.out.print("Ingrese número de tarjeta: ");
			codigo=sc.nextLine();
			System.out.println("-------------------------");
			int posicion=-1;
			for (int i=0; i<arrcodigo.length; i++) {
				if (arrcodigo[i].equals(codigo)) {
					posicion=i;}
			}
			if (posicion==-1) {
				System.out.println("  --Tarjeta no válida--");
				System.out.println("-------------------------");
				}
			else {
				while (x<=3) {
					System.out.print("Ingrese Contraseña: ");
					contra=sc.nextInt();
					System.out.println("----------------------");
					if (contra!=contraseñas[posicion]) {
						System.out.println("-Contraseña Incorrecta-");
						if (x<3) {
							System.out.println("--Inténtelo de nuevo---");
							System.out.println("-"+(3-x)+" intentos restantes--");
							System.out.println("-----------------------");}
						else if (x==3) {
							System.out.println("---Intentos acabados---");
							System.out.println("-----------------------");
							System.out.println("   Tarjeta bloqueada   ");
							System.out.println("-----------------------");}
						x++;
						
					}
					else {
						x=4;
						System.out.println("Bienvenido(a) "+arrnombre[posicion]);
						//comienzo del bucle
							while (opc_Op.equals("SI")||opc_Op.equals("si")) {
							System.out.println("-------------------------");
							System.out.println("       Operaciones       ");
							System.out.println("-------------------------");
							System.out.println("1. Ver Saldo            ");
							System.out.println("2. Retirar              ");
							System.out.println("3. Depositar            ");
							System.out.println("4. Transferencia        ");
							System.out.println("5. Movimientos          ");
							System.out.println("6. Cambio de contraseña ");
							System.out.println("-------------------------");
							System.out.print("¿Qué operación realizará?: ");
							opc2=sc.nextInt();
							System.out.println("-------------------------");
							switch(opc2) {
								case 1:
									System.out.println("Saldo: "+arrsaldo[posicion]);
									accion1=1;
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
													accion2=1;
													System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
													arrsaldo[posicion]=arrsaldo[posicion]-400;
													System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
													break;}	
											case 2:
												if (arrsaldo[posicion]<200) {
													System.out.println("Saldo insuficiente");
													break;}
												else {
													accion2=1;
													System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
													arrsaldo[posicion]=arrsaldo[posicion]-200;
													System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
													break;}
											case 3:
												if (arrsaldo[posicion]<100) {
													System.out.println("Saldo insuficiente");
													break;}
												else {
													accion2=1;
													System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
													arrsaldo[posicion]=arrsaldo[posicion]-100;
													System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
													break;}
											case 4:
												if (arrsaldo[posicion]<50) {
													System.out.println("Saldo insuficiente");
													break;}
												else {
													accion2=1;
													System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
													arrsaldo[posicion]=arrsaldo[posicion]-50;
													System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
													break;}
											case 5:
												System.out.print("Ingrese Monto: ");
												monto=sc.nextInt();
												System.out.println("-------------------");
												if (monto>arrsaldo[posicion]) {
													System.out.println("Saldo insuficiente");}
												else if (monto>0){
													accion2=1;
													System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
													arrsaldo[posicion]=arrsaldo[posicion]-monto;
													System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);}
												else {
													System.out.println("Cantidad incorrecta");}
												break;
										default: 
											System.out.println("---Opción incorrecta--");
											break;
											}
									break;}
								case 3:
									System.out.println("Saldo a Depositar");
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
											accion3=1;
											System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
											arrsaldo[posicion]=arrsaldo[posicion]+400;
											System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
											break;
										case 2:
											accion3=1;
											System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
											arrsaldo[posicion]=arrsaldo[posicion]+200;
											System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
											break;
										case 3:
											accion3=1;
											System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
											arrsaldo[posicion]=arrsaldo[posicion]+100;
											System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
											break;
										case 4:
											accion3=1;
											System.out.println("Saldo Anterior: "+arrsaldo[posicion]);
											arrsaldo[posicion]=arrsaldo[posicion]+50;
											System.out.println("Nuevo Saldo: "+arrsaldo[posicion]);
											break;
										case 5:
											while (temp1==0) {
												System.out.print("Ingrese Monto: ");
												monto1=sc.nextInt();
												System.out.println("-------------------");
												if (monto1>4000) {
													System.out.println("El monto máximo a depositar es S/4.000");
													System.out.println("      ----Inténtelo de nuevo----      ");
													System.out.println("--------------------------------------");}
												else if (monto1<0){
													System.out.println("---Cantidad incorrecta----");
													System.out.println("----Inténtelo de nuevo----");
													System.out.println("--------------------------");}
												else {
													temp1=1;
													temp2=1;
													accion3=1;
													System.out.println("Saldo Anterior..: S/"+arrsaldo[posicion]);
													arrsaldo[posicion]=arrsaldo[posicion]+monto1;
													System.out.println("Nuevo Saldo.....: S/"+arrsaldo[posicion]);}}
											break;
										default:
											System.out.println("-Opción incorrecta-");}
											break;

								case 4:
									sc.nextLine();
									while (transf==0) {
										System.out.print("Número de tarjeta...: ");
										cliente=sc.nextLine();
										System.out.println("-------------------------");
										for (int i=0; i<arrcodigo.length; i++) {
											if (arrcodigo[i].equals(cliente)) {
												posicion2=i;}}
										if (posicion2==-1) {
											System.out.println("---Tarjeta no encontrada---");
											System.out.println("-----Inténtelo de nuevo----");
											System.out.println("-------------------------");
											}
										else if (arrcodigo[posicion2]==arrcodigo[posicion]){
											System.out.println("----Tarjeta no válida----");
											System.out.println("---Inténtelo de nuevo----");
											System.out.println("-------------------------");}
										else {
											while (temp==0) {
												System.out.print("Saldo a transferir..: ");
												transf=sc.nextInt();
												System.out.println("-------------------------");
												if (transf>5000) {
													System.out.println("El monto máximo a tranferir es S/5.000");
													System.out.println("      ----Inténtelo de nuevo----      ");
													System.out.println("--------------------------------------");}
												else if (transf<0){
													System.out.println("---Cantidad incorrecta---");
													System.out.println("----Inténtelo de nuevo---");
													System.out.println("-------------------------");}
												else if (transf>arrsaldo[posicion]){
													System.out.println("---Saldo insuficiente---");
													System.out.println("---Inténtelo de nuevo---");
													System.out.println("------------------------");}
												else {
													temp=1;
													accion4=1;
													System.out.println("Cliente..........: "+arrnombre[posicion2]);
													System.out.println("N° de tarjeta....: "+arrcodigo[posicion2]);
													System.out.println("Monto transferido: S/"+transf);
													System.out.println("-------------------------");
													System.out.println("Saldo anterior...: S/"+arrsaldo[posicion]);
													arrsaldo[posicion]=arrsaldo[posicion]-transf;
													System.out.println("Nuevo Saldo......: S/"+arrsaldo[posicion]);
													System.out.println("\n-------------------------------");
													System.out.println("**  Transferencia realizada  **");
													System.out.println("******   exitosamente    ******");
													}}
												}
											}
										break;
									
									case 5: //movimientos
										System.out.println("Movimientos realizados recientemente");
										System.out.println("------------------------------------");
										if (accion1==1) {
											System.out.println("> Ver Saldo");}
										if (accion2==1) {
											System.out.println("> Retiro");}
										if (accion3==1) {
											System.out.println("> Deposito");}
										if (accion4==1) {
											System.out.println("> Transferencia");}
										if (accion6==1) {
											System.out.println("> Cambio de contraseña");}
										if (accion1==0&&accion2==0&&accion3==0&&accion4==0&&accion6==0) {
											System.out.println("\n    --No hubo ningún movimiento--   ");}
										break;
										
									case 6:							
										accion6=1;
										while (a>0) {

									        System.out.print("Ingrese la contraseña actual......: ");
											contra=sc.nextInt();
											if (contra!=contraseñas[posicion]) {
												System.out.println("Contraseña Incorrecta");
												System.out.println("----------------------");
											}
										    else {
										    	while (a>0){
										    	System.out.print("Ingrese la nueva contraseña....: ");
										    	contra1=sc.nextInt();
										    	String c=contra1 + "";
										    	if (c.length()!= 4) {
										    		System.out.println("****************************");
										    		System.out.println("----Debe tener 4 Dígitos----");
										    		System.out.println("-----Inténtelo de nuevo-----");
										    		System.out.println("****************************");
										    
										    	}else {
										    		while(a>0) {
										    			System.out.print("Reingrese la nueva contraseña..: ");
										    			contra2=sc.nextInt();
										    			if (contra2 == contra1) {
										    				System.out.println("** Cambio realizado **");
										    				break;
										    		
										    			}else {
										    				System.out.println("****************************");
										    				System.out.println("No coinciden las contraseñas");
										    				System.out.println("****************************");	
										    		}
										    		}
										    		break;
										    		
										    	}
										    	}
										    	break;
										    
										}
										}
										break;	
										
									default:{
										System.out.println("Operación no encontrada");
										break;}
									}
							
								sc.nextLine();
								while (t>0) {
									System.out.println("-------------------------");
									System.out.print("¿Realizará otra operación? [SI|NO]: ");
									opc_Op=sc.nextLine();
									if (opc_Op.equals("NO")||opc_Op.equals("no")) {
										break;
									}
									else if (opc_Op.equals("SI")||opc_Op.equals("si")) {
										break;
									}
									else {
									System.out.println("-------------------------");
										System.out.println("----Inténtelo de nuevo---");
											
									}	
								}		
							}	
						}
									if (opc_Op.equals("NO")||opc_Op.equals("no")) {
										System.out.println("\n* * * * * * * * * * * * * * * * * *");
										System.out.println("    GRACIAS POR SU PREFERENCIA    ");
										System.out.println("           VUELVA PRONTO           ");
										System.out.println("* * * * * * * * * * * * * * * * * *");}
			}
		}
	}
}