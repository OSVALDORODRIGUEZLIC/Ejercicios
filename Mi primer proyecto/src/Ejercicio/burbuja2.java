package Ejercicio;

public class burbuja2 {

	public static void main(String[] args) {
		int b[]= (31,123,130);
		

	}

	public static void burbuja(int b[]) {
		for (int i=0; i <b.length; i++) {
			for (int j=0; j< b.length -1; j++) {
				if (b[j] > b[j+1]) {
					int aux= b[j];
					b[j] = b[j+1];
					b[j+1] = aux;
					
				}
			}
		}
	}
	
	public static void mostrar (int b[]) {
		
		for (int i=0; i < b.length; i++) {
			System.out.println();
		}
	}
}
