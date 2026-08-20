package murach.email;
import murach.business.User;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String url = "/index.jsp";

        // lấy action từ request
        String action = request.getParameter("action");
        if (action == null) {
            action = "join"; // mặc định
        }

        // xử lý action và set URL
        if (action.equals("join")) {
            url = "/index.jsp";    // trang join
        }
        else if (action.equals("add")) {
            // lấy dữ liệu từ form
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            // tạo đối tượng User và lưu vào DB
            User user = new User(firstName, lastName, email);
           

            // gắn User vào request và set URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";    // trang cảm ơn
        }

        // forward request/response đến URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {
        // gom logic GET vào POST
        doPost(request, response);
    }
}
	