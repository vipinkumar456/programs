package packs;
import java.awt.*;
class MyFrame1
{
	MyFrame1()
	{
	Frame f=new Frame("this is my frame");
	Panel p=new Panel();
	f.add(p);
	
	// Menu 
	MenuBar mb=new MenuBar();
	f.setMenuBar(mb);
	//MenuItem
	Menu File,Edit,Help,print;
	File =new Menu("File");
	Edit =new Menu("Edit");
	Help =new Menu("Help");
	print =new Menu("Print");
	mb.add(File);	mb.add(Edit);	mb.add(Help);	mb.add(print);
    //MenuComponent
	MenuItem open,save,saveas;
	open =new MenuItem("Open");
	save =new MenuItem("Save");
	saveas =new MenuItem("SaveAs");
	File.add(open);File.add(save);Edit.add(saveas);
	// Label
	Label l=new Label("username");
	// Textfield
	TextField tf=new TextField(20);
	// Textarea
	TextArea ta=new TextArea(10,10);
	//combobox
	Choice c=new Choice();
	c.add("select the city");c.add("NewDelhi");
	c.add("Faridabd");c.add("Badarpur");
	// list
	List li=new List();
	li.add("NewDelhi");li.add("NewDelhi");
	li.add("NewDelhi");li.add("NewDelhi");
	
	//choicebox
	Checkbox cb1=new Checkbox("I.s.c");
	Checkbox cb2=new Checkbox("B.s.c");
	Checkbox cb3=new Checkbox("M.s.c");
	
	// radiobutton
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox cb4=new Checkbox("Male",cbg,true);
	Checkbox cb5=new Checkbox("Female",cbg,false);
	
	// Button
	Button b=new Button(" save");
	
		p.add(l);p.add(tf);p.add(ta);p.add(c);p.add(li);p.add(cb1);
		p.add(cb2);p.add(cb3);p.add(cb4);p.add(cb5);p.add(b);
	
	
	
	
	
	
	f.setSize(600,600);
	f.setLocation(200,100);
	f.setVisible(true);
}	
	public static void main(String args[])
	{
		new MyFrame1();
	}
}