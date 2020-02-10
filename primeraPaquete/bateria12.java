package primeraPaquete;

import java.util.Scanner;

public class bateria12
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
 int a = numero.nextInt();
 int c=0;
 int d=0;
 int e=a;
 int f=0;
 int b=1;
 for (a=e;a>0;a--)
 {
	 b=b--;
	 b=a;
	 while (b>0)
	 {
		 d=d+1;
		 if (a%d==0)
		 {
	      c=c+1;
		 }
		 b=b-1;
		
	 }
	 if (c==2)
	 {
		 System.out.println ("El numero  es primo: "+a); 	 
	 }
	 c=0;
 }
		}
	}
