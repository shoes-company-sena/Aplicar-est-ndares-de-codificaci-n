package org.example;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/formHandler")
public class FormHandlerServlet extends HttpServlet {

    // Método GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener parámetro del formulario enviado por GET
        String nombre = request.getParameter("nombre");

        // Generar respuesta
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hola, " + nombre + " desde GET!</h1>");
    }

    // Método POST
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener parámetro del formulario enviado por POST
        String nombre = request.getParameter("nombre");

        // Generar respuesta
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hola, " + nombre + " desde POST!</h1>");
    }
}