package Modelo;
import java.util.ArrayList;
import java.util.List;

public class ProductoAjustado implements Producto
{

	private List<Ingrediente> Agregar;
	private List<Ingrediente> Eliminar;
	
	public ProductoAjustado(ProductoMenu base)
	{
		Agregar = new ArrayList<Ingrediente>();
		Eliminar = new ArrayList<Ingrediente>();
	}
	
	public void eliminarIngrediente(Ingrediente NuevoIngrediente)
	{
		Eliminar.add(NuevoIngrediente);
	}	
	
	public void agregarIngrediente(Ingrediente NuevoIngrediente)
	{
		Agregar.add(NuevoIngrediente);
	}	
	
	@Override
	public int getPrecio() 
	{
		return 0;
	}

	@Override
	public String getNombre() 
	{
		return null;
	}

	@Override
	public String generarTextoFactura() 
	{
		return null;
	}

	
}

