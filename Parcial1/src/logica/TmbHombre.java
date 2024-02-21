package logica;

public class TmbHombre extends Tmb {
	
	private double cte = 88.362;
	private double ctePeso = 13.397;
	private double cteAltura = 4.799;
	private double cteAnios = 5.677;
	
	
	public TmbHombre(double peso, double altura, int edad) {
	    super(peso, altura, edad);
	}
	
	
	
	public double calcularTmb() {
		return (cte + (ctePeso*this.peso) + (cteAltura*this.altura) - (cteAnios*this.edad));
	}

}