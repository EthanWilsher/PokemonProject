package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.Fighting;

public class GurDurr extends Pokemon implements Fighting
{
	public GurDurr()
	{
		super(533, "GurDurr");
		
		setup();
	}
	
	public GurDurr(String name)
	{
		super(533, name);
		
		setup();
	}
	
	public GurDurr(int number, String name)
	{
		super(name, number);
		
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(500);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(250);
	}
	public boolean flex()
	{
		return true;
	}
	
	public boolean bleed()
	{
		return false;
	}
	
	public int punches(int hits)
	{
		int connections = -30;
		
		return connections;
	}

}
