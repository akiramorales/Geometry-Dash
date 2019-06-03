import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Environment extends JComponent
{
	//Fields
	private Rectangle base, mid, dead;
	private int hight;
	private int width;
	private int dx = 0, dy = 0;
	//Constructors
	public Environment()
	{
		base = new Rectangle();
		mid = new Rectangle();
		dead = new Rectangle();
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.fill(base);
		g2.fill(mid);
		g2.setColor(Color.RED);
		g2.fill(dead);
	}
}
