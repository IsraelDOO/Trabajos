/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Form", urlPatterns = {"/Form"})
public class Form extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");
        String correo = request.getParameter("correo");
        String fecha = request.getParameter("fecha");
        
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("Nombre: " + nombre);
            out.println("Contraseña: " + contrasena);
            out.println("Correo electrónico: " + correo);
            out.println("Fecha: " + fecha);
            
            response.sendRedirect("resultados.jsp?nombre= "+ nombre + "&contrasena= "
            + contrasena + "&correo= "+ correo + "&fecha= "+ fecha);
        }
    }
}
