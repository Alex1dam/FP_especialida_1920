package primeraPaquete;

import java.util.Scanner;

public class sumatipos
{
private static Scanner digito;

public static void main(String args[])
{ 
	Scanner digito = new Scanner(System.in);
    System.out.println("Introduzca dos numero");
    int numero1 = digito.nextInt();
    int numero2 = digito.nextInt();
    int numero3 = digito.nextInt();
    int numero4 = digito.nextInt();
    int par=0;
    int impar=0;
    if (numero1%2==0)
   par=par+numero1;
    else
    	impar=impar+numero1;
    if (numero2%2==0)
   par=par+numero2;
    else
    	impar=impar+numero2;
    if (numero3%2==0)
   par=par+numero3;
    else
    	impar=impar+numero3;
    if (numero4%2==0)
   par=par+numero4;
    else
    	impar=impar+numero4;
    System.out.println("La suma de los numeros pares es: "+par);
    System.out.println("La suma de los numeros impares es: "+impar);
  
} 
} 