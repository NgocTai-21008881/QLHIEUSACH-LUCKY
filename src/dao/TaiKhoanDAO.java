/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.taiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TaiKhoanDAO {

    public taiKhoan timTaiKhoanByEmail(String email) {
        Connection con = ConnectDB.getInstance().getConnection();
        taiKhoan tk = null;
        PreparedStatement prestmt = null;
        String url = "Select * from [dbo].[TaiKhoan] taikoan JOIN NhanVien nv on taikoan.tenDangNhap = nv.maNhanVien\n"
                + "where nv.email = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, email);
            ResultSet rs = prestmt.executeQuery();
            while (rs.next()) {
                tk = new taiKhoan(rs.getString(1), rs.getString(2), rs.getString(3));
                return tk;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Đổi mật khẩu tài khoản
     *
     * @param taiKhoan
     */
    public void doiMatKhauTaiKhoan(taiKhoan taiKhoan, String maKhau) {

        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "update TAIKHOAN set matKhau = ? where tenDangNhap = ?";
        try {
            prestmt = con.prepareStatement(url);

            prestmt.setString(1, maKhau);
            prestmt.setString(2, taiKhoan.getTenDangNhap());
            prestmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                prestmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

 public int addTaiKhoan(taiKhoan taiKhoan) {
    
        try {
          ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();

            String sql = "Insert into TaiKhoan (tendangnhap, matKhau, phanquyen) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, taiKhoan.getTenDangNhap());
            ps.setString(2, taiKhoan.getMatKhau());
            ps.setString(3, taiKhoan.getPhanQuyen());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
public boolean cvTaiKhoan(String tk) {
    Connection con = ConnectDB.getInstance().getConnection();
    PreparedStatement stmt = null;
    String sql = "SELECT tenDangNhap FROM TaiKhoan WHERE tenDangNhap = ? AND phanQuyen = 'QL'";
    taiKhoan taiKhoan = null;

    try {
        stmt = con.prepareStatement(sql);
        stmt.setString(1, tk);
        ResultSet rs = stmt.executeQuery();

        // Check if there is a row in the result set
        if (rs.next()) {
            taiKhoan = new taiKhoan();
            taiKhoan.setTenDangNhap(rs.getString("tenDangNhap"));
        }

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        close(stmt);
    }

    // Return true if taiKhoan is not null, indicating that the user is an admin
    return taiKhoan != null && taiKhoan.getTenDangNhap() != null;
}

    public void close(PreparedStatement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
