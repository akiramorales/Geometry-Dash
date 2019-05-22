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
		while(getX()>)
		{
			time++;
		}
	}
}
