package Servlet;


import Controlador.ControladorListade_libros;

import include.Listade_libros;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NuevaListade_librosServlet", urlPatterns = {"/crearlistade_libros"})
public class NuevaListade_librosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lista de libros</h1>");
        int no_solicitud = 0;
        String ISBN =
                request.getParameter("isbn");
        String Asignatura = request.getParameter("asignatura");

        try {
            no_solicitud= Integer.parseInt(request.getParameter("no_solicitud"));
        } catch (NumberFormatException e){

        }
        out.println(no_solicitud);
        out.println(ISBN);
        out.println(Asignatura);
        Listade_libros a = new Listade_libros(no_solicitud,ISBN,Asignatura);
        ControladorListade_libros ca = new ControladorListade_libros();
        if(ca.crearlistade_libros(a)) {
            response.sendRedirect("Listade_libros.jsp");
            out.println("<p>Lista agregada</p>");
        } else {
            response.sendRedirect("crearlistade_libros.jsp?listade_libros=error");
            out.println("<p>Lista no agregada</p>");
        }
        //enctype="multipart/form-data"



        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
