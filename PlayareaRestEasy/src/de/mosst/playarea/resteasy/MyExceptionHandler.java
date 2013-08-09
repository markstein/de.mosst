package de.mosst.playarea.resteasy;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyExceptionHandler implements ExceptionMapper<MyException> {

	@Override
	public Response toResponse(MyException exception) {
		return Response.serverError().entity(exception.getMessage()).build();
	}
}
