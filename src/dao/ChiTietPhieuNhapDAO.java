/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.ChiTietPhieuNhap;
import entity.PhieuNhap;
import entity.SanPham;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trana
 */
public class ChiTietPhieuNhapDAO {
    private SanPhamDAO sanPham_DAO = new SanPhamDAO();
    private PhieuNhapDAO phieuNhap_DAO = new PhieuNhapDAO();

    public ChiTietPhieuNhapDAO() {
    }
    
    public ArrayList<ChiTietPhieuNhap> getAllCTHDByHoaDon(PhieuNhap phieuNhap) {
         ArrayList<ChiTietPhieuNhap> listChiTietPhieuNhap = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "Select * from ChiTietPhieuNhap where maPhieuNhap = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, phieuNhap.getMaPhieuNhap());
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                SanPham sanPham = sanPham_DAO.getSanPhamById(rs.getString(1));

                int soLuong = rs.getInt(2);
                double donGiaMua = rs.getDouble(3);
                
                ChiTietPhieuNhap CTPN = new ChiTietPhieuNhap(sanPham, phieuNhap, soLuong, donGiaMua);
                listChiTietPhieuNhap.add(CTPN);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listChiTietPhieuNhap;
        
    }
    
    public ArrayList<ChiTietPhieuNhap> getCTPNById(String id){
       ConnectDB.getInstance();
       Connection conn = ConnectDB.getConnection();
       ArrayList<ChiTietPhieuNhap> listCTPN = new ArrayList<ChiTietPhieuNhap>();

        try {
            String sql = "select * from ChiTietPhieuNhap where maPhieuNhap = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            PhieuNhap phieuNhap = phieuNhap_DAO.getPhieuNhapById(id);
            while(rs.next()){
               SanPham sanPham = sanPham_DAO.getSanPhamById(rs.getString(1));
               int soLuong = rs.getInt(2);
               double donGiaMua = rs.getDouble(3);
               ChiTietPhieuNhap chiTietPhieuNhap = new ChiTietPhieuNhap(sanPham, phieuNhap, soLuong, donGiaMua);
               
               listCTPN.add(chiTietPhieuNhap);
            }
            return listCTPN;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int addChiTietPhieuNhap(ChiTietPhieuNhap ctpn){
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();

        try {
            String sql  ="Insert into ChiTietPhieuNhap values (?,?,?,?)";
            PreparedStatement stmt = con.prepareCall(sql);
            stmt.setString(1, ctpn.getSanPham().getMaSP());
            stmt.setInt(2, ctpn.getSoLuong());
            stmt.setDouble(3, ctpn.getDonGiaMua());
            stmt.setString(4, ctpn.getPhieuNhap().getMaPhieuNhap());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietPhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public int capNhatSoLuong(SanPham sanPham){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();

        try {
            String sql  ="update SanPham set soLuongTK = ? where maSP = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setInt(1, sanPham.getSoLuongTK());
            stmt.setString(2, sanPham.getMaSP());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
