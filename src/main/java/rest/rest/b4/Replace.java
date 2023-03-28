package rest.rest.b4;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/path")
public class Replace {
	@GET
	@Path("/replace")
	public String replac(@PathParam("s") String s) {
		char ch[]= {'a', 'e' , 'i','o','u'};
		//String con ="aeiou";
		char cp [] = s.toCharArray();
		String sd ="";
		for(int i=0;i<cp.length;i++) {
			for(int j =0;j<ch.length; j++) {
				if(cp[i] == ch[j]) {
					sd+= s.replace(ch[j], ch[j+1]);
				}
				
			}
			
		}
		
		
		return null;	
	}
	@GET
	@Path("/obj")
	public String objpri() {
		 SubInner su = new SubInner();
		 
		return su.b+"";
		
	}
	
	
}
