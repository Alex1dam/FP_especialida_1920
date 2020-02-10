package primeraPaquete;
import java.util.concurrent.TimeUnit;
public class bateria2_3
{
	public static void main(String args[]) throws InterruptedException 
	{
	int a=0;
	int b=0;
	int c=0;
	for (int i=1000;i>0;i--)
{
if (a>=10)
{
	a=0;
	b++;
}
if (b>=10)
{
	b=0;
	c++;
}
TimeUnit.SECONDS.sleep(1);
if (c==3)
	System.out.print("E");
else
	System.out.print(""+c);
if (b==3)
	System.out.print("E");
else
	System.out.print(""+b);
if (a==3)
	System.out.println("E");
else
	System.out.println(""+a);
a++;
}
}
}