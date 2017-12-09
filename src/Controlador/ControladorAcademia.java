package Controlador;

import Modelo.ModeloAcademia;
import include.Academia;

public class ControladorAcademia {
    public boolean crearAcademia(Academia a) {
        ModeloAcademia modeloAcademia = new ModeloAcademia();
        return modeloAcademia.crear_academia(a);
    }


    public String getViewAcademias() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Clave</th>\n" +
                "\t\t\t\t            <th>Nombre</th>\n" +
                               "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloAcademia modeloAcademia = new ModeloAcademia();
        int i =0;

        for (Academia a : modeloAcademia.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getClave() + "</td>" +
                    "<td>" + a.getNombre() + "</td>" +

                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }
    public String getViewAcademiasCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloAcademia modeloAcademia = new ModeloAcademia();
        int i =0;

        for (Academia a : modeloAcademia.getAllProductos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   Clave Academia: " + a.getClave() +
                    "                   <br>Nombre: " + a.getNombre()+
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



