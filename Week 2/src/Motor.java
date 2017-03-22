public class Motor
{
	public RemoteControl []rC;
	public Motor()
	{
		rC = new RemoteControl[4];
		for(int i = 0; i < rC.length; i++)
		{
			rC[i] =  new RemoteControl();
		}
	}
}
