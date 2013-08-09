package de.mosst.playarea.resteasy;

import org.junit.Test;

public class TestRESTEasyExceptionHandling {
	
    @Test
    public void testException() throws Exception {
        PlayareaRsClient client = new PlayareaRsClient();
        
        //run
        String string = client.eineMethodeMitException();
        
        System.out.println(string);
        
    }

}
