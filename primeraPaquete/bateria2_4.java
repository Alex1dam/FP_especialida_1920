package primeraPaquete;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class bateria2_4
{
	private static Scanner digito;

	public static void main(String args[]) throws InterruptedException 
	{
	int a=0;
	int b=0;
	int c=0;
	digito = new Scanner(System.in);
    System.out.println("Introduzca la cantidad de digitos");
    int numero1 = digito.nextInt();
	for (int i=1000;i>0;i--)
{
if (a>=60)
{
	a=0;
	b++;
}
if (b>=60)//bien //
{
	b=0;
	c++;
}
if (c==3)
	System.out.println("E");
else
	System.out.println(""+c);
if (b==3)
	System.out.println("E");
else
	System.out.println(""+b);
if (a==3)
	System.out.println("E");
else
	System.out.println(""+a);
a++;
}
}
}