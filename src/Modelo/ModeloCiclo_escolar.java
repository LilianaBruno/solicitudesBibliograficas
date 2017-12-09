package Modelo;

import include.Ciclo_escolar;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloCiclo_escolar extends Conexion {
    public boolean crear_Ciclo_escolar(Ciclo_escolar a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO ciclo_escolar VALUES ( ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setString(1, a.getClave());
            pst.setString(2, a.getNombre());

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

    public ArrayList<Ciclo_escolar> getAllProductos(){
        ArrayList<Ciclo_escolar> ciclos = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM ciclo_escolar";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                ciclos.add(new Ciclo_escolar(rs.getString("Clave"),
                        rs.getString("Nombre")));
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
        return ciclos;
    }

    public static void main(String[] args) {
        ModeloCiclo_escolar asign = new ModeloCiclo_escolar();
        System.out.println(asign.crear_Ciclo_escolar(new Ciclo_escolar("123", "enero-febrero")));

        for(Ciclo_escolar a : asign.getAllProductos()) {
            System.out.println(a.getNombre());
        }
    }
}