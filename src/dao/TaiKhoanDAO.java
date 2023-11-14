package dao;

import entity.taiKhoan;
import entity.NhanVien;

import java.sql.Connection;
import connectDB.ConnectDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TaiKhoanDAO {
    private NhanVienDAO nhanVien_DAO = new NhanVienDAO();

    public TaiKhoanDAO() {
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
}
