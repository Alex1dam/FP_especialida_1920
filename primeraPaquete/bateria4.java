package primeraPaquete;

import java.util.Scanner;

public class bateria4
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int a�o=0;
	System.out.println("Introduzca el a�o");
	numero = new Scanner(System.in);
    a�o = numero.nextInt();
    if ((a�o%4==0)&&((a�o%100!=0)||(a�o%400==0)))
    {
  System.out.println("El a�o es bisiesto");
    }
    else
    {
    	  System.out.println("El a�o no es bisiesto");
    }
    	}
    }