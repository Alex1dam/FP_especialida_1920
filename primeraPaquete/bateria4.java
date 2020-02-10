package primeraPaquete;

import java.util.Scanner;

public class bateria4
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int año=0;
	System.out.println("Introduzca el año");
	numero = new Scanner(System.in);
    año = numero.nextInt();
    if ((año%4==0)&&((año%100!=0)||(año%400==0)))
    {
  System.out.println("El año es bisiesto");
    }
    else
    {
    	  System.out.println("El año no es bisiesto");
    }
    	}
    }