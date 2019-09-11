import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class MyComponent extends JComponent{
	
	private static int counter = 0;
	
	public void paintComponent(Graphics g) {
		
		drawCar(g, 10, 10);
		drawCar(g, 200, 200);
		drawCar(g, this.getWidth()-80, this.getHeight()-40);
		
		counter++;
		System.out.println("paintComponent called " + counter + " times.");
		
	}
	
	public static void drawCar(Graphics g, int x, int y) {
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.BLUE);
		Rectangle body	= new Rectangle(x+10,y+20, 60, 10);
		g2D.fill(body);
		
		g2D.setColor(Color.BLACK);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(x+20, y+30, 10, 10);
		g2D.fill(rearTire);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(x+50, y+30, 10, 10);
		g2D.fill(frontTire);
		Line2D.Double rearWindow = new Line2D.Double(x+20, y+20, x+30, y+10);
		g2D.draw(rearWindow);
		Line2D.Double frontWindow = new Line2D.Double(x+60, y+20, x+50, y+10);
		g2D.draw(frontWindow);
		Line2D.Double roof = new Line2D.Double(x+30, y+10, x+50, y+10);
		g2D.draw(roof);
	}
	
}
