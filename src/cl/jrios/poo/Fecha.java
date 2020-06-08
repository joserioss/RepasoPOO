package cl.jrios.poo;

public class Fecha {

	private String dia;
	private String mes;	
	private String anio;
	
//	Consturctor por defecto
	public Fecha() {
		super();
		this.dia = null;
		this.mes = null;
		this.anio = null;
	}
	
	public Fecha(String dia, String mes, String anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		if(dia.length() == 1)
			this.dia = "0" + dia;
		else
			this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
    // Sobrescrito
    public String toString() {
        String retorno = String.format("Fecha: %s-%s-%s", dia, mes, anio);
        return retorno;
    }
    // sobrescrito
    public int hashCode() {
        return dia.hashCode();
    }
    // Sobrescrito
    public boolean equals(Object obj) {
        String este = this.toString();
        String ese = "";
        if(obj != null)
            ese = obj.toString();
        return este.equals(ese);
    }
		
}
