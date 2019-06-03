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
	private Rectangle base, projU, projL;
	
	public Environment()
	{
		base = new Rectangle(600, HEIGHT);
		base.setLocation(0, 250);
		projL = new Rectangle(WIDTH, HEIGHT + setProjHeightL());
		setLocation(0, 300);
		projU = new Rectangle(WIDTH, 300 - setProjHeightU());
		setLocation(0, 0);
		setBounds(0, 0, 600, 300);
	}
	
	public int setProjHeightL()
	{
		heightL = (int) (Math.random() * 1000 - 301);
		return heightL;
	}
	
	public int setProjHeightU()
	{
		heightU = (int) (Math.random() * 1000 - 301);
		if(heightU + heightL <= 285)
		{
			return heightU;
		}
		else heightU = 0;
		return heightU;
	}
	
	public void move()
	{
		while(GameMain.getMoveState() == true) dx++;
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
