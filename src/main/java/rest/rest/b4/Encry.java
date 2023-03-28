package rest.rest.b4;

import java.util.StringTokenizer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/String")
public class Encry {
@Path("{s}")
@GET
@Produces("text/plain")
	public String encryp(@PathParam("s") String s) {
		String s1 ="abcdefghi";
		String s2 = "jklmnopqr";
		String s3 = "stuvwxyz";
		String op ="";
		for (int i=0; i<s.length();i++) {
			char ch= s.charAt(i);
			if(s1.contains(ch+"")) {
				op+= "1" + (s1.indexOf(ch)+1)+"";
				
			}
            if(s2.contains(ch+"")) {
            	op+= "2" + (s2.indexOf(ch)+1)+"";
				
			}
            if(s3.contains(ch+"")) {
            	op+= "3" + (s3.indexOf(ch)+1)+"";
				
			}
            if(s.contains(" ")) {
            	op+= 0+"";
            }
			
		}	
		
		return op;
		
}
public String decryp(@PathParam("p") String p) {
	String s ="";
	StringTokenizer k = new StringTokenizer(p);
	while(k.hasMoreTokens()) {
		String h= k.nextToken();
	for(int i= 0; i<p.length();i++) {
		if(i%2 ==0) {
	char ch= h.charAt(i);
		
	}
		else {
			char ch= h.charAt(i);
		}
	}
	}
	
	
	
	return p;
	
}

                              	
}
	
	

