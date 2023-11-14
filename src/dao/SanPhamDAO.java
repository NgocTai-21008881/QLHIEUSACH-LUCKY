package dao;

import connectDB.ConnectDB;
import entity.NhaCungCap;
import entity.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SanPhamDAO {

    public SanPhamDAO() {
    }

    public ArrayList<SanPham> getAllSanPham() {
        NhaCungCapDAO nhaCungCapDao = new NhaCungCapDAO();

        ArrayList<SanPham> listSanPham = new ArrayList<>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            String sql = "Select * from SanPham";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String maSP = rs.getString(1);
                String tenSP = rs.getString(2);
                String maNCC = rs.getString(3);
                NhaCungCap nhaCungCap = nhaCungCapDao.getNhaCungCap(maNCC);
                int soLuong = rs.getInt(4);
                String loaiSP = rs.getString(5);
                double donGiaBan = rs.getDouble(6);

                SanPham sanPham = new SanPham(maSP, tenSP, nhaCungCap, soLuong, loaiSP, donGiaBan);
                listSanPham.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSanPham;
    }
    
    public int capNhatSoLuong(SanPham sanPham){
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();

        try {
            String sql  ="update SanPham set soLuongTK = ? where maSP = ?";
            PreparedStatement stmt = con.prepareCall(sql);
            stmt.setInt(1, sanPham.getSoLuongTK());
            stmt.setString(2, sanPham.getMaSP());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public SanPham getSanPhamById(String id) {
        NhaCungCapDAO nhaCungCapDao = new NhaCungCapDAO();

        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();

        try {
            String sql = "select * from SanPham where maSP = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maSP = rs.getString(1);
                String tenSP = rs.getString(2);
                String maNCC = rs.getString(3);
                NhaCungCap nhaCungCap = nhaCungCapDao.getNhaCungCap(maNCC);
                int soLuong = rs.getInt(4);
                String loaiSP = rs.getString(5);
                double donGiaBan = rs.getDouble(6);

                SanPham sanPham = new SanPham(maSP, tenSP, nhaCungCap, soLuong, loaiSP, donGiaBan);
                return sanPham;
            }

        } catch (SQLException e) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public SanPham getSanPhamByIdWithImg(String id) {
        NhaCungCapDAO nhaCungCapDao = new NhaCungCapDAO();

        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();

        try {
            String sql = "select * from SanPham where maSP = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maSP = rs.getString(1);
                String tenSP = rs.getString(2);
                String maNCC = rs.getString(3);
                NhaCungCap nhaCungCap = nhaCungCapDao.getNhaCungCap(maNCC);
                int soLuong = rs.getInt(4);
                String loaiSP = rs.getString(5);
                double donGiaBan = rs.getDouble(6);
                String hinhAnh = rs.getString(16);

                SanPham sanPham = new SanPham(maSP, tenSP, nhaCungCap, soLuong, loaiSP, donGiaBan, hinhAnh);
                return sanPham;
            }

        } catch (SQLException e) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
