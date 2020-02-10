package primeraPaquete;

import java.util.Scanner;
public class adminpass
{
public static void main(String args[])
{   
	System.out.println("Introduzca el usuario");
    Scanner teclado = new Scanner(System.in);
    String numero1 = teclado.nextLine();
    System.out.println("Introduzca la contraseña");
    String numero2 = teclado.nextLine();
    if ((numero2.contentEquals("123456"))&(numero1.contentEquals("admin")))
       System.out.println("Successful login");  
    else
      {	
    	System.out.println("Incorrect password, try again, you have 2 more oportunities"); 
        System.out.println("Introduzca la contraseña");

        String numero3 = teclado.nextLine();
        if (numero3.contentEquals("123456"))
        {
        	System.out.println("Successful login");
        }  
        else
        {	
        	System.out.println("Incorrect password, try again, you have 1 more oportunity");                              
            System.out.println("Introduzca la contraseña");
            String numero4 = teclado.nextLine();
                  if (numero4.contentEquals("123456"))
                  {
                	  System.out.println("Successful login");
                  }   
                  else 
                  {
                   System.out.println("You can´t login for the next 3 hours");
                  }
         }
        }
    teclado.close();
    }
}