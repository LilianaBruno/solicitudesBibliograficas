package Modelo;

import include.Solicitud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class
ModeloSolicitud extends Conexion {
    public boolean crear_solicitud (Solicitud a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO solicitud VALUES ( ?, ?, ?, ?,?)";
            pst = getConecction().prepareStatement(sql);
            pst.setString(1, a.getFecha());
            pst.setString(2, a.getNombre_acad());
            pst.setString(3, a.getClave_ciclo());
            pst.setString(4, a.getNombre_departamento());
            pst.setInt(5,a.getDocente_RfcDoce());
            if(pst.executeUpdate() == 1){
                flag = true;
            }

        } catch (Exception e) {

        } finally {
            try {
                if(getConecction() != null) getConecction().close();
                if(pst != null) pst.close();
            } catch (Exception e){

            }
        }
        return flag;
    }

    public ArrayList<Solicitud> getAllProductos(){
        ArrayList<Solicitud> solicitudes = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM solicitud";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                solicitudes.add(new Solicitud(rs.getString("Fecha"),
                        rs.getString("Nombre_acad"),
                        rs.getString("Clave_ciclo"),
                        rs.getString("Nombre_departamento"),
                        rs.getInt("getDocente_RfcDoce")));
            }
        } catch (Exception e) {

        }finally {
            try {
                if(getConecction() != null)getConecction().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {

            }
        }
        return solicitudes;
    }

    public static void main(String[] args) {
        ModeloSolicitud asign = new ModeloSolicitud();
        System.out.println(asign.crear_solicitud(new Solicitud("Marzo 19", "Natacion", "ccc5", "1234",12)));

        for(Solicitud a : asign.getAllProductos()) {
            System.out.println(a.getFecha());
        }
    }
}