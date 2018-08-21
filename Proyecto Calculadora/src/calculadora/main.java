package calculadora;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class main {

	public static void main(String[] args) {
		//instanciarlo
				calculadora calc = new calculadora();
		
		
		//1st step
		String primerArg = args[0];
		String segundoArg = args[1];
		String tercerArg = args[2];
		double op1 =0.0;
		double op2 =0.0;
		
		try {
			//Convertirlos a números
			 op1 = Double.parseDouble(primerArg);
			 op2 = Double.parseDouble(segundoArg);
			
		}catch(NumberFormatException  ne) {
			System.out.print("no se ha podido convertir");
			System.out.println("Mensaje de error"+ne.getMessage());
		System.exit(100);
		} finally {
			
		}
		
		
		
		
		//declarar variable para almacenar el resultado
		
		double resultado;
		switch (tercerArg) {
		case"+":
			resultado = calc.suma(op1, op2);
			break;
		case"-":
			resultado = calc.resta(op1, op2);
			break;
		case"*":
			resultado = calc.multiplicacion(op1, op2);
			break;
		case"/":
			resultado = calc.division(op1, op2);
			break;
		default:
		resultado = -1;	
		}
		
		System.out.println("el resultado es es:"+ resultado);
		
		
	}
	
}
