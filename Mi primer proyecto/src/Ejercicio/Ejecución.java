package Ejercicio;

import java.util.Scanner;

public class Ejecución {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado =new Scanner(System.in);
		float edad;
		System.out.println("ingrese valor");
		edad =teclado.nextFloat();
		if (edad >=18) {
			System.out.println("Mayor de edad");
		}
			else if(edad <18) {
				System.out.println("Menor de edad");
				
			}
	
		}
			
		
	}


