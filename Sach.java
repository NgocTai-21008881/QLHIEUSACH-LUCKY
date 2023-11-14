package entity;

import dao.SachDao;
import dao.SanPhamDAO;

public class Sach extends SanPham {
	private NhaXuatBan nhaXuatBan;
	private TheLoai theLoai;
	private String tacGia;
	/**
	 * @param maSP
	 * @param tenSP
	 * @param nhaCungCap
	 * @param soLuongTK
	 * @param donGiaBan
	 * @param nhaXuatBan
	 * @param theLoai
	 */
	
	
	
	
	/**
	 * @param maSP
	 * @param tenSP
	 * @param nhaCungCap
	 * @param soLuongTK
	 * @param loaiSP
	 * @param donGiaBan
	 * @param nhaXuatBan
	 * @param theLoai
	 * @param tacGia
	 */
	
	
	/**
	 * @param maSP
	 * @param tenSP
	 * @param nhaCungCap
	 * @param soLuongTK
	 * @param donGiaBan
	 * @param hinhAnh
	 * @param nhaXuatBan
	 * @param theLoai
	 * @param tacGia
	 */
	public String auto_ID() {
		SachDao sach_dao= new SachDao();
		String idPrefix="S";
		int length=sach_dao.getAllSach().size();
		String finalId=idPrefix +String.format("%04d",length+1);
		return finalId;
	}
	public Sach() {
		super();
	}
	public Sach(String maSP, String tenSP, NhaCungCap nhaCungCap, int soLuongTK, double donGiaBan, String hinhAnh,
			NhaXuatBan nhaXuatBan, TheLoai theLoai, String tacGia) {
		super(maSP, tenSP, nhaCungCap, soLuongTK, donGiaBan, hinhAnh);
		this.nhaXuatBan = nhaXuatBan;
		this.theLoai = theLoai;
		this.tacGia = tacGia;
	}
	public TheLoai getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(TheLoai theLoai) {
		this.theLoai = theLoai;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public NhaXuatBan getNhaXuatBan() {
		return nhaXuatBan;
	}
	/**
	 * @param nhaXuatBan
	 * @param theLoai
	 * @param tacGia
	 */
	
	public void setNhaXuatBan(NhaXuatBan nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
}
