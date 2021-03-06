package de.mosst.playarea.resteasy;

import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

public class PlayareaRsClient {
    
    private static final String SERVER_URL = "http://localhost:9180/PlayareaRestEasy/rx";
    
    private PlayareaRsInterface client;

    public PlayareaRsClient() {
        ResteasyProviderFactory resteasyProviderFactory = ResteasyProviderFactory.getInstance();
        resteasyProviderFactory.addClientErrorInterceptor(new MyExceptionInterceptor());
		RegisterBuiltin.register(resteasyProviderFactory);
        client = ProxyFactory.create(PlayareaRsInterface.class, SERVER_URL);
    }
    
    public void save(ComplexeObjectAleph aleph, ComplexeObjectBeth beth) {
        client.save(aleph, beth);
    }
    
    public String eineMethodeMitException() {
    	String string = "nuuuuuuuuuuuuuuuul";
		try {
	        string = client.eineMethodeMitException();
        } catch (MyException e) {
	        e.printStackTrace();
        }
    	return string;
    	
    }

}
