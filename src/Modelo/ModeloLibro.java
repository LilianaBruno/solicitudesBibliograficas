package Modelo;

import include.Libro;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloLibro extends Conexion {
    public boolean crear_libro (Libro  a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO libro VALUES ( ?, ?, ?, ?, ?, ?)";
            pst = getConecction().prepareStatement(sql);
            pst.setString(1, a.getNombre());
            pst.setString(2, a.getAutores());
            pst.setString(3, a.getEditorial());
            pst.setInt(4, a.getAño());
            pst.setString(5, a.getISBN());
            pst.setString(6, a.getEdicion());

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

    public ArrayList<Libro> getAllProductos(){
        ArrayList<Libro> libros = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM libro ";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                libros.add(new Libro(rs.getString("Nombre"),
                        rs.getString("Autores"),
                        rs.getString("Editorial"),
                        rs.getInt("Año"),
                        rs.getString("ISBN"),
                        rs.getString("Edicion")));
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
        return libros;
    }

    public static void main(String[] args) {
        ModeloLibro asign = new ModeloLibro();
        System.out.println(asign.crear_libro(new Libro("Programación Orientada a objetos", "Maria Rosales", "Casa del libro", 1990,"primera","Tercera" )));

        for(Libro a : asign.getAllProductos()) {
            System.out.println(a.getNombre());
        }
    }
}