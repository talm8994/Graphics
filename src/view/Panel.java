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
	private JButton addPolygonButton;
	private SpringLayout baseLayout;
	private JButton addSqureButton;
	private JButton addEllipseButton;
	private JButton addTriangleButton;
	private JButton addCircleButton;
	
	public Panel(Controller baseController)
	{
		this.baseController= baseController;
		addRectangleButton = new JButton("rectangle");
		addPolygonButton = new JButton("polygon");
		addSqureButton = new JButton("Squre");
		addEllipseButton = new JButton("Ellipse");
		addTriangleButton = new JButton("Triangle");
		addCircleButton = new JButton("circle");
		
		
		shapePanel= new ShapePanel();
		baseLayout = new SpringLayout();
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.gray);
		this.add(shapePanel);
		this.add(addRectangleButton);
		this.add(addPolygonButton);
		this.add(addSqureButton);
		this.add(addEllipseButton);
		this.add(addTriangleButton);
		this.add(addCircleButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, -10, SpringLayout.NORTH, addRectangleButton);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -36, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 28, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 36, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 158, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addRectangleButton, -37, SpringLayout.SOUTH, this);
		
	}
	private void setupListeners()
	{
		addCircleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addEllipse();
				repaint();
			}
			
		});
		
		addTriangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();
			}
			
		});
		
		addEllipseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addEllipse();
				repaint();
			}
			
		});
		
		addSqureButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();
			}
			
		});
		
		addPolygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addPolygon();
				repaint();
			}
			
		});
		
		addRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();
			}
			
		});
	}
	
//	protected void paintComponent(Graphics currentGraphics)
//	{
//		super.paintComponent(currentGraphics);
//		
//		
//		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
//		mainGraphics.setStroke(new BasicStroke(2));
//		mainGraphics.setColor(Color.RED);
//		
//		mainGraphics.drawRect(50,70, 200, 20);
//		
//		for(Rectangle current : rectangleList)
//		{
//			int red = (int)(Math.random() * 256);
//			int green = (int)(Math.random() * 256);
//			int blue = (int)(Math.random() * 256);
//			
//			mainGraphics.setColor(new Color (red, green, blue));
//			mainGraphics.draw(current);
//			
//		}
//	}
}
