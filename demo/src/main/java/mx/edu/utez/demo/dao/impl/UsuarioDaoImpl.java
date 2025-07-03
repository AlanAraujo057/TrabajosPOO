package mx.edu.utez.demo.dao.impl;

import mx.edu.utez.demo.config.DBConnection;
import mx.edu.utez.demo.dao.IUsuarioDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDaoImpl implements IUsuarioDao {

    @Override
    public boolean login(String correo, String contraseña) throws Exception {
        // Tabla corregida: USUARIOSPOO
        String sql = "SELECT id, correo, contraseña FROM USUARIOPOO WHERE correo = ? AND contraseña = ?";
        try (
                Connection con = DBConnection.getConnection(); // Conexión a la base de datos
                PreparedStatement ps = con.prepareStatement(sql) // Preparar consulta
        ) {
            ps.setString(1, correo); // Reemplazar primer parámetro
            ps.setString(2, contraseña);   // Reemplazar segundo parámetro
            ResultSet resultSet = ps.executeQuery(); // Ejecutar consulta
            return resultSet.next(); // Si hay resultado, el login es válido
        } catch (Exception e) {
            throw new Exception("Error en login: " + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        UsuarioDaoImpl dao = new UsuarioDaoImpl();
        try {
            boolean resultado = dao.login("20243ds057@utez.edu.mx", "alxn0907");
            System.out.println("Login correcto: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

