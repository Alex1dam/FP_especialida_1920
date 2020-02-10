package primeraPaquete;
import java.util.Scanner;
public class bateria2_13
{
private static Scanner digito;
public static void main(String args[])
{ 
		digito = new Scanner(System.in);
	    System.out.println("Introduzca la altura");
	    int numero1 = digito.nextInt();
          for (int i=numero1;i>0;i--)	    
          {
	   		System.out.print("*      ");System.out.println(" *");
	   		System.out.println("");
	    }
          System.out.print(" *  *  * ");
}
}