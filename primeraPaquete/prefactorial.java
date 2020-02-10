package primeraPaquete;

import java.util.Scanner;

public class prefactorial 
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
for (int origen=1;origen<b;origen++)
 {   
	 c=origen*c;
	 System.out.println ("El factorial es " +c);
 }
		 System.out.println ("El factorial es " +c);
		}
	}