package za.ac.wsu.s221507000;
import java.util.Scanner;
public class CircleApp {
	
	static float radius;
	static float area;
	static float circumference;
	static float diameter;
    static float pi = (float) 3.14; 
    static int x;
    static int y;
	
	
	
	public void setRadius(float radius)
	{
		this.radius = radius;
	}
	
	public void setArea(float area)
	{
		this.area = area;
	}
	
	public void setCircumference(float Circumference)
	{
		this.circumference = Circumference;
	}
	
	public void setDiameter(float diameter)
	{
        this.diameter = diameter;
	}
	
	public void setX(int area)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	
	public float getRadius()
	{
		return this.radius;
	}
	
	public float getArea()
	{
		return this.area;
	}
	public float getCircumference()
	{
		return this.circumference;
	}
	
	public float getDiameter()  
	{
		return this.diameter;
	}
	
	public float getX()
	{
		return this.x;
	}
	
	public float getY()
	{
		return this.y;
	}
	
	public static void main(String[] args) {
		
		
		do {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("enter x");
		x = s.nextInt();
		
		System.out.println("enter y");
		y = s.nextInt();
		
		
		System.out.println("enter radius");
		radius = s.nextFloat();
		
		area = pi*radius*radius;
		System.out.println("area = " +area);
		
		circumference = 2*pi*radius;
		System.out.println("circumference = " +circumference);
		
		diameter = 2*radius;
		System.out.println("diameter = " +diameter);
		
		}while(radius>0);
	}
	
	}

