import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowAdminPage {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // redirect if the user is not an admin
        if (request.getSession().getAttribute("isAdmin").equals(false)) {
            response.sendRedirect("/WEB-INF/profile.jsp");
        }
        request.getRequestDispatcher("/WEB-INF/admin.jsp").forward(request, response);
    }
}
