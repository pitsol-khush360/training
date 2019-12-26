package services;

/**
 * @author Khushal Rankawat
 *
 */
public class Area 
{
	private double area;
	
	/**
	 * @param width refers width(base) of triangle
	 * @param height refers height of triangle
	 * @return returns area of triangle.
	 */
	public double getTriangleArea(double width,double height)
	{
		area=0.5*width*height;
		return area;
	}
	
	/**
	 * @param width shows width of rectangele
	 * @param height shows height of rectangele
	 * @return returns area of rectangle
	 */
	public double getRectangleArea(double width,double height)
	{
		area=width*height;
		return area;
	}
	
	/**
	 * @param width shows side of square.
	 * @return returns area of square
	 */
	public double getSquareArea(double width)
	{
		area=width*width;
		return area;
	}
	
	/**
	 * @param radius shows radius of circle
	 * @return returns area of circle.
	 */
	public double getCircleArea(double radius)
	{
		area=3.14*radius*radius;
		return area;
	}
}
