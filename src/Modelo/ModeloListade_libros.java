package Modelo;

import include.Listade_libros;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloListade_libros extends Conexion {
    public boolean crearlistade_libros(Listade_libros a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO listade_libros VALUES ( ?, ?, ?)";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, a.getNo_solicitud());
            pst.setString(2, a.getISBN());
            pst.setString(3, a.getAsignatura());

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

    public ArrayList<Listade_libros> getAllProductos(){
        ArrayList<Listade_libros> listasde_libros = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM listade_libros";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                listasde_libros.add(new Listade_libros(rs.getInt("No_solicitud"),
                        rs.getString("ISBN"),
                        rs.getString("Asignatura")));
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
        return listasde_libros;
    }

    public static void main(String[] args) {
        ModeloListade_libros asign = new ModeloListade_libros();
        System.out.println(asign.crearlistade_libros(new Listade_libros(2,"lolpjhj","TALLER")));

        for(Listade_libros a : asign.getAllProductos()) {
            System.out.println(a.getNo_solicitud());
        }
    }
}