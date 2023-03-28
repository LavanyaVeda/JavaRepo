
package rest.rest.b4;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("text/plain")
    public String getIt() {
        return "Hi there!";
    }
    
    @GET 
    @Path("/lav/{s}")
    //@Produces("text/plain")
    public String task1(@PathParam("s") String a) {
    try {
    	int x =Integer.parseInt(a);
    	return "Int";
    }
    	catch(Exception e) {
    		try {
    			float x =Float.parseFloat(a);
    			return "float";
    		}
    		catch(Exception r) {
    			
    			return "String";
    		}
    		
    	}
    }
    
    @GET
    @Path("/num")
    public String get() {
    	Child ch=new Child();
    	return ch.b+"<br>"+ch.say()+"<br>"+ch.name;
    }
    @GET
    @Path("/File/{a},{b}")
   @Produces(MediaType.TEXT_HTML)
	   public String getfile(@PathParam("a") int a, @PathParam("b") int b) throws Exception {
    	Fileop op =new Fileop();
    	op.getop(a, b);
		return null;
		   
	   }
 
    
}
