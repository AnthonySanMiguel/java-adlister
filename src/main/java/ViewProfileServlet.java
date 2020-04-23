import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// This Servlet will be used to listen for users trying to view all of the Ads - likely by going to a page like "/ads" (or "/ads/index.jsp" or "/")

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")

public class ViewProfileServlet extends HttpServlet {

    // This will require a doGet() method

    // this doGet() method assumes that there **IS** a ad id in the URL parameters
    // i.e. http/localhost:8080/ads?id=3

    // check to see if there is an id passed in URL parameters
    // i.e. http/localhost:8080/ads?id=3

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long adId = Long.parseLong(req.getParameter("id")); // checking for "id" in URL parameters

        // Create the connection to the DaoFactory
        Ads adsDao = DaoFactory.getAdsDao();
        // This will give us access to all the Ads Interface methods

        // Get the ad by its ID from ListAdsDao
        Ad ad = adsDao.findById(adId); // This will return a ad of type Ad (e.g. the type stated in Bean)

        // set the attribute "ad" to the object we just created (see previous line)
        req.setAttribute("ad", ad);
        req.getRequestDispatcher("/profile.jsp").forward(req, resp);
    }
}
