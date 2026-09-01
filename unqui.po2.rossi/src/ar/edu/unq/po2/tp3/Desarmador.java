package ar.edu.unq.po2.tp3;

public class Desarmador {

	public int numeroConMasPares(int[] numeros) {
		int ganador = 0;
		int maxCantPares = -1;
		
		for (int nActual : numeros) {
			int paresDelActual = this.cantPares(nActual);
			
			if (paresDelActual > maxCantPares) {
				maxCantPares = paresDelActual;
				ganador = nActual;
			}
		}
		return ganador;
	}
	
	public int cantPares(int n) {
		int cantPares = 0;
		
		if (n == 0) {
			return 1;
		}
		
		while (n > 0) {
			int ultimoDigito = n % 10;
			
			if (ultimoDigito % 2 == 0) {
				cantPares++;
			}
			
		n = n/10;
		}
		return cantPares;
	}
	
}