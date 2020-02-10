package primeraPaquete;

import java.util.Scanner;

public class testprimos
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int a;
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
 a = numero.nextInt();
 int b=a;
 int c=0;
 int d=0;
 int contadorprimos=a;
 while (a>0)
 {
	 b=a;
	 c=0;
	 d=0;
	 while (b>0)
	 {
		 d=d+1;
		 if (a%d==0)
		 {
	      c=c+1;
		 }
		 b=b-1;
	 }
	 if (c<=2)
	 {
			 System.out.println ("El numero  es primo "+a);
			 contadorprimos++;
		 }
	 a--;
	 
	 
 }
 
	
		}
	}
