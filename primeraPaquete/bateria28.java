package primeraPaquete;

import java.util.Scanner;

public class bateria28
{
public static void main(String args[])
{ 
    int b=1;
	Scanner veces = new Scanner(System.in);
    System.out.println("Introduzca un numero");
    int numero  = veces.nextInt();
	for (int i=(int) numero;i>0;i--)
	{
		System.out.print(" "+b); System.out.print(""+b* +b*+b); System.out.println(" "+b*+b*+b);
     b=b+1;
	}
	veces.close();
} 
} 