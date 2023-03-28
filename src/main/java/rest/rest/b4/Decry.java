package rest.rest.b4;

import java.util.StringTokenizer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/rrr")


public class Decry {
	
	//public static void main(String[] args) {
	@GET
	@Path("/{s}")
		public String decr(@PathParam("s") String s) {
		//String s="19'2401218151524,035262919251701925019111131.";
		String s1="abcdefghi",s2="jklmnopqr",s3="stuvwxyz";
		String sym="!@#$&*()_-+={}[]:;',.?/<>0";
		String ssz="";
		for(char c:s.toCharArray()){
			if(sym.contains(c+""))
				ssz+=c;
			}
		StringTokenizer st=new StringTokenizer(s,sym);
		int n=st.countTokens();
		String ar[]=new String[n];
		for(int i=0;st.hasMoreTokens();i++)
			ar[i]=st.nextToken();
		String op="";
		int j=0;
		for(String tok:ar){
			for(int i=0;i<tok.length();i++){
				if(i%2==0){
					String pos=tok.charAt(i+1)+"";
					int ind=new Integer(pos).intValue()-1;
					if(tok.charAt(i)=='1')
						op+=s1.charAt(ind);
					else if(tok.charAt(i)=='2')
						op+=s2.charAt(ind);
					else if(tok.charAt(i)=='3')
						op+=s3.charAt(ind);
}}
			char ch=ssz.charAt(j);
			if(ch=='0')
				op+=" ";
			else
				op+=ch;
			j++;
		}
			
	//System.out.print(op);
	//}
	return op;
		}
	
	
	@GET
	@Path("/lambda/{n1}")
	//@Produces("MediaType.")
	public String lambda(@PathParam("n1") int n1) {
		testing oh=new testing();
		oh.pro();
		testing.Pro1();
		Single fact = (a)->{
			int b = 1 ;
			for(int i =1 ; i<=a; i++) {
				 b *= i;
				 }
			
			return b;
			};
		Single even =(a)->{
			if(a%2==0) 
				
			return a;
			return a;
		};
		//Single odd =
		int fa =fact.opera(n1);
		return fa+"";
		
	}


	
}
	
