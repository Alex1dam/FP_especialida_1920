package primeraPaquete;

import java.util.Scanner;

public class bateria2_9
{
private static Scanner digito;
private static int cont;

public static void main(String args[])
{ 
	int suma=0;
	int numero2=1;
	cont = 0;
	for (int i=1;i>0; i++)
	{
		digito = new Scanner(System.in);
	    System.out.println("Introduzca un numero");
	    int numero1 = digito.nextInt();
	    suma++;
	    if (numero1==numero2)
	    {
	    	cont++;
	    }
	    if (numero1>numero2)
	    {
	    	numero2=numero1;
	    }
	    if (numero1<=0)
	    {
	    	i=-1;
	    }
	}
	System.out.print("Has introducido "+suma); System.out.println(" numeros");
	System.out.println("El numero mas grande, es: "+numero2); 
	System.out.print("Dicho numero se ha repetido "+cont); 	System.out.println(" veces"); 
} 
}