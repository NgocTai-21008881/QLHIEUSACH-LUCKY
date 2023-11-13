package dao;

import entity.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import connectDB.ConnectDB;

public class KhachHangDAO {

    public KhachHangDAO() {
    }
    
    public ArrayList<KhachHang> getAllKhachHang(){
        ArrayList<KhachHang>listKhachHang = new ArrayList<>();
        ConnectDB.getInstance();
            Connection conn = ConnectDB.getConnection(); 
        try {
            String sql = "Select * from KhachHang";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String maKhachHang = rs.getString(1);
                String hoVaTen =  rs.getString(2);
                String email = rs.getString(3);
                String sdt = rs.getString(4);
                boolean gioiTinh = rs.getBoolean(5);
                KhachHang kh = new KhachHang(maKhachHang, hoVaTen, email, sdt, gioiTinh);
                listKhachHang.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKhachHang;
    }
    
    public ArrayList<KhachHang> getKhachHangByName(String tenKhachHang){
       
        ArrayList<KhachHang>listKhachHang = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
            String sql = "select * from KhachHang where tenKhachHang like ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, "%" + tenKhachHang + "%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(rs.getString(1));
                khachHang.setTenKhachHang(rs.getString(2));
                khachHang.setEmail(rs.getString(3));
                khachHang.setSoDienThoai(rs.getString(4));
                khachHang.setGioiTinh(rs.getBoolean(5));
                listKhachHang.add(khachHang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKhachHang;
    }
    
    public KhachHang getKhachHangById(String id){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
            String sql = "select * from KhachHang where maKhachHang = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(rs.getString(1));
                khachHang.setTenKhachHang(rs.getString(2));
                khachHang.setEmail(rs.getString(3));
                khachHang.setSoDienThoai(rs.getString(4));
                khachHang.setGioiTinh(rs.getBoolean(5));
                return khachHang;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public KhachHang getKhachHangBySdt(String sdt){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
            String sql = "select * from KhachHang where soDienThoai = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, sdt);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(rs.getString(1));
                khachHang.setTenKhachHang(rs.getString(2));
                khachHang.setEmail(rs.getString(3));
                khachHang.setSoDienThoai(rs.getString(4));
                khachHang.setGioiTinh(rs.getBoolean(5));
                return khachHang;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int updateKhachHang(KhachHang khachHang){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
            String sql = "update khachHang set tenKhachHang = ?,"
                    + "                         email = ?,"
                    + "                         soDienThoai = ?,"
                    + "                         gioiTinh = ?"
                    + " where maKhachHang = ?";
            
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, khachHang.getTenKhachHang());
            stmt.setString(2, khachHang.getEmail());
            stmt.setString(3, khachHang.getSoDienThoai());
            stmt.setBoolean(4, khachHang.isGioiTinh());
            stmt.setString(5, khachHang.getMaKhachHang());
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public int addKhachHang(KhachHang khachHang){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();    
        try {
            String sql = "insert into khachHang(maKhachHang, hoVaTen, email, sdt, gioiTinh) values (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, khachHang.getMaKhachHang());
            stmt.setString(2, khachHang.getTenKhachHang());
            stmt.setString(3, khachHang.getEmail());
            stmt.setString(4, khachHang.getSoDienThoai());
            stmt.setBoolean(5, khachHang.isGioiTinh());
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    } 
}


