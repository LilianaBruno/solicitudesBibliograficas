package Controlador;

import Modelo.ModeloCarrera;
import include.Carrera;

public class ControladorCarrera {
    public boolean crearCarrera(Carrera a) {
        ModeloCarrera modeloCarrera = new ModeloCarrera ();
        return modeloCarrera.crear_carrera(a);
    }

    public String getViewCarreras() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>ClaveCarrera</th>\n" +
                "\t\t\t\t            <th>Nombre</th>\n" +
                "\t\t\t\t            <th>Direccion</th>\n" +

                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloCarrera modeloCarrera = new ModeloCarrera();
        int i =0;

        for (Carrera a : modeloCarrera.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getClaveCarrera() + "</td>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "<td>" + a.getDireccion() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewCarrerasCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloCarrera  modeloCarrera = new ModeloCarrera();
        int i =0;

        for (Carrera a : modeloCarrera.getAllProductos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   Clave Carrera: " + a.getClaveCarrera() +
                    "                   <br>Nombre: " + a.getNombre() +
                    "                   <br>Dirección: " + a.getDireccion() +
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



