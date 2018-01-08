package pokemon.controller;

import pokemon.model.*;
import java.util.List;
import java.util.ArrayList;

public class PokemonController
{
	
	public void Pokemon()
	{
		this.pokedex = new ArrayList<Pokemon>();
		
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
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
}
