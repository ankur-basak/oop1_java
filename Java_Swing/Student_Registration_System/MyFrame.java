import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener
{
	private JLabel titleLabel, nameLabel, passLabel, radioBtnLabel, checkBoxLabel, comboBoxLabel;
	private JTextField nameTF;
	private JPasswordField passPF;
	private JButton loginBtn, showBtn, exitBtn, registrationBtn;
	private JRadioButton maleRB, femaleRB;
	private JCheckBox cb1, cb2, cb3, cb4, cb5;
	private JComboBox department;
	private JPanel panel;
	private ButtonGroup btng;
	
	public MyFrame()
	{
		super("Student Registration System");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel = new JPanel();
		this.panel.setLayout(null);
		
		this.nameLabel = new JLabel("Name: ");
		this.nameLabel.setBounds(30,50,100,20);
		this.panel.add(nameLabel);
		
		this.passLabel = new JLabel("Password: ");
		this.passLabel.setBounds(30,80,100,20);
		this.panel.add(passLabel);
		
		this.nameTF = new JTextField();
		this.nameTF.setBounds(140,50,90,25);
		this.panel.add(nameTF);
		
		this.passPF = new JPasswordField();
		this.passPF.setBounds(140,80,90,25);
		this.panel.add(passPF);
		
		this.showBtn = new JButton("Show");
		this.showBtn.setBounds(250,80,90,25);
		this.panel.add(showBtn);
		
		this.radioBtnLabel = new JLabel("Select Your Gender: ");
		this.radioBtnLabel.setBounds(30,120,190,40);
		this.panel.add(radioBtnLabel);
		
		this.maleRB = new JRadioButton ("Male");
		this.maleRB.setBounds(40,150,80,30);
		this.panel.add(maleRB);
		
		this.femaleRB = new JRadioButton ("Female");
		this.femaleRB.setBounds(120,150,80,35);
		this.panel.add(femaleRB);
		
		this.btng = new ButtonGroup();
		this.btng.add(maleRB);
		this.btng.add(femaleRB);
		
		this.checkBoxLabel = new JLabel("Which document you submitted ?");
		this.checkBoxLabel.setBounds(400,30,190,40);
		this.panel.add(checkBoxLabel);
		
		this.cb1 = new JCheckBox("MarkSheet");
		this.cb1.setBounds(490,65,210,40);
		this.panel.add(cb1);
		
		this.cb2 = new JCheckBox("HSC Certificate");
		this.cb2.setBounds(490,95,210,40);
		this.panel.add(cb2);
		
		this.cb3 = new JCheckBox("SSC Certificate");
		this.cb3.setBounds(490,125,210,40);
		this.panel.add(cb3);
		
		this.cb4 = new JCheckBox("Father's NID");
		this.cb4.setBounds(490,155,210,40);
		this.panel.add(cb4);
		
		this.cb5 = new JCheckBox("Mother's NID");
		this.cb5.setBounds(490,185,210,40);
		this.panel.add(cb5);
		
		this.comboBoxLabel = new JLabel("Select Your Department: ");
		this.comboBoxLabel.setBounds(400,230,180,30);
		this.panel.add(comboBoxLabel);
		
		String data[] = {"CSE","EEE","BBA","COE","IPE","LLB"};
		
		this.department = new JComboBox(data);
		this.department.setBounds(570,230,55,30);
		this.panel.add(department);
		
		this.loginBtn = new JButton("Login");
		this.loginBtn.setBounds(65,190,70,30);
		this.panel.add(loginBtn);
		
		this.exitBtn = new JButton("Exit");
		this.exitBtn.setBounds(140,190,70,30);
		this.panel.add(exitBtn);
		
		this.registrationBtn = new JButton("Registration");
		this.registrationBtn.setBounds(90,230,105,30);
		this.registrationBtn.addActionListener(this);
		this.panel.add(registrationBtn);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(registrationBtn.getText().equals(command))
		{
			String textFieldValue = " ", passFieldValue = " ", radioButtonValue = " ", checkBoxValue = " ", comboBoxValue=" ";
			
			if ((maleRB.isSelected() || (femaleRB.isSelected())) && ((cb1.isSelected()) ||(cb2.isSelected()) || (cb3.isSelected()) ||(cb4.isSelected())) && (!nameTF.getText().isEmpty()) && (!passPF.getText().isEmpty()))
			{
				String values = " ";
				
				textFieldValue = nameTF.getText();
				passFieldValue = passPF.getText();
				
				if(maleRB.isSelected())
				{
					radioButtonValue = maleRB.getText();
				}
				
				else
				{
					radioButtonValue = femaleRB.getText();
				}
				
				if(cb1.isSelected())
				{
					checkBoxValue = cb1.getText();
				}
				if(cb2.isSelected())
				{
					checkBoxValue = checkBoxValue +cb2.getText();
				}
				if(cb3.isSelected())
				{
					checkBoxValue = checkBoxValue+cb3.getText();
				}
				if(cb4.isSelected())
				{
					checkBoxValue = checkBoxValue+cb4.getText();
				}
				if(cb5.isSelected())
				{
					checkBoxValue = checkBoxValue+cb5.getText();
				}
				
				comboBoxValue = department.getSelectedItem().toString();
				
				MyDataFrame mdf = new MyDataFrame(textFieldValue, passFieldValue, radioButtonValue, checkBoxValue, comboBoxValue);
				
				this.setVisible(false);
				mdf.setVisible(true);
			}	
			
			else
			{
				JOptionPane.showMessageDialog(this, "Please fill up all the field");
			}
		}
	}
}


