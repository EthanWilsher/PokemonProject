package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.Fighting;

public class Hitmonlee extends Pokemon implements Fighting
{
	public Hitmonlee()
	{
		
		super(106, "Hitmonlee");
		
		setup();
	}
	
	public Hitmonlee(String name)
	{
		super(106, name);
		
		setup();
	}
	
	public Hitmonlee(int number, String name)
	{
		super(name, number);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(578);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.93);
		this.setHealthPoints(200);
	}
	
	
	
	public int punches(int hits)
	{
		int connections = 9999;
		
		return connections;
	}
	
	public boolean flex()
	{
		return false;
	}
	
	public boolean bleed()
	{
		return true;
	}

}
