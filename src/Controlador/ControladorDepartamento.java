package Controlador;


import Modelo.ModeloDepartamento;

import include.Departamento;

public class ControladorDepartamento {
    public boolean crear_Departamento(Departamento a) {
        ModeloDepartamento modeloDepartamento = new ModeloDepartamento();
        return modeloDepartamento.crear_Departamento(a);
    }

    public String getViewDepartamentos() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t            <th>Nombre</th>\n" +
                "\t\t\t\t            <th>Titular</th>\n" +
                "\t\t\t\t            <th>Edificio</th>\n" +

                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloDepartamento modeloDepartamento = new ModeloDepartamento();
        int i =0;

        for (Departamento a : modeloDepartamento.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "<td>" + a.getTitular() + "</td>" +
                    "<td>" + a.getEdificio() + "</td>" +

                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }


    public String getViewDepartamentosCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloDepartamento  modeloDepartamento = new ModeloDepartamento();
        int i =0;

        for (Departamento a : modeloDepartamento.getAllProductos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   <br>Nombre: " + a.getNombre() +
                    "                   <br>Titular: " + a.getTitular() +
                    "                   <br>Edificio: " + a.getEdificio() +
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





