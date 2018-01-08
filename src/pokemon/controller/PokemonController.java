package pokemon.controller;

import pokemon.model.*;
import java.util.*;

public class PokemonController 
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public void Pokemon()
	{
		this.pokedex = new ArrayList<Pokemon>();
		
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}
	
	
	private void buildPokedex()
	{
		pokedex.add(new GurDurr());
		pokedex.add(new Hitmonlee());
		pokedex.add(new Jigglypuff());
		pokedex.add(new Litwick());
		pokedex.add(new Marshadow());
		pokedex.add(new Wigglytuff());
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	public void start()
	{
		
	}

	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
}
