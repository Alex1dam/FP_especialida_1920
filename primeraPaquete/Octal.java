package primeraPaquete;

import java.util.Scanner;

public class Octal
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int a;
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
 a = numero.nextInt();
 int recaunto=1;
 int c=0;
 int d=0;
while (a!=0)
{
      c=a%8;
      d=8-c;
      a=(a-c)/8;
      recaunto=recaunto+c;
  	  recaunto=recaunto*10;
}
System.out.println("Introduzca un numero"+recaunto);
	}
}