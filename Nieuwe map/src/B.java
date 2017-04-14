public class B extends F implements G
{
	public C []c;
	private E e;
	
	public B()
	{
		this.c = new C[3];
		for(int i = 0; i < c.length; i++)
		{
			c[i] = new C();
		}
		this.e = null;
	}
	public int doSomething(int i)
	{
		super.doSomething(i);
		this.e = new E();
		return 0;
	}
	public void doSomethingElse()
	{
		
	}
	public void createCELink()
	{
		this.c[0].createCELink(e);
	}
	public void displayD(int i)
	{
		
	}
	public void removeCELink(C.D d, C c)
	{
		c.removeCELink(this.e);
	}
}