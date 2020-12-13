import java.util.*;
class PatternOne
{	
public static int pprint;
public static void main(String[] args)
	  {
            PatternOne v1 = new PatternOne();
            for(pprint = 1; pprint<=5; pprint++)
 		{
		v1.pprints();
        	}
            for(pprint = 4; pprint>=1; pprint--)
 		{
		v1.pprints();
        	}
  	  }	

public void pprints()
  {
    for(int j = 0; j<pprint; ++j)
       {
	  System.out.print("*");
       }
          System.out.println("");
   }
}