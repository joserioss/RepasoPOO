package cl.jrios.poo;

import java.util.List;

public class Sumador {
	
	int suma = 0;
	

	public int aplicar(Integer... numeros) {
		suma = 0;
		for(int numero : numeros) {
			suma += numero;
		}
	    return suma;
	}

	public int aplicar(String... numeros) {
		suma = 0;
		for(String numero : numeros) {
			suma += Integer.parseInt(numero);
		}
		return suma;
	}
	
	public int aplicar(int arreglo[]) {
		suma = 0;
		for(int i = 0; i < arreglo.length; i++) {
			suma += arreglo[i];
		}
		return suma;
	}
	
	public int aplicar(List<Integer> numeros) {
		suma = 0;
		for(int i = 0; i < numeros.size(); i++) {
			int numero = numeros.get(i);
			suma += numero;
		}
		return suma;
	}
	
	
}
