package mx.com.twg.entity;

import mx.com.twg.abstracts.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica{

	public Triangulo(String tipo) {
		super(tipo);
	}
	
	@Override
	public void dibujar() {
		// this.getClass().getSimpleName() == Obtiene el nombre de estra clase
				System.out.println("Tipo de figura de la clase: "+this.getClass().getSimpleName());
	}

	
}
