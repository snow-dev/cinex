package cine;

import java.util.ArrayList;



public class boleto extends Pelicula
{
	
	
	public boleto(String titulo, String director, int duracion, int costo) 
	{
		super(titulo, director, duracion, costo);
		// TODO Auto-generated constructor stub
	}
	
	public void boletoPelicula()
	{
		
		for(int x=0; x<=10; x++)
		{
			System.out.println("*******************************");
		}
		System.out.println("\n Su ticket se está generanodo\n Espere un momento!\n");
		System.out.println("*******************************");
		System.out.println("* Titulo: "+ titulo);
		System.out.println("* Duración:"+ director);
		System.out.println("* Costo: " + costo);
		System.out.println("* Disfrute de su pelicula!");
		System.out.println("*******************************");
		
	}
	public void boletoGolosina(ArrayList<String> compra)
	{
		System.out.println(compra);
				
	}
	
	@Override
	public String toString()
	{
		return "\n Disfrute su pelicula!!";
		
	}
}
