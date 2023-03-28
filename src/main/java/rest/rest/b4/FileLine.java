package rest.rest.b4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.glassfish.admin.amx.util.FileOutput;

public class FileLine {
	public String lines(int num) throws Exception {
		
	FileInputStream fin= new FileInputStream("D:\\Practicefile\\Details.txt");
	int ch =fin.read();
	String s="";
	int count =0;
	while(ch!=-1) {
		if(ch==13) {
			count+=1;
		}
		if(count==num) {
		s+=(char)ch;	
		}
		else {
			
		}
		ch=fin.read();
	}
	return s;
	}
	
	
	public String getdata( String var) throws Exception {
		FileInputStream fin =new FileInputStream("D:\\Practicefile\\Person.txt");
		int ch= fin.read();
		String data="";
		while(ch!=-1) {
			data+= (char) ch;
			ch=fin.read();
		}
		String val="";
		String ar[] = data.split("\n");
		for(String str: ar) {
			if(str.substring(0,str.indexOf("=")).equals(var.toLowerCase())) {
				val=  str.substring(str.indexOf('=') + 1);
			}
		}
			if(val.length() ==0) {
				return "Not a value";
			}
			else {
				return val;
			}
		 	
	}

}
