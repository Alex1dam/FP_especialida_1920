package primeraPaquete;

import java.util.Scanner;

public class catetos
{
private static Scanner digito;

public static void main(String args[])
{ 
	Scanner digito = new Scanner(System.in);
    System.out.println("Introduzca los catetos");
    int numero1 = digito.nextInt();
    int numero2 = digito.nextInt();
    double operacion=numero1*numero1+numero2*numero2;
  double hipotenusa= operacion=Math.sqrt(operacion);
System.out.println("La hipotenusa es: "+hipotenusa);
} 
} 