import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class MyComponent extends JComponent{
	
	private static int counter = 0;
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		Rectangle r	= new Rectangle(10,10, 100, 50);
		g2D.draw(r);
		
		Rectangle r2	= new Rectangle(100,100, 100, 50);
		g2D.draw(r2);
		
		r2.translate(100, 100);
		g2D.draw(r2);
		
		Ellipse2D.Double oval = new Ellipse2D.Double(300, 100, 50, 50);
		g2D.draw(oval);
		
		Line2D.Double line1 = new Line2D.Double(50,50, 200, 100);
		g2D.draw(line1);
		
		counter++;
		System.out.println("paintComponent called " + counter + " times.");
		
	}
	
}
