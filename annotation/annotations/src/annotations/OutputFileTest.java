package annotations;

import java.io.File;

public class OutputFileTest		
	{
    	private File output; 
    	@Before public void createOutputFile() 
 	 { 
       output = new File(...);
    	}
  
	@After public void deleteOutputFile() 
   		{
        output.delete(); 
   	} 
     
    @Test public void testFile1() 
    		{
       
   		} 
	@Test public void testFile2() 
   	 {
       
    		}
}
