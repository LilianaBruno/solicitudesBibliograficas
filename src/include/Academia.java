package include;

public class Academia {
    private String Clave;
    private String Nombre;


    public Academia() {
    }

    public Academia(String clave, String nombre) {
        Clave = clave;
        Nombre = nombre;

    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public String getNombre() { return Nombre; }

    public void setNombre(String nombre) { Nombre = nombre; }


}
