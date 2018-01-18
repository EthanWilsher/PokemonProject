package pokemon.model;

public class Marshadow extends Pokemon implements Fighting, Ghost
{
	public Marshadow()
	{
		super("Marshadow", 802);
	}
	
	public Marshadow(String name)
	{
		super(name, 802);
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

	@Override
	public boolean doesFloat()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean transparent()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int howBig(int amount)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	
}
