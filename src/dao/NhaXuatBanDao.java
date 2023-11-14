package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import connectDB.ConnectDB;
import entity.NhaXuatBan;

public class NhaXuatBanDao {
	public NhaXuatBanDao() {
		
	}
	public ArrayList<NhaXuatBan> getAllNhaXuatBan(){
		ArrayList<NhaXuatBan> listNhaXuatBan = new ArrayList<NhaXuatBan>();
		 ConnectDB.getInstance();
         Connection conn = ConnectDB.getConnection(); 
         try {
        	 String sql ="Select * from NhaXuatBan";
        	 Statement sta = conn.createStatement();
        	 ResultSet rs = sta.executeQuery(sql);
        	 while(rs.next()) {
        		 String maNXB= rs.getString("maNhaXuatBan");
        		 String tenNXB =rs.getString("tenNhaXuatBan");
        		 String diachi =rs.getString("diaChi");
        		 String sdt =rs.getString("soDienThoai");
        		 NhaXuatBan nhaxuatban = new NhaXuatBan(maNXB, tenNXB, diachi, sdt);
        		 listNhaXuatBan.add(nhaxuatban);
        	 }
         }catch(SQLException e) {
        	 e.printStackTrace();
         }
         return listNhaXuatBan;
	}
	public NhaXuatBan getNhaXuatBan(String id) {
		ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
            String sql = "select * from NhaXuatBan where maNhaXuatBan = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
            	NhaXuatBan nhaxuatban = new NhaXuatBan();
                nhaxuatban.setMaNXB(rs.getString(1));
                nhaxuatban.setTenNXB(rs.getString(2));
                nhaxuatban.setDiaChi(rs.getString(3));
                nhaxuatban.setSoDienThoai(rs.getString(4));
                return nhaxuatban;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
	}
	public NhaXuatBan getNhaXuatBanByName(String name) {
		 ConnectDB.getInstance();
	        Connection conn = ConnectDB.getConnection();
	        
	        try {
	        String sql = "select * from NhaXuatBan where tenNhaXuatBan = ?";
	        PreparedStatement stmt = conn.prepareCall(sql);
	        stmt.setString(1, name);
	        ResultSet rs = stmt.executeQuery();
	        while(rs.next()){
	            NhaXuatBan nhaXuatBan= new NhaXuatBan();
	           nhaXuatBan.setMaNXB(rs.getString(1));
	           nhaXuatBan.setTenNXB(rs.getString(2));
	           nhaXuatBan.setDiaChi(rs.getString(3));
	           nhaXuatBan.setSoDienThoai(rs.getString(4));
	            
	            return nhaXuatBan;
	        }
	        } catch (SQLException ex) {
	            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return null;
	    }
	
}
