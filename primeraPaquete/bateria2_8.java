package primeraPaquete;

import java.util.Scanner;

public class bateria2_8
{
private static Scanner digito;

public static void main(String args[])
{ 
	double suma=0;
	int contador=0;
	double precio=0;
	for (int i=5;i>0; i--)
	{
		digito = new Scanner(System.in);
	    System.out.println("Introduzca el codigo del articulo");
	    int codigo = digito.nextInt();
	    switch(codigo)
	    {
	    case 1: precio=0.6;
	    break;
	    case 2: precio=3;
	    break;
	    case 3:precio=1.25;
	    break;
	    default: System.out.println("Codigo no reconocido o invalido");
	    break;
	    }
	    if ((codigo==1)|(codigo==2)|(codigo==3))
	    {
			digito = new Scanner(System.in);
		    System.out.println("Cantidad (en L)");
		    int cantidad = digito.nextInt();
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

	    precio=0;
	}
	System.out.print("Hubo "+contador); System.out.print(" facturas de mas de 600$");
} 
} 