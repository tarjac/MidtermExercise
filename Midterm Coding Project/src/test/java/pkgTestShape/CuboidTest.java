package pkgTestShape;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import pkgShape.Cuboid;

public class CuboidTest {
	
	@Test
	public void CuboidTest()
	{
		try 
		{
			Cuboid cub1 = new Cuboid(19,8,3);
			
			
		} catch (Exception e) 
		{
			fail("The Test failed to build a Cuboid");
			
			
		}

	}
	
	@Test
	public void setiDepthTest()
	{
		Cuboid cub1 = new Cuboid(19,8,3);
		
		cub1.setiDepth(15);
		
		int depth = cub1.getiDepth();
		
		assertEquals(depth, 15);
		
		boolean check = false;

		  try {
		    cub1.setiDepth(-1);
		    
		  } catch (IllegalArgumentException  e) {
			  
		    check = true;
		    
		  }

		  assertTrue(check);
		
		
	}
	
	@Test
	public void getiDepthTest()
	{
		Cuboid cub1 = new Cuboid(19,8,3);
		int depth = cub1.getiDepth();
		
		assertEquals(depth, 3);
	}
	
	
	
	
	
    @Test
	public void areaTest()
	{
		
		Cuboid cub1 = new Cuboid(1,1,1);
		
		double theArea = cub1.area();
		
		assertTrue(theArea == 8);
		
	}
    
    
	@Test
    public void perimeterTest()
    {
		Cuboid cub1 = new Cuboid(6,2,4);

		
    	
    	boolean check = false;

		  try {
		    cub1.perimeter();
		    
		  } catch (UnsupportedOperationException  e) {
			  
			  
		    check = true;
		  }
		  assertTrue(check);
    }
	
	@Test
	public void volumeTest()
	{
		Cuboid cub1 = new Cuboid(19,8,3);
		double volume = cub1.volume();
		assertTrue(volume == 456);
		
	}
	
	

}



