package primeraPaquete;

import java.util.Scanner;

public class Eureka
{
private static Scanner pass;

public static void main(String args[])
{ 
    System.out.println("Introduzca la contraseña");
    Scanner pass = new Scanner(System.in);
    String numero1 = pass.nextLine();
    System.out.println("Su contraseña es "+numero1);
    if (numero1.contentEquals("Eureka")) 
       System.out.println("equal");
    else
    	System.out.println("Not..equal"); 
} 
} 