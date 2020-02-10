package primeraPaquete;

import java.util.Scanner;

public class primos2 
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
 int contadorprimos=0;
 while (contadorprimos<100)
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
		 if (c==3)
		 {
			b=0; 
		 }
	 }
	 if (c<=2)
	 {
			 System.out.println ("El numero  es primo "+a);
			 contadorprimos++;
		 }
	 a++;
	 
 }	
		}
	}
