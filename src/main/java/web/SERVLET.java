package web;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class SERVLET extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");

        out.print("<html>");
        out.print("<head>");
        out.print("<tittle>Respuesta Servlet</tittle>");
        out.print("<meta charset='UTF-8'>");
        out.print("<link rel='stylesheet' href='recursos/estilos.css'/>");
        out.print("<link href='//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css' rel='stylesheet'>");
        out.print("</head>");
        out.print("<body style = 'background-color: #4B3869'>");
        
        out.print("<div class='row'>");
            out.print("<div class='container '>");
                out.print("<div class='container-fluid' style = 'background-color: #664E88; color:#F3F1F5' align='center'; >");
                out.print("<h3>Respuesta Servlet</h3>");
                out.print("</div>");
            out.print("</div>");
            out.print("<div class='container'>");
               out.print("<div class='container-fluid' >");
               //out.print("<div class='jumbotron'  style = 'background-color: #664E88' text-align='center';> ");

               // Tabla solamente
               out.print("<table class='table'>");
               out.print("<thead style = 'background-color: #63B4B8' class='topTabla' id='topTabla'><tr><th scope='col'>Usuario</th>");
               out.print("<th scope='col'>Password</th>");
               out.print("<th scope='col'>Tecnología</th>");
               out.print("<th scope='col'>Genero</th>");
               out.print("<th scope='col'>Ocupación</th>");
               out.print("<th scope='col'>Música</th>");
               out.print("<th scope='col'>Comentarios</th></tr></thead>");


               //#ba4681
               out.print("<tbody style = 'background-color: #A9E4D7'> <tr>");
               out.print("<td>" + usuario + "</td>");
               out.print("<td>" + password + "</td>");

               out.print("<td>");
               for (int i = 0; i < tecnologias.length; i++) {
                   out.print(tecnologias[i] + "/");
               }
               out.print("</td>");

               out.print("<td>" + genero + "</td>");

               out.print("<td>" + ocupacion + "</td>");

              
               if (musica != null) {
                   out.print("<td>");
                   for (int i = 0; i < musica.length; i++) {
                       out.print(musica[i] + "/");
                   }
                   out.print("</td> ");
               } else {
                   out.print("<td> No tienes música </td> ");
               }

               if (comentarios.length() > 0) {
                   out.print("<td>" + comentarios + " </td> ");
               } else {
                   out.print("<td> No disponible... perro </td> ");
               }

               out.print("</tr> </tbody>");
               out.print("</table>");
               //Tabla

               out.print("</div>");
              //out.print("</div>");
            
       // out.print("</div>");
        out.print("</div>");
        
        
        
        //#e4ccf3
       
        
        
        out.print("</body>");
        out.print("</html>");

    }

}
