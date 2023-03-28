package rest.rest.b4;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/task001")
@Produces("text/plain")

public class Task1 {
@Path("t1/{s1},{s2}")
@GET
public String advance(@PathParam("s1") String s1, @PathParam("s2") String s2) 
{
	String str =s2;
	char ch1[] = s1.toCharArray();
	char ch2[] = s2.toCharArray();
	for(int i=0;i<s1.length();i++) 
	{
		for(int j=0; j<s2.length();j++) 
		{
		
			if(ch1[i]==ch2[j]) 
			{
				str=str.replace(ch2[j], '*');
			}
			
		}
		
		
	}
		return str;
		
	}
@Path("/t2/{s}")
@GET
public String duplicates(@PathParam("s") String s) {
	
	String st ="";
	char ch[]= s.toCharArray();
	for(int i=0;i<s.length();i++) {
		//if(s.contains(ch[i]+"")) {
			if(!(st.contains(ch[i]+"")))
				st+=ch[i];
		//}
		
	}
	return st;
	
}
@GET
@Path("/t3/{j}")
public String sortit(@PathParam("j") String h) {
	char ch[] = h.toCharArray();
			Arrays.sort(ch);
	
	return Arrays.toString(ch);
}
@Path("/t4/{s}")
@GET
public String midchar(@PathParam("s") String s) {
	String s4="";
	String s1[] = s.split(" ");
	
	for(int i=0;i<s1.length; i++)
	{
		int n=(s1[i].length()/2);
		if(s1[i].length()%2==0)
		{
			s4+= s1[i].charAt(n-1);
			s4+= s1[i].charAt(n);
		}
		else 
		{ 
		s4 += s1[i].charAt  (n);
		}
	}
	return s4;
	
}
}
