package Controlador;

import Modelo.ModeloDocente;
import include.Docente;

public class ControladorDocente {
    public boolean crear_docente(Docente a) {
        ModeloDocente modeloDocente = new ModeloDocente();
        return modeloDocente.crear_docente (a);
    }

    public String getViewDocentes() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>RfcDoce</th>\n" +
                "\t\t\t\t            <th>Nombre</th>\n" +
                "\t\t\t\t            <th>Apellido_paterno</th>\n" +
                "\t\t\t\t            <th>Apellido_materno</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloDocente modeloDocente = new ModeloDocente();
        int i =0;

        for (Docente a : modeloDocente.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getRfcDoce() + "</td>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "<td>" + a.getApellido_paterno() + "</td>" +
                    "<td>" + a.getApellido_materno() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewDocentesCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloDocente  modeloDocente = new ModeloDocente();
        int i =0;

        for (Docente a : modeloDocente.getAllProductos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   RFCDoce: " + a.getRfcDoce() +
                    "                   <br>Nombre: " + a.getNombre() +
                    "                   <br>Apellido Paterno: " + a.getApellido_paterno() +
                    "                   <br>Apellido Materno: " + a.getApellido_materno() +
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




