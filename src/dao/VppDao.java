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
import entity.VPP;

public class VppDao {
	public VppDao() {
		
	}
	public ArrayList<VPP> getAllVPP(){
		ArrayList<VPP> listVPP = new ArrayList<VPP>();
		NhaCungCapDAO nhaCungCapDao = new NhaCungCapDAO();
		ConnectDB.getInstance();
		Connection con =ConnectDB.getConnection();
		try {
			String sql ="select * from SanPham where maSP LIKE 'H%'";
			Statement sta =con.createStatement();
			ResultSet rs =sta.executeQuery(sql);
			while(rs.next()) {
				 String maSP = rs.getString(1);
	              String tenSP = rs.getString(2);
	              String maNCC = rs.getString(3);
	              NhaCungCap nhaCungCap = nhaCungCapDao.getNhaCungCap(maNCC);
	              int soLuong = rs.getInt(4);
	              String hinhAnh =rs.getString(15);
	              double donGiaBan = rs.getDouble(6);
	              String xuatXu=rs.getString(7);
	              String mauSac=rs.getString(8);
	              String chatLieu=rs.getString(9);
	              VPP vpp = new VPP(maSP, tenSP, nhaCungCap, soLuong, donGiaBan, hinhAnh, xuatXu, mauSac, chatLieu);
	              listVPP.add(vpp);
			}
		}catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listVPP;
	}
	public VPP timVPPTheoTen(String ten) {
		NhaCungCapDAO nhaCungCapDao = new NhaCungCapDAO();
		
		PreparedStatement sta =null;
		VPP vpp=null;
		try {
			ConnectDB.getInstance();
			Connection con =ConnectDB.getConnection();
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
	              String hinhAnh =rs.getString(15);
	              double donGiaBan = rs.getDouble(6);
	              String xuatXu=rs.getString(7);
	              String mauSac=rs.getString(8);
	              String chatLieu=rs.getString(9);
	              vpp = new VPP(maSP, tenSP, nhaCungCap, soLuong, donGiaBan, hinhAnh, xuatXu, mauSac, chatLieu);
	              
			}
		}catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
			try {
				sta.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return vpp;
	}
	public VPP getVPPByID(String id) {
		NhaCungCapDAO nhaCungCapDao = new NhaCungCapDAO();
		PreparedStatement sta =null;
		VPP vpp=null;
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
	              String hinhAnh =rs.getString(15);
	              double donGiaBan = rs.getDouble(6);
	              String xuatXu=rs.getString(7);
	              String mauSac=rs.getString(8);
	              String chatLieu=rs.getString(9);
	              vpp = new VPP(maSP, tenSP, nhaCungCap, soLuong, donGiaBan, hinhAnh, xuatXu, mauSac, chatLieu);
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
			return vpp;
		
	}
	public int addVPP(VPP vpp) {
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			String sql ="insert into SanPham(maSP,tenSP,maNCC,hinhAnh,xuatXu,mauSac,chatLieu,soLuongTK,donGiaBan,loaiSP) values(?,?,?,?,?,?,?,?,?,?)";
			 PreparedStatement sta = con.prepareStatement(sql);
			 sta.setString(1,vpp.getMaSP());
			 sta.setString(2,vpp.getTenSP());
			 sta.setString(3,vpp.getNhaCungCap().getMaNCC());
			 sta.setString(4,vpp.getHinhAnh());
			 sta.setString(5,vpp.getXuatXu());
			 sta.setString(6,vpp.getMauSac());
			 sta.setString(7,vpp.getChatLieu());
			 sta.setInt(8,vpp.getSoLuongTK());
			 sta.setDouble(9, vpp.getDonGiaBan());
                         			 sta.setString(10, "VPP");
			 return sta.executeUpdate();
		} catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return -1;
		}
	public int updateVPP(VPP vpp) {
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			String sql ="update SanPham set tenSP= ?,maNCC= ?,hinhAnh =? ,xuatXu =?,mauSac =?,chatLieu =?,soLuongTK =?,donGiaBan =? where maSP =?";
			PreparedStatement sta = con.prepareStatement(sql);
			sta.setString(1,vpp.getTenSP());
			 sta.setString(2,vpp.getNhaCungCap().getMaNCC());
			 sta.setString(3,vpp.getHinhAnh());
			 sta.setString(4,vpp.getXuatXu());
			 sta.setString(5,vpp.getMauSac());
			 sta.setString(6,vpp.getChatLieu());
			 sta.setInt(7,vpp.getSoLuongTK());
			 sta.setDouble(8, vpp.getDonGiaBan());
			 sta.setString(9,vpp.getMaSP());
			 return sta.executeUpdate();
		}catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return -1;
	}
	}

