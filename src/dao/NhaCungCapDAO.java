package dao;

import connectDB.ConnectDB;
import entity.NhaCungCap;
import entity.NhanVien;

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
                String SoDienThoai = rs.getString(4);
                String email = rs.getString(5);
                NhaCungCap nhaCungCap = new NhaCungCap(maNhaCungCap, tenNhaCungCap, diaChi,SoDienThoai,email);
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
                nhaCungCap.setSoDienThoai(rs.getString(4));
                nhaCungCap.setEmail(rs.getString(5));
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
            String sql = "update NhaCungCap set tenNCC = ?,diaChi = ?,soDienThoai = ?,email = ? where maNCC = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, nhaCungCap.getTenNCC());
            stmt.setString(2, nhaCungCap.getDiaChi());
            stmt.setString(3, nhaCungCap.getSoDienThoai());
            stmt.setString(4, nhaCungCap.getEmail());
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
        public static NhaCungCap getNhaCungCapByGmail(String gmail){
            ConnectDB.getInstance();
            Connection conn = ConnectDB.getConnection();
            try {
               
                String sql = "select * from NhaCungCap where email = ?";
                PreparedStatement stmt = conn.prepareCall(sql);
                stmt.setString(1, gmail);
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    String maNCC = rs.getString(1);
                    String tenNCC =rs.getString(2);
                    String diachi = rs.getString(3);
                    String sdt = rs.getString(4);
                    String email = rs.getString(5);
                  NhaCungCap nhaCC = new NhaCungCap(maNCC, tenNCC, diachi, sdt, email);
                    return nhaCC;
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }
        public static NhaCungCap getNhaCungCapBySdt(String sdt) {
    		ConnectDB.getInstance();
    		Connection conn = ConnectDB.getConnection();

    		try {
    			String sql = "select * from NhaCungCap where soDienThoai = ?";
    			PreparedStatement stmt = conn.prepareCall(sql);
    			stmt.setString(1, sdt);
    			ResultSet rs = stmt.executeQuery();
    			while (rs.next()) {
    				NhaCungCap nhaCC = new NhaCungCap();
    				nhaCC.setMaNCC(rs.getString(1));
    				nhaCC.setTenNCC(rs.getString(2));
    				nhaCC.setDiaChi(rs.getString(3));
    				nhaCC.setSoDienThoai(rs.getString(4));
    				nhaCC.setEmail(rs.getString(5));
    				return nhaCC;
    			}
    		} catch (SQLException ex) {
    			Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
    		}
    		return null;
    	}
}
