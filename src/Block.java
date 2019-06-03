import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Block extends JComponent
{
	private static int dy = 0;
	private boolean isMoving = true;
	private Rectangle block;
	
	public Block()
	{
		Rectangle block = new Rectangle(10, 10);
		setBounds(100, 240, 11, 11);
	}
	
	public void setY(int y)
	{
		dy = y;
	}
	
	public void update()
	{
		setLocation(getX(), getY() + dy);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.fill(block);
		
	}
}
