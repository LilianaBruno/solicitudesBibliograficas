package Servlet;

import Controlador.ControladorDepartamento;
import include.Departamento;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NuevaDepartamento", urlPatterns = {"/crearDepartamento"})
public class NuevaDepartamentoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Departamento</h1>");

        String Nombre =
                request.getParameter("nombre_departamento");
        String Titular = request.getParameter("titular_departamento");
        String Edificio = request.getParameter("edificio_departamento");

        try {

        } catch (NumberFormatException e){

            out.println(Nombre);
            out.println(Titular);
            out.println(Edificio);



        }
        Departamento a = new Departamento(Nombre,Titular,Edificio);

        ControladorDepartamento ca = new ControladorDepartamento();
        if(ca.crear_Departamento(a)) {
            response.sendRedirect("Departamento.jsp");
            out.println("<p>Departamento agregado</p>");
        } else {
            response.sendRedirect("creardepartamento.jsp?departamento=error");
            out.println("<p>Departamento no agregado</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
