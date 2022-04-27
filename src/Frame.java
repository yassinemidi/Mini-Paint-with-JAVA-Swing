import java.awt.*;
import javax.swing.*;



public class Frame extends JFrame {
	DrawPanel panel2 ;
	public Frame(){
		this.setSize(900,600);
		
				
		
		ButtonsPanel panel1 = new ButtonsPanel() {

			@Override
			void clear() {
				panel2.clear();
				
			}
			
		};
		
		panel2 = new DrawPanel();
		JtoolBar bar=new JtoolBar();
		
		this.setLayout(new BorderLayout());
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		
		this.add(bar.jtoolbar,BorderLayout.LINE_START);

		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		//menu bar
		JMenuBar menuBar = new JMenuBar();
		JMenu MenuFile = new JMenu("File");
		JMenu MenuEdit = new JMenu("Edit");
		JMenu MenuLanguage = new JMenu("Languages") ;
		JMenu MenuExit = new JMenu("Exit") ;
		
		menuBar.add(MenuFile);
		menuBar.add(MenuEdit);
		menuBar.add(MenuLanguage);
		menuBar.add(MenuExit);
		
		
		
		

		
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
		

		
		
	}

}
