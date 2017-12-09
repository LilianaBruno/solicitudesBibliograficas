package include;

public class Departamento {
    private String Nombre;
    private String Titular;
    private String Edificio;


    public Departamento(String nombre, String titular, String edificio) {

        Nombre= nombre;
        Titular=titular;
        Edificio= edificio;


    }

    public String getNombre() { return Nombre;}

    public void setNombre(String nombre) { Nombre = nombre; }

    public String getTitular() { return Titular; }

    public void setTitular(String titular) { Titular = titular; }

    public String getEdificio() { return Edificio; }

    public void setEdificio(String edificio) { Edificio = edificio;
    }
}
