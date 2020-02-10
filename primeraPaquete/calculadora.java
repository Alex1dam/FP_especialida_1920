package primeraPaquete;

import java.util.Scanner;

public class calculadora
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	double a = 0;
	int b=0;
	double c;
	double operacion;
	System.out.println("introduza un numero");
	numero = new Scanner(System.in);
    a = numero.nextInt();
	System.out.println("que operacion desea realizar");
    b = numero.nextInt();
switch (b) 
{
    case 1:
    	System.out.println("Introduzca otro numero");
        c = numero.nextInt();
        operacion=a+c;
    	System.out.println("El resultado de la suma es: "+operacion);
        break;
    case 2:
    	System.out.println("Introduzca otro numero");
        c = numero.nextInt();
        operacion=a-c;
    	System.out.println("El resultado de la resta es: "+operacion);
        break;
    case 3:
    	System.out.println("Introduzca otro numero");
        c = numero.nextInt();
        operacion=a*c;
    	System.out.println("El resultado de la multiplicacion es: "+operacion);
        break;
    case 4:
    	System.out.println("Introduzca otro numero");
        c = numero.nextInt();
        operacion=a/c;
    	System.out.println("El resultado de la division es: "+operacion);
        break;
    case 5:
    	System.out.println("Introduzca otro numero");
        c = numero.nextInt();
        operacion=a%c;
    	System.out.println("El resultado del modulo es: "+operacion);
        break;
    case 6:
        operacion=Math.sqrt(a);
    	System.out.println("El resultado de la raiz cuadrada es: "+operacion);
        break;
    case 7:
    	double e=a;
    	 c=0;
    	 int d=0;
    	 while (e>0)
    	 {
    		 d=d+1;
    		 if (a%d==0)
    		 {
    	      c=c+1;
    		 }
    		 e=e-1;
    	 }
    	 if (c>2)
    		 System.out.println ("El numero no es primo");
    		 else 
    			 System.out.println ("El numero  es primo");
        break;
    case 8:
    	if (a%2==0)
   		 System.out.println ("El numero es primo");
   		 else 
   			 System.out.println ("El numero es impar");
        break;
    default:
    	System.out.println("No se reconoce dicha operacion");

 }
}
}