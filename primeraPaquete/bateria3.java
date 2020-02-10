package primeraPaquete;

import java.util.Scanner;

public class bateria3
{
public static void main(String args[])
{ 
	Scanner veces = new Scanner(System.in);
    System.out.println("Introduzca el año");
    int a = veces.nextInt();
	if (a%400==0&&a%4==0)
		System.out.println("Es un año bisiesto");
		else 
		{
		System.out.println("No es un año bisiesto");
		}
	}
		}
