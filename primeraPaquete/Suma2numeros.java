package primeraPaquete;
import java.util.Scanner;

public class Suma2numeros
{
private static Scanner numero;

public static void main (String args[])
{
System.out.println("Introduzca un numero");
numero = new Scanner(System.in);
int numero1 = numero.nextInt();
System.out.println("Introduzca otro numero");
numero = new Scanner(System.in);
int numero2 = numero.nextInt();
int suma= numero1+numero2;
System.out.println("El resultado de la suma es "+suma);
numero.close();
}
}
