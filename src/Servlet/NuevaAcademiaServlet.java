package Servlet;

import Controlador.ControladorAcademia;
import Modelo.ModeloAcademia;
import include.Academia;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;



@WebServlet(name = "NuevaAcademiaServlet", urlPatterns = {"/crearAcademia"})
public class NuevaAcademiaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Academia</h1>");


        String nombre =
                request.getParameter("nombre_academia");
        String clave =
                request.getParameter("clave_academia");


        try {


        } catch (NumberFormatException e){
            out.println(clave);
            out.println(nombre);


        }
        Academia a = new Academia(clave,nombre);
        ControladorAcademia ca = new ControladorAcademia();
        if(ca.crearAcademia(a)) {
            response.sendRedirect("Academia.jsp");
            out.println("<p>Academia agregada</p>");
        } else {
            response.sendRedirect("crearacademia.jsp?academia=error");
            out.println("<p>Academia no agregada</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
