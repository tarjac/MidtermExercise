package pkgShape;

public class Cuboid extends Rectangle 
{
	
	
	private int iDepth;

	public Cuboid(int length, int width, int depth) 
	{
		super(length, width);
		
		iDepth = depth;
	}

	
	
	public int getiDepth() 
	{
		
		return iDepth;
	}
	
	

	public void setiDepth(int iDepth)
	
	{
		if(iDepth<=0)
		{
			
			throw new IllegalArgumentException("The depth of the rectangle has to be more than 0");
		}
		
		this.iDepth = iDepth;
	}
	
	
	@Override
	public double perimeter()
	{
		throw new UnsupportedOperationException();
		
	}
	
	public double volume()
	{
		return (double)super.getiLength()*super.getiWidth()*this.getiDepth();
		
	}
	
	@Override
	public double area()
	{
		
		
		return 2 * (super.getiLength() * super.getiWidth()) +
               2 * (super.getiLength() * this.getiDepth()) +
		       2 * (super.getiWidth() + this.getiDepth());
	}
	
	
	
		
	

}



