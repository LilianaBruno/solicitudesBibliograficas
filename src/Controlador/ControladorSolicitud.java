package Controlador;

import Modelo.ModeloSolicitud;
import include.Asignatura;
import include.Solicitud;

public class ControladorSolicitud {
    public boolean crear_solicitud(Solicitud a) {
        ModeloSolicitud modeloSolicitud = new ModeloSolicitud();
        return modeloSolicitud.crear_solicitud(a);
    }

    public String getViewSolicitudes() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Fecha</th>\n" +
                "\t\t\t\t            <th>Nombre_acad</th>\n" +
                "\t\t\t\t            <th>Clave_ciclo</th>\n" +
                "\t\t\t\t            <th>Nombre_departamento</th>\n" +
                "\t\t\t\t            <th>docente_RfcDoce</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloSolicitud modeloSolicitud = new ModeloSolicitud();
        int i =0;

        for (Solicitud a : modeloSolicitud.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getFecha() + "</td>" +
                    "<td>" + a.getNombre_acad() + "</td>" +
                    "<td>" + a.getClave_ciclo() + "</td>" +
                    "<td>" + a.getNombre_departamento() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewSolicitudesCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloSolicitud modeloSolicitud = new ModeloSolicitud();
        int i =0;

        for (Solicitud a : modeloSolicitud.getAllProductos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getFecha() +
                    "               </span> " +
                    "               <p>" +
                    "                   Clave Asignatura: " + a.getFecha() +
                    "                   <br>Creditos: " + a.getNombre_acad() +
                    "                   <br>Clave carrera: " + a.getClave_ciclo() +
                    "                   <br>Clave Asignatura: " + a.getNombre_departamento() +
                    "                   <br>Clave docente_RfcDoce: " + a.getDocente_RfcDoce() +
                    "               </p>"+
                    "           </div>\n" +
                    "       <div class=\"card-action\">\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "       </div>\n" +
                    "       </div>\n" +
                    "   </div>\n";
        }
        htmlcode += "" +
                "      </div>";
        return htmlcode;
    }
}


