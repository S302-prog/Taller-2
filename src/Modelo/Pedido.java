package Modelo;

public class Pedido {
	
	private int numeroPedidos;
	private String nombreCliente;
	private String direccionCliente;
	
	public Pedido (String nombreDelCliente, String direccionDelCliente)
	{
		nombreCliente = nombreDelCliente;
		direccionCliente = direccionDelCliente;
	}

	public String getDireccionCliente() 
	{
		return direccionCliente;
	}

	public int getNumeroPedidos() 
	{
		return numeroPedidos;
	}

	public String getNombreCliente() 
	{
		return nombreCliente;
	}

}
