package include;

public class Solicitud {


    private  String Fecha;
    private String  Nombre_acad;
    private String Clave_ciclo;
    private String Nombre_departamento;
    private Integer Docente_RfcDoce;



    public Solicitud(String fecha, String nombre_acad, String clave_ciclo, String nombre_departamento,int docente_RfcDoce) {

        Fecha = fecha;
        Nombre_acad = nombre_acad;
        Clave_ciclo = clave_ciclo;
        Nombre_departamento= nombre_departamento;
        Docente_RfcDoce=docente_RfcDoce;
}

    public String getFecha() { return Fecha; }
    public void setFecha(String fecha) { Fecha = fecha; }

    public String getNombre_acad() { return Nombre_acad; }

    public void setNombre_acad(String nombre_acad) { Nombre_acad = nombre_acad; }

    public String getClave_ciclo() { return Clave_ciclo; }

    public void setClave_ciclo(String clave_ciclo) { Clave_ciclo = clave_ciclo; }

    public String getNombre_departamento() { return Nombre_departamento; }

    public void setNombre_departamento(String nombre_departamento) { Nombre_departamento = nombre_departamento; }

    public Integer getDocente_RfcDoce() {
        return Docente_RfcDoce;
    }

    public void setDocente_RfcDoce(Integer docente_RfcDoce) {
        Docente_RfcDoce = docente_RfcDoce;
    }
}

