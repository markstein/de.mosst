package de.mosst.playarea.resteasy;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.Form;

@Path("playarea")
public interface PlayareaRsInterface {
    
    @POST
    @Path("save")
    @Produces(MediaType.APPLICATION_JSON)
    public void save(@Form ComplexeObjectAleph objectAleph, @Form ComplexeObjectBeth objectBeth);

}
