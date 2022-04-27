import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JtoolBar implements ActionListener{
	
	JToolBar jtoolbar;
	
	JButton cercle;
	JButton line;
	JButton squar;
	
	public JtoolBar() {
		jtoolbar =new JToolBar();
		jtoolbar.setLayout(new BoxLayout(jtoolbar, BoxLayout.PAGE_AXIS));
		cercle=new JButton("Cercle");
		line=new JButton("Line");
		squar=new JButton("Squar");
		
		jtoolbar.add(cercle);
		jtoolbar.add(line);
		jtoolbar.add(squar);
		
		cercle.addActionListener(this);
		line.addActionListener(this);
		squar.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cercle) {
			System.out.println("cercle");
		}else if(e.getSource()==line){
			System.out.println("Line");
		}else {
			System.out.println("Squar");
		}
		
	}
	
	
	
	
	
	
	

}
