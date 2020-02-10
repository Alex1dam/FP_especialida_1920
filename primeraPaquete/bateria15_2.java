package primeraPaquete;

import java.util.Scanner;

public class bateria15_2
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
    double a = numero.nextDouble();
    double interes=1.03;
    double b=2*a;
    int c=0;
    do {
    	a=a*interes;
    	c=c+1;
    }
    	
    	while (a<b);
    System.out.println("Se han necesitado "+c);  System.out.print(" meses, para duplicarlo.");
 
		}
	}