package mx.com.twg.abstracts;

public abstract class FiguraGeometrica {
	
	private String tipoFigura;
	
	public FiguraGeometrica(String tipoFigura){
		this.tipoFigura = tipoFigura;
	}

	public abstract void dibujar();
	
	public String getTipoFigura() {
		return tipoFigura;
	}


	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}


	@Override
	public String toString(){
		return "Tipo de figura: "+this.tipoFigura;
	}
}
