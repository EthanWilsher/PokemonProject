package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.Fairy;

public class Wigglytuff extends Jigglypuff 
{
	public Wigglytuff()
	{
		super(40, "Wigglytuff");
		
		setup();
	}
	
	public Wigglytuff(String name)
	{
		super(40, name);
		
		setup();
	}
	
	public Wigglytuff(int number, String name)
	{
		super(number, name);
		
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(666);
		this.setCanEvolve(false);
		this.setHealthPoints(400);
	}
	public boolean isPink()
	{
		return true;
	}
	
	public boolean doesFloat()
	{
		return false;
	}
	
	public int cute(int aww)
	{
		int cuteness = 100;
		
		return cuteness;
	}
}
