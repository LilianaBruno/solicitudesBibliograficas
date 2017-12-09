package Servlet;

import Controlador.ControladorDocente;

import include.Docente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NuevoDocenteServlet", urlPatterns = {"/crearDocente"})
public class NuevoDocenteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Docente</h1>");


        String RfcDoce =
                request.getParameter("RfcDoce");

        String Nombre =
                request.getParameter("nombre");
        String Apellido_paterno = request.getParameter("apellido_paterno");
        String Apellido_materno = request.getParameter("apellido_materno");

        try {


        } catch (NumberFormatException e){
            out.println(Nombre);
            out.println(Apellido_paterno);
            out.println(Apellido_materno);
            out.println(RfcDoce);

        }
        Docente a = new Docente(RfcDoce,Nombre,Apellido_paterno,Apellido_materno);

        ControladorDocente  ca = new ControladorDocente();
        if(ca.crear_docente(a)) {
            response.sendRedirect("Docentes.jsp");
            out.println("<p>Docente agregado</p>");
        } else {
            response.sendRedirect("creardocente.jsp?docente=error");
            out.println("<p>Docente no agregado</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
