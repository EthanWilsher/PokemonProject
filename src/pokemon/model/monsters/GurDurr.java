package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.Fighting;

public class GurDurr extends Pokemon implements Fighting
{
	public boolean flex()
	{
		return true;
	}
	
	public boolean bleed()
	{
		return false;
	}
	
	public int punches(int hits)
	{
		int connections = -30;
		
		return connections;
	}

}
