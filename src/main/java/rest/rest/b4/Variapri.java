package rest.rest.b4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Team")
public class Variapri {
	@GET
	@Path("/Array")
	public String meth() {
	MethArray ar= new MethArray();
	 ar.CreateArray(10);
	 ar.addarray(9);
	 return ar.readarray();
	
	
	}
	 @GET
	    @Path("/File/{a},{b}")
	   @Produces(MediaType.TEXT_HTML)
		   public String getfile(@PathParam("a") int a, @PathParam("b") int b) throws Exception {
	    	Fileop op =new Fileop();
	    	op.getop(a, b);
			return op.read("file1");
			   
		   }
	 @GET
	    @Path("/FileCopy/{a},{b}")
	   @Produces(MediaType.TEXT_HTML)
		   public String getfile(@PathParam("a") String a, @PathParam("b") String b) throws Exception {
	    	Fileop op =new Fileop();
			return op.copy(a, b);
			   
		   }
	 @GET
	 @Path("/image")
	 public String getim() throws Exception {
		 Fileop co = new Fileop();
		// co.compress();
		 co.decompress();
		return "Decompressed";
		 
	 }
	 @GET
	 @Path("/Line/{num}")
	 public String getline(@PathParam("num") int num) throws Exception {
		 FileLine li = new FileLine();
		 return li.lines(num);
		 
	 }
	
	 @GET
	 @Path("/getvalue/{var}")
	 public String get(@PathParam("var") String var) throws Exception {
		 FileLine va =new FileLine();
		 return va.getdata(var);
	 }
	 
	 @GET
	 @Path("/arr/{a}")
	 public String get(@PathParam("a") int a) throws Exception {
		 FileArray val=new FileArray();
		 val.arrayval();
		 return val.arrayv(a);
	 }
	 @GET
	 @Path("/Copy")
	 public String copy() throws Exception {
		 Fileop val=new Fileop();
		
		 return val.copyPaste()+val.cutpaste();
	 }
	 @GET
	 @Path("cutrename")
	  public String cutByRename() {
		 File f1=new File("d:/Practicefile/Values.txt");
		 File f2=new File("d:Practicefile/hello/"+f1.getName());
		 f1.renameTo(f2);
		 
		return "renamed";
		 
	 }
		 
}
