package pkgShape;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid> 
{ 
	
	
	
	
	
    public int compare(Cuboid cub1, Cuboid cub2) 
    {         
        if(cub1.area() > cub2.area())
        {
        	
        	return 1;
        }
        
        else if(cub1.area() < cub2.area())
        { 
        	return -1;
        	
        }
        
        
        return 0;
    } 
} 





