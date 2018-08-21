package Ejercicio;

public class Main {

	public static void main(String[] args) {
		Conversiones conv = new Conversiones();
		double pesosPrimeros = conv.dollarTopeso(100);
		double pesosSegundos = conv.dollarTopeso(100, 15.50);
		double pesosTerceros = conv.dollarTopeso(100, 15.50, true);
		
		System.out.println("Valor de mi primera conversión");
		System.out.println( pesosPrimeros);
		System.out.println("Valor de mi segundo conversión");
		System.out.println( pesosSegundos);
		System.out.println("Valor de mi tercera conversión");
		System.out.println( pesosTerceros);
		
				
		
		
	}

}
