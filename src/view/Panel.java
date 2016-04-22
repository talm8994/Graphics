package view;

import controller.Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.*;

public class Panel extends JPanel
{
	
	private Controller baseController;
	private ShapePanel shapePanel;
	private JButton addRectangleButton;
	private SpringLayout baseLayout;
	private ArrayList<Rectangle> rectangleList;
	
	public Panel(Controller baseController)
	{
		this.baseController= baseController;
		baseLayout = new SpringLayout();
		addRectangleButton = new JButton(" add shape");
		rectagleList = new Arraylist<Rectangle>();
		shapePanel= new ShapePanel;
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{
		this.set
		this.setLayout(baseLayout);
		this.add(shapePanel);
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		addRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				int xPostion = (int)(Math.random() * getWidth());
				int yPostion = (int)(Math.random() * getHight());
				int width = (int)(Math.random() * 100);
				int hight = (int)(Math.random() * 100);
				
				rectangleList.add(new Rectangle (xPosition, yPosition, width, height));
				
				repaint();
			}
			
		});
	}
	
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		mainGraphics.setStroke(new BasicStroke(2));
		mainGraphics.setColor(Color.RED);
		
		mainGraphics.drawRect(50,70, 200, 20);
		
		for(Rectangle current : rectangleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color (red, green, blue));
			mainGraphics.draw(current);
			
		}
	}
}
