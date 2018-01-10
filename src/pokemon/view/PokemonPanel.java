package pokemon.view;

import pokemon.controller.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;



public class PokemonPanel extends JPanel
{
	private SpringLayout pokemonLayout;
	private PokemonController appController;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		numberField = new JTextField("##");
		attackField = new JTextField("AP");
		healthField =  new JTextField("HP");
		modifierField = new JTextField("mod");
		
		
		iconLabel = new JLabel("pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/PokedexImage")), JLabel.CENTER);
		modifierLabel = new JLabel("");
		evolvableLabel = new JLabel("");
		numberLabel = new JLabel("");
		healthLabel = new JLabel("");
		attackLabel = new JLabel("");
		nameLabel = new JLabel("");
		clearButton = new JButton("clear");
		saveButton = new JButton("save");
		pokedexDropdown = new JComboBox();
		
		pokemonLayout = new SpringLayout();
		
		
		
		descriptionArea = new JTextArea(5, 10);
		
		
		typeArea = new JTextArea(4, 15);
		
		
		
		firstType = new JPanel();
		
		
		secondType = new JPanel();
		
		thirdType = new JPanel();
		
		fourthType = new JPanel();
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel<String>(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(pokemonLayout);
		this.setBackground(Color.ORANGE);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	
	private void setupLayout()
	{
		pokemonLayout.putConstraint(SpringLayout.WEST, firstType, 0, SpringLayout.WEST, healthLabel);
		pokemonLayout.putConstraint(SpringLayout.NORTH, secondType, 1, SpringLayout.SOUTH, firstType);
		pokemonLayout.putConstraint(SpringLayout.WEST, secondType, 0, SpringLayout.WEST, healthLabel);
		pokemonLayout.putConstraint(SpringLayout.NORTH, firstType, 0, SpringLayout.SOUTH, thirdType);
		pokemonLayout.putConstraint(SpringLayout.WEST, iconLabel, 165, SpringLayout.EAST, firstType);
		pokemonLayout.putConstraint(SpringLayout.SOUTH, typeArea, -20, SpringLayout.NORTH, pokedexDropdown);
		pokemonLayout.putConstraint(SpringLayout.EAST, typeArea, -27, SpringLayout.EAST, this);
		pokemonLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 39, SpringLayout.NORTH, this);
		pokemonLayout.putConstraint(SpringLayout.SOUTH, iconLabel, -6, SpringLayout.NORTH, descriptionArea);
		pokemonLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, descriptionArea);
		pokemonLayout.putConstraint(SpringLayout.WEST, descriptionArea, 56, SpringLayout.WEST, this);
		pokemonLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, evolvableBox);
		pokemonLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, attackField);
		pokemonLayout.putConstraint(SpringLayout.NORTH, attackField, 0, SpringLayout.NORTH, nameField);
		pokemonLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, modifierField);
		pokemonLayout.putConstraint(SpringLayout.NORTH, modifierField, 0, SpringLayout.NORTH, numberField);
		pokemonLayout.putConstraint(SpringLayout.WEST, nameField, 24, SpringLayout.WEST, this);
		pokemonLayout.putConstraint(SpringLayout.SOUTH, nameField, -85, SpringLayout.SOUTH, this);
		pokemonLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 27, SpringLayout.SOUTH, nameField);
		pokemonLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, nameField);
		pokemonLayout.putConstraint(SpringLayout.WEST, numberField, 42, SpringLayout.WEST, this);
		pokemonLayout.putConstraint(SpringLayout.SOUTH, numberField, -25, SpringLayout.NORTH, nameField);
		pokemonLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 125, SpringLayout.NORTH, this);
		pokemonLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 339, SpringLayout.WEST, this);
		pokemonLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -59, SpringLayout.EAST, this);
		pokemonLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, clearButton);
		pokemonLayout.putConstraint(SpringLayout.WEST, saveButton, 6, SpringLayout.EAST, clearButton);
		pokemonLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		pokemonLayout.putConstraint(SpringLayout.EAST, clearButton, -84, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent selection)
				{
					int selectPokemonIndex = pokedexDropdown.getSelectedIndex();
					updatePokedexInfo(selectedPokemonIndex);
					updateImage();
					updateTypePanels();
					repaint();
				}	
				});
	}
	
	private void updateImage()
	{
		
	}
	
	private void updateTypePanels() 
	{
		String [] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		if (types[0].equals("Fairy"))
		{
			firstType.setBackground(Color.PINK);
		}
		else if(types[0].equals("Fighting"))
		{
			firstType.setBackground(Color.RED);
		}
		else if(types[0].equals("Ghost"))
		{
			firstType.setBackground(Color.GRAY);
		}
		else
		{
			firstType.setBackground(Color.WHITE);
		}
	
		if(types.length > 1)
		{
			if (types[1].equals) 
		}
		
		
	
	}
	
	
	
	
	
	

}
