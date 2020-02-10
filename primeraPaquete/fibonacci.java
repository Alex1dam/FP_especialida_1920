package primeraPaquete;

import java.util.Scanner;

public class fibonacci 
{
public static void main (String args[])
{
System.out.println("Introduzca un numero");
Scanner user = new Scanner(System.in);
int numero1 = user.nextInt();
int y=1;
int z=0;
int contador1=1;
int contador2=1;
while ((numero1)>=(contador1)||(numero1)>=(contador2))
{
contador1=y+z;
contador2=y+contador1;	
y=contador2;
z=contador1;
if ((numero1)>=(contador1)&&(numero1)>=(contador2))
{
System.out.println(""+contador1);
System.out.println(""+contador2);
}
}	
}
}