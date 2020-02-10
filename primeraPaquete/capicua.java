package primeraPaquete;

import java.util.Scanner;

public class capicua
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
    int d=a;
 while (a>0)
 {
		resto = a % 10;
		 b = b * 10 + resto;
		 a/=10; 
 }
 if (d==b)
 {
	 System.out.println ("capicua");

 }
 else
	 System.out.println ("no capicua");

	}
}