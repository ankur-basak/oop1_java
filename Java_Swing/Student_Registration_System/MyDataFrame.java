import java.lang.*;
import javax.swing.*;

public class MyDataFrame extends JFrame
{
	private JLabel titleLabel, nameLabel, passLabel, radioBtnLabel, checkBoxLabel, comboBoxLabel;
	
	private JPanel panel;
	
	public MyDataFrame(String name, String pass, String radioBtn, String checkBox, String comboBox)
	{
		super("My Data Frame");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel = new JPanel();
		this.panel.setLayout(null);
		
		this.titleLabel = new JLabel("Your All data is here");
		this.titleLabel.setBounds(250,30,190,40);
		this.panel.add(titleLabel);
		
		this.nameLabel = new JLabel("Name: ");
		this.nameLabel.setBounds( 180,80,200,30);
		this.panel.add(nameLabel);
		
		this.passLabel = new JLabel("Password: ");
		this.passLabel.setBounds(180,100,200,30);
		this.panel.add(passLabel);	
		
		this.radioBtnLabel = new JLabel(" Gender: ");
		this.radioBtnLabel.setBounds(177,120,220,30);
		this.panel.add(radioBtnLabel);
		
		this.checkBoxLabel = new JLabel("Submitted: ");
		this.checkBoxLabel.setBounds(180,140,230,30);
		this.panel.add(checkBoxLabel);
		
		this.comboBoxLabel = new JLabel("Department: ");
		this.comboBoxLabel.setBounds(180,160,240,30);
		this.panel.add(comboBoxLabel);
		
		this.nameLabel = new JLabel(name);
		this.nameLabel.setBounds(240,80,250,30);
		this.panel.add(nameLabel);
		
		this.passLabel = new JLabel(pass);
		this.passLabel.setBounds(250, 100, 270,30);
		this.panel.add(passLabel);
		
		this.radioBtnLabel = new JLabel(radioBtn);
		this.radioBtnLabel.setBounds(250,120,290,30);
		this.panel.add(radioBtnLabel);
		
		this.checkBoxLabel = new JLabel(checkBox);
		this.checkBoxLabel.setBounds(250,140,300,30);
		this.panel.add(checkBoxLabel);
		
		this.comboBoxLabel = new JLabel(comboBox);
		this.comboBoxLabel.setBounds(250,160,360,30);
		this.panel.add(comboBoxLabel);
		
		this.add(panel);
	}
}