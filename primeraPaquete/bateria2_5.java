package primeraPaquete;

import java.util.Scanner;

public class bateria2_5
{
private static Scanner digito;

public static void main(String args[])
{ 
	int a=0;
	int b=0;
	int resto=0;
	int numero=0;
		Scanner digito = new Scanner(System.in);
	    System.out.println("Introduzca un numero");
	    int numero1 = digito.nextInt();
          for (int i=1;i>0;i--)	    
          {
	   		resto = a%10;
	   		System.out.println(""+resto);
	   		 
	    }
	System.out.println("Su numero del tarot es "+resto);
} 
} 