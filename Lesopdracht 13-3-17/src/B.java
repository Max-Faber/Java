
public class B 
{
	C []c;
	E e = new E();
	
	public B()
	{
		c = new C[3];
		for(int i = 0; i < c.length; i++)
		{
			c[i] = new C();
		}
	}
}
