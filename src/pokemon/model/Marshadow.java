package pokemon.model;

public class Marshadow extends Pokemon implements Fighting, Ghost
{
	public Marshadow()
	{
		super(802, "Marshadow");
	}
	
	public Marshadow(String name)
	{
		super(802, name);
	}
	
	public Marshadow(int number, String name)
	{
		super(name, number);
	}
	
	public int punches(int hits)
	{
		int connections = 29;
		
		return connections;
	}
	
	public boolean flex()
	{
		return true;
	}
	
	public boolean bleed()
	{
		return true;
	}
}
