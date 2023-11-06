package entity;

public class SanPham {
	private String maSP;
	private String tenSP;
	private NhaCungCap nhaCungCap;
	private int soLuongTK;
	private String loaiSP;
	private double donGiaBan;
	
	

	public SanPham() {
		super();
	}

	public SanPham(String tenSP, NhaCungCap nhaCungCap, int soLuongTK, String loaiSP, double donGiaBan) {
		super();
		this.tenSP = tenSP;
		this.nhaCungCap = nhaCungCap;
		this.soLuongTK = soLuongTK;
		this.loaiSP = loaiSP;
		this.donGiaBan = donGiaBan;
	}
	
	public SanPham(String maSP, String tenSP, NhaCungCap nhaCungCap, int soLuongTK, String loaiSP, double donGiaBan) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.nhaCungCap = nhaCungCap;
		this.soLuongTK = soLuongTK;
		this.loaiSP = loaiSP;
		this.donGiaBan = donGiaBan;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public int getSoLuongTK() {
		return soLuongTK;
	}

	public void setSoLuongTK(int soLuongTK) {
		this.soLuongTK = soLuongTK;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}

	public double getDonGiaBan() {
		return donGiaBan;
	}

	public void setDonGiaBan(double donGiaBan) {
		this.donGiaBan = donGiaBan;
	}
	
	
}
