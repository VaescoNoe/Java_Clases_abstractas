package mx.com.twg.entity;

import mx.com.twg.abstracts.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica{

	public Rectangulo(String tipo) {
		super(tipo);
	}

	@Override
	public void dibujar() {
		// this.getClass().getSimpleName() == Obtiene el nombre de esta clase
		System.out.println("Tipo de figura de la clase: "+this.getClass().getSimpleName());
	}
}
