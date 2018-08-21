package Ejercicio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Burbuja {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			int arreglo[],nElementos, aux;
			
			nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de números a ordenar"));
			
			arreglo=new int[nElementos];
			
			for (int i=0; i<nElementos; i++) {
				System.out.println((i+1)+ "\n Digite el número a ordenar:");
				arreglo [i] = entrada.nextInt();
		}
			
			
			for (int i=0; i< (nElementos-1); i++) {
				for(int j=0; j<(nElementos-1);j++){
					
				if(arreglo[j] > arreglo[j+1]) {
					aux = arreglo[j];
					arreglo[j] =arreglo[j+1];
					arreglo[j+1] = aux;
				}
				}
			}
	
			System.out.print("\n arreglo creciente");
	for (int i=0; i<nElementos; i++) {
	System.out.println(arreglo[i]);
	}

	System.out.println("");
	}
}
	
