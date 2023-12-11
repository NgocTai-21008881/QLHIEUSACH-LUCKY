package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import connectDB.ConnectDB;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;

public class HoaDonDAO {

    private NhanVienDAO nhanVien_DAO = new NhanVienDAO();
    private KhachHangDAO khachHang_DAO = new KhachHangDAO();

    public HoaDonDAO() {

    }

    public ArrayList<HoaDon> getAllHoaDon() {
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "Select * from HoaDon where maHoaDon like 'HD%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String maHoaDon = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                NhanVien nhanVien = nhanVien_DAO.getNhanVienByID(rs.getString(3));
                KhachHang khachHang = khachHang_DAO.getKhachHangById(rs.getString(4));
                HoaDon hoaDon = new HoaDon(maHoaDon, ngayLap, nhanVien, khachHang);
                listHoaDon.add(hoaDon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHoaDon;
    }

    public ArrayList<HoaDon> getAllHoaDon(String maId) {
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "Select * from HoaDon where maHoaDon like ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, "%" + maId + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String maHoaDon = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                NhanVien nhanVien = nhanVien_DAO.getNhanVienByID(rs.getString(3));
                KhachHang khachHang = khachHang_DAO.getKhachHangById(rs.getString(4));
                HoaDon hoaDon = new HoaDon(maHoaDon, ngayLap, nhanVien, khachHang);
                listHoaDon.add(hoaDon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHoaDon;
    }
    
    public ArrayList<HoaDon> getAllHoaDon(String tenKhachHang, String tenNhanVien) {
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "SELECT         HoaDon.*\n"
                    + "FROM            HoaDon INNER JOIN\n"
                    + "                         KhachHang ON HoaDon.maKhachHang = KhachHang.maKhachHang INNER JOIN\n"
                    + "                         NhanVien ON HoaDon.maNhanVien = NhanVien.maNhanVien\n"
                    + "where NhanVien.tenNhanVien like ? and KhachHang.tenKhachHang like ? and maHoaDon like 'HD%'";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, "%" + tenNhanVien + "%");
            stmt.setString(2, "%" + tenKhachHang + "%");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String maHoaDon = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                NhanVien nhanVien = nhanVien_DAO.getNhanVienByID(rs.getString(3));
                KhachHang khachHang = khachHang_DAO.getKhachHangById(rs.getString(4));
                HoaDon hoaDon = new HoaDon(maHoaDon, ngayLap, nhanVien, khachHang);
                listHoaDon.add(hoaDon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHoaDon;
    }
    
    public ArrayList<HoaDon> getAllHoaDon(String tenKhachHang, String tenNhanVien, Date tuNgay, Date denNgay) {
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "SELECT         HoaDon.*\n"
                    + "FROM            HoaDon INNER JOIN\n"
                    + "                         KhachHang ON HoaDon.maKhachHang = KhachHang.maKhachHang INNER JOIN\n"
                    + "                         NhanVien ON HoaDon.maNhanVien = NhanVien.maNhanVien\n"
                    + "where NhanVien.tenNhanVien like ? and KhachHang.tenKhachHang like ? and maHoaDon like 'HD%' and ngayLapHD between ? and ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, "%" + tenNhanVien + "%");
            stmt.setString(2, "%" + tenKhachHang + "%");
            stmt.setDate(3, tuNgay);
            stmt.setDate(4, denNgay);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String maHoaDon = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                NhanVien nhanVien = nhanVien_DAO.getNhanVienByID(rs.getString(3));
                KhachHang khachHang = khachHang_DAO.getKhachHangById(rs.getString(4));
                HoaDon hoaDon = new HoaDon(maHoaDon, ngayLap, nhanVien, khachHang);
                listHoaDon.add(hoaDon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHoaDon;
    }

    public ArrayList<HoaDon> getHoaDonByDate(Date ngayBatDau, Date ngayKetThuc) {
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();

        try {
            String sql = "Select * from HoaDon where ngayLapHD between ? and ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateBatDau = sdf.format(ngayBatDau);
            String dateNgayKetThuc = sdf.format(ngayKetThuc);

            stmt.setString(1, dateBatDau);
            stmt.setString(2, dateNgayKetThuc);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String maHoaDon = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                NhanVien nhanVien = nhanVien_DAO.getNhanVienByID(rs.getString(3));
                KhachHang khachHang = khachHang_DAO.getKhachHangById(rs.getString(4));
                HoaDon hoaDon = new HoaDon(maHoaDon, ngayLap, nhanVien, khachHang);
                listHoaDon.add(hoaDon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHoaDon;
    }

    public HoaDon getHoaDonById(String id) {
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();

        try {
            String sql = "select * from HoaDon where maHoaDon = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMaHD(rs.getString(1));
                hoaDon.setNgayLapHD(rs.getDate(2));

                NhanVien nhanVien = nhanVien_DAO.getNhanVienByID(rs.getString(3));
                hoaDon.setNhanVien(nhanVien);

                KhachHang khachHang = khachHang_DAO.getKhachHangById(rs.getString(4));
                hoaDon.setKhachHang(khachHang);

                return hoaDon;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int addHoaDon(HoaDon hoaDon) {
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "Insert into HoaDon values (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, hoaDon.getMaHD());
            stmt.setDate(2, hoaDon.getNgayLapHD());
            stmt.setString(3, hoaDon.getNhanVien().getMaNhanVien());
            stmt.setString(4, hoaDon.getKhachHang().getMaKhachHang());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
