package Controlador;

import Modelo.ModeloCiclo_escolar;
import include.Ciclo_escolar;

public class ControladorCiclo_escolar {
    public boolean crearCiclo_escolar(Ciclo_escolar a) {
        ModeloCiclo_escolar modeloAsignatura = new ModeloCiclo_escolar();
        return modeloAsignatura.crear_Ciclo_escolar(a);
    }

    public String getViewCiclos() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Clave</th>\n" +
                "\t\t\t\t            <th>Nombre</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloCiclo_escolar modeloCiclo_escolar = new ModeloCiclo_escolar();
        int i =0;

        for (Ciclo_escolar a : modeloCiclo_escolar.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getClave() + "</td>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewCiclosCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloCiclo_escolar  modeloCicloEscolar = new ModeloCiclo_escolar();
        int i =0;

        for (Ciclo_escolar a : modeloCicloEscolar.getAllProductos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   Clave: " + a.getClave() +
                    "                   <br>Nombre: " + a.getNombre() +
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




