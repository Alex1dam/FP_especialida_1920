package primeraPaquete;
import java.util.Scanner;
import java.lang.Math; 
class bateria_1 
{ 
	private static Scanner numero;
    public static void main(String args[]) 
    { 
        int max = 200; int min = 1; int range = max - min + 1; 
           int rand = (int)(Math.random() * range) + min; 
         int numero1=rand;
         System.out.println("Introduzca la cantidad de intentos");
		 numero = new Scanner(System.in);
       int b = numero.nextInt();
        		 for (int c=b ; c>0 ;c--)
        		 {
        			 System.out.println("Introduce un numero");
        			 numero = new Scanner(System.in);
        	       int a = numero.nextInt();
                	  if (a>numero1) 
                      {
                     	 System.out.println("<");
                      }
                     		 if (a<numero1)
                     			 {
                             	 System.out.println(">");
                     			 }

                     		 if (a==numero1)
                     		 {
                             	 System.out.println("Has acertado");
                             	 c=0;
                     		 }
        		 }
        } 
    } 
