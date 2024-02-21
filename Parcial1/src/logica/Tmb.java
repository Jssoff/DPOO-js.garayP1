package logica;

public abstract class Tmb {
	protected double peso;
	protected double altura;
	protected int edad;
	
	public double getpeso() {
		return peso;
	}
	
	public double getaltura() {
		return altura;
	}
	
	public int getedad() {
		return edad;
	}
	
	
	public void setpeso(double peso) {
		this.peso = peso;
	}
	
	public void setaltura(double altura) {
		this.altura= altura;
	}
	
	
	public void setedad( int edad) {
		this.edad = edad;
	}
	
	
	public Tmb(double peso, double altura, int edad ) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	
	
	public abstract double calcularTmb();

}




