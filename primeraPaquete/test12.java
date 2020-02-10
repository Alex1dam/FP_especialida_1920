package primeraPaquete;
import java.util.Scanner;
  public class test12 
  {
    private static Scanner sc;

	public static void main(String[] args) 
    {   System.out.println("Introduzca una palabra");
        sc = new Scanner(System.in);
        String cad = sc.nextLine(); 
        System.out.println("Introduzca la razon");
        char letra = sc.next().charAt(0); 
        int cantidadletras = 0;
        for (int i = 0; i < cad.length(); i++) 
        {
            char car = cad.charAt(i); 
            if (car == letra) 
            {
                cantidadletras++; 
            }
        }
        System.out.println("La candidad de veces que sale son " + cantidadletras);
    }
  }
