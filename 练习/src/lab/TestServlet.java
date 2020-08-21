package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/status")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setStatus(404);
        //resp.setContentType("text/html; charset=utf-8");
        //resp.getWriter().println("啦啦啦啦啦啦");

        //resp.sendError(404);

        //int i = 1/0;        //500

        //resp.setStatus(301);
        //resp.setHeader("Location","https://www.baidu.com");


    }
}
