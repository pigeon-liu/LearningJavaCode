package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/set-cookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setHeader("Set-Cookie","today = 2020-08-08");

        //Servlet 提供的方便的类和方法种 cookie
        // 本质上都是在设置响应头 Set-Cookie
        Cookie cookie = new Cookie("today","2020-08-08");
        resp.addCookie(cookie);

        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("种cookie:today = 2020-08-08");
    }
}
