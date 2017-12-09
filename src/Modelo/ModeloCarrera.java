package Modelo;

import include.Carrera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloCarrera extends Conexion {
    public boolean crear_carrera(Carrera a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO carrera VALUES ( ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, a.getClaveCarrera());
            pst.setString(2, a.getNombre());
            pst.setString(3, a.getDireccion());
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

    public ArrayList<Carrera> getAllProductos(){
        ArrayList<Carrera> carreras = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM carrera";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                carreras.add(new Carrera(rs.getInt("ClaveCarrera"),
                        rs.getString("Nombre"),
                        rs.getString("Direccion")));

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
        return carreras;
    }

    public static void main(String[] args) {
        ModeloCarrera asign = new ModeloCarrera();
        System.out.println(asign.crear_carrera(new Carrera(1231, "Informatica",  "Sistemas Computacionales")));

        for(Carrera a : asign.getAllProductos()) {
            System.out.println(a.getNombre());
        }
    }
}