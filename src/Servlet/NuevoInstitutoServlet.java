package Servlet;


import Controlador.ControladorInstituto;

import include.Instituto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NuevoInstitutoServlet", urlPatterns = {"/crearInstituto"})
public class NuevoInstitutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Instituto</h1>");


        String ClaveInst=
                request.getParameter("clave_inst");
        String NombreInst = request.getParameter("nombre_inst");
        String DireccionInst = request.getParameter("direccion_inst");

        try {

        } catch (NumberFormatException e){
            out.println(ClaveInst);
            out.println(NombreInst);
            out.println(DireccionInst);


        }
        Instituto a = new Instituto(ClaveInst,NombreInst,DireccionInst);

        ControladorInstituto ca = new ControladorInstituto();
        if(ca.crear_instituto (a)) {
            response.sendRedirect("Institutos.jsp");
            out.println("<p>Instituto agregado</p>");

        } else {

            response.sendRedirect("crearinstituto.jsp?instituto=error");
            out.println("<p>Instituto no agregado</p>");

        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
