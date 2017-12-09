package Servlet;

import Controlador.ControladorSolicitud;
import include.Solicitud;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NuevaSolicitudServlet", urlPatterns = {"/crear_solicitud"})
public class NuevaSolicitudServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Solicitud</h1>");
        int docente_RfcDoce =0;
        String Fecha =
                request.getParameter("fecha_solicitud");
        String Nombre_Acad =
                request.getParameter("nombre_acad");
        String Clave_ciclo = request.getParameter("clave_ciclo");
        String Nombre_departamento = request.getParameter("nombre_departamento");

        try {
            docente_RfcDoce = Integer.parseInt(request.getParameter("docente_RfcDoce"));

        } catch (NumberFormatException e){

        }
        out.println(Fecha);
        out.println(Nombre_Acad);
        out.println(Clave_ciclo);
        out.println(Nombre_departamento);
        Solicitud a = new Solicitud(Fecha,Nombre_Acad,Clave_ciclo,Nombre_departamento,docente_RfcDoce);

        ControladorSolicitud ca = new ControladorSolicitud();
        if(ca.crear_solicitud (a)) {
            response.sendRedirect("Solicitudes.jsp");
            out.println("<p>Solicitud agregada</p>");
        } else {
            response.sendRedirect("crearsolicitud.jsp?solicitud=error");
            out.println("<p>Solicitud no agregada</p>");
        }
        //enctype="multipart/form-data"



        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
