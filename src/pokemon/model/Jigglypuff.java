package pokemon.model;

public class Jigglypuff extends Pokemon implements Fairy
{
	public Jigglypuff()
	{
		super("Jigglypuff", 39);
		
		setup();
	}
	
	public Jigglypuff(String name)
	{
		super(name, 39); 
		
		setup();
	}
	
	public Jigglypuff(int number, String name)
	{
		super(name, number);
		
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(9001);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.99);
		this.setHealthPoints(2000);
	}
	
	public boolean isPink()
	{
		return true;
	}
	
	public boolean doesFloat()
	{
		return true;
	}
	
	public int cute(int aww)
	{
		int cuteness = 200000;
		
		return cuteness;
	}

}
