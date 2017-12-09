package include;

public class Libro {

    private String Nombre;
    private String Autores;
    private String Editorial;
    private Integer Año;
    private String ISBN;
    private String Edicion;


    public Libro(String nombre, String autores, String editorial, Integer año, String isbn, String edicion) {
        Nombre = nombre;
        Autores = autores;
        Editorial = editorial;
        Año = año;
        ISBN = isbn;
        Edicion = edicion;
    }

    public String getNombre() { return Nombre; }

    public void setNombre(String nombre) { Nombre = nombre;}

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String autores) {
        Autores = autores;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public Integer getAño() {
        return Año;
    }

    public void setAño(Integer año) { Año = año; }

    public String getISBN() { return ISBN; }

    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public String getEdicion() { return Edicion; }

    public void setEdicion(String edicion) { Edicion = edicion; }

}
