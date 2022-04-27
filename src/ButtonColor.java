import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;


public class ButtonColor extends JButton {
	Image myImage;
	Graphics graphImage;
	ButtonColor(int i,Color c){
		myImage = new BufferedImage(20,20, BufferedImage.TYPE_INT_RGB);
		graphImage = myImage.getGraphics();
		fillColor(c);
		this.setSize(50,50);
		this.setText("Color"+i);
		this.setFocusable(false);
		this.setIcon(myImage);
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setVerticalTextPosition(JButton.BOTTOM);
		

		
		
	}

	public void fillColor(Color c){
		graphImage.setColor(c);
		graphImage.fillRect(0, 0, 20, 20);
		
	}
	public void setIcon(Image img) {
		ImageIcon icon = new ImageIcon(myImage);
		this.setIcon(icon);
	}
	public void changeColor(Color c) {
		fillColor(c);
		setIcon(myImage);
		// TODO Auto-generated method stub
		
	}
}
