package dao;

import connectDB.ConnectDB;
import entity.NhaCungCap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhaCungCapDAO {

    public NhaCungCapDAO() {
    }
    
    public ArrayList<NhaCungCap> getAllNhaCungCap(){
        ArrayList<NhaCungCap>listNhaCungCap = new ArrayList<>();
        ConnectDB.getInstance();
            Connection conn = ConnectDB.getConnection(); 
        try {
            String sql = "Select * from NhaCungCap";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String maNhaCungCap = rs.getString(1);
                String tenNhaCungCap =  rs.getString(2);
                String diaChi = rs.getString(3);
                NhaCungCap nhaCungCap = new NhaCungCap(maNhaCungCap, tenNhaCungCap, diaChi);
                listNhaCungCap.add(nhaCungCap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNhaCungCap;
    }
    
    public NhaCungCap getNhaCungCap(String id){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
            String sql = "select * from NhaCungCap where maNCC = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                NhaCungCap nhaCungCap = new NhaCungCap();
                nhaCungCap.setMaNCC(rs.getString(1));
                nhaCungCap.setTenNCC(rs.getString(2));
                nhaCungCap.setDiaChi(rs.getString(3)); 
                return nhaCungCap;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<NhaCungCap> getNhaCungCapByTen(String tenNhaCungCap){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        ArrayList<NhaCungCap> listNhaCungCap = new ArrayList<>();
        try {
            String sql = "select * from NhaCungCap where tenNCC like ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, "%"+tenNhaCungCap+"%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                NhaCungCap nhaCungCap = new NhaCungCap();
                nhaCungCap.setMaNCC(rs.getString(1));
                nhaCungCap.setTenNCC(rs.getString(2));
                nhaCungCap.setDiaChi(rs.getString(3));
                listNhaCungCap.add(nhaCungCap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNhaCungCap;
    }
    
    public int updateNhaCungCap(NhaCungCap nhaCungCap){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
            String sql = "update NhaCungCap set tenNCC = ?,"
                    + "                          diaChi = ?"
                    + " where maNCC = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, nhaCungCap.getTenNCC());
            stmt.setString(2, nhaCungCap.getDiaChi());
            stmt.setString(5, nhaCungCap.getMaNCC());
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public int addNhaCungCap(NhaCungCap nhaCungCap){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();    
        try {
            String sql = "insert into NhaCungCap(maNCC, tenNCC, diaChi) values (?, ?, ?)";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, nhaCungCap.getMaNCC());
            stmt.setString(2, nhaCungCap.getTenNCC());
            stmt.setString(3, nhaCungCap.getDiaChi());
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    } 
        public NhaCungCap getNhaCungCapByName(String name){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
        String sql = "select * from NhaCungCap where tenNCC = ?";
        PreparedStatement stmt = conn.prepareCall(sql);
        stmt.setString(1, name);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            NhaCungCap nhaCungCap = new NhaCungCap();
            nhaCungCap.setMaNCC(rs.getString(1));
            nhaCungCap.setTenNCC(rs.getString(2));
            nhaCungCap.setDiaChi(rs.getString(3));
            
            return nhaCungCap;
        }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
