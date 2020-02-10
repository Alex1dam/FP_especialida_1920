package primeraPaquete;

import java.util.Scanner;

public class Binario
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int a;
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
    a = numero.nextInt();
    int recaunto=0;
    while (0<=a)
 {
    recaunto=recaunto*10;
    if (a%2==1)
    { 
    	a=(a-1)/2;
    	recaunto=recaunto+1;
      }
    else
    {
    	a=a/2;
    }
 }
    System.out.println("el resultado es: "+recaunto);
}
}