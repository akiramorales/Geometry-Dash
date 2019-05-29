import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Block extends JComponent
{
	//Fields
	private Rectangle blk;
	private int changeY;
	private int dy = 0;
	//Constructor
	public Block(int x, int y)
	{
		blk = new Rectangle(10, 10);
		setBounds(x, y, 11, 11);
	}
	//Methods
	public void setY(int y)
	{
		dy = y;
	}
	
	public void update()
	{
		setLocation(getX(), getY() + dy);
	}
	
	public void jump()
	{
		int time = 0;
		int y0 = this.getY();
		dy++;
		update();
		while(this.getY()!=y0)
		{
			dy = -(time-10)^2+101;
			time++;
			update();
		}
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.fill(blk);
	}
}
