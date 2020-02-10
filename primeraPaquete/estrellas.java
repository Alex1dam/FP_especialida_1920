package primeraPaquete;

import java.util.Scanner;

public class estrellas
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int a = 0;
	System.out.println("Introduzca un numero");
	numero = new Scanner(System.in);
    a = numero.nextInt();
switch (a) 
{
    case 1:
        System.out.println("*");
    	System.out.println("0, exito");
        break;
    case 2:
        System.out.println("**");
        System.out.println("*");
    	System.out.println("0, exito");
        break;
    case 3:
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    	System.out.println("0, exito");
        break;
    case 4:
        System.out.println("****");
        System.out.println("***");        
        System.out.println("**");
        System.out.println("*");
    	System.out.println("0, exito");
        break;
    case 5:
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");        
        System.out.println("**");
        System.out.println("*");
    	System.out.println("0, exito");
        break;
    case 6:
        System.out.println("******");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");        
        System.out.println("**");
        System.out.println("*");
    	System.out.println("0, exito");
        break;
    case 7:
        System.out.println("*******");
        System.out.println("******");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");        
        System.out.println("**");
        System.out.println("*");
    	System.out.println("0, exito");
        break;
    default:
    	System.out.println("-1, caso no valido");

 }
}
}