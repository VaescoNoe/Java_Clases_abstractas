package mx.com.twg.entity;

import mx.com.twg.abstracts.FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica{

	public Cuadrado(String tipo) {
		super(tipo);
	}

	@Override
	public void dibujar() {
		// this.getClass().getSimpleName() == Obtiene el nombre de esta clase
		System.out.println("Tipo de figura de la clase: "+this.getClass().getSimpleName());
	}

}
