package include;



public class Docente {
    private String RfcDoce;
    private String Nombre;
    private String  Apellido_paterno;
    private String Apellido_materno;


    public Docente() {
    }

    public Docente(String rfcDoce, String nombre, String apellido_paterno, String apellido_materno ){

        RfcDoce = rfcDoce;
        Nombre = nombre;
        Apellido_paterno = apellido_paterno;
        Apellido_materno = apellido_materno;

    }

    public String getRfcDoce() {
        return RfcDoce;
    }

    public void setRfcDoce(String rfcDoce) {
        RfcDoce = rfcDoce;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido_paterno() {
        return Apellido_paterno;
    }

    public String getApellido_materno() {
        return Apellido_materno;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido_paterno(String apellido_paterno) {
        Apellido_paterno = apellido_paterno;
    }

    public void setApellido_materno(String apellido_materno) {
        Apellido_materno = apellido_materno;
    }
}

