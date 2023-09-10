package Modelo;

public class Ingrediente {
	
	private String nombre;
	private int costoAdicional;
	

	public Ingrediente(String ingredienteNombre, int precioIngrediente) 
	{
		nombre = ingredienteNombre;
		costoAdicional = precioIngrediente;
	}


	public String getNombre() {
		return nombre;
	}


	public int getcostoAdicional() {
		return costoAdicional;
	}
	}


