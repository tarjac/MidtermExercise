package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.SortByArea;

public class SortByAreaTest {
	
	
	
    private final SortByArea sba = new SortByArea();

	@Test
	public void compareTest()
	{
		Cuboid cub1 = new Cuboid(4,3,1);
		
		Cuboid cub2 = new  Cuboid(1,1,1);
		
		int comp = sba.compare(cub1, cub2);
		
		assertTrue(comp == 1);
		
		Cuboid cub3 = new Cuboid(140,141,141);
		
		Cuboid cub4 = new  Cuboid(200,200,200); 
		
	    comp = sba.compare(cub3, cub4);
	    
	    
		assertTrue(comp == -1);
		
		Cuboid cub5 = new Cuboid(10,10,10);
		
		Cuboid cub6 = new  Cuboid(10,10,10); 
		
	    comp = sba.compare(cub5, cub6);
	    
	    
		assertTrue(comp == 0);
		
		
		
		
		
		
	}
}



