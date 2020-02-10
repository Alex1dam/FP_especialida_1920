package primeraPaquete;

import java.util.Scanner;

public class bateria19
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
 int a = numero.nextInt();
 int f=0;
for (int i=1;i<a;i++) 
{
	if (a%i==0) 
	{
		f=f+i;
	}	
}
 if (f==a)
	 System.out.println("El numero es perfecto "+f);
 else
	 System.out.println("El numero no es perfecto "+a);
		}
	}
