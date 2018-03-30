/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 6
 */


import java.util.ArrayList;

/**
 * GoldmineFacade provides a single interface through which users can operate the subsystems.
 */
public class GoldmineFacade
{
	private ArrayList<MineWorker> workers;
	
	public GoldmineFacade()
	{
		workers = new ArrayList <MineWorker>();
		workers.add(new GoldDigger());
		workers.add(new CartOperator());
		workers.add(new TunnelDigger());

	}
	
	public void startNewDay()
	{
		carryoutActions(workers, MineWorker.Action.WAKE_UP, MineWorker.Action.GO_TO_MINE);
	}
	
	public void digOutGold()
	{
		carryoutActions(workers, MineWorker.Action.WORK);
	}
	
	public void endDay()
	{
		carryoutActions(workers, MineWorker.Action.GO_HOME, MineWorker.Action.GO_TO_SLEEP);
	}
	
	private static void carryoutActions(ArrayList<MineWorker> workers, MineWorker.Action... actions)
	{
		for (MineWorker obj:workers)	// For each object MineWorker, actions are performed
			obj.action(actions);
	}
}