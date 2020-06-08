package cl.jrios.poo;

import java.text.DecimalFormat;

public class Vehiculo {

	private String codigoMotor; 
	private String marca;
	private String nDePuertas;
	private String anioDeFabricacion;
	private Integer precio;
	
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Vehiculo(String codigoMotor, String marca, String nDePuertas, String anioDeFabricacion, Integer precio) {
		super();
		this.codigoMotor = codigoMotor;
		this.marca = marca;
		this.nDePuertas = nDePuertas;
		this.anioDeFabricacion = anioDeFabricacion;
		this.precio = precio;
	}



	public String getCodigoMotor() {
		return codigoMotor;
	}
	public void setCodigoMotor(String codigoMotor) {
		this.codigoMotor = codigoMotor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getnDePuertas() {
		return nDePuertas;
	}
	public void setnDePuertas(String nDePuertas) {
		this.nDePuertas = nDePuertas;
	}
	public String getAnioDeFabricacion() {
		return anioDeFabricacion;
	}
	public void setAnioDeFabricacion(String anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}




	public Integer getPrecio() {
		return precio;
	}



	public void setPrecio(Integer precio) {
		this.precio = precio;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anioDeFabricacion == null) ? 0 : anioDeFabricacion.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((nDePuertas == null) ? 0 : nDePuertas.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (anioDeFabricacion == null) {
			if (other.anioDeFabricacion != null)
				return false;
		} else if (!anioDeFabricacion.equals(other.anioDeFabricacion))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (nDePuertas == null) {
			if (other.nDePuertas != null)
				return false;
		} else if (!nDePuertas.equals(other.nDePuertas))
			return false;
		return true;
	}

	static String toProperCase(String s) {
	    return s.substring(0, 1).toUpperCase() +
	               s.substring(1).toLowerCase();
	}

	@Override
	public String toString() {
		
		String patron = "###,###";
		DecimalFormat decimalFormat = new DecimalFormat(patron);
		
		String precioFormateado = decimalFormat.format(this.getPrecio());
		String marcaFormateada = toProperCase(this.getMarca());
				
		return "Vehiculo : " + marcaFormateada + ", " + nDePuertas  + " puertas" 
				+ ", año " + anioDeFabricacion + ", $ " + precioFormateado;
	}
	
	
	
}
