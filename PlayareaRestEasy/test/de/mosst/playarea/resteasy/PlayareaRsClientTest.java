package de.mosst.playarea.resteasy;

import org.junit.Test;

public class PlayareaRsClientTest {

    @Test
    public void testSave() throws Exception {
        PlayareaRsClient client = new PlayareaRsClient();
        
        ComplexeObjectAleph aleph = new ComplexeObjectAleph();
        aleph.aleph = "Привет";
        ComplexeObjectBeth beth = new ComplexeObjectBeth();
        beth.beth = "bonzhur";
        
        //run
        client.save(aleph, beth);
        
    }
}
