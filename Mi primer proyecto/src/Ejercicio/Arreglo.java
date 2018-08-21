package Ejercicio;

public class Arreglo {

	public static void main(String[] args) {
		
		int [] arreglo = {1,2,3,4,5,6,7,8,9,10};
		for (int i= 0; i < arreglo.length ; i++) {
			System.out.println("Posiciones:" + i +"valor" + arreglo[i]);
		}
				for (Integer i:arreglo) {
					System.out.println("valor solamente"+ i);
				}
		}

	}


