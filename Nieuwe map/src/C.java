import java.util.ArrayList;
import java.util.List;

public class C 
{
	public ArrayList<D> d;
	private int DiD;
	private  DIterator diterator;
	private H h;
	
	public C()
	{
		this.d = new ArrayList<D>();
		this.d.add(new D());
		this.DiD = 1;
		this.diterator = new DIterator(this.d);
		this.h = null;
	}
	
	public void createCELink(E e)
	{
		this.h = new H(this, e);
		this.h.e.setH(h);
	}
	public void displayD()
	{
		for(int i = 0; i < (DiD - 1); i++)
		{
			System.out.println("ID: " + this.d.get(i).getID() + " Name: " + this.d.get(i).getName());;
		}
	}
	public void removeCELink(E e)
	{
		this.h.e.resetH();
	}
	public int calculateAverageIdD()
	{
		int som = 0;
		for(int i = 0; i < 10; i++)
		{
			d.add(new D());
		}
		for(int i = 0; i < this.d.size(); i++)
		{
			som += this.d.get(i).getID();
		}
		return som / this.d.size();
	}
	public class D extends B
	{
		private int id;
		private String name;

		int getID()
		{
			return this.id;
		}
		String getName()
		{
			return this.name;
		}
	}
	public class DIterator
	{
		private List<C.D> D;
		private int currentID = 0;
		
		public DIterator(List<C.D> d)
		{
			this.D = d;
		}
		public boolean hasNext()
		{
			return (currentID < this.D.size() && this.D.get(currentID++) != null);
		}
		public C.D next()
		{
			this.currentID++;
			return this.D.get(this.currentID);
		}
		public boolean remove()
		{
			
		}
	}
}