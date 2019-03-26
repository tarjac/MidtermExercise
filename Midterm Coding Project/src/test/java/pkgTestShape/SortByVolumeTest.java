package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.SortByVolume;

public class SortByVolumeTest {

	private final SortByVolume sbv = new SortByVolume();

	@Test
	public void compareTest()
	{
		Cuboid cub1 = new Cuboid(4,3,1);
		
		Cuboid cub2 = new  Cuboid(1,1,1);
		
		int comp = sbv.compare(cub1, cub2);
		
		assertTrue(comp == 1);
		
		Cuboid cub3 = new Cuboid(140,141,141);
		
		Cuboid cub4 = new  Cuboid(200,200,200); 
		
	    comp = sbv.compare(cub3, cub4);
	    
	    
		assertTrue(comp == -1);
		
		Cuboid cub5 = new Cuboid(10,10,10);
		
		Cuboid cub6 = new  Cuboid(10,10,10); 
		
	    comp = sbv.compare(cub5, cub6);
	    
	    
		assertTrue(comp == 0);
		
		
		
		
		
		
	}
}





