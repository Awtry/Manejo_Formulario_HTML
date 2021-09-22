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
        //out.print("<link rel='stylesheet' href='recursos/estilos.css'/>");
        out.print("<link href='//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css' rel='stylesheet'>");
        out.print("</head>");
        out.print("<body class='perritosJamon'>");
        out.print("<table width='200' class='table'>");
        
        out.print("<thead><tr><th scope='col'>Usuario</th>");
        out.print("<th scope='col'>Password</th>");
        out.print("<th scope='col'>Tecnología</th>");
        out.print("<th scope='col'>Genero</th>");
        out.print("<th scope='col'>Ocupación</th>");
        out.print("<th scope='col'>Música</th>");
        out.print("<th scope='col'>Comentarios</th></tr></thead>");
        
        out.print("<tbody> <tr>");
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
            out.print("<tr> <td>");
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
        out.print("</body>");
        out.print("</html>");

        /*
        
        <title>Formulario</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="recursos/estilos.css"/>
        
        <caption>Registro de datos</caption>
                <tr>
                    <td class="columna">
                        Usuario:(*)
                    </td>
                    <td>
                        <input class="default" type="text" name="usuario" value = "Escribir usuario" onfocus="this.select()">
                    </td>
                </tr>
                <tr>
                    <td class="columna">
                        Password:(*)
                    </td>
                    <td>
                        <input class="default" type="text" name="password" onfocus="this.select()">
                    </td>
                </tr>
                <tr>
                    <td class="columna">
                        Tecnológias de desarrollo:(*)
                    </td>
                    <td>
                        Java <input type="checkbox" name="tecnologia" value="java"><!-- comment -->
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        Do Net<input type="checkbox" name="tecnologia" value="net"><!-- comment -->
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        PHP <input type="checkbox" name="tecnologia" value="php">
                    </td>
                </tr>
                <tr>
                    <td class="columna">
                        Genero:(*)
                    </td>
                    <td>
                        Hombre: <input  type="radio" name="genero" value="H">
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        Mujer: <input  type="radio" name="genero" value="M">
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        Otro: <input  type="radio" name="genero" value="O">
                        &nbsp;&nbsp;&nbsp;&nbsp;
                    </td>
                </tr>
                <tr>
                    <td class="columna">
                        Ocupacion:(*)
                    </td>
                    <td>
                        <select name="ocupacion" class="default">
                            <option value="">Seleccionar</option>
                            <option value="1">Profesor</option>
                            <option value="2">Ingeniero</option>
                            <option value="3">Artista</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="columna">
                        Música favorita: 
                    </td>
                    <td>
                        <select name="musica" multiple class="default">
                            <option value="artcore">Artcore</option>
                            <option value="electronica">Electronica</option>
                            <option value="oriental">Oriental</option>
                            <option value="orquesta">Orquesta</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="columna">
                        Comentarios: 
                    </td>
                    <td>
                        <textarea name="comentarios" rows="2" cols="30" onfocus="this.select()"></textarea>
                    </td>
                </tr>
                <tr style="text-align: center">
                    <td>
                        <input type="reset" value="Limpiar" class="default"> 
                    </td>
                    <td>
                        <input type="submit" value="Vamonos" class="default"> 
                    </td>
                </tr>
            </table>
         */
    }

}
