package mx.com.twg;

import mx.com.twg.abstracts.FiguraGeometrica;
import mx.com.twg.entity.Cuadrado;
import mx.com.twg.entity.Rectangulo;
import mx.com.twg.entity.Triangulo;

public class Main {

	public static void main(String[] args) {


		FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
		FiguraGeometrica cuadrado = new Cuadrado("Cuadrado");
		FiguraGeometrica triangulo = new Triangulo("Triangulo");
		
		System.out.println(rectangulo);
		rectangulo.dibujar();
		System.out.println("");
		
		System.out.println(cuadrado);
		cuadrado.dibujar();
		System.out.println("");
		
		System.out.println(triangulo);
		triangulo.dibujar();
		
	}

}
