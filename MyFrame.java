package pack;
import java.awt.*;
public class MyFrame {

	MyFrame()
	{
		Frame f = new Frame("this is my frame");
		Panel p = new Panel();
		
		f.add(p);
		//menu
		MenuBar mb= new MenuBar();
		f.setMenuBar(mb);
		// menu component
		Menu file,edit,view,help,print;
		file = new Menu("File ");
		edit = new Menu("Edit ");
		view = new Menu("View ");
		help = new Menu("Help ");
		print = new Menu("Print ");
		
		// menu item
		MenuItem new1,open,save,saveas,exit,copy,paste,doc,pdf;
		new1 =new MenuItem("New ");
		open =new MenuItem("Open ");
		save =new MenuItem("Save ");
		 
		saveas =new MenuItem("Save As ");
		exit =new MenuItem("Exit ");
		copy =new MenuItem("Copy ");
		paste =new MenuItem("Paste ");
		doc =new MenuItem("DOC ");
		pdf =new MenuItem("PDF ");
		
		file.add(new1);file.add(open);file.addSeparator();file.add(save);file.add(saveas);
		file.addSeparator();file.add(print);file.add(exit);edit.add(copy);edit.add(paste);
		mb.add(file);mb.add(edit);mb.add(view);mb.add(help);
		
		print.add(doc);print.add(pdf);
		//label
		Label l= new Label("User Name");
		
		// text field
		TextField tf = new TextField(20);
		
		// text area
		TextArea ta = new TextArea(10,20);
		
		// combobox
		Choice c = new Choice();
		c.add("select the city");c.add("New Delhi");
		c.add("Noida");c.add("Faridabad");
		
		// list
		List li = new List();
		li.add("select the city");li.add("New Delhi");
		li.add("Noida");li.add("Faridabad");
		
		//check box
		Checkbox cb1= new Checkbox("I.Sc",true);
		Checkbox cb2= new Checkbox("B.Sc");
		Checkbox cb3= new Checkbox("M.Sc");
		
		//radio button
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb4= new Checkbox("Male",cbg,true);
		Checkbox cb5= new Checkbox("Female",cbg,false);
		
		// button 
		Button b= new Button("Save");
		//adding components
		
		p.add(l);p.add(tf);p.add(ta);p.add(c);p.add(li);
		p.add(cb1);p.add(cb2);p.add(cb3);p.add(cb4);p.add(cb5);
		p.add(b);
		
		f.setSize(600,600);
		f.setLocation(200,100);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame(); 

	}

}
