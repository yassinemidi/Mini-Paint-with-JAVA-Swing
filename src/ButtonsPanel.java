import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class ButtonsPanel extends JPanel{
	public Image image;
	public Graphics2D g2;
	JButton CC1;
	JButton CC2;
	public Color color1= Color.black;
	public Color color2= Color.white;
	ButtonColor C1;
	ButtonColor C2;
	
	JButton gome;
	abstract void clear();

	ButtonsPanel(){
		this.setBackground(Color.GRAY);
		this.setPreferredSize(new Dimension(33,50));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		gome=new JButton("Gomme");
		gome.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("okk");
				DrawPanel.setColor(Color.WHITE);

				// TODO Auto-generated method stub
				
			}

		});
		
		this.add(gome);
		
		
		String[] values = {"1","2","3","4","5","6","7","8","9","10"};
		JComboBox comboBoxGome = new JComboBox(values);
		comboBoxGome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int size = Integer.parseInt((String) comboBoxGome.getSelectedItem());
				DrawPanel.setSize(size*2);

				// TODO Auto-generated method stub
				
			}
		});
		
		this.add(comboBoxGome);
		
		C1 = new ButtonColor(1,color1);
		C1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("okk");
				DrawPanel.setColor(color1);

				// TODO Auto-generated method stub
				
			}

		});
		
		this.add(C1);
		
		JButton CC1 = new JButton("Change Color 1");
		CC1.setSize(40,40);
		CC1.setFocusable(false);
		CC1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("ok");
				JColorChooser colorChooser = new JColorChooser();
				color1 = JColorChooser.showDialog(null, "pick a color", color1);
				C1.changeColor(color1);

				// TODO Auto-generated method stub
				
			}

		});
		this.add(CC1);
		
		
		
		C2 = new ButtonColor(2,color2);
		C2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("okk2");
				DrawPanel.setColor(color2);

				// TODO Auto-generated method stub
				
			}

		});
		this.add(C2);
		
		JButton CC2 = new JButton("Change Color 2");
		CC2.setSize(40,40);
		CC2.setFocusable(false);
		CC2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("ok2");
				JColorChooser colorChooser = new JColorChooser();
				color2 = JColorChooser.showDialog(null, "pick a color", color2);
				C2.changeColor(color2);

				// TODO Auto-generated method stub
				
			}

		});
		this.add(CC2);
//combobox		
		
		JComboBox comboBox = new JComboBox(values);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int size = Integer.parseInt((String) comboBox.getSelectedItem());
				DrawPanel.setSize(size);

				// TODO Auto-generated method stub
				
			}
		});
		this.add(comboBox);
		JButton clearButton = new JButton("clear");
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
				
				
			}
		});
		this.add(clearButton);
		
		
		
		
		
		
		
		
		
		
		

		
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==CC1) {
//			JColorChooser colorChooser = new JColorChooser();
//			this.color1 = JColorChooser.showDialog(null, "pick a color", Color.black);
//			C1.changeColor(color1);
//			System.out.println("ok");
//			
//		}
//	}
	
}
