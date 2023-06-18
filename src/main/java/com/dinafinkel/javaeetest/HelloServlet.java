package com.dinafinkel.javaeetest;

import com.dinafinkel.javaeetest.bean.Cart;
import com.dinafinkel.javaeetest.bean.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
//    private List<Product> products = new ArrayList<>();

    public void init() {
        message = "Hello! ";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();

        String name = request.getParameter("name");
        int amount = Integer.parseInt(request.getParameter("amount"));

        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            List<Product> product = new ArrayList<>(Collections.singletonList(new Product(name, amount)));
//            product.add(new Product(name, amount));
            cart = new Cart("Dina's cart", product);
        }
        else {
            cart.getProducts().add(new Product(name, amount));
        }
        session.setAttribute("cart", cart);


//        Cart cart = (Cart) session.getAttribute("cart");
//        if (cart == null) {
//            cart = new Cart(name, amount);
//            session.setAttribute("cart", cart);
//        }
//        cart.setName(name);
//        cart.setAmount(amount);
//        session.setAttribute("cart", cart);


        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
//        out.println("<h>" +"Count for client: " + count + "</h");
        out.println("</body></html>");

//        response.sendRedirect("https://www.google.com");
//        response.sendRedirect("test_jsp.jsp");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("test_jsp.jsp");
//        dispatcher.forward(request,response);
        getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
    }

    public void destroy() {
    }
}