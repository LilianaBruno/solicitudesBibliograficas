package Servlet;

import Controlador.ControladorCarrera;
import include.Carrera;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NuevaCarrerServlet", urlPatterns = {"/crearCarrera"})
public class NuevaCarreraServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Carrera</h1>");
        int Clave_carrera = 0;

        String Nombre =
                request.getParameter("nombre");
        String Direccion = request.getParameter("direccion");

        try {
            Clave_carrera = Integer.parseInt(request.getParameter("clave_carrera"));

        } catch (NumberFormatException e){

            out.println(Clave_carrera);
            out.println(Nombre);
            out.println(Direccion);

        }
        Carrera a = new Carrera(Clave_carrera,Nombre,Direccion);

        ControladorCarrera ca = new ControladorCarrera();
        if(ca.crearCarrera(a)) {
            response.sendRedirect("Carrera.jsp");
            out.println("<p>Carrrera agregada</p>");
        } else {
            response.sendRedirect("crearcarrera.jsp?carrera=error");
            out.println("<p>Carrera no agregada</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
