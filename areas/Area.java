package areas;

public class Area 
{
	private double area;
	
	public double getTriangleArea(double width,double height)
	{
		area=0.5*width*height;
		return area;
	}
	
	public double getRectangleArea(double width,double height)
	{
		area=width*height;
		return area;
	}
	
	public double getSquareArea(double width)
	{
		area=width*width;
		return area;
	}
	
	public double getCircleArea(double radius)
	{
		area=3.14*radius*radius;
		return area;
	}
}
