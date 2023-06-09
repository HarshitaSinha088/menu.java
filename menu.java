// to print multiple values from list.
import java.awt.*;
import java.awt.event.*;

class menu extends Frame implements ActionListener
{
	MenuBar mb;
	Menu file,edit;
	MenuItem neww,open,save,cut;
	Dialog d1;
	Button b1;
	
	menu()
	{
		d1=new Dialog(this);
		d1.setSize(300,300);
		d1.setLayout(new FlowLayout(FlowLayout.LEFT));
		b1=new Button("Exit");
		b1.addActionListener(this);
		d1.add(b1);
		
		mb=new MenuBar();
		setMenuBar(mb);
		
		file=new Menu("File");
		edit=new Menu("Edit");
		
		mb.add(file);
		mb.add(edit);
		
		
		neww=new MenuItem("New");
		neww.addActionListener(this);
		open=new MenuItem("Open");
		save=new MenuItem("Save");
		cut=new MenuItem("Cut");
		
		file.add(neww);
		file.add(open);
		file.add(save);
		edit.add(cut);
		
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==neww)
			d1.show();
		if(ae.getSource()==b1)
			d1.dispose();
	}
	public static void main(String[] args)
	{
		new menu();
	}
}
		
		
		
		