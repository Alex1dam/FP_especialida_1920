package primeraPaquete;
import javax.swing.JOptionPane;
public class InviertePrimeraUltima 
{
    static String invierte(String cadena)
    {
        String parte1,parte2,parte3;
        if (cadena.indexOf(" ")!=-1)
        {
            parte1=cadena.substring(0,cadena.indexOf(" "));
            parte2=cadena.substring(cadena.indexOf(" "),cadena.lastIndexOf(" ")+1);
            parte3=cadena.substring(cadena.lastIndexOf(" "),cadena.length());      
            return parte3+parte2+parte1;
        } 
        else 
        {
            return cadena;
         }     
       } 
    public static void main(String[] args) 
    {
        String frase;     
        frase=JOptionPane.showInputDialog("Introduzca una frase (al menos de dos palabras)");
        System.out.println("Cadena invirtiendo primer y última palabras: "+invierte(frase));
    }
    
}
