package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.Fairy;
public class Jigglypuff extends Pokemon implements Fairy
{
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
