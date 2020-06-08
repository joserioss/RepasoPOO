package cl.jrios.poo;

import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		Vehiculo auto1 = new Vehiculo("A239012", "NISSan", "5", "2018", 7344321);
		Vehiculo auto2 = new Vehiculo("A2dasdq2", "Nissan", "5", "2018", 5312111);
		Vehiculo auto3 = new Vehiculo("Cek23AD", "Tesla", "4", "2020", 12564323);
		Vehiculo auto4 = new Vehiculo("A2dasdq2", "Nissan", "5", "2018", 5312111);
		
		System.out.println(auto1.toString());
		
		System.out.println(auto1.equals(auto3));
		
		
		System.out.println();
		
		}
}
