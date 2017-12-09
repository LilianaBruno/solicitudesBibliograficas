package Servlet;

import Controlador.ControladorCiclo_escolar;
import include.Ciclo_escolar;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NuevaCiclo_escolar", urlPatterns = {"/crearCiclo_escolar"})
public class NuevaCiclo_escolarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Ciclo_escolar</h1>");
        String Clave = request.getParameter("clave_cicloescolar");

        String Nombre =
                request.getParameter("nombre_cicloescolar");


        try {


        } catch (NumberFormatException e){

            out.println(Clave);
            out.println(Nombre);

        }
        Ciclo_escolar a = new Ciclo_escolar(Clave, Nombre);
        ControladorCiclo_escolar ca = new ControladorCiclo_escolar();
        if(ca.crearCiclo_escolar(a)) {
            response.sendRedirect("Ciclo_escolar.jsp");
            out.println("<p>Ciclo escolar agregado</p>");
        } else {
            response.sendRedirect("crearciclo_escolar.jsp?ciclo_escolar=error");
            out.println("<p>Ciclo escolar  no agregado</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
