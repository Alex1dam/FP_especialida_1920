package primeraPaquete;

import java.util.Scanner;

public class bateria3
{
public static void main(String args[])
{ 
	Scanner veces = new Scanner(System.in);
    System.out.println("Introduzca el a�o");
    int a = veces.nextInt();
	if (a%400==0&&a%4==0)
		System.out.println("Es un a�o bisiesto");
		else 
		{
		System.out.println("No es un a�o bisiesto");
		}
	}
		}
