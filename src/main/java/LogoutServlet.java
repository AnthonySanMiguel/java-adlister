import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.removeAttribute("user");
//        session.invalidate(); // Will delete ALL session data upon termination/logout (e.g. lose all items in shopping cart, session creation, last login, etc.) *This info may be useful later, so not a good idea to wipe every time user logs out.
        resp.sendRedirect("/login");
    }
}
