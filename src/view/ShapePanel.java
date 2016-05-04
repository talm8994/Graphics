package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.*;

import javax.swing.JPanel;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Rectangle> squreList; 
	
	public ShapePanel()
	{
		rectangleList = new ArrayList<Rectangle>();
		triangleList = new ArrayList<Polygon>();
		polygonList = new ArrayList<Polygon>();
		ellipseList = new ArrayList<Ellipse2D>();
		circleList = new ArrayList<Ellipse2D>();
		squreList = new ArrayList<Rectangle>();
	}
	
	public void addRectangle()
	{
		int xPosition = (int)(Math.random() * this.getWidth());
		 int yPosition = (int)(Math.random() * this.getHeight());
		 int width = (int)(Math.random() * (this.getWidth() / 2));
		 int height = (int)(Math.random() * (this.getWidth() / 2));	
		 
		 rectangleList.add(new Rectangle(xPosition, yPosition, width, height));
	}
	
	public void addSqure()
	{
		int xPosition = (int)(Math.random() * this.getWidth());
		 int yPosition = (int)(Math.random() * this.getHeight());
		 int width = (int)(Math.random() * (this.getWidth() / 2));
		 
		 rectangleList.add(new Rectangle(xPosition, yPosition, width, width));
	}
	
	public void addEllipse()
	{
		int xPosition = (int)(Math.random() * this.getWidth());
		 int yPosition = (int)(Math.random() * this.getHeight());
		 int width = (int)(Math.random() * (this.getWidth() / 2));
		 int height = (int)(Math.random() * (this.getWidth() / 2));	
		 
		 ellipseList.add(new Ellipse2D.Double(xPosition, yPosition, width, height));
	}
	
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 9) +3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for (int side = 0; side < numberOfSides; side++)
		{
			xPoints[side] = (int)(Math.random() * 2000);
			yPoints[side] = (int)(Math.random() * 2000);
		}
		
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
	}
	
	public void addTriangle()
	{
		int [] xPoints = new int[3];
		xPoints[0] = (int)(Math.random() * 150);
		xPoints[1] = (int)(Math.random() * 250);
		xPoints[2] = (int)(Math.random() * 350);
		
		int [] yPoints = {(int)(Math.random() * 150), (int)(Math.random() * 250), (int)(Math.random() * 350)};
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		triangleList.add(triangle);
	}
	
	private void drawShapes(Graphics2D mainGraphics, ArrayList shapes)
	{
		for(Object current : shapes)
		{
			int red = (int)(Math.random()* 256);
			int green = (int)(Math.random()* 256);
			int blue = (int)(Math.random()* 256);
			int alfa = (int)(Math.random() * 42);
			
			int penSize = (int)(Math.random()* 10) + 3;
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(penSize));
			if(current instanceof Polygon)
			{
				mainGraphics.draw((Shape)current);
			}
			else
			{
				mainGraphics.fill((Shape)current);
			}
			
		}
	}
	// this is a thing for the stuff lol
	protected void paintConponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);;
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		for(Polygon currentTriangle : triangleList)
		{
			int red = (int)(Math.random()* 256);
			int green = (int)(Math.random()* 256);
			int blue = (int)(Math.random()* 256);
			int alfa = (int)(Math.random() * 42);
			
			int penSize = (int)(Math.random()* 10) + 3;
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(penSize));
			
			mainGraphics.draw(currentTriangle);
		}
		
		for(Polygon current : polygonList)
		{
			int red = (int)(Math.random()* 256);
			int green = (int)(Math.random()* 256);
			int blue = (int)(Math.random()* 256);
			int alfa = (int)(Math.random() * 42);
			
			
			mainGraphics.setColor(new Color(red, green, blue));
		}
	}
}
