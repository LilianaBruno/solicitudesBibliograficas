package include;

public class Carrera {
    private int ClaveCarrera;
    private String Nombre;
    private String Direccion;

    public Carrera() {
    }

    public Carrera(int clavecarrera,
                   String nombre,
                   String direccion) {
        ClaveCarrera = clavecarrera;
        Nombre = nombre;
        Direccion = direccion;

    }

    public int getClaveCarrera() { return ClaveCarrera; }

    public void setClaveCarrera(int claveCarrera) { ClaveCarrera = claveCarrera; }

    public String getNombre() { return Nombre; }

    public void setNombre(String nombre) { Nombre = nombre; }

    public String getDireccion() { return Direccion; }

    public void setDireccion(String direccion) { Direccion = direccion; }
}
