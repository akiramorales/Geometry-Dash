import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import javax.swing.JFrame;

public class GameMain extends JFrame implements ActionListener
{
	private Block block;
	public GameMain()
	{
		this.setBounds(300, 300, 600, 600);
		this.setLayout(null);
		block = new Block(100, 100);
		this.add(block);
		
		Timer t1 = new Timer(100, this);
		t1.start();
		this.setFocusable(true);
		
		this.addKeyListener(new KeyListener()
		{

			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_SPACE)
				{
					block.jump();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE)
				{
					block.setY(0);
					
				}
				
			}

			@Override
			public void keyTyped(KeyEvent arg0)
			{
			}
		});
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	public void actionPerformed(ActionEvent arg0)
	{
		block.update();
		repaint();
	}
public static void main(String args[])
	{
		new GameMain();
	}
}
