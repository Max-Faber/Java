public class A
{
	private B b;
	public A()
	{
		this.b = new B();
	}
	
	public static void main(String[] args)
	{
		A a = new A();
		a.startSequence(10);
		a.b.createCELink();
		a.b.doSomethingElse();
		a.b.removeCELink(a.b.c[0].d.get(0), a.b.c[0]);
	}
	public void startSequence(int i)
	{
		this.b.doSomething(i);
	}
}