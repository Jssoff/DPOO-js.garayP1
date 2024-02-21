package Main;

import logica.Tmb;
import logica.TmbHombre;
import logica.TmbMujer;


public class Consola {

	public static void main(String[] args) {
		Tmb p;
		p = new TmbHombre(53.5, 1.45, 34);
		System.out.println(p.calcularTmb());
		
		p = new TmbMujer(56.7, 1.87, 16);
		System.out.println(p.calcularTmb());
		
	}
}
