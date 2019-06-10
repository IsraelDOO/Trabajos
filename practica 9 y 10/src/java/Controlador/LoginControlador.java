package Controlador;

import Modelo.LoginDAOImpl;
import Modelo.LoginDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("password");
        String accion = request.getParameter("accion");

        if(usuario.equals("") || password.equals("")){
                request.getRequestDispatcher("invalido.jsp").forward(request, response);
        } 
        if(accion.equals("Registrar")){
        
            int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
            String newUsuario = request.getParameter("usuario");
            String newPassword = request.getParameter("password");
            String newCorreo = request.getParameter("correo");            
            String newTel = request.getParameter("telefono");
            
            LoginDAOImpl usuarioDAO = new LoginDAOImpl();
            LoginDTO usuarioDTO = new LoginDTO();
            
            usuarioDTO.setId_usuario(id_usuario);
            usuarioDTO.setUsuario(usuario);
            usuarioDTO.setPassword(newPassword);
            usuarioDTO.setCorreo(newCorreo);     
            usuarioDTO.setTelefono(newTel);

            usuarioDAO.insertar(usuarioDTO);
                HttpSession miSession = request.getSession();
                miSession.setAttribute("user", usuarioDTO);
            response.sendRedirect("bienvenido.jsp");
        }
        
        if(accion.equals("Entrar")){
        if(usuario==null || password==null){
                //request.setAttribute("error","Usuario/Password no pueden estar en blanco");
                //RequestDispatcher req= request.getRequestDispatcher("/index.html");
                //req.forward(request,response);
            request.getRequestDispatcher("invalido.jsp").forward(request, response);
        }else{
            LoginDAOImpl loginDaoImpl = new LoginDAOImpl();
            LoginDTO loginDTO= new LoginDTO();
            loginDTO.setUsuario(usuario);
            loginDTO.setPassword(password);
            boolean autenticado = false;
            
                autenticado=loginDaoImpl.autenticar(loginDTO);
                if(autenticado){
                    HttpSession miSession = request.getSession();
                    miSession.setAttribute("user", loginDTO);                        
                    response.sendRedirect("bienvenido.jsp");
                    Cookie micookie = new Cookie("micookie","micookievalue");
             response.addCookie (micookie);
                        micookie.setMaxAge(60*60);
                        micookie.setMaxAge(0);
                }else{
                    response.sendRedirect("invalido.jsp");
                }
        
        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}