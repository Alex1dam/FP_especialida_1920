package primeraPaquete;

import java.util.Scanner;

public class Vuelta
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int a=0;
	int b=0;
	int resto=0;
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
    a = numero.nextInt();
 while (a>0)
 {
		resto = a % 10;
	    b = b * 10 + resto;
		a/=10; 
 }
 System.out.println ("El numero dado la vuelta es: " +b);
	}
}