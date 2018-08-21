package Calculadora;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Calculadora 
{

	public static void main(String[] args) 
	{
		
		int op=0;
		double n1, n2, s, m, r, d;
		String dato;
		
		do 
		{
			try 
			{
				dato=JOptionPane.showInputDialog("calculadora\n"+ "[1] Suma\n" + "[2]Resta\n" +"[3]Multiplicacion\n"+"[4]Division\n" + "[5]Salida del sistema");
				op= Integer.parseInt(dato);
		
			}
			// lo que realiza es agarra una expcion de un caracter
			catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,"Ingresar una opción del 1 al 5");
				
			}
			if (op<0) {
				JOptionPane.showMessageDialog(null,"Ingrese valores numericos positivos");
			}
			
			switch(op) 
			{
				case 1:
					n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese valor"));
					n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese valor"));
				s=n1+n2;
				JOptionPane.showMessageDialog(null,"la suma es" +s);
				break;
				
				case 2:
					n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese valor"));
					n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese valor"));
				r=n1-n2;
				JOptionPane.showMessageDialog(null,"la resta es" +r);
				break;
				
				case 3:
					n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese valor"));
					n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese valor"));
				m=n1*n2;
				JOptionPane.showMessageDialog(null,"la multiplicacion es" +m);
				break;
				
				case 4:
					n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese valor"));
					n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese valor"));
				
					if(n2==0) {
						JOptionPane.showMessageDialog(null,"division entre 0, operación invalida");
					}
					else {
						d=n1/n2;
						JOptionPane.showMessageDialog(null,"la resta es" +d);
						break;
				
				}
			}
			
		}
			while(op!=5);{
		
			}
	}
		}
	


		


