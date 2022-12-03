package pack;
import java.awt.*;
import javax.swing.*;
public class MySwing {

	MySwing()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("this is my frame");
		JPanel p = new JPanel();
		
		f.add(p);
		p.setLayout(null);
		//label
		JLabel l= new JLabel("User Name");
		
		
		// text field
		JTextField tf = new JTextField(20);
		//tf.setBackground(Color.BLACK);
		//tf.setForeground(Color.white);
		//tf.setFont(new Font("Lucida Handwriting",Font.BOLD,16));
		//tf.setHorizontalAlignment(JTextField.RIGHT);
		JLabel l1= new JLabel("Password ");
		
		// text field
		JPasswordField pf = new JPasswordField(20);
		
		// text area
		JTextArea ta = new JTextArea(10,20);
		JScrollPane sp = new JScrollPane(ta);
		// combobox
		String str[]={"select the city","New Delhi","Noida","Faridabad"};
		JComboBox c= new JComboBox(str);
		
		
		
		// list
		JList li = new JList(str);
		
		
		//check box
		JCheckBox cb1= new JCheckBox("I.Sc",true);
		JCheckBox cb2= new JCheckBox("B.Sc");
		JCheckBox cb3= new JCheckBox("M.Sc");
		
		//radio button
		ButtonGroup cbg = new ButtonGroup();
		JRadioButton cb4= new JRadioButton("Male",cbg,true);
		JRadioButton cb5= new JRadioButton("Female",cbg,false);
		cbg.add(cb4);cbg.add(cb5);
		// button 
		JButton b= new JButton("Save");
		//adding components
		
		p.add(l);p.add(tf);p.add(l1);p.add(pf);p.add(sp);
		p.add(cb1);p.add(cb2);p.add(cb3);p.add(cb4);p.add(cb5);
		p.add(b);
		// layouts
		/*l.setBounds(40,50,80,20);
		tf.setBounds(130,50,150,20);
		l1.setBounds(40,80,80,20);
		pf.setBounds(130,80,150,20);*/
		f.setSize(600,600);
		f.setLocation(200,100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MySwing(); 

	}

}
