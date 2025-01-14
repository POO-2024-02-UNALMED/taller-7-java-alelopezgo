package comunicacion;

public class Fabula extends Escrito {
	
	String ensenanzas;
	String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanzas = ensenanzas;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabras) {
		return this.getPaginas() * palabras;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.ensenanzas;
	}
	
	public String getEnsenanzas() {
		return ensenanzas;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setEnsenanzas(String ensenanzas) {
		this.ensenanzas = ensenanzas;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}