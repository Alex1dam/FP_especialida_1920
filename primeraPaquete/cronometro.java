package primeraPaquete;
import java.util.concurrent.TimeUnit;
public class cronometro
{
	public static void main(String args[]) throws InterruptedException 
	{
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	for (int i=1;i>0;i++)
{
if (a>=10)
{
	a=0;
	b=b+1;
}
if (b>=6)
{
	b=0;
	c=c+1;
}
if (c>=10)
{
	c=0;
	d=d+1;
}
if (d>=6)
{
	d=0;
	e=e+1;
}
TimeUnit.SECONDS.sleep(1);
System.out.print(""+e);System.out.print(":"+d);System.out.print(""+c);System.out.print(":"+b);System.out.println(""+a);

a++;
}
}
}