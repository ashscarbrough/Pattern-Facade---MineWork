public class TunnelDigger extends MineWorker
{
	@Override
	public void work()
	{
		System.out.println(name() + " creates another promising tunnel.");
	}
	
	@Override
	public String name()
	{
		return "Dwarven tunnel digger";
	}
}
