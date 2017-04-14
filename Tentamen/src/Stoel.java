public class Stoel
{
	public int rijNummer;
	public char stoelLetter;
	public Passagier passagier;
	
	public Stoel(int rij, char stoel)
	{
		this.rijNummer = rij;
		this.stoelLetter = stoel;
		this.passagier = null;
	}
	public boolean reserveer(Passagier passagier)
	{
		if(this.passagier != null)
		{
			this.passagier = passagier;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isBeschikbaar()
	{
		return passagier != null;
	}
}