import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

public class DrawPanel extends JComponent {
	
	
	public Image image;
	public static Graphics2D g2;
	public int currentX, currentY, oldX, oldY;
	 
	public DrawPanel() {
	    setDoubleBuffered(false);
	    //get mouse coords when press it
	    addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent e) {
	        oldX = e.getX();
	        oldY = e.getY();
	      }
	    });
	    
	    //draw a line each time we drag the 
	    addMouseMotionListener(new MouseMotionAdapter() {
	      public void mouseDragged(MouseEvent e) {
	        currentX = e.getX();
	        currentY = e.getY();
	 
	        if (g2 != null) {
	          g2.drawLine(oldX, oldY, currentX, currentY);
	          repaint();
	          oldX = currentX;
	          oldY = currentY;
	        }
	      }
	    });
	  }
	 //create the image and paint our graphic in it
	  protected void paintComponent(Graphics g) {
	    if (image == null) {
	      image = createImage(getSize().width, getSize().height);
	      g2 = (Graphics2D) image.getGraphics();
	      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	      clear();
	    }
	 
	    g.drawImage(image, 0, 0, null);
	  }
	 
	  // methods we're gonna use later
	  public void clear() {
	    g2.setPaint(Color.white);
	    // draw white on entire draw area to clear
	    g2.fillRect(0, 0, getSize().width, getSize().height);
	    g2.setPaint(Color.black);
	    repaint();
	  }
	  
	  public static void setColor(Color color) {
		  g2.setPaint(color);
		  
		  
	  }
	  
	  
	  public static void setSize(int size) {
		  g2.setStroke(new BasicStroke(size));
		  
		  
	  }
	  
	  
	 
	  
}
