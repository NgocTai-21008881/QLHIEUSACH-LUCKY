package dao;

import entity.NhanVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import connectDB.ConnectDB;

public class NhanVienDAO {

    public NhanVienDAO() {
    }
    
    public ArrayList<NhanVien>getAllNhanVien(){
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        
        try {
            String sql = "Select * from NhanVien";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String maNhanVien = rs.getString(1);
                String tenNhanVien =rs.getString(2);
                String chucVu = rs.getString(5);
                String sdt = rs.getString(3);
                boolean gioiTinh = rs.getBoolean(4);
                String email = rs.getString(6);
                NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, gioiTinh, chucVu, sdt, email);
                listNhanVien.add(nhanVien);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return listNhanVien;
    }
        public boolean dieuKienQuenMatkhau(String gmail) {
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;
        String sql = "Select * from nhanvien where email = ?";
        NhanVien NhanVien = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, gmail);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                NhanVien = new NhanVien(
                        rs.getString(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(stmt);

        }
        return NhanVien != null && NhanVien.getEmail()!= null;
    }
    public NhanVien getNhanVienByID(String id){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
           
            String sql = "select * from NhanVien where maNhanVien = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String maNhanVien = rs.getString(1);
                String tenNhanVien =rs.getString(2);
                String chucVu = rs.getString(5);
                String sdt = rs.getString(3);
                boolean gioiTinh = rs.getBoolean(4);
                String email = rs.getString(6);
                NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, gioiTinh, chucVu, sdt, email);

                return nhanVien;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
	
     public NhanVien getNhanVienByName(String name){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "select * from NhanVien where tenNhanVien = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String maNhanVien = rs.getString(1);
                String tenNhanVien =rs.getString(2);
                String chucVu = rs.getString(5);
                String sdt = rs.getString(3);
                boolean gioiTinh = rs.getBoolean(4);
                String email = rs.getString(6);
                NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, gioiTinh, chucVu, sdt, email);
                
                return nhanVien;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     	public NhanVien getNhanVienBySdt(String sdt) {
		ConnectDB.getInstance();
		Connection conn = ConnectDB.getConnection();

		try {
			String sql = "select * from NhanVien where soDienThoai = ?";
			PreparedStatement stmt = conn.prepareCall(sql);
			stmt.setString(1, sdt);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				NhanVien nhanVien = new NhanVien();
				nhanVien.setMaNhanVien(rs.getString(1));
				nhanVien.setTenNhanVien(rs.getString(2));
				nhanVien.setSoDienThoai(rs.getString(3));
				nhanVien.setGioiTinh(rs.getBoolean(4));
				nhanVien.setChucVu(rs.getString(5));
				nhanVien.setEmail(rs.getString(6));
				return nhanVien;
			}
		} catch (SQLException ex) {
			Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

    public NhanVien getNhanVienByGmail(String gmail){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
           
            String sql = "select * from NhanVien where email = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, gmail);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String maNhanVien = rs.getString(1);
                String tenNhanVien =rs.getString(2);
                String sdt = rs.getString(3);
                boolean gioiTinh = rs.getBoolean(4);
                String chucVu = rs.getString(5);
                String email = rs.getString(6);
                NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, gioiTinh, chucVu, sdt, email);
                
                return nhanVien;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int updateNhanVien(NhanVien nhanVien){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        System.out.println(nhanVien);
        try {
            String sql = "update NhanVien set tenNhanVien = ?, soDienThoai = ?, gioiTinh = ?, chucVu = ?, email = ? where maNhanVien = ?";
            
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, nhanVien.getTenNhanVien());
            stmt.setString(2, nhanVien.getSoDienThoai());
            stmt.setBoolean(3, nhanVien.isGioiTinh());
            stmt.setString(4, nhanVien.getChucVu());
            stmt.setString(5, nhanVien.getEmail());
            stmt.setString(6, nhanVien.getMaNhanVien());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public int updateOTP(String gmail, String OTP, Timestamp expiredAt){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
           
            String sql = "update nhanvien set OTP = ?, expriedAt = ? where email = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, OTP);
            stmt.setTimestamp(2, expiredAt);
            stmt.setString(3, gmail);
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public int xoaNhanVien(String maNhanVien){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
           
            String sql = "update nhanvien set isDeleted = 1 where maNhanVien = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, maNhanVien); 
            
//            if(taiKhoan_DAO.xoaTaiKhoan(maNhanVien) != -1);
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;

    }
    
    public int addNhanVien(NhanVien nhanVien){
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "insert into nhanvien(maNhanVien, tenNhanVien, soDienThoai, gioiTinh, chucVu, email)"
                + "                 values(?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, nhanVien.getMaNhanVien());
            stmt.setString(2, nhanVien.getTenNhanVien());
            stmt.setString(3, nhanVien.getSoDienThoai());
            stmt.setBoolean(4, nhanVien.isGioiTinh());
            stmt.setString(5, nhanVien.getChucVu());
            stmt.setString(6, nhanVien.getEmail());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
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
