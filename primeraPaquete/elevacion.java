package primeraPaquete;

import java.util.Scanner;

public class elevacion 
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int a;
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
 a = numero.nextInt();
 int b=a+9;
 int resultado=0;
 while (b>a)
 {
	 resultado=a*a;	a=a+1;
	 System.out.println("el resultado es: "+resultado);
		}
	}
}