package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {

	//ArrayList Privada
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	//Agregar numero al Array
	public void addNumber(int n) {
		this.numeros.add(n);
	}
	
	//1. Contar pares
	public int getPares() {
		int cantPares = 0;
		
		for (int numero : this.numeros) {
			if (numero % 2 == 0) {
				cantPares++;
			}
		}
		
		return cantPares;
	}
	
	//2. Contar impares
	public int getImpares() {
		int cantImpares = 0;
		
		for (int numero : this.numeros) {
			if (numero % 2 != 0) {
				cantImpares++;
			}
		}
		
		return cantImpares;
	}
	
	//3. Contar multiplos de X
	public int getMultiplos(int x) {
		int cantMultiplos = 0;
		
		for (int numero : this.numeros) {
			if (numero % x == 0) {
				cantMultiplos++;
			}
		}
		
		return cantMultiplos;
	}
	
}
