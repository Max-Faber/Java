import java.util.ArrayList;
import java.util.Date;

public class Vlucht
{
	public String maatschappij;
	public int nummer;
	public Date vertrek;
	public Piloot piloot[];
	public ArrayList<Steward> steward;
	public Vliegtuig vlieguig;
	
	public Vlucht(String maatschappij, int nummer, Date vertrek, Vliegtuig vliegtuig, Piloot piloot1, Piloot piloot2)
	{
		this.piloot = new Piloot[2];
		this.piloot[0] = piloot1;
		this.piloot[1] = piloot2;
		this.steward = new ArrayList<Steward>();
		this.maatschappij = maatschappij;
		this.nummer = nummer;
		this.vertrek = vertrek;
		this.vliegtuig = vliegtuig;
	}
}