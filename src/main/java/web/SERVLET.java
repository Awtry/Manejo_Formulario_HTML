package web;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Servlet")
public class SERVLET extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String musica[] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<tittle>Respuesta Servlet</tittle>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Esto esta dentro del Servlet<h1>");
        out.print("</body>");
        out.print("</html>");
        
    }
    
}
