package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Restaurante{
		
	private List<Ingrediente> Ingredientes;
	private List<ProductoMenu> MenuBase;
	private List<Combo> Combo;
	
	private Restaurante()
	{
		Ingredientes = new ArrayList<Ingrediente>();
		MenuBase = new ArrayList<ProductoMenu>();
		Combo = new ArrayList<Combo>();
	}
	
	public void cargarInformacion(String archivoIngredientes, String archivoMenu, String archivoCombos)
	{
		cargarIngredientes(archivoIngredientes);
		cargarMenu(archivoMenu);
		cargarCombos(archivoCombos);
	}
	
	public void cargarIngredientes(String archivoIngredientes) {
	    try {
	        BufferedReader br = new BufferedReader(new FileReader(archivoIngredientes));
	        String linea;
	        while ((linea = br.readLine()) != null) 
	        {
	            String[] partir = linea.split(";");
	            String nombreIngrediente = partir[0];
	            int precioIngrediente = Integer.parseInt(partir[1]);

	            Ingrediente unIngrediente = new Ingrediente(nombreIngrediente, precioIngrediente);
	            Ingredientes.add(unIngrediente);
	        }
	        br.close();
	    } catch (IOException e) 
	    	{
	        e.printStackTrace();
	    	}
	} 
	
	public void cargarMenu(String archivoMenu) 
	{
	    try 
	    {
	        BufferedReader br = new BufferedReader(new FileReader(archivoMenu));
	        String linea;
	        while ((linea = br.readLine()) != null) 
	        {
	            String[] partir = linea.split(";");
	            String nombreProducto = partir[0];
	            int precioProducto = Integer.parseInt(partir[1]);

	            ProductoMenu unProducto = new ProductoMenu(nombreProducto, precioProducto);
	            MenuBase.add(unProducto);
	        }
	        br.close();
	    } catch (IOException e) 
	    	{
	        e.printStackTrace();
	    	}
	}
	
	public void cargarCombos(String archivoCombo) {
	    try {
	        BufferedReader br = new BufferedReader(new FileReader(archivoCombo));
	        String linea;
	        while ((linea = br.readLine()) != null) 
	        {
	            String[] partir = linea.split(";");
	            String nombreCombo = partir[0];
	            double descuentoCombo = Integer.parseInt(partir[1].split("%")[0]);
	            String hamburguesaCombo = partir[2];
	            String papasCombo = partir[3];
	            String gaseosaCombo = partir[4];

	            Combo unCombo = new Combo(nombreCombo, descuentoCombo, hamburguesaCombo, papasCombo, gaseosaCombo);
	            Combo.add(unCombo);
	        }
	        br.close();
	    } catch (IOException e) 
	    	{
	        e.printStackTrace();
	    	}
	} 
	
}
