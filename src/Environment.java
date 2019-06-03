import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Environment extends JComponent
{
	private static final int WIDTH = 50;
	private static final int HEIGHT = 50;
	private static int heightL = 0, heightU = 0;
	private static int dx = 0;
	private boolean isMoving = true;
	private Rectangle base, projU, projL;
	
	public Environment()
	{
		Rectangle base = new Rectangle(WIDTH, HEIGHT);
		Rectangle projL = new Rectangle(WIDTH, HEIGHT + heightL);
		Rectangle projU = new Rectangle(WIDTH, 300 - heightU);
		setBounds(0, 0, 600, 300);
	}
	
	public int setProjHeightL()
	{
		heightL = (int) (Math.random() * 100);
		return heightL;
	}
	
	public int setProjHeightU()
	{
		heightU = (int) (Math.random() * 100);
		if(heightU + heightL <= 285)
		{
			return heightU;
		}
		else heightU = 0;
		return heightU;
	}
	
	public void move()
	{
		while(isMoving == true) dx++;
		setLocation(getX() - dx, getY());
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.fill(base);
		g2.fill(projU);
		g2.fill(projL);
	}
}
