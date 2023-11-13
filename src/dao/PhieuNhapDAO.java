/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.PhieuNhap;
import entity.NhaCungCap;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trana
 */
public class PhieuNhapDAO {

    private NhaCungCapDAO nhaCungCap_DAO = new NhaCungCapDAO();

    public ArrayList<PhieuNhap> getAllPhieuNhap() {
        ArrayList<PhieuNhap> listPhieuNhap = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "Select * from PhieuNhap where maPhieuNhap like 'PN%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String maPhieuNhap = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                PhieuNhap phieuNhap = new PhieuNhap(maPhieuNhap, ngayLap);
                listPhieuNhap.add(phieuNhap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPhieuNhap;
    }

    public PhieuNhap getPhieuNhapById(String id) {
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "Select * from PhieuNhap where maPhieuNhap = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                PhieuNhap phieuNhap = new PhieuNhap();
                phieuNhap.setMaPhieuNhap(rs.getString(1));
                phieuNhap.setNgayNhap(rs.getDate(2));

                return phieuNhap;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<PhieuNhap> getPhieuNhapByDate(Date ngayBatDau, Date ngayKetThuc) {
        ArrayList<PhieuNhap> listHoaDon = new ArrayList<>();
        ConnectDB.getInstance();
        Connection conn = ConnectDB.getConnection();

        try {
            String sql = "Select * from PhieuNhap where ngayNhap between ? and ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateBatDau = sdf.format(ngayBatDau);
            String dateNgayKetThuc = sdf.format(ngayKetThuc);

            stmt.setString(1, dateBatDau);
            stmt.setString(2, dateNgayKetThuc);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String maPhieuNhap = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                PhieuNhap phieuNhap = new PhieuNhap(maPhieuNhap, ngayLap);
                listHoaDon.add(phieuNhap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHoaDon;
    }
    
    public int addPhieuNhap(PhieuNhap phieuNhap){
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();

        try {
            String sql  ="Insert into PhieuNhap values(?,?)";
            PreparedStatement stmt = con.prepareCall(sql);
            stmt.setString(1, phieuNhap.getMaPhieuNhap());
            stmt.setDate(2, phieuNhap.getNgayNhap());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
