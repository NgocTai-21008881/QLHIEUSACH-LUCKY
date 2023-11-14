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
import entity.NhaCungCap;
import entity.NhaXuatBan;
import entity.Sach;
import entity.TheLoai;

public class SachDao  {
	public SachDao() {
		
	}
	public ArrayList<Sach> getAllSach(){
		NhaCungCapDAO nhaCungCapDao = new NhaCungCapDAO();
		NhaXuatBanDao nhaXuatBanDao = new NhaXuatBanDao();
		TheLoaiDao theLoaiDao = new TheLoaiDao();
        ArrayList<Sach> listSach = new ArrayList<>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            String sql = "Select * from SanPham where maSP LIKE 'S%'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String maSP = rs.getString(1);
                String tenSP = rs.getString(2);
                String maNCC = rs.getString(3);
                NhaCungCap nhaCungCap = nhaCungCapDao.getNhaCungCap(maNCC);
                int soLuong = rs.getInt(4);
                String hinhAnh =rs.getString(15);
                double donGiaBan = rs.getDouble(6);
                String TheLoai=rs.getString(12);
                TheLoai theLoai=theLoaiDao.getTheoMaTheLoai(TheLoai);
                String nhaXB =rs.getString(11);
                NhaXuatBan nhaXuatBan=nhaXuatBanDao.getNhaXuatBan(nhaXB);
                String tacGia=rs.getString(10);
                Sach sach = new Sach(maSP, tenSP, nhaCungCap, soLuong, donGiaBan, hinhAnh, nhaXuatBan, theLoai, tacGia);
                listSach.add(sach);
            }

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSach;
    }
	public Sach timSachTheoTenSach(String ten) {
		NhaCungCapDAO nhaCungCapDao = new NhaCungCapDAO();
		NhaXuatBanDao nhaXuatBanDao = new NhaXuatBanDao();
		TheLoaiDao theLoaiDao = new TheLoaiDao();
		Sach sach =null;
		PreparedStatement sta =null;
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql ="select * from SanPham where tenSP = ?";
			sta =con.prepareStatement(sql);
			sta.setString(1, ten);
			ResultSet rs =sta.executeQuery();
			while(rs.next()) {
				 String maSP = rs.getString(1);
	                String tenSP = rs.getString(2);
	                String maNCC = rs.getString(3);
	                NhaCungCap nhaCungCap = nhaCungCapDao.getNhaCungCap(maNCC);
	                int soLuong = rs.getInt(4);
	                double donGiaBan = rs.getDouble(6);
	                
	                String TheLoai=rs.getString(12);
	                TheLoai theLoai=theLoaiDao.getTheoMaTheLoai(TheLoai);
	                String nhaXB =rs.getString(11);
	                NhaXuatBan nhaXuatBan=nhaXuatBanDao.getNhaXuatBan(nhaXB);
	                String tacGia=rs.getString(10);
	                String hinhAnh =rs.getString(15);
	                sach=new Sach(maSP, tenSP, nhaCungCap, soLuong, donGiaBan, nhaXB, nhaXuatBan, theLoai, tacGia);
	            
	               
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				sta.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sach;
	}
	public Sach getSachByID(String id) {
		NhaCungCapDAO nhaCungCapDao = new NhaCungCapDAO();
		NhaXuatBanDao nhaXuatBanDao = new NhaXuatBanDao();
		TheLoaiDao theLoaiDao = new TheLoaiDao();
		Sach sach =null;
		PreparedStatement sta =null;
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql ="select * from SanPham where maSP = ?";
			sta =con.prepareStatement(sql);
			sta.setString(1,id);
			ResultSet rs =sta.executeQuery();
			while(rs.next()) {
				 String maSP = rs.getString(1);
	                String tenSP = rs.getString(2);
	                String maNCC = rs.getString(3);
	                NhaCungCap nhaCungCap = nhaCungCapDao.getNhaCungCap(maNCC);
	                int soLuong = rs.getInt(4);
	                double donGiaBan = rs.getDouble(6);
	                
	                String TheLoai=rs.getString(12);
	                TheLoai theLoai=theLoaiDao.getTheoMaTheLoai(TheLoai);
	                String nhaXB =rs.getString(11);
	                NhaXuatBan nhaXuatBan=nhaXuatBanDao.getNhaXuatBan(nhaXB);
	                String tacGia=rs.getString(10);
	                String hinhAnh =rs.getString(15);
	                sach = new Sach(maSP, tenSP, nhaCungCap, soLuong, donGiaBan, hinhAnh, nhaXuatBan, theLoai, tacGia);
	            
	               
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				sta.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sach;
	}
	public int themSach(Sach s) {
		
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			String sql="insert into SanPham(maSP,tenSP,maTheLoai,hinhAnh,maNCC,maNhaXuatBan,tacGia,soLuongTK,donGiaBan) values(?,?,?,?,?,?,?,?,?)";
			 PreparedStatement sta = con.prepareStatement(sql);
			sta.setString(1,s.getMaSP());
			sta.setString(2,s.getTenSP());
			sta.setString(3,s.getTheLoai().getMaTheLoai());
			sta.setString(4,s.getHinhAnh());
			sta.setString(5,s.getNhaCungCap().getMaNCC());
			sta.setString(6,s.getNhaXuatBan().getMaNXB());
			sta.setString(7,s.getTacGia());
			sta.setInt(8,s.getSoLuongTK());
			sta.setDouble(9,s.getDonGiaBan());
			return sta.executeUpdate();
		} catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return -1;
	}
	public int capNhat(Sach s) {
		
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			String sql="update SanPham set tenSP =?, maTheLoai =?,hinhAnh =?,maNCC =?,maNhaXuatBan =?,tacGia =?,soLuongTK =?,donGiaBan=? where maSP =? ";
			PreparedStatement sta=con.prepareStatement(sql);
			sta.setString(1,s.getTenSP());
			sta.setString(2,s.getTheLoai().getMaTheLoai());
			sta.setString(3,s.getHinhAnh());
			sta.setString(4,s.getNhaCungCap().getMaNCC());
			sta.setString(5,s.getNhaXuatBan().getMaNXB());
			sta.setString(6,s.getTacGia());
			sta.setInt(7,s.getSoLuongTK());
			sta.setDouble(8,s.getDonGiaBan());
			sta.setString(9,s.getMaSP());
			 return sta.executeUpdate();
		}catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return -1;
	
	}
}
	

