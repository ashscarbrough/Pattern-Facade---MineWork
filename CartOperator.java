public class CartOperator extends MineWorker
{
	@Override
	public void work()
	{
		System.out.println(name() + " moves gold chunks out of the mine.");
	}
	
	@Override
	public String name()
	{
		return "Dwarf cart operator";
	}
}
