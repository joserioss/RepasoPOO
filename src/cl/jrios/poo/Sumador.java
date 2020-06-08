package cl.jrios.poo;

public class Sumador {

	public Integer aplicar(Integer... numeros) {
		int suma = 0;
		for(int numero : numeros) {
			suma += numero;
		}
	    return suma;
	}
}
