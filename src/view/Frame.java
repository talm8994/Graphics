package view;

import controller.Controller;
import javax.swing.JFrame;

import controller.Controller;

public class Frame extends JFrame
{
	private Panel basePanel;
	private Controller baseController;
	
	public Frame(Controller baseController)
	{
		this.baseController = baseController;
		basePanel = new Panel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Chat Bot");
		this.setResizable(false);
		this.setSize(400,400);
		this.setVisible(true);
	}
}
