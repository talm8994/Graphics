package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
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
	
	public ShapePanel()
	{
		
	}
	
	public void addRectangle()
	{
		
	}
	public void addSqure()
	{
		
	}
	public void addEllips()
	{
		 int xPosition = (int)(Math.random() * 1500);
		 int yPosition = (int)(Math.random() * 2000);
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
	
	protected void paintConponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);;
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		for(Polygon currentTriangle : triangleList)
		{
			int red = (int)(Math.random()* 256);
			int green = (int)(Math.random()* 256);
			int blue = (int)(Math.random()* 256);
			
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
			
			mainGraphics.setColor(new Color(red, green, blue));
		}
	}
}
