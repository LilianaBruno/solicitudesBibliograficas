package Controlador;

import Modelo.ModeloListade_libros;
import include.Listade_libros;

public class ControladorListade_libros {
    public boolean crearlistade_libros(Listade_libros a) {
        ModeloListade_libros modeloListade_libros = new ModeloListade_libros();
        return modeloListade_libros.crearlistade_libros(a);
    }

    public String getViewListade_libros() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>No_solicitud</th>\n" +
                "\t\t\t\t            <th>ISBN</th>\n" +
                "\t\t\t\t            <th>Asignatura</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloListade_libros modelolistade_libros = new ModeloListade_libros();
        int i =0;

        for (Listade_libros a : modelolistade_libros.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getNo_solicitud() + "</td>" +
                    "<td>" + a.getISBN() + "</td>" +
                    "<td>" + a.getAsignatura() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewListade_librosCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloListade_libros modeloListade_libros = new ModeloListade_libros();
        int i =0;

        for (Listade_libros a : modeloListade_libros.getAllProductos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNo_solicitud() +
                    "               </span> " +
                    "               <p>" +
                    "                   Clave Asignatura: " + a.getNo_solicitud() +
                    "                   <br>Creditos: " + a.getISBN() +
                    "                   <br>Clave Asignatura: " + a.getAsignatura() +
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


