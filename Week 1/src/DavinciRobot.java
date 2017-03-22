
public class DavinciRobot 
{
	boolean x;
	int y;
	byte z;

	public DavinciRobot()
	{
		x = true;
		y = 12345678;
		z = 127;
	}
	boolean convert()
	{
		if(x == true || y < z) return true;
		else return false;
	}
}