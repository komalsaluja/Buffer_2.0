import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FoodServlet1 extends HttpServlet{

//HttpSession session;
String order;
int qty;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	//session=request.getSession();
	order=request.getParameter("c");
//	if(order.equals("1. ADD TO CART") || order.equals("2. ADD TO CART") || order.equals("3. ADD TO CART") || order.equals("4. ADD TO CART") || order.equals("5. ADD TO CART") || order.equals("6. ADD TO CART"))
//	{
//		out.println("<h1 fon> We know you are Hungry, but please take a minute to register Yourself so that we could deliver your food at lightening speed to your doorstep</h1>");
//		out.println("<h1><a href=register.html>Click here to Register...</a>");
//	}
	
	if(order.equals("REGISTER"))
	{
		out.println("<h1 fon> We know you are Hungry, but please take a minute to register Yourself so that we could deliver your food at lightening speed to your doorstep</h1>");
		out.println("<h1><a href=register.html>Click here to Register...</a>");
	}
	out.close();
	
}
}
