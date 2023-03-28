package rest.rest.b4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class Fileop {

	public String getop(int a , int b) throws Exception {
		FileOutputStream ou = new  FileOutputStream("D:\\Practicefile\\file1.txt");
		int c= a+b;
		String op ="Addition of "+a+ "+"+b+ "="+c;
		ou.write(op.getBytes());
		
		return "Added";
		
	}
	public String read(String filename) throws Exception {
		
		FileInputStream in= new FileInputStream("D:\\Practicefile\\"+filename+".txt");
		int ch=in.read();
		String ad ="";
		while(ch!=-1){
		ad +=(char)ch;
		ch=in.read();	
		}
		
		return ad;
		
	}
	public String copy(String file1, String file2) throws Exception {
		
		
		FileInputStream in =new FileInputStream("D:\\Practicefile\\"+file1+".txt");
		int ch =in.read();
		String data ="";
		while(ch!=-1) {
			data +=(char)ch;
			ch= in.read();
		}
		FileOutputStream op= new FileOutputStream("D:\\"+file2+".txt");
		op.write(data.getBytes());
		
		return file2;
		
	}
	public String compress() throws Exception {
		FileInputStream in = new  FileInputStream("C:\\Users\\user\\Desktop\\lav.jpg");
		DeflaterInputStream dis = new DeflaterInputStream(in);
		FileOutputStream ou = new FileOutputStream("d://compress.txt");
		int ch=dis.read();
			while(ch!=-1) {
				ou.write(ch);
				ch=dis.read();
		}
		return "compressed";
		
	}
	public String decompress() throws Exception {
		FileInputStream in = new  FileInputStream("d://compress.txt");
		InflaterInputStream is = new InflaterInputStream(in);
		FileOutputStream ou = new FileOutputStream("d://decompress.jpg");
		
		int ch=is.read();
		while(ch!=-1) {
			ou.write(ch);
			ch=is.read();
	}

		return "decompressed";
		
	}
	public String copyPaste() throws Exception {
		
		File f1=new File("d:/Practicefile/file1.txt");
		File f2=new File("d:/Practicefile/hello/"+f1.getName());
		FileInputStream fin=new FileInputStream(f1);
		FileOutputStream fout=new FileOutputStream(f2);
		int ch=fin.read();
		while(ch!=-1) {
			fout.write(ch);
			ch=fin.read();}
		
		return "Copy";	
}
	public String cutpaste() throws Exception {
		File f1=new File("d:/Practicefile/Person.txt");
		File f2=new File("d:/Practicefile/hello/"+f1.getName());
		FileInputStream fin=new FileInputStream(f1);
		FileOutputStream fout=new FileOutputStream(f2);
		int ch=fin.read();
		while(ch!=-1) {
			fout.write(ch);
			ch=fin.read();
		}
		fin.close();
		f1.delete();
		return " cut paste";
		
	}
	}
