package pokemon.model;

public class Hitmonlee extends Pokemon implements Fighting
{
	public Hitmonlee()
	{
		
		super("Hitmonlee", 106);
		
		setup();
	}
	
	public Hitmonlee(String name)
	{
		super(name, 106);
		
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
