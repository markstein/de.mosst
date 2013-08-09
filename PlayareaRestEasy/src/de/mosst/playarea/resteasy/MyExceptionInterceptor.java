package de.mosst.playarea.resteasy;

import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.core.BaseClientResponse;
import org.jboss.resteasy.client.core.ClientErrorInterceptor;

public class MyExceptionInterceptor implements ClientErrorInterceptor {

	@Override
	public void handle(ClientResponse<?> response) throws RuntimeException {
		try {
			BaseClientResponse<?> r = (BaseClientResponse<?>) response;
			InputStream stream = r.getStreamFactory().getInputStream();
			stream.reset();
			String data = response.getEntity(String.class);
			if (Response.Status.INTERNAL_SERVER_ERROR.equals(response.getResponseStatus())) {
				throw new MyException(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
