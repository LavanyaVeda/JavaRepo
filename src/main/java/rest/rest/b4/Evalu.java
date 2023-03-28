package rest.rest.b4;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
@Path("/understring")
public class Evalu {
	@GET
	@Path("/{s}/{i}")
	public String Underscore(@PathParam("s")String s, @PathParam("i") int j) {
		
		String op ="";
		String p ="_";
		//StringBuilder sb = new StringBuilder(s);
		for(int i=0;i<s.length();i++) {
			
			if(i%j==0 && i!=0) {
				// sb.append("_");
				op += p;
			}
			if(s.length()<j) {
				op+= s+p;
			}
			op+= s.charAt(i);
			
			
		}
		
		
		
		
		return op;
		
	}
	

}
