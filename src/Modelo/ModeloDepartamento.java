package Modelo;

import include.Departamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloDepartamento extends Conexion {
    public boolean crear_Departamento(Departamento a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO departamento VALUES ( ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setString(1, a.getNombre());
            pst.setString(2, a.getTitular());
            pst.setString(3,a.getEdificio());
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

    public ArrayList<Departamento> getAllProductos(){
        ArrayList<Departamento> asignaturas = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM departamento";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                asignaturas.add(new Departamento( rs.getString("Nombre"),
                        rs.getString("Titular"),

                        rs.getString("Edificio")));
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
        return asignaturas;
    }

    public static void main(String[] args) {
        ModeloDepartamento asign = new ModeloDepartamento();
        System.out.println(asign.crear_Departamento(new Departamento("servicios escolares", "Manuela", "2")));

        for(Departamento a : asign.getAllProductos()) {
            System.out.println(a.getNombre());
        }
    }
}