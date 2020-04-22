//// This Servlet will be used to listen for users trying to view all of the Products - likely by going to a page like "/products" (or "/products/index.jsp" or "/")
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "ShowProductServlet", urlPatterns = "/products/show")
//
//public class ShowProductsServlet extends HttpServlet {
//
//    // This will require a doGet() method
//
//    // this doGet() method assumes that there **IS** a product id in the URL parameters
//        // i.e. http/localhost:8080/products/show?id=27
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
//        // check to see if there is an id passed in URL parameters
//            // i.e. http/localhost:8080/products/show?id=27
//        long productId = Long.parseLong(request.getParameter("id")); // checking for "id" in URL parameters
//
//        // Create the connection to the DaoFactory
//        Products productsDao = DaoFactory.getProductsDao();
//            // This will give us access to all the Products Interface methods
//
//        // Get the product by its ID from ListProductsDao
//        Product product = productsDao.findById(productId); // This will return a product of type Product (e.g. the type stated in Bean)
//
//        // set the attribute "product" to the object we just created (see previous line)
//        request.setAttribute("product", product);
//        request.getRequestDispatcher("/");
//    }
//}
