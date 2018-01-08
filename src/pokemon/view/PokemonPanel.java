package pokemon.view;

import pokemon.controller.*;
import javax.swing.*;
import java.awt.event.ActionListener;
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
		clearButton = new JButton("save");
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
