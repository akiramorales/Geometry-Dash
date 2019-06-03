import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class GameMain extends JFrame implements ActionListener
{
	private Environment env;
	private Block block;
	private ArrayList<Environment> obst;
	private static Boolean isMoving = true;
	private int dx = 0, dy = 0;
	
	public GameMain()
	{
		env = new Environment();
		add(env);
		block = new Block();
		add(block);
		obst = new ArrayList<Environment>();
		setBounds(100, 100, 600, 300);
		setLayout(null);
		setResizable(false);
		
		Timer ti = new Timer(100, this);
		ti.start();
		setFocusable(true);
		this.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_SPACE)
				{
					dy += 10;
					isMoving = true;
				}
			}

			@Override
			public void keyReleased(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_SPACE)
				{
					isMoving = false;
				}
				while(isMoving == false)
				{
					dy -= 19;
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0)
			{
			
			}

		});
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static boolean getMoveState()
	{
		boolean state = isMoving;
		return state;
	}
	
	public static void main(String args[])
	{
		new GameMain();
	}

	public void actionPerformed(ActionEvent e)
	{
//		if(env.getX() < 600)
//		{
//			obst.add(new Environment());
//			this.add(new Environment());
//		}
//		
//		if(env.getX() < 0)
//		{
//			obst.remove(new Environment());
//			this.remove(new Environment());
//		}
//		block.update();
//		env.move();
//		repaint();
	}
}

