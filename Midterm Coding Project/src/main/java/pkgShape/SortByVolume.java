package pkgShape;

import java.util.Comparator;


public class SortByVolume implements Comparator<Cuboid> 
{  
	
	 
	
    public int compare(Cuboid cub1, Cuboid cub2) { 
    	 if(cub1.volume() > cub2.volume())
         {
         	return 1;
         	
         }
    	 
    	 
         else if(cub1.volume() < cub2.volume())
         { 
         	return -1;
         	
         }
    	 
    	 
         return 0;
  
    
   } 
    
    
} 




