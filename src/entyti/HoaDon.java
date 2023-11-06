package entity;

import java.sql.Date;
import java.util.ArrayList;

import dao.ChiTietHoaDonDAO;
import dao.HoaDonDAO;

public class HoaDon {
	private String maHD;
	private Date ngayLapHD;
	private NhanVien nhanVien;
	private KhachHang khachHang;

	public HoaDon() {
		super();
	}
	
	public HoaDon(HoaDon hd) {
		this.ngayLapHD = hd.ngayLapHD;
		this.nhanVien = hd.nhanVien;
		this.khachHang = hd.khachHang;
	}

	public HoaDon(Date ngayLapHD, NhanVien nhanVien, KhachHang khachHang) {
		super();
		this.ngayLapHD = ngayLapHD;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
	}

	public HoaDon(String maHD, Date ngayLapHD, NhanVien nhanVien, KhachHang khachHang) {
		super();
		this.maHD = maHD;
		this.ngayLapHD = ngayLapHD;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public Date getNgayLapHD() {
		return ngayLapHD;
	}

	public void setNgayLapHD(Date ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	
	public double tongTien(){
        double tongTien = 0;
        ChiTietHoaDonDAO cthd_DAO = new ChiTietHoaDonDAO();
        ArrayList<ChiTietHoaDon>listChiTietHoaDon = cthd_DAO.getAllCTHDByHoaDon(this);
        
        for(ChiTietHoaDon cthd : listChiTietHoaDon){
            tongTien += cthd.thanhTien();
        }
        
        return tongTien;
    }
}
