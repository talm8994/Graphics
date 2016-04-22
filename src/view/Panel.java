package view;

import controller.Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 158, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addRectangleButton, -37, SpringLayout.SOUTH, this);
		rectangleList = new ArrayList<Rectangle>();
		shapePanel= new ShapePanel();
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 28, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 36, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, -224, SpringLayout.NORTH, addRectangleButton);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -404, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(shapePanel);
		this.add(addRectangleButton);
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
				int xPosition = (int)(Math.random() * getWidth());
				int yPosition = (int)(Math.random() * getHeight());
				int width = (int)(Math.random() * 100);
				int height = (int)(Math.random() * 100);
				
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
