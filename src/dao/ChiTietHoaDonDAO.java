package dao;

import connectDB.ConnectDB;
import entity.ChiTietHoaDon;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;
import entity.SanPham;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChiTietHoaDonDAO {
    private SanPhamDAO sanPham_DAO = new SanPhamDAO();
    private HoaDonDAO hoaDon_DAO = new HoaDonDAO();
    private NhanVienDAO nhanVien_DAO = new NhanVienDAO();
    private KhachHangDAO khachHang_DAO = new KhachHangDAO();
    
    public ChiTietHoaDonDAO() {
    }
    
    public ArrayList<ChiTietHoaDon> getAllCTHDByHoaDon(HoaDon hoaDon){
        ArrayList<ChiTietHoaDon>listChiTietHoaDon = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "Select * from ChiTietHoaDon where maHoaDon = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, hoaDon.getMaHD());
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                SanPham sanPham = sanPham_DAO.getSanPhamById(rs.getString(1));
                
                int soLuong = rs.getInt(3);
                
                ChiTietHoaDon CTHD = new ChiTietHoaDon(sanPham, hoaDon, soLuong);
                listChiTietHoaDon.add(CTHD);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listChiTietHoaDon;
    }

    public ArrayList<ChiTietHoaDon> getCTHDById(String id){
       ConnectDB.getInstance();
       Connection conn = ConnectDB.getConnection();
       ArrayList<ChiTietHoaDon> listCTHD = new ArrayList<ChiTietHoaDon>();

        try {
            String sql = "select * from ChiTietHoaDon where maHoaDon = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            HoaDon hoaDon = hoaDon_DAO.getHoaDonById(id);
            while(rs.next()){
               SanPham sanPham = sanPham_DAO.getSanPhamById(rs.getString(1));
               int soLuong = rs.getInt(3);
               ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(sanPham, hoaDon, soLuong);
               
               listCTHD.add(chiTietHoaDon);
            }
            return listCTHD;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
