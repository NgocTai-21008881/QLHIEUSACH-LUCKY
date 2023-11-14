/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.KhachHangDAO;
import dao.NhanVienDAO;
import entity.KhachHang;
import entity.NhanVien;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author LENOVO
 */
public class QuanLyKhachHang extends javax.swing.JPanel {
	private KhachHangDAO KH_DAO = new KhachHangDAO();
	 private boolean isThemActive = false;
	    private boolean isSuaActive = false;
    /**
     * Creates new form Tab_Sach
     */
    public QuanLyKhachHang() {
        initComponents();
        loadtableKH();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(10, 110, 140, 40);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(662, 8, 60, 40);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(10, 60, 140, 40);
        txt_TimKiem = new javax.swing.JTextField();
        txt_TimKiem.setBounds(550, 87, 459, 40);
        txt_SDT = new javax.swing.JTextField();
        txt_SDT.setBounds(160, 110, 230, 40);
        txt_Email = new javax.swing.JTextField();
        txt_Email.setBounds(721, 10, 286, 40);
        btn_TimKiem = new javax.swing.JButton();
        btn_TimKiem.setBounds(1044, 84, 120, 40);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(439, 86, 70, 40);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(10, 10, 140, 40);
        txt_MaKH = new javax.swing.JTextField();
        txt_MaKH.setBounds(160, 10, 230, 40);
        btn_Them = new javax.swing.JButton();
        btn_Them.setBounds(687, 156, 120, 40);
        btn_Luu = new javax.swing.JButton();
        btn_Luu.setBounds(510, 156, 120, 40);
        btn_Sua = new javax.swing.JButton();
        btn_Sua.setBounds(865, 156, 120, 40);
        btn_LamMoi = new javax.swing.JButton();
        btn_LamMoi.setBounds(1044, 156, 120, 40);
        txt_TenKH = new javax.swing.JTextField();
        txt_TenKH.setBounds(160, 60, 230, 40);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(440, 10, 80, 40);
        combobox_giotinh = new javax.swing.JComboBox<>();
        combobox_giotinh.setBounds(550, 10, 80, 40);
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_KhachHang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1260, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("SỐ ĐIỆN THOẠI:");
        jPanel1.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("EMAIL:");
        jPanel1.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("TÊN KHÁCH HÀNG:");
        jPanel1.add(jLabel6);

        txt_TimKiem.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel1.add(txt_TimKiem);
        jPanel1.add(txt_SDT);
        jPanel1.add(txt_Email);

        btn_TimKiem.setBackground(new java.awt.Color(255, 153, 0));
        btn_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiem.setText("TÌM KIẾM");
        btn_TimKiem.setBorder(null);
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              btn_timKhachHangActionPerformed(evt);
            }
        });
        jPanel1.add(btn_TimKiem);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Tìm kiếm:");
        jPanel1.add(jLabel10);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("MÃ KHÁCH HÀNG:");
        jPanel1.add(jLabel9);
        jPanel1.add(txt_MaKH);

        btn_Them.setBackground(new java.awt.Color(255, 102, 102));
        btn_Them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Them.setForeground(new java.awt.Color(255, 255, 255));
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Add-icon.png"))); // NOI18N
        btn_Them.setText("THÊM");
        btn_Them.setBorder(null);
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               btn_themActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Them);

        btn_Luu.setBackground(new java.awt.Color(255, 51, 102));
        btn_Luu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Luu.setForeground(new java.awt.Color(255, 255, 255));
        btn_Luu.setIcon(new ImageIcon(QuanLyKhachHang.class.getResource("/Img/icons8_downloads_30px.png"))); // NOI18N
        btn_Luu.setText("LƯU");
        btn_Luu.setBorder(null);
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               try {
				btn_luuActionPerformed(evt);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });
      
        jPanel1.add(btn_Luu);

        btn_Sua.setBackground(new java.awt.Color(153, 255, 204));
        btn_Sua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_maintenance_30px.png"))); // NOI18N
        btn_Sua.setText("SỬA");
        btn_Sua.setBorder(null);
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capNhatActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Sua);

        btn_LamMoi.setBackground(new java.awt.Color(102, 255, 102));
        btn_LamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_LamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Refresh-icon.png"))); // NOI18N
        btn_LamMoi.setText("LÀM MỚI");
        btn_LamMoi.setBorder(null);
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
               btn_LamMoiActionPerformed(evt);
            }
        });
        jTable_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_danhSachKhachHangMousePressed(evt);
            }
        });
        jPanel1.add(btn_LamMoi);
        jPanel1.add(txt_TenKH);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("GIỚI TÍNH:");
        jPanel1.add(jLabel3);

        combobox_giotinh.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
        combobox_giotinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(combobox_giotinh);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1260, 220));

        jTable_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ KHÁCH HÀNG", "TÊN KHÁCH HÀNG", "SỐ ĐIỆN THOẠI", "GIỚI TÍNH", "EMAIL", 
            }
        ));
        jScrollPane1.setViewportView(jTable_KhachHang);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1260, 370));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JComboBox<String> combobox_giotinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_KhachHang;
    private javax.swing.JTextField txt_TimKiem;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_TenKH;
    private javax.swing.JTextField txt_Email;
    // End of variables declaration//GEN-END:variables
	public void clearTableKhachHang() {
	         DefaultTableModel dtm = (DefaultTableModel) jTable_KhachHang.getModel();
	        dtm.setRowCount(0);
	    }

	// load table
	public void loadtableKH()
	{
		 clearTableKhachHang();
	    KhachHangDAO KH_DAO = new KhachHangDAO();
	   DefaultTableModel  dtm = (DefaultTableModel) jTable_KhachHang.getModel();
	     ArrayList<KhachHang> listKH = KH_DAO.getAllKhachHang();
	     for (KhachHang KH : listKH) {
	    	 String gioitinh = new String();
	    	 if (KH.isGioiTinh() == true )
	    		 gioitinh = "Nam";
	    	 else gioitinh = "Nữ";
	         
	         Object[] rowData = {KH.getMaKhachHang(), KH.getTenKhachHang(),KH.getEmail(),KH.getSoDienThoai(),gioitinh};
	         dtm.addRow(rowData);
	}}

	// valid data
	private boolean validateData() {
	    String sdt = txt_SDT.getText().trim();
	    String email = txt_Email.getText().trim();
	    String HovaTen = txt_TenKH.getText().trim();
	    String manv  = txt_MaKH.getText().trim();
	    
	    
	    
	    if (txt_Email.getText().equals("") || txt_MaKH.getText().equals("") || txt_SDT.getText().equals("")
	            || txt_TenKH.getText().equals("")) {
	        JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
	        return false;
	    }
	    if (!(sdt.length() > 0 && sdt.matches("[0-9]{10}"))) {
	        JOptionPane.showMessageDialog(txt_SDT,"Số điện thoại yêu cầu phải đủ 10 số");
	        txt_SDT.requestFocus();
	        return false;
	    }
	    if (!(email.length() > 0 && email.matches("[a-zA-Z0-9._%-]+(@){1}[a-zA-Z]+(.){1}[a-zA-Z]{2,4}"))) {
	        JOptionPane.showMessageDialog(this, "Email sai định dạng");
	        txt_Email.requestFocus();
	        return false;
	    }
	    return true;
	}

	private void themKH() throws SQLException {
	    if (!validateData()) {
	        return;
	    }
	    String maKH = txt_MaKH.getText();
	    String hoVaTen = txt_TenKH.getText();
	    String email = txt_Email.getText();
	    String sdt = txt_SDT.getText();
	    boolean gioitinh = true;
	    if (KH_DAO.getKhachHangById(email) != null) {
	        JOptionPane.showMessageDialog(null, "Email đã tồn tại trong hệ thống. Vui lòng sử dụng email khác");
	        return;
	    }
	    if (KH_DAO.getKhachHangBySdt(sdt) != null) {
	        JOptionPane.showMessageDialog(null, "Số điện thoại đã tồn tại trong hệ thống. Vui lòng sử dụng sdt khác");
	        return;
	    }
	    boolean gioiTinh = combobox_giotinh.getSelectedItem() == "Nam" ? true : false;
	   KhachHang KH= new KhachHang(maKH, hoVaTen,email,sdt,gioitinh);
	    if (KH_DAO.addKhachHang(KH) != -1) {
	        loadtableKH();;
	        clearInput();
	        huyThaoTac();
	        JOptionPane.showMessageDialog(null, "Thêm thành công");
	        return;
	    }
	    else JOptionPane.showMessageDialog(null, "Thêm thất bại");
	}

	public void clearTable() {
	    DefaultTableModel dtm = (DefaultTableModel) jTable_KhachHang.getModel();
	    dtm.setRowCount(0);
	}

	private void clearInput() {
	   txt_Email.setText("");
	    txt_SDT.setText("");
	    txt_TenKH.setText("");
	    combobox_giotinh.setSelectedIndex(0);
	}

	private void isInputActive(boolean check) {
	  txt_SDT.setEnabled(check);
	    txt_Email.setEnabled(check);
	   txt_TenKH.setEnabled(check);
	   combobox_giotinh.setEnabled(check);
	   txt_MaKH.setEnabled(!check);
	}
	private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {
        clearInput();
    }

	private void isThemKhachHangClicked(boolean check) {
	    isThemActive = check;
	    isSuaActive = !check;
	    if (isThemActive) 
	    {
	        KhachHang KH = new KhachHang();
	    	txt_MaKH.setText(KH.auto_ID());
	        btn_Them.setText("Huỷ");
	        btn_Sua.setEnabled(false);
	    } else if (isSuaActive) {
	        btn_Sua.setText("Huỷ");
	        btn_Them.setEnabled(false);
	    }
	    btn_Luu.setEnabled(true);
	    isInputActive(true);
	}

	private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {
	    if (btn_Them.getText().equals("THÊM")) {
	        isThemActive = true;
	        isThemKhachHangClicked(isThemActive);
	        clearInput();
	    } else if (btn_Them.getText().equals("Huỷ")) {
	        huyThaoTac();
	    }
	}

	private void btn_timKhachHangActionPerformed(java.awt.event.ActionEvent evt) {
	   TimKiem();
	    
	}

	private void capNhatKhachHang() {
	    if (!validateData()) {
	        return;
	    }
	   KhachHang KH = KH_DAO.getKhachHangById((String) jTable_KhachHang.getValueAt(jTable_KhachHang.getSelectedRow(), 0));
	    KH.setEmail(txt_Email.getText());
	    KH.setTenKhachHang(txt_TenKH.getText());
	    KH.setSoDienThoai(txt_SDT.getText());
	   KH.setGioiTinh(combobox_giotinh.getSelectedItem().toString() == "Nam" ? true : false);
	    if (KH_DAO.updateKhachHang(KH) != -1) {
	        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
	        loadtableKH();
	        clearInput();
	        huyThaoTac();
	        return;
	    }
	    JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
	
	}

	private void tbl_danhSachKhachHangMousePressed(java.awt.event.MouseEvent evt) {
	    String id = (String) jTable_KhachHang.getValueAt(jTable_KhachHang.getSelectedRow(), 0);
	    KhachHang KH = KH_DAO.getKhachHangById(id);
	    if (KH == null) {
	        System.out.println("Không tìm thấy khách hàng");
	        return;
	    }
	    thongTinKhachHang(KH);
	}

	public void TimKiem() {
	  jTable_KhachHang.clearSelection();
	    clearTable();
	    DefaultTableModel dtm = (DefaultTableModel) jTable_KhachHang.getModel();
	    String maKH = "";
	    if (txt_TimKiem.getText().length() > 0) {
	        maKH = txt_TimKiem.getText();
	    }
	    ArrayList<KhachHang> listKH = KH_DAO.getAllKhachHang();
	    for (KhachHang KH : listKH) {
	    	String gioitinh = new String();
	    	if (KH.isGioiTinh() == true)
	    	{
	    		gioitinh = "Nam";
	    	}
	    	else gioitinh = "Nữ";
	    	
	        if (KH.getMaKhachHang().toLowerCase().contains(maKH.toLowerCase())) {
	            Object[] rowData = {KH.getMaKhachHang(),KH.getTenKhachHang(), KH.getEmail(),  KH.getEmail(),gioitinh};
	            dtm.addRow(rowData);
	        }
	
	    }
	}

	private void huyThaoTac() {
	    clearInput();
	    isSuaActive = false;
	    isThemActive = false;
	    btn_Them.setText("THÊM");
	    btn_Sua.setText("SỬA");
	    btn_Them.setEnabled(true);
	    btn_Sua.setEnabled(true);
	    btn_Luu.setEnabled(false);
	    txt_MaKH.setText("");
	    isInputActive(false);
	    jTable_KhachHang.clearSelection();
	}

	private void thongTinKhachHang(KhachHang KH) {
	 txt_MaKH.setText(KH.getMaKhachHang());
	  txt_Email.setText(KH.getEmail());
	   txt_SDT.setText(KH.getSoDienThoai());
	   combobox_giotinh.setSelectedItem(KH.isGioiTinh() == true ? "Nam" : "Nữ");
	 txt_TenKH.setText(KH.getTenKhachHang());
	   txt_Email.setText(KH.getEmail());
	}

	private void btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {
	    if (jTable_KhachHang.getSelectedRow() == -1) {
	        JOptionPane.showMessageDialog(null, "Vui lòng chọn dữ liệu để cập nhật");
	        return;
	    }
	
	    if (btn_Sua.getText().equals("SỬA")) {
	        isThemActive = false;
	        isThemKhachHangClicked(isThemActive);
	    } else if (btn_Sua.getText().equals("Huỷ")) {
	        huyThaoTac();
	    }
	}

	private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) throws SQLException  {
	    if (isThemActive) {
	        themKH();
	        clearInput();
	    } else if (isSuaActive) {
	        capNhatKhachHang();
	        clearInput();
	    }
	}
}
