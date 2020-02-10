package primeraPaquete;

import java.util.Scanner;

public class factorial 
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
 while (b>0)
 {   
	 c=b*c;
	 b=b-1;
 }
		 System.out.println ("El factorial es " +c);
		}
	}