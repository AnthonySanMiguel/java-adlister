import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name"); // Check URL query string for "name= (-INPUT-)"
        out.print("<h1>Hello" + ", " + name.substring(0, 1).toUpperCase() + name.substring(1) + "!" + "</h1>"); // Take input from "name = (-INPUT-)", capitalize, and return with greeting.

        out.println("<form>");
        out.println("<h3>Welcome to my website!</h3><hr>");
        out.println("You are visitor number: " + (++iHitCounter));
        out.println("</fieldset></form>");
    }

    // Instance variable used for counting hits on this servlet
    private int iHitCounter;

    // init method just initializes the hitCounter to zero
    public void init() throws ServletException {
        iHitCounter = 0;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
