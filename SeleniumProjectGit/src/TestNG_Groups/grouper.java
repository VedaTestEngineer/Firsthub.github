package TestNG_Groups;

import org.testng.annotations.Test;

public class grouper 
{
     @Test (groups = {"sanity"})
     public void test1()
     {
    	 System.out.println ("hello India");
     }
     
     @Test (groups = {"sanity", "smoke"})
     public void test2()
     {
    	 System.out.println ("hello Asia");
     }
     
     @Test (groups = {"smoke"})
     public void test3()
     {
    	 System.out.println ("hello World");
     }
}
