package primeraPaquete;

import java.util.Scanner;

public class compararcadenas {
	private static Scanner numero;
	public static void main(String args[]) 
	{
		int a=0;
		System.out.println("Introduzca un numero");
		numero = new Scanner(System.in);
	    a = numero.nextInt();
	    System.out.println(""+a);
	}
}