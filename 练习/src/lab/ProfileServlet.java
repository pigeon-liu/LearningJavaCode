package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/profile" )
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        // 通过请求 Cookie 中的 session-id，去 Session 中读取 User 对象
        // 如果读到了 User 对象，就嗲表用户已经登录了
        // 否则，代表用户没有登录过

        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null){
            writer.println("<p>您没有登录，所以没有个人中心</p>");
        } else {
            writer.println("<p>欢迎您" + user.username +"</p>");
        }
    }
}
