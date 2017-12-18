package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.Derptastic;

public class TissueBox extends Pokemon implements Derptastic
{
	public TissueBox(int number, String name)
	{
		super(number, name);
	}
	
	public int annoy(int level)
	{
		int annoyance = -9999;
		
		return annoyance;
				
	}
	
	public String sayDerpy()
	{
		return "HERPADERPADERPADERP";
	}
	
	public void derpDerpDerp()
	{
		System.out.print("deerp");
	}
	
}
