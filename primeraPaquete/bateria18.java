package primeraPaquete;

import java.util.Scanner;

public class bateria18 
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int a;
	int b;
	int c;
	System.out.println("Introducir numeros de terminos");
	numero = new Scanner(System.in);
    a = numero.nextInt();
    System.out.println("Introducir el primer termino");
	numero = new Scanner(System.in);
    b = numero.nextInt();
    System.out.println("Introducir la razon");
	numero = new Scanner(System.in);
    c = numero.nextInt();
    for (int i=a;i>0;i--)
    {
    	System.out.println(" "+b);
    	b=b*c;
    }
		}
	}