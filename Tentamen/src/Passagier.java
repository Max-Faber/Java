import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
public class Passagier extends Persoon
{
	public Stoel stoel;
	public Vlucht vlucht;
	public boolean isIngestapt;
	Vliegtuig vliegtuig;
	
	public Passagier()
	{
		super(naam, geboorteDatum);
		this.stoel = new Stoel(stoel.rijNummer, stoel.stoelLetter);
		this.vlucht = new Vlucht(vlucht.maatschappij, vlucht.nummer, vlucht.vertrek, vlucht.vlieguig, vlucht.piloot[0], vlucht.piloot[1]);
		this.isIngestapt = false;
	}
	
	public void boekVlucht(Vlucht vlucht)
	{
		this.vlucht = vlucht;
	}
	public void kiesStoelUit()
	{
		int aantalStoelen = vliegtuig.capaciteit();
		Iterator<Stoel> stoelen = vliegtuig.geefBeschikbareStoelen();

		this.stoel = stoelen.next();
		stoel.reserveer(this);
		/*for(int i = 0; i < (aantalStoelen - 1) ; i++)
		{
			this.stoel = stoelen.previous();
		}*/
	}
	public void stapIn()
	{
		this.isIngestapt = true;
	}
	public boolean isIngechecked()
	{
		if(stoel.isBeschikbaar()) return true;
		else return false;
	}
}