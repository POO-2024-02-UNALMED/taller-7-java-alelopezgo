package comunicacion;

public class Alfabeto extends Pictograma {
	
	static String[] letras;
	String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;		
	}
	
	public int cantidadLetras() {
		return Alfabeto.letras.length;
			}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
	    StringBuilder abecedario = new StringBuilder();
	    for (int i = 0; i < letras.length; i++) {
	        abecedario.append(letras[i]);
	        if (i < letras.length - 1) {
	            abecedario.append(", ");
	        }
	    }
	    return abecedario.toString();
	}
	
	public String[] getLetras() {
		return letras;
	}
	
	public String getInterpretacion() {
		return interpretacion();
	}
	
	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}