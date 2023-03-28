package rest.rest.b4;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Array")
public class MethArray {
	int array[];

	public String CreateArray(int a) {
		if (a > 0) {
			array = new int[a];
		}

		return "Array Is Created";

	}

	public String addarray(int a) {
		// int array[] = new int[20];
		// int count =0;
		for (int i = 0; i < array.length; i++) {

			array[i] = a * (i + 1);

		}
		return "Added";

	}

	public String readarray() {
		// int array[]= {2,4,6,6,87,9,9,45,876,3435};

		return Arrays.toString(array);

	}

	@GET
	@Path("/EMP")
	@Produces(MediaType.TEXT_HTML)
	public String getemp() {
		int empid[] = { 11, 12, 13, 14, 15 };
		String[] empnames = { "Lavanya", "Vandana", "Susmitha", "Ram", "Surya" };
		// double [] salaries = {1100,2010,9019,2394,5619};
		// double[] incre = new double[5];
		// double bonus;
		double exper[] = { 2, 5.7, 4, 6, 2.5 };
		String skill[][] = { { "Java", "Python", "C" }, { "Html", "Css" }, { "Javascript", "python", "Sql", "c++" },
				{ "mySql", "R" }, { "GoLang", "Oracle", "AWS" } };
		double salary[] = new double[5];

		for (int i = 0; i < exper.length; i++) {

			salary[i] = (exper[i] * 10000) + (skill[i].length * 1000);

		}
		Employ emp[] = new Employ[5];
		for (int j = 0; j < emp.length; j++) {
			emp[j] = new Employ(empid[j], empnames[j], salary[j]);
		}
		String res = "";
		for (int i = 0; i < emp.length; i++)
			res += emp[i].toString() + "," + exper[i] + "," + Arrays.toString(skill[i]);
		return res;
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/reve")
	public String getrev() {
		Reverse van = new Reverse();
		String op =van.rev();
		return op;

	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/office/{val}")
	public String getOffice(@PathParam("val") String val) {
		Office of =Office.CAFETERIA;
		
		Office kw= Office.valueOf(val.toUpperCase());
		String msg = null;
		
		switch(kw) {
		
		case TRAINING_ROOM :
			msg ="Trainees undergoes Training";
			break;
		case CONFERENCE_ROOM:
			msg="Meetings Goes on";
		case  CAFETERIA:
			msg ="Having Good Food";
			
		}
		return msg;
		
		
		}
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/opera/{value}/{x},{y}")
	public String oper(@PathParam("value") String value,@PathParam("x") int x,@PathParam("y") int y) {
		Operation op =Operation.valueOf(value.toUpperCase());
		int c=0;
		switch(op) {
		case ADD:
			c= x+y;
			break;
		case MULTIPLE:
			c=x*y;
			break;
		case SUBSTRACT:
			c=x-y;
			break;
		case DIVIDE:
			c=x/y;
			break;
			
		}
		return value+"of "+ x +",  "+ y +"= "+c+" " ;
		
	}
}
