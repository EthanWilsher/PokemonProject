package pokemon.controller;

import pokemon.model.*;
import java.util.*;
import pokemon.view.*;


public class PokemonController 
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public void Pokemon()
	{
		this.pokedex = new ArrayList<Pokemon>();
		
		buildPokedex();
		
		
		this.appFrame = new PokemonFrame();
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
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
		
		
	}
	
	
	
	
	
	
	
}
