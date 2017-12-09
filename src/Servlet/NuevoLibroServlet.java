package Servlet;

import Controlador.ControladorLibro;
import include.Libro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NuevoLibroServlet", urlPatterns = {"/crear_libro"})
public class NuevoLibroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Libros</h1>");
        int año = 0;
        String Nombre =
                request.getParameter("nombre_libro");
        String Autores= request.getParameter("autores_libro");
        String Editorial= request.getParameter("editorial_libro");
        String ISBN= request.getParameter("isbn_libro");
        String Edición= request.getParameter("edicion_libro" );





        try {

            año = Integer.parseInt(request.getParameter("año"));
        } catch (NumberFormatException e){

        }
        out.println(Nombre);
        out.println(Autores);
        out.println(Editorial);
        out.println(año);
        out.println(ISBN);
        out.println(Edición);
        Libro a = new Libro(Nombre,Autores,Editorial,año,ISBN,Edición);

        ControladorLibro ca = new ControladorLibro();
        if(ca.crear_libro(a)) {
            response.sendRedirect("Libros.jsp");
            out.println("<p>Libro agregado</p>");
        } else {
            response.sendRedirect("crearlibro.jsp?Libro=error");
            out.println("<p>Libro no agregado</p>");
        }
        //enctype="multipart/form-data"



        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
