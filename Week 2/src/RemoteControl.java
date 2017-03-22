public class RemoteControl
{
	public DavinciRobot []dR;
	
	public RemoteControl()
	{
		dR = new DavinciRobot[2];
		for(int i = 0; i < dR.length; i++)
		{
			dR[i] = new DavinciRobot();
		}
	}
}
