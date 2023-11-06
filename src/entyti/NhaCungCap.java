package entity;

public class NhaCungCap {
	private String maNCC;
    private String tenNCC;
    private String diaChi;
    
	public NhaCungCap() {
		super();
	}

	public NhaCungCap(String maNCC, String tenNCC, String diaChi) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.diaChi = diaChi;
	}

	public NhaCungCap(String tenNCC, String diaChi) {
		super();
		this.tenNCC = tenNCC;
		this.diaChi = diaChi;
	}

	public String getMaNCC() {
		return maNCC;
	}

	public void setMaNCC(String maNCC) {
		this.maNCC = maNCC;
	}

	public String getTenNCC() {
		return tenNCC;
	}

	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
    
    
}
