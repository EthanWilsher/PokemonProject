package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.Fighting;

public class Litwick extends Pokemon implements Fighting
{
	public boolean doesFloat()
	{
		return false;
	}
	
	public boolean transparent()
	{
		return true;
	}
	
	public int howBig(int size)
	{
		int volume = 2;
		
		return volume;
	}
}
