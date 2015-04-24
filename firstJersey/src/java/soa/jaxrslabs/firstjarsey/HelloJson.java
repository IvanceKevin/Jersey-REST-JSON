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
@Path("hellojson")
public class HelloJson {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloJson
     */
    public HelloJson() {
    }

    /**
     * Retrieves representation of an instance of soa.jaxrslabs.firstjarsey.HelloJson
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        return "{\n" +
"    \"glossary\": {\n" +
"        \"title\": \"example glossary\",\n" +
"		\"GlossDiv\": {\n" +
"            \"title\": \"S\",\n" +
"			\"GlossList\": {\n" +
"                \"GlossEntry\": {\n" +
"                    \"ID\": \"SGML\",\n" +
"					\"SortAs\": \"SGML\",\n" +
"					\"GlossTerm\": \"Standard Generalized Markup Language\",\n" +
"					\"Acronym\": \"SGML\",\n" +
"					\"Abbrev\": \"ISO 8879:1986\",\n" +
"					\"GlossDef\": {\n" +
"                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n" +
"						\"GlossSeeAlso\": [\"GML\", \"XML\"]\n" +
"                    },\n" +
"					\"GlossSee\": \"markup\"\n" +
"                }\n" +
"            }\n" +
"        }\n" +
"    }\n" +
"}";
    }

    /**
     * PUT method for updating or creating an instance of HelloJson
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
