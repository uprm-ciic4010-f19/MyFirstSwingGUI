import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame mainFrame = new JFrame("My First Swing GUI");
		
		mainFrame.setSize(600, 400);
		
		MyComponent myComponent = new MyComponent();
		mainFrame.add(myComponent);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);

	}

}
