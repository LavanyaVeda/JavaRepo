package rest.rest.b4;

import java.util.Arrays;

public class Reverse {
	public String rev() {
		String s="Lavanya";
		char ch[]=s.toCharArray();
		int ar[] = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			ar[i]= (int) ch[i];
	
		}
		//reversing ascii values
		int r =0;
		int rever[]= new int[ar.length];
		for (int j = 0; j < ar.length; j++) {
			int a=ar[j];
			
			while(a!=0) {
				int rem =a%10;
				r =r*10 +rem;
				a=a/10;
			}
			rever[j] =r;			
			
		}
		//converting ascii to string'
		char revch[]=new char[rever.length];
		String op="";
		for(int k=0;k<rever.length;k++) {
			revch[k] = (char) rever[k];
			
		}
		
		op =Arrays.toString(revch);
		return op;
		
	}
	
}
