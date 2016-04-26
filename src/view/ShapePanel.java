package view;

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
		triangleList = new ArrayLIst<>
	}
	
	public void addRectangle()
	{
		
	}
	public void addSqure()
	{
		
	}
	public void addEllips()
	{
		
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
}
