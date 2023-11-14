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
import entity.TheLoai;

public class TheLoaiDao {
	public TheLoaiDao() {
		
	}
	public ArrayList<TheLoai> getAllTheLoai(){
		ArrayList<TheLoai>listTheLoai = new ArrayList<>();
        ConnectDB.getInstance();
            Connection conn = ConnectDB.getConnection(); 
        try {
            String sql = "Select * from TheLoaiSach";
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()){
                String maTheLoai = rs.getString("maTheLoai");
                String tenTheLoai =  rs.getString("tenTheLoai");
                TheLoai theloai = new TheLoai(maTheLoai, tenTheLoai);
                listTheLoai.add(theloai);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTheLoai ;
	}
	public TheLoai getTheoMaTheLoai(String id) {
		ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
            String sql = "select * from TheLoaiSach where maTheLoai = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
            	TheLoai theloai = new TheLoai();
                theloai.setMaTheLoai(rs.getString(1));
                theloai.setTenTheLoai(rs.getString(2));
                return theloai;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
	}
	public TheLoai getTheLoaiByName(String name) {
		 ConnectDB.getInstance();
	     Connection conn = ConnectDB.getConnection();
	     try {
	         String sql = "select * from TheLoaiSach where tenTheLoai = ?";
	         PreparedStatement stmt = conn.prepareCall(sql);
	         stmt.setString(1, name);
	         ResultSet rs = stmt.executeQuery();
	         while(rs.next()){
	        	 TheLoai theloai = new TheLoai();
	                theloai.setMaTheLoai(rs.getString(1));
	                theloai.setTenTheLoai(rs.getString(2));
	                return theloai;
	         }
	}catch (SQLException ex) {
        Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
}
}
