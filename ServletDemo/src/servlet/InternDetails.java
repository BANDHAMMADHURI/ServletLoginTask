package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InternDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Map<String, String> map = new LinkedHashMap<String, String>();
	List<String> list = new LinkedList<String>();
	String internName, password;
	
	PrintWriter out;
	
	public void internDetails()

	{
		String madhuri = "<br><br>Company : Full Creative "+"<br><br>Designation: Java Intern" + "<br><br>Experience : 2nd Month" + "<br><br> City : Hyderabad" + "<br><br>Year of Passout : 2016"
				+ "<br><br>Stream : CSE";
		list.add(madhuri);
		map.put("madhuri", list.get(0));
		
		String chandra = "<br><br>Company : Full Creative "+"<br><br>Designation: Java Intern" + "<br><br>Experience : 2nd Month" +  "<br><br> City : Vizag "  + "<br><br>Year of Passout : 2015"
				+  "<br><br>Stream : CSE";
		list.add(chandra);
		map.put("chandra", list.get(1));
		
		String mounika = "<br><br>Company : Full Creative "+"<br><br>Designation: Java Intern" + "<br><br>Experience : 3rd Month" + "<br><br>City : Hyderabad" + "<br><br>Year of Passout : 2016"
				+ "<br><br>Stream : CSE";
		list.add(mounika);
		map.put("mounika", list.get(2));
		
		String akshaya = "<br><br>Company : Full Creative "+"<br><br>Designation: Java Intern" + "<br><br> Experience : 3rd Month" +  " <br><br>City : Chennai" +  "<br><br>Year of Passout : 2015"
				 + "<br><br>Stream : CSE";
		list.add(akshaya);
		map.put("akshaya", list.get(3));
		
		String laxmi="<br><br>Company : Full Creative "+" <br><br>Designation: Design Intern"
				+ "<br><br>Experience :  2nd Month"+"<br><br> City : Tiruvanantapuram"+"<br><br>Year of Passout : 2016"+ "<br><br>Stream : Designing";
		list.add(laxmi);
		map.put("laxmi",list.get(4));
		
		String nishanthi="<br><br>Company : Full Creative "+"<br><br>Designation: Java Intern"
				+ "<br><br>Experience : 2nd Month"+" <br><br>City : Vizag "+"<br><br>Year of Passout : 2015"+ "<br><br>Stream : CSE";
		list.add(nishanthi);
		map.put("nishanthi",list.get(5));
		
		String akila="<br><br>Company : Full Creative "+"<br><br>Designation: SetMore Team"
				+ "<br><br> Experience : 2nd Month"+"<br><br> City : Chennai"+"<br><br>Year of Passout : 2014"+ "<br><br>Stream : EEE";
		list.add(akila);
		map.put("akila",list.get(6));
		
		String indu="<br><br>"
				+ "Company : Full Creative "+"<br><br>Designation: Java Intern"
				+ "<br><br>Experience : 2nd Month"+" <br><br>City : Chennai "+"<br><br>Year of Passout : 2015"+"<br><br>Stream : CSE";
		list.add(indu);
		map.put("indu",list.get(7));
	
	}
	/*public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		internName = request.getParameter("username");
		password = request.getParameter("password");
		
		
	}
	*/

	

	
}
