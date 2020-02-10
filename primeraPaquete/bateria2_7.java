package primeraPaquete;

import java.util.Scanner;

public class bateria2_7
{
private static Scanner digito;

public static void main(String args[])
{ 
	int suma=0;
	int contador=0;
	for (int i=5;i>0; i--)
	{
		digito = new Scanner(System.in);
	    System.out.println("Introduzca el codigo del articulo");
	    int codigo = digito.nextInt();
		digito = new Scanner(System.in);
	    System.out.println("Cantidad (en L)");
	    int cantidad = digito.nextInt();
		digito = new Scanner(System.in);
	    System.out.println("Precio (por L)");
	    int precio = digito.nextInt();
	    if (suma<cantidad*precio)
	    {
		    suma=cantidad*precio;
		    System.out.print("La facturacion total es de "+suma); System.out.println(" $.");
	    }
	    if (suma>=600)
	    {
	    contador++;
	    }
	    if (codigo==1)
	    {
	    	System.out.print("Se han vendido "+cantidad); System.out.println(" litros");
	    }
	}
	System.out.print("Hubo "+contador); System.out.print(" facturas de mas de 600$");
} 
} 