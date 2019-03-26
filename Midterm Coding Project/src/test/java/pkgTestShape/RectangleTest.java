package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	
	@Test
	public void RectangleTest()
	{
		try 
		{
			Rectangle rec1 = new Rectangle(1,12);
			
			
		} catch (Exception e) 
		{
			
			fail("The Test failed to build a Rectangle");
		}

	}
	
	@Test
	public void RectangleTest2()
	{
		try 
		{
			Rectangle rec1 = new Rectangle(-1,-2);
			
			
			
		} catch (Exception e) 
		{
			fail("The Test failed to build Rectangle");
			
		}

	}
	
	@Test
	public void areaTest()
	{
		Rectangle rec1 = new Rectangle(3,1);
		double area = rec1.area();
		
		assertTrue(area==3);
	}
	
	
	
	
	@Test
	public void getiWidthTest()
	{
		Rectangle rec2 = new Rectangle(3, 7);
		int width = rec2.getiWidth();
		
		
		
		assertEquals(width, 7);

	}
	
	@Test
	public void perimeterTest()
	{
		Rectangle r3 = new Rectangle(6, 11);
		
		double perimeter= r3.perimeter();
		
		assertTrue(perimeter== 34);
	}
	
	
	@Test
	public void getiLengthTest()
	{
		Rectangle rec= new Rectangle(4, 3);
		int length = rec.getiLength();
		
		
		assertEquals(length, 4);
	}
	
	@Test
	public void comparetoTest()
	{
		Rectangle rec1 = new Rectangle(30, 4);
		Rectangle rec2 = new Rectangle(30, 4);
		Rectangle rec3 = new Rectangle(97, 12);
		
		int compare = rec3.compareTo(rec1);
		
		assertTrue(compare == 1);
		
		
		compare = rec2.compareTo(rec1);
		
		assertTrue(compare == 0);
		
		
		compare = rec1.compareTo(rec3);
		
		assertTrue(compare == -1);
		
		
	}
	
	
	
	@Test
	public void setiWidthTest()
	{
		
		Rectangle rec1 = new Rectangle(7, 1);
		
		rec1.setiWidth(3);
		
		int wid = rec1.getiWidth();
		
		assertTrue(wid == 3);
		
		
		  boolean check = false;
		  

		  try {
			  
		    rec1.setiWidth(-8);
		  } catch (IllegalArgumentException  e) 
		  {
		    check =true;
		    
		    
		  }

		  
		  
		  assertTrue(check);
		
		
	}
	
	@Test
	public void setiLengthTest()
	{
		Rectangle rec1 = new Rectangle(5, 3);
		
		rec1.setiLength(40);
		
		int length = rec1.getiLength();
		
		assertTrue(length== 40);
		
		
		  boolean check = false;
		  
		  

		  try {
		    rec1.setiLength(-19);
		  } catch (IllegalArgumentException  e) 
		  {
		    check =true;
		  }

		  
		  
		  assertTrue(check);
		
	}
	
	


}



