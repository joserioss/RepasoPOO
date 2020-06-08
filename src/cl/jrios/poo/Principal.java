package cl.jrios.poo;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		int arreglo[] = {13,23,24};
		List<Integer> lista = new ArrayList<>();
		
		lista.add(12);
		lista.add(13);
		lista.add(10);
		lista.add(10);
		
		Sumador suma = new Sumador();
		
		System.out.println(suma.aplicar(24,12,14,34));
		System.out.println(suma.aplicar("34","12","14"));
		System.out.println(suma.aplicar(arreglo));
		System.out.println(suma.aplicar(lista));
		
		}
}
