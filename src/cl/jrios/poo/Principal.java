package cl.jrios.poo;

public class Principal {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha();
		Fecha fecha2 = new Fecha("8","06", "2020");
		
		fecha1.setDia("8");
		System.out.printf("%s-%s-%s \n", fecha1.getDia(), fecha1.getMes(), fecha1.getAnio());
		System.out.printf("%s-%s-%s \n", fecha2.getDia(), fecha2.getMes(), fecha2.getAnio());
	}
}
