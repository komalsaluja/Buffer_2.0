import java.awt.MenuItem;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class FoodServlet3 extends HttpServlet {

	class Node{  
		String dish;
        int price;  
        int qty;
        Node next;    
            
        public Node(String dish,int price,int qty) {
        	this.dish=dish;
            this.price = price; 
            this.qty=qty;
            this.next = null;    
        }    
    }    
	public Node head = null;    
    public Node tail = null;    
   
    
    //addNode() will add a new node to the list    
    public void addNode(String dish,int price,int qty) {    
        //Create a new node    
        Node newNode = new Node(dish,price,qty);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
	HttpSession session;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		session=request.getSession();
		
		
		String item=request.getParameter("c");
//		int qty=Integer.parseInt(request.getParameter("q"));
	    String dishName;
	    int price;
	    if(item.equals("1. ADD TO CART"))
	    {
	    	dishName="Chilli Paneer Dry";
	    	price=250;	    	
	    	int qty=Integer.parseInt(request.getParameter("q"));
	    	out.println("<h2>You chose "+ dishName+"</h2>");
	    	out.println("<a href=food1.html>Want to order more?</a>");
	    	//out.println("<a href=./display>Generate Bill</a>");
	    	//session.setAttribute("h", head);
	    	addNode(dishName, price,qty);
	    	Node current = head;    
	        if(head == null) {    
	            out.println("List is empty");    
	            return;    
	        }  
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	        	out.print("<h2>Dish : "+current.dish+"|  \t\t\tQuantity = "+ current.qty+"| \t\t\tPrice = "+(current.price*current.qty)+"</h2>");      
	            current = current.next;    
	        }    
	    }
	    
	    else if(item.equals("2. ADD TO CART"))
	    {
	    	dishName="Chowmein";
	    	price=150;
	    	int qty=Integer.parseInt(request.getParameter("q1"));
	    	out.println("You chose "+ dishName);
	    	out.println("<a href=food1.html>Want to order more?</a>");
	    	//out.println("<a href=./display>Generate Bill</a>");
	    	//session.setAttribute("h", head);
	    	addNode(dishName, price,qty);
	    	Node current = head;    
	        if(head == null) {    
	            out.println("List is empty");    
	            return;    
	        }  
	        while(current != null) {    
	            //Prints each node by incrementing pointer   
	        	 out.print("<h2>Dish : "+current.dish+"|  \t\t\tQuantity = "+ current.qty+"| \t\t\tPrice = "+(current.price*current.qty)+"</h2>");     
	            current = current.next;    
	        }    
	    }
	    else if(item.equals("3. ADD TO CART"))
	    {
	    	dishName="Makhani Pasta";
	    	price=200;
	        int qty=Integer.parseInt(request.getParameter("q2"));
	    	out.println("You chose "+ dishName);
	    	out.println("<a href=food1.html>Want to order more?</a>");
	    	//out.println("<a href=./display>Generate Bill</a>");
	    	//session.setAttribute("h", head);
	    	addNode(dishName, price,qty);
	    	Node current = head;    
	        if(head == null) {    
	            out.println("List is empty");    
	            return;    
	        }  
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	        	out.print("<h2>Dish : "+current.dish+"|  \t\t\tQuantity = "+ current.qty+"| \t\t\tPrice = "+(current.price*current.qty)+"</h2>");        
	            current = current.next;    
	        }    
	    }
	    else if(item.equals("4. ADD TO CART"))
	    {
	    	dishName="Manchow Soup";
	    	price=300;
	    	int qty=Integer.parseInt(request.getParameter("q3"));
	    	out.println("You chose "+ dishName);
	    	out.println("<a href=food1.html>Want to order more?</a>");
	    	//out.println("<a href=./display>Generate Bill</a>");
	    	//session.setAttribute("h", head);
	    	addNode(dishName, price,qty);
	    	Node current = head;    
	        if(head == null) {    
	            out.println("List is empty");    
	            return;    
	        }  
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	        	out.print("<h2>Dish : "+current.dish+"|  \t\t\tQuantity = "+ current.qty+"| \t\t\tPrice = "+(current.price*current.qty)+"</h2>");     
	            current = current.next;    
	        }    
	    }
	    else if(item.equals("5. ADD TO CART"))
	    {
	    	dishName="Paneer Tikka Tawa";
	    	price=350;
	    int qty=Integer.parseInt(request.getParameter("q4"));
	    	addNode(dishName, price,qty);
	    	out.println("You chose "+ dishName);
	    	out.println("<a href=food1.html>Want to order more?</a>");
	    	//out.println("<a href=./display>Generate Bill</a>");
	    	//session.setAttribute("h", head);
	    	Node current = head;    
	        if(head == null) {    
	            out.println("List is empty");    
	            return;    
	        }  
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	        	out.print("<h2>Dish : "+current.dish+"|  \t\t\tQuantity = "+ current.qty+"| \t\t\tPrice = "+(current.price*current.qty)+"</h2>");      
	            current = current.next;    
	        }    
	    }
	    else if(item.equals("6. ADD TO CART"))
	    {
	    	dishName="Schezwan Rice";
	    	price=250;
	    int qty=Integer.parseInt(request.getParameter("q5"));
	    	out.println("You chose "+ dishName);
	    	out.println("<a href=food1.html>Want to order more?</a>");	    	
	    	//out.println("<a href=./display>Generate Bill</a>");
	    	//session.setAttribute("h", head);
	    	addNode(dishName, price,qty);
	    	Node current = head;    
	        if(head == null) {    
	            out.println("List is empty");    
	            return;    
	        }  
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	        	out.print("<h2>Dish : "+current.dish+"|  \t\t\tQuantity = "+ current.qty+"| \t\t\tPrice = "+(current.price*current.qty)+"</h2>");         
	            current = current.next;    
	        }    
	    }
	  }	 
}