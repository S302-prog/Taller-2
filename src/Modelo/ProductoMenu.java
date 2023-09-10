package Modelo;

public class ProductoMenu implements Producto{
	
	private String nombre;
	private int precioBase;

	public ProductoMenu(String nombreProducto, int precioProducto) 
	{
		nombre = nombreProducto;
		precioBase = precioProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public int getPrecio() {
		return 0;
	}

	public String generarTextoFactura() {
		return null;
	}

}
