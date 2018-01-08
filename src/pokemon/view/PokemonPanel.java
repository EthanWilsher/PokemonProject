package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.*;



public class PokemonPanel extends JPanel
{
	
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
	
	private SpringLayout pokemonLayout;
	

	
	private PokemonController appController;
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		this.evolvableBox = new JCheckBox();
		this.nameField = new JTextField("name");
		this.numberField = new JTextField("##");
		this.attackField = new JTextField("AP");
		this.healthField =  new JTextField("HP");
		this.modifierField = new JTextField("mod");
		
		
		this.iconLabel = new JLabel("pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/PokedexImage")), JLabel.CENTER);
		this.modifierLabel = new JLabel("");
		this.evolvableLabel = new JLabel("");
		this.numberLabel = new JLabel("");
		this.healthLabel = new JLabel("");
		this.attackLabel = new JLabel("");
		this.nameLabel = new JLabel("");
		this.clearButton = new JButton("save");
		this.saveButton = new JButton("save");
		this.pokedexDropdown = new JComboBox();
		
		this.descriptionArea = new JTextArea(5, 10);
		this.typeArea = new JTextArea(4, 15);
		
		this.firstType = new JPanel();
		this.secondType = new JPanel();
		this.thirdType = new JPanel();
		this.fourthType = new JPanel();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
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
		
	}
	

}
