
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Server2", urlPatterns = {"/Server2"})
public class Server2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");        
            String nombre = request.getParameter("nombre");
            String contrasena = request.getParameter("contrasena");
            String correo = request.getParameter("correo");
            String fecha = request.getParameter("fecha");
            
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Resultados </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Resultados... </h1>");
            out.println("<h2> Nombre: </h1>" + nombre);
            out.println("<h2> Contraseña: </h2>" + contrasena);
            out.println("<h2> Correo electrónico: </h2>" + correo);
            out.println("<h2> Fecha: </h2>" + fecha);
            out.println("</body>");
            out.println("</html>");
        }
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
