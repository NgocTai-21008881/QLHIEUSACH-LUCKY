package entity;

import java.util.ArrayList;

import dao.ChiTietHoaDonDAO;
import dao.SanPhamDAO;

public class ChiTietHoaDon {
    private SanPham sanPham;
    private HoaDon hoaDon;
    private int soLuong;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(SanPham sanPham, HoaDon hoaDon, int soLuong) {
        this.sanPham = sanPham;
        this.hoaDon = hoaDon;
        this.soLuong = soLuong;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    @Override
	public String toString() {
		return "ChiTietHoaDon [sanPham=" + sanPham + ", hoaDon=" + hoaDon + ", soLuong=" + soLuong + "]";
	}

	public double thanhTien() {
    	double thanhTien = 0;
    	thanhTien = this.getSanPham().getDonGiaBan() * this.getSoLuong();
        
        return thanhTien;
    }
    
}
