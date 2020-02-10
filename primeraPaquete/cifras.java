package primeraPaquete;

import java.util.Scanner;

public class cifras
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int a;
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
 a = numero.nextInt();
 int b=a;
 int c=1;
for (b=a; a > 1; a--)
 {  
	 if ((b/10)>1)
	{
	  c=c+1;
	}
	 b=b/10;
		}
 System.out.println ("El numero de cifras que tiene su numero es: " +c);
	}
}