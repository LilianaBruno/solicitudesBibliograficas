package include;

public class Listade_libros {
    private Integer No_solicitud;
    private String ISBN;
    private String Asignatura;


    public Listade_libros(Integer no_solicitud, String isbn, String asignatura) {
        No_solicitud = no_solicitud;
        ISBN = isbn;
        Asignatura = asignatura;
    }

    public Integer getNo_solicitud() { return No_solicitud; }

    public void setNo_solicitud(Integer no_solicitud) { No_solicitud = no_solicitud; }

    public String getISBN() { return ISBN; }

    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public String getAsignatura() { return Asignatura; }

    public void setAsignatura(String asignatura) { Asignatura = asignatura; }
}