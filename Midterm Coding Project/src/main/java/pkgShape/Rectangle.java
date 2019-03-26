package pkgShape;

public class Rectangle extends Shape implements Comparable<Rectangle>
{
	
	private int iLength;
	
	private int iWidth;
	
	
	
	public Rectangle(int length, int width)
	{
		iWidth = width;
		iLength = length;
	}

	public double area() 
	{
		return iWidth*iLength;
	}
	
	public double perimeter() 
	{
		return (iWidth * 2) + (iLength * 2);	
	}

	public int getiWidth() 
	{
		
		return iWidth;
	}

	public void setiWidth(int iWidth) 
	{
		if(iWidth<=0)
		{
			throw new IllegalArgumentException("The width of the rectangle has to be more than 0");
		}
		
		this.iWidth = iWidth;
	}

	public int getiLength() 
	{
		return iLength;
	}

	public void setiLength(int iLength) 
	{
		if(iLength <= 0)
		{
			throw new IllegalArgumentException("The width of the rectangle has to be more than 0");
		}
		
		
		this.iLength = iLength;
	}

	@Override
	public int compareTo(Rectangle rec) 
	{
		if(this.area() > rec.area())
		{
			return 1;
			
		}
		
		else if (this.area() < rec.area())
		{
			
			return -1;
		}
		
		return 0;
	}

	
	
	
	
	
}



