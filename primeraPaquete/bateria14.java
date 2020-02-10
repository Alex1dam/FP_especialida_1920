package primeraPaquete;

import java.util.Scanner;

public class bateria14
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
    double a = numero.nextDouble();
    double interes=1.06;
    double b=3*a;
    int c=0;
    do {
    	a=a*interes;
    	c=c+1;
    }
    	
    	while (a<b);
    System.out.println("Se han necesitado "+c);  System.out.print(" meses, para triplicarlo.");
 
		}
	}