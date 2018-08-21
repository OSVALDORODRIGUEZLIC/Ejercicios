package Ejercicio;

public class prueba {

	public static void main(String[] args) {

		
		byte calificacion = 7;
		short cal_short = calificacion;
		int cal_int = calificacion;
		cal_int = cal_short;
		byte cal_byte = calificacion;
		cal_byte =(byte) cal_short;
	
		System.out.println(calificacion);
		
		
		byte objByte = 7;
		objByte= cal_byte;
		Integer i = 0;
		i = cal_int;
		
		
		byte b= objByte;
		int i2 =1;
		
		
	}

}
