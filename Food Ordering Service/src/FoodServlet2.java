import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FoodServlet2 extends HttpServlet{
 
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	//HttpSession session1;
	
	@Override
	public void init() throws ServletException {
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db0","root","root");
			ps=con.prepareStatement("insert into register values(?,?,?)");
			
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();	
		String username,address,phonenumber;
		username=request.getParameter("uname");
		phonenumber=request.getParameter("phno");
		address=request.getParameter("addr");
//		session1=request.getSession();
//		session1.setAttribute("1", username);
//		session1.setAttribute("2", phonenumber);
//		session1.setAttribute("3", address);
		try {
			ps.setString(1,username);
			ps.setString(2, phonenumber);
			ps.setString(3, address);
			ps.executeUpdate();
			System.out.println("Data Inserted Successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<html>");
    	out.println("<body bgcolor=seashell>");
    	out.println("<h2>Account Created Successfully!!!</h1>");
    	out.println("<h2>Hello ,"+ username +" Welcome to Hungry Birds!!!</h2>");
    	out.println("<h3><a href=food1.html>Want to Order food?</a>");
    	out.println("</body></html>");
    	out.close();
    	
		} 
	@Override
	public void destroy() {
		try {
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	}
