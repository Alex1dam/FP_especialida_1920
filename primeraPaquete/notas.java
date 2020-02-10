package primeraPaquete;

import java.util.Scanner;

public class notas
{
private static Scanner user;

public static void main (String args[])
{
	int veces=0;
	int mayor=0;
	int menor=99;
	int contador=0;
	int media=0;
	int numero1 =1;
for (int i=1;i>=1;i++)
{
	Scanner user = new Scanner(System.in);
    System.out.println("Introduzca una nota");
    numero1 = user.nextInt();
	if (numero1<=0)
    {
    	i=0;
	
    }
veces=veces+1;
contador=contador+numero1;
if (numero1>mayor) 
mayor=numero1;
if (numero1<menor) 
{
menor=numero1;
}
}
media=(contador/veces);
user.close();
System.out.println("Tenemos esta cantidad de notas tuyas: "+veces);
System.out.println("La media es: "+media );
System.out.println("el numero maximo es: " +mayor );
System.out.println("el numero minimo es: "+menor);
}
}