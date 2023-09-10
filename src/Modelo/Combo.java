package Modelo;

public class Combo {
	
	private double descuento;
	private String nombreCombo;
	private String complemento1;
	private String complemento2;
	private String complemento3;
	

	public Combo(String nombreDelCombo, double descuentoCombo, String hamburguesaCombo, String papasCombo, String gaseosaCombo)
	{
		nombreCombo = nombreDelCombo;
		descuento = descuentoCombo;
		complemento1 = hamburguesaCombo;
		complemento2 = papasCombo;
		complemento3 = gaseosaCombo;
		
		
	}

	public String getNombreCombo() {
		return nombreCombo;
	}

	public String getComplemento2() {
		return complemento2;
	}

	public String getComplemento1() {
		return complemento1;
	}

	public String getComplemento3() {
		return complemento3;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
}

