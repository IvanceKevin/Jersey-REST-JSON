/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soa.jaxrslabs.firstjarsey;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author kevin
 */
@Path("helloensma")
public class HelloEnsma {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloEnsma
     */
    public HelloEnsma() {
    }

    /**
     * Retrieves representation of an instance of soa.jaxrslabs.firstjarsey.HelloEnsma
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        return "<bonjour>Bonjour ENSMA</bonjour>";
    }

    /**
     * PUT method for updating or creating an instance of HelloEnsma
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
    
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }*/
}
