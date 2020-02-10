package primeraPaquete;

import java.util.Scanner;

public class pseint14
{
private static Scanner digito;

public static void main(String args[])
{ 
	Scanner digito = new Scanner(System.in);
    System.out.println("Introduzca dos numero");
    int numero1 = digito.nextInt();
    int numero2 = digito.nextInt();
    if (numero1 > 0 & numero2 > 0)
    { 
     System.out.println("Sus numeros son positivos");
    }
      else
       {  
          if (numero1 < 0 & numero2 < 0) 
          {
    	  System.out.println("Su numero son negativo");
    	  }
    	  else 
    	{ 
    		  System.out.println("un numero es positivo y un numero es negativo");}
     }
} 
} 