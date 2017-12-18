package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.Fairy;

public class Wigglytuff extends Jigglypuff implements Fairy
{
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
