package logica;

public class TmbMujer extends Tmb {
		
	private double cte = 447.593;
	double ctePeso = 9.247;
	private double cteAltura = 3.098;
	private double cteAnios = 4.33;
	
	public TmbMujer(double peso, double altura, int edad ) {
		 super(peso, altura, edad);
	}
	
	public double calcularTmb() {
		return (cte + (ctePeso*this.peso) + (cteAltura*this.altura) - (cteAnios * this.edad));
	}

}
