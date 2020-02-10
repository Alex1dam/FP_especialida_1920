package primeraPaquete;

import java.util.Scanner;

public class bateria2_6
{
private static Scanner digito;

public static void main(String args[])
{ 
	int suma=0;
	for (int i=10;i>0; i--)
	{
		digito = new Scanner(System.in);
	    System.out.println("Introduzca un numero");
	    int numero1 = digito.nextInt();
	    suma++;
	    if (numero1<=0)
	    {
	    	i=0;
	    }
	}
	System.out.print("has introducido "+suma); System.out.print(" numeros");
} 
} 