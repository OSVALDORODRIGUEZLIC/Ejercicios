package Ejercicio;

public class BurbujaOrden {

	private boolean isAsc;
	private int tamanoArreglo;
	private int [] arreglo;
	
	public BurbujaOrden(boolean _tipoOrden, int tamanoArreglo) {
		isAsc= _tipoOrden;
		this.tamanoArreglo =tamanoArreglo;
		this.arreglo =new int[tamanoArreglo];
	}
	 
	public void setValor(int valor, int pos) {
		this.arreglo[pos]=valor;
	}

	public void setValor(int [] arreglo) {
		this.arreglo =arreglo;
	}

	public void setValor (boolean reset) {
		if (reset) {
			this.arreglo = new int[tamanoArreglo];
		}
		
		public int[] obteneElementosOrdenados() {
			
		}
	}
	
}
