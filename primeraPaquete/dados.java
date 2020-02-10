package primeraPaquete;
import java.util.Scanner;
import java.lang.Math; 
class dados 
{ 
	private static Scanner numero;
    public static void main(String args[]) 
    { 
        int max = 100; int min = 1; int rango = max - min + 1; 
           int rand = (int)(Math.random() * rango) + min; 
          int numero1=rand;
        		 for (int c=100 ; c>0 ;c--)
        		 {
        			 System.out.println("Introduce un numero");
        			 numero = new Scanner(System.in);
        	       int a = numero.nextInt();
                	  if (a>numero1) 
                      {
                     	 System.out.println("Te has pasado");
                      }
                     		 if (a<numero1)
                     			 {
                             	 System.out.println("Te has quedado corto");
                     			 }

                     		 if (a==numero1)
                     		 {
                             	 System.out.println("Has acertado");
                             	 c=0;
                     		 }
        		 }
        } 
    } 
