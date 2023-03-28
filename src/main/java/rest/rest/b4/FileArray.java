package rest.rest.b4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileArray {
	public String arrayval() throws Exception {
		FileOutputStream ou = new FileOutputStream("D:\\Practicefile\\Values.txt");
		int arr[]= {2,4,5,6,8,9,0,2};
	   String op= Arrays.toString(arr);
	   ou.write(op.getBytes());
	  
		return null;	
	}
	public String arrayv(int a) throws Exception {
		 FileInputStream in = new FileInputStream("D:\\Practicefile\\Values.txt");
		   int ch =in.read();
		   String data ="";
		   String q="";
		   while(ch!=-1) {
			data+=(char)ch;
			ch= in.read();
		  }
		   String out[] =data.split(",");
		   for(int i=0;i<out.length;i++) {
			   if(a==i) {
				  q=out[i]; 
			   }
		   }
		return q;
		   
	}
	public String getvalue() {
		File f =new File("d:/new/");
		
		return null;
		
	}

}
