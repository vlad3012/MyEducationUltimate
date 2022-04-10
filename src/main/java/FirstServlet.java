import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
//        try{
//            writer.println("<h1> Hello everybody from my FirstServlet</h1>");
//        } catch(Exception e){
//            System.out.println("Error");
//        }finally {
//            writer.close();
//        }
        writer.println("<html>");
        writer.println("<h1>Let's drink to love,how your eyes are shining now </h1>");
        writer.println("</html>");
    }
}
