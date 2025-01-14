package comunicacion;

public class Tesis extends Escrito {
	
	String idea;
	static String[] argumentos;
	String conclusion;
	String referencias;
	String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabras) {
		return this.getPaginas() * palabras * 5;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.idea + '\n' + Tesis.argumentos.length + '\n' + this.conclusion + '\n' + this.referencias;
	}
	
	public String getIdea() {
		return idea;
	}
	
	public static String[] getArgumentos() {
		return argumentos;
	}
	
	public String getConclusion() {
		return conclusion;
	}
	
	public String getReferencias() {
		return referencias;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	public static void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}
	
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
