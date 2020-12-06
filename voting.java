import java.util.*;
class voting
 {
public static void main (String[] args)
  {
     int age = 18 ;  
     boolean voterid = true;
     boolean aadhar  = true;
     char vote = 'Y';
     String day ;
      day = "MON";
     while(vote == 'Y')
     {
     	switch(day)
    	{
         case "MON":
	
    	 if((age >= 18) && (voterid == true) && (aadhar == true))
   	    { 
		  System.out.println("you r eligible to vote");
      	    }
        else
           {
          	 System.out.println("you r not eligible to vote");
      	    }
 //*         break;
         case "TUE":
               System.out.println("you r not eligible to vote");
            
        }
       vote = 'N';
     }
    }
}



