/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import connectDB.ConnectDB;
import entyti.taiKhoan;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class LoginDao {

    private ConnectDB con;

    /**
     *
     * @return
     */
    public boolean checkLogin(String username, String matkhau) {
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;
        String sql = "Select * from [TaiKhoan] where tenDangNhap = ? and matKhau = ?";
        taiKhoan taiKhoan = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, matkhau);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                taiKhoan = new taiKhoan(
                        rs.getString(1),
                        rs.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources (stmt, rs, and con) here if necessary
            // This should be done in a finally block to ensure resources are properly released.
        }

        return taiKhoan != null && taiKhoan.getTenDangNhap()!= null;

    }
}
