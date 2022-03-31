package clases;

import java.util.Scanner;

public class Actividad {
		static int campoA;
		static int campoB;
		public static void main(String[] arg) {
			//Campos
			Scanner scan = new Scanner(System.in);
			
			
			int resultado; 
			
			//Ingresando los datos
			System.out.println("Ingrese el campo A:");
			campoA = scan.nextInt();
			
			System.out.println("Ingrese el campo B:");
			campoB = scan.nextInt();
			
			//Solicitando la operacion
			int operacion;
			System.out.println("Ingrese la operacion a realizar: Suma[1] o Resta[2]");
			operacion = scan.nextInt();
			//validacion de los datos ingresados 
			int valido = 0;
			while (valido <= 0) {
				valido = valido + validar(campoA, campoB);
			}
			if(operacion == 1) {
				resultado = campoA + campoB; 
				System.out.println("La Suma es: " + resultado);
			}else if(operacion == 2) {
				resultado = campoA - campoB; 
				System.out.println("La Resta es: " + resultado);
			}
			
		}
		
		
		private static int validar(int A, int B) {
			Scanner scan = new Scanner(System.in);
			if(A >= 300 && B >= 10 && B <100) {
				return 1;
			}
			if(A < 300){
				System.out.println("Campo A errado");
				System.out.println("El campo A debe ser de tres dígitos cuyo primer valor digito es mayor de 3.");	
				System.out.println("Ingrese el campo A:");
				campoA = scan.nextInt();
				System.out.println(campoA);
				
				
			}
			if( B >=  10) {
				System.out.println("Campo B errado");
				System.out.println("El campo b debe ser de dos dígitos.");
				System.out.println("Ingrese el campo B:");
				campoB = scan.nextInt();
				System.out.println(campoB);
			}else if(B <= 99) {
				System.out.println("Campo B errado");
				System.out.println("El campo b debe ser de dos dígitos.");
				System.out.println("Ingrese el campo B:");
				campoB = scan.nextInt();
				System.out.println(campoB);
			}
			
			
			return -1;
		}
		
}
