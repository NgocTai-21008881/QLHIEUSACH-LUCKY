/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.ChiTietPhieuNhapDAO;
import dao.NhaCungCapDAO;
import dao.PhieuNhapDAO;
import dao.SanPhamDAO;
import entity.ChiTietPhieuNhap;
import entity.NhaCungCap;
import entity.PhieuNhap;
import entity.SanPham;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.text.NumberFormat;
import java.time.LocalDate;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Tab_NhapHang extends javax.swing.JPanel {

    PhieuNhapDAO phieuNhap_DAO = new PhieuNhapDAO();
    ChiTietPhieuNhapDAO ctpn_DAO = new ChiTietPhieuNhapDAO();
    SanPhamDAO sanPham_DAO = new SanPhamDAO();
    NhaCungCapDAO nhaCungCap_DAO = new NhaCungCapDAO();
    DefaultTableModel dtm = null;
    double tongTien = 0;

    /**
     * Creates new form Tab_Sach
     */
    public Tab_NhapHang() {
        initComponents();
        PhieuNhap pn = new PhieuNhap();
        jTextFieldMaPhieuNhap.setText(pn.getMaPhieuNhap());
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        jTextFieldNgayNhap.setText(date.toString());
        loadTblSanPham();
    }

    // clear table sản phẩm
    public void clearTableSanPham() {
        dtm = (DefaultTableModel) jTable_DanhSachSanPham.getModel();
        dtm.setRowCount(0);
    }

    //load table phiếu nhập
    public void loadTblSanPham() {
        clearTableSanPham();
        phieuNhap_DAO = new PhieuNhapDAO();
        dtm = (DefaultTableModel) jTable_DanhSachSanPham.getModel();
        ArrayList<SanPham> listSanPham = sanPham_DAO.getAllSanPham();
        for (SanPham sanPham : listSanPham) {
            Object[] rowData = {sanPham.getMaSP(), sanPham.getTenSP(), sanPham.getLoaiSP(), sanPham.getSoLuongTK(), sanPham.getDonGiaBan() / 2, sanPham.getNhaCungCap().getTenNCC()};
            dtm.addRow(rowData);
        }
    }

    //clear table sản phẩm
    public void clearTableChiTietPhieuNhap() {
        dtm = (DefaultTableModel) jTable_ChiTietPhieuNhap.getModel();
        dtm.setRowCount(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelThongTinNhap = new javax.swing.JPanel();
        jLabelNgayNhap = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        jLabelTimKiem = new javax.swing.JLabel();
        jLabelMaPhieuNhap = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jTextFieldNgayNhap = new javax.swing.JTextField();
        jLabelDonGiaMua = new javax.swing.JLabel();
        jTextFieldSoLuong = new javax.swing.JTextField();
        jLabelMaPhieuNhap2 = new javax.swing.JLabel();
        jTextFieldDonGiaMua = new javax.swing.JTextField();
        jLabelMaSP = new javax.swing.JLabel();
        jTextFieldMaSP = new javax.swing.JTextField();
        jLabelTenSP = new javax.swing.JLabel();
        jTextFieldTenSP = new javax.swing.JTextField();
        jLabelLoaiSP = new javax.swing.JLabel();
        jComboBoxLoaiSP = new javax.swing.JComboBox<>();
        jTextFieldMaPhieuNhap = new javax.swing.JTextField();
        jLabelQuanLyPhieuNhap = new javax.swing.JLabel();
        jPanelDanhSachSanPham = new javax.swing.JPanel();
        jScrollPaneChiTietHoaDon = new javax.swing.JScrollPane();
        jTable_DanhSachSanPham = new javax.swing.JTable();
        jPanelChiTietPhieuNhap = new javax.swing.JPanel();
        jScrollPaneChiTietPhieuNhap = new javax.swing.JScrollPane();
        jTable_ChiTietPhieuNhap = new javax.swing.JTable();
        btnXoaSP = new javax.swing.JButton();
        btnXoaAll = new javax.swing.JButton();
        jLabelTongTien = new javax.swing.JLabel();
        jTextFieldTongTien = new javax.swing.JTextField();
        btnNhapHang = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jTextFieldChange = new javax.swing.JTextField();
        jButtonXacNhan = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1260, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelThongTinNhap.setBackground(new java.awt.Color(255, 255, 255));
        jPanelThongTinNhap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelThongTinNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNgayNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNgayNhap.setText("NGÀY NHẬP:");
        jPanelThongTinNhap.add(jLabelNgayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 40));

        btnTimKiem.setBackground(new java.awt.Color(255, 153, 0));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("TÌM KIẾM");
        btnTimKiem.setBorder(null);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanelThongTinNhap.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 100, 140, 30));

        jLabelTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTimKiem.setForeground(new java.awt.Color(255, 153, 0));
        jLabelTimKiem.setText("Tìm kiếm:");
        jPanelThongTinNhap.add(jLabelTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 90, 30));

        jLabelMaPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMaPhieuNhap.setText("MÃ PHIẾU NHẬP:");
        jPanelThongTinNhap.add(jLabelMaPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 40));

        btnThem.setBackground(new java.awt.Color(255, 102, 102));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Add-icon.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.setBorder(null);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanelThongTinNhap.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 30));

        btnLamMoi.setBackground(new java.awt.Color(102, 255, 102));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Refresh-icon.png"))); // NOI18N
        btnLamMoi.setText("LÀM MỚI");
        btnLamMoi.setBorder(null);
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        jPanelThongTinNhap.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, -1));

        jTextFieldNgayNhap.setEditable(false);
        jTextFieldNgayNhap.setEnabled(false);
        jPanelThongTinNhap.add(jTextFieldNgayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 260, 30));

        jLabelDonGiaMua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDonGiaMua.setText("ĐƠN GIÁ MUA");
        jPanelThongTinNhap.add(jLabelDonGiaMua, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 110, 40));
        jPanelThongTinNhap.add(jTextFieldSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 260, 30));

        jLabelMaPhieuNhap2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMaPhieuNhap2.setText("SỐ LƯỢNG");
        jPanelThongTinNhap.add(jLabelMaPhieuNhap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 140, 40));

        jTextFieldDonGiaMua.setEnabled(false);
        jPanelThongTinNhap.add(jTextFieldDonGiaMua, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 260, 30));

        jLabelMaSP.setText("MÃ SẢN PHẨM");
        jPanelThongTinNhap.add(jLabelMaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));
        jPanelThongTinNhap.add(jTextFieldMaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 190, 30));

        jLabelTenSP.setText("TÊN SẢN PHẨM");
        jPanelThongTinNhap.add(jLabelTenSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, -1, -1));
        jPanelThongTinNhap.add(jTextFieldTenSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 190, 30));

        jLabelLoaiSP.setText("LOẠI SẢN PHẨM");
        jPanelThongTinNhap.add(jLabelLoaiSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, -1, -1));

        jComboBoxLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại", "Sách", "Văn Phòng Phẩm" }));
        jComboBoxLoaiSP.setName(""); // NOI18N
        jPanelThongTinNhap.add(jComboBoxLoaiSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 170, 30));

        jTextFieldMaPhieuNhap.setEditable(false);
        jTextFieldMaPhieuNhap.setEnabled(false);
        jPanelThongTinNhap.add(jTextFieldMaPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 260, 30));

        add(jPanelThongTinNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1260, 140));

        jLabelQuanLyPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));
        jLabelQuanLyPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelQuanLyPhieuNhap.setForeground(new java.awt.Color(255, 51, 0));
        jLabelQuanLyPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQuanLyPhieuNhap.setText("QUẢN LÝ NHẬP HÀNG");
        add(jLabelQuanLyPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 40));

        jPanelDanhSachSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder("DANH SÁCH SẢN PHẨM"));
        jPanelDanhSachSanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_DanhSachSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SP", "TÊN SP", "LOẠI SP", "SỐ LƯỢNG TK", "ĐƠN GIÁ", "NHÀ CUNG CẤP"
            }
        ));
        jTable_DanhSachSanPham.setRowHeight(30);
        jTable_DanhSachSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_DanhSachSanPhamMousePressed(evt);
            }
        });
        jScrollPaneChiTietHoaDon.setViewportView(jTable_DanhSachSanPham);

        jPanelDanhSachSanPham.add(jScrollPaneChiTietHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1250, 140));

        add(jPanelDanhSachSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1270, 170));

        jPanelChiTietPhieuNhap.setBorder(javax.swing.BorderFactory.createTitledBorder("CHI TIẾT PHIẾU NHẬP"));
        jPanelChiTietPhieuNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_ChiTietPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SP", "TÊN SP", "LOẠI SẢN PHẨM", "SỐ LƯỢNG", "ĐƠN GIÁ", "THÀNH TIỀN"
            }
        ));
        jTable_ChiTietPhieuNhap.setRowHeight(30);
        jTable_ChiTietPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_ChiTietPhieuNhapMousePressed(evt);
            }
        });
        jScrollPaneChiTietPhieuNhap.setViewportView(jTable_ChiTietPhieuNhap);

        jPanelChiTietPhieuNhap.add(jScrollPaneChiTietPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 860, 140));

        btnXoaSP.setBackground(new java.awt.Color(153, 255, 204));
        btnXoaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_maintenance_30px.png"))); // NOI18N
        btnXoaSP.setText("XOÁ SẢN PHẨM");
        btnXoaSP.setBorder(null);
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });
        jPanelChiTietPhieuNhap.add(btnXoaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 170, 40));

        btnXoaAll.setBackground(new java.awt.Color(153, 255, 204));
        btnXoaAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaAll.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_maintenance_30px.png"))); // NOI18N
        btnXoaAll.setText("XOÁ TẤT CẢ");
        btnXoaAll.setBorder(null);
        btnXoaAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaAllActionPerformed(evt);
            }
        });
        jPanelChiTietPhieuNhap.add(btnXoaAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, 170, 40));

        jLabelTongTien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTongTien.setText("TỔNG TIỀN");
        jPanelChiTietPhieuNhap.add(jLabelTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 120, 30));

        jTextFieldTongTien.setEditable(false);
        jPanelChiTietPhieuNhap.add(jTextFieldTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 180, 30));

        btnNhapHang.setBackground(new java.awt.Color(255, 102, 102));
        btnNhapHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhapHang.setForeground(new java.awt.Color(255, 255, 255));
        btnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Add-icon.png"))); // NOI18N
        btnNhapHang.setText("NHẬP HÀNG");
        btnNhapHang.setBorder(null);
        btnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHangActionPerformed(evt);
            }
        });
        jPanelChiTietPhieuNhap.add(btnNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 120, 170, 30));

        jButtonT.setText("+");
        jButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTActionPerformed(evt);
            }
        });
        jPanelChiTietPhieuNhap.add(jButtonT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 40, -1));

        jButtonG.setText("-");
        jButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGActionPerformed(evt);
            }
        });
        jPanelChiTietPhieuNhap.add(jButtonG, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 40, -1));
        jPanelChiTietPhieuNhap.add(jTextFieldChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 30, 90, -1));

        jButtonXacNhan.setBackground(new java.awt.Color(255, 102, 102));
        jButtonXacNhan.setText("Xác nhận");
        jButtonXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXacNhanActionPerformed(evt);
            }
        });
        jPanelChiTietPhieuNhap.add(jButtonXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, -1, -1));

        add(jPanelChiTietPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1260, 170));
    }// </editor-fold>//GEN-END:initComponents
    private int tongsoluong = 0;
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {
            if (kiemTraHopLe() == true) {
                int soLuong = Integer.parseInt(jTextFieldSoLuong.getText());
                double donGiaMua = Double.parseDouble(jTextFieldDonGiaMua.getText());
                DefaultTableModel dtmDSSP = (DefaultTableModel) jTable_DanhSachSanPham.getModel();
                int row = jTable_DanhSachSanPham.getSelectedRow();

                String maSP = dtmDSSP.getValueAt(row, 0).toString();
                SanPham sp = sanPham_DAO.getSanPhamById(maSP);

                DefaultTableModel dtmCTPN = (DefaultTableModel) jTable_ChiTietPhieuNhap.getModel();
                double tien = 0;
                int tang = 0;
                int check = 0;
                int checkSL = 0;
                for (int i = 0; i < dtmCTPN.getRowCount(); i++) {
                    if (sp.getMaSP().equals(jTable_ChiTietPhieuNhap.getValueAt(i, 0).toString())) {
                        int slhc = Integer.parseInt(dtmCTPN.getValueAt(i, 3).toString());
                        tongsoluong = slhc + soLuong;
                        check = i;
                        tang = 1;
                        break;
                    }
                }
                if (checkSL == 0) {
                    if (tang == 0) {
                        if (Double.parseDouble(dtmDSSP.getValueAt(row, 4).toString()) == 0) {
                            Double donGia = Double.parseDouble(jTextFieldDonGiaMua.getText());
                            Object[] rowData = {sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), soLuong, donGia, soLuong * donGia};
                            dtmCTPN.addRow(rowData);
                        } else {
                            Object[] rowData = {sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), soLuong, sp.getDonGiaBan(), soLuong * sp.getDonGiaBan()};
                            dtmCTPN.addRow(rowData);
                        }

                    } else {
                        dtmCTPN.setValueAt(tongsoluong, check, 3);
                        dtmCTPN.setValueAt(tongsoluong * sp.getDonGiaBan(), check, 5);
                        tang = 0;
                    }
                }
                tinhTongTien();
                lamMoi();
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        lamMoi();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        clearTableSanPham();
        String maSP = jTextFieldMaSP.getText().toString().trim();
        String tenSP = jTextFieldTenSP.getText().toString().trim();
        String loaiSP = null;
        if (jComboBoxLoaiSP.getSelectedIndex() == 1) {
            loaiSP = "Sách";
        } else if (jComboBoxLoaiSP.getSelectedIndex() == 2) {
            loaiSP = "VPP";
        } else {
            loaiSP = "";
        }
        dtm = (DefaultTableModel) jTable_DanhSachSanPham.getModel();
        ArrayList<SanPham> listSanPham = sanPham_DAO.getAllSanPham();
        for (SanPham sanPham : listSanPham) {
            if (sanPham.getMaSP().contains(maSP) && sanPham.getTenSP().contains(tenSP) && sanPham.getLoaiSP().contains(loaiSP)) {
                Object[] rowData = {sanPham.getMaSP(), sanPham.getTenSP(), sanPham.getLoaiSP(), sanPham.getSoLuongTK(), sanPham.getDonGiaBan(), sanPham.getNhaCungCap().getTenNCC()};
                dtm.addRow(rowData);
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jTable_DanhSachSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DanhSachSanPhamMousePressed
        // TODO add your handling code here:
        int row = jTable_DanhSachSanPham.getSelectedRow();
        dtm = (DefaultTableModel) jTable_DanhSachSanPham.getModel();
        double donGia = Double.parseDouble(dtm.getValueAt(row, 4).toString());
        if (donGia > 0) {
            jTextFieldDonGiaMua.setText(String.valueOf(donGia));
            jTextFieldDonGiaMua.setEnabled(false);
            jTextFieldDonGiaMua.setEditable(false);
        } else {
            jTextFieldDonGiaMua.setText("");
            jTextFieldDonGiaMua.setEnabled(true);
            jTextFieldDonGiaMua.setEditable(true);
        }
    }//GEN-LAST:event_jTable_DanhSachSanPhamMousePressed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtmCTPN = (DefaultTableModel) jTable_ChiTietPhieuNhap.getModel();
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        PhieuNhap pn = new PhieuNhap(jTextFieldMaPhieuNhap.getText(), date);
        phieuNhap_DAO.addPhieuNhap(pn);
        if (kiemTraHopLeNhapHang()) {
            for (int i = 0; i < jTable_ChiTietPhieuNhap.getRowCount(); i++) {
                String maSP = dtmCTPN.getValueAt(i, 0).toString();
                SanPham sp = sanPham_DAO.getSanPhamById(maSP);
                int soLuong = Integer.parseInt(dtmCTPN.getValueAt(i, 3).toString());
                double donGiaMua = Double.parseDouble(dtmCTPN.getValueAt(i, 4).toString());
                sp.setSoLuongTK(soLuong + sp.getSoLuongTK());
                if (sp.getDonGiaBan() == 0) {
                    sp.setDonGiaBan(donGiaMua * 2);
                    sanPham_DAO.capNhatGiaBan(sp);
                }
                ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(sp, pn, soLuong, donGiaMua);
                ctpn_DAO.addChiTietPhieuNhap(ctpn);
                sanPham_DAO.capNhatSoLuong(sp);
            }
            ArrayList<ChiTietPhieuNhap> listCTPN = ctpn_DAO.getCTPNById(pn.getMaPhieuNhap());
            xuatPhieuNhap(pn, listCTPN);
            openPhieuNhap(pn.getMaPhieuNhap());
            clearTableChiTietPhieuNhap();
            lamMoi();
            PhieuNhap pnnew = new PhieuNhap();
            jTextFieldMaPhieuNhap.setText(pnnew.getMaPhieuNhap());
            tongTien = 0;
            jTextFieldTongTien.setText("");
        }
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        // TODO add your handling code here:
        int row = jTable_ChiTietPhieuNhap.getSelectedRow();
        DefaultTableModel dtmCTPN = (DefaultTableModel) jTable_ChiTietPhieuNhap.getModel();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần xoá");
        } else {
            dtmCTPN.removeRow(row);
        }
        tinhTongTien();

    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void btnXoaAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaAllActionPerformed
        // TODO add your handling code here:
        clearTableChiTietPhieuNhap();
        jTextFieldTongTien.setText("");
    }//GEN-LAST:event_btnXoaAllActionPerformed

    private void jButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGActionPerformed
        // TODO add your handling code here:
        try {
            int row = jTable_ChiTietPhieuNhap.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần thay đổi");
            }
            int giam = Integer.parseInt(jTextFieldChange.getText()) - 1;
            jTextFieldChange.setText(String.valueOf(giam));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonGActionPerformed

    private void jButtonXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXacNhanActionPerformed
        // TODO add your handling code here:
        try {
            int check = 0;
            int row = jTable_ChiTietPhieuNhap.getSelectedRow();
            DefaultTableModel dtmNhap = (DefaultTableModel) jTable_ChiTietPhieuNhap.getModel();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần thay đổi");
            } else {
                ArrayList<SanPham> listSanPham = sanPham_DAO.getAllSanPham();
                int soLuong = Integer.parseInt(jTextFieldChange.getText());
                if (soLuong < 1) {
                    int option = JOptionPane.showConfirmDialog(null, "Số lượng nhập nhỏ hơn 1 nên sản phẩm sẽ bị xoá. Bạn chắc chứ?");
                    if (option == JOptionPane.YES_OPTION) {
                        dtmNhap.removeRow(row);
                        JOptionPane.showMessageDialog(null, "Xoá thành công");
                    } else {
                        check = 1;
                    }
                }
                if (check == 0) {
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                    dtmNhap.setValueAt(soLuong, row, 3);
                    double donGia = Double.parseDouble(dtmNhap.getValueAt(row, 4).toString());
                    int sl = Integer.parseInt(dtmNhap.getValueAt(row, 3).toString());
                    double thanhTien = sl * donGia;
                    dtmNhap.setValueAt(thanhTien, row, 5);
                    tinhTongTien();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Số lượng thay đổi phải là 1 con số");
        }
    }//GEN-LAST:event_jButtonXacNhanActionPerformed

    private void jTable_ChiTietPhieuNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ChiTietPhieuNhapMousePressed
        // TODO add your handling code here:
        int row = jTable_ChiTietPhieuNhap.getSelectedRow();
        DefaultTableModel dtmBan = (DefaultTableModel) jTable_ChiTietPhieuNhap.getModel();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần thay đổi");
        }
        jTextFieldChange.setText(dtmBan.getValueAt(row, 3).toString());
    }//GEN-LAST:event_jTable_ChiTietPhieuNhapMousePressed

    private void jButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTActionPerformed
        // TODO add your handling code here:
        try {
            int row = jTable_ChiTietPhieuNhap.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần thay đổi");
            }
            int tang = Integer.parseInt(jTextFieldChange.getText()) + 1;
            jTextFieldChange.setText(String.valueOf(tang));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonTActionPerformed

    private void tinhTongTien() {
        DefaultTableModel dtmNhap = (DefaultTableModel) jTable_ChiTietPhieuNhap.getModel();
        double tien = 0;
        for (int i = 0; i < dtmNhap.getRowCount(); i++) {
            tien += Double.parseDouble(dtmNhap.getValueAt(i, 5).toString());
        }
        tongTien = tien;
        jTextFieldTongTien.setText(NumberFormat.getInstance().format(tongTien));
        jTextFieldDonGiaMua.setText("");
        jTextFieldSoLuong.setText("");
        jTextFieldChange.setText("");
        jTable_DanhSachSanPham.clearSelection();
        jTable_ChiTietPhieuNhap.clearSelection();
    }

    private void lamMoi() {
        jTextFieldDonGiaMua.setText("");
        jTextFieldSoLuong.setText("");
        jTextFieldMaSP.setText("");
        jTextFieldTenSP.setText("");
        jTextFieldDonGiaMua.setEnabled(false);
        jTextFieldDonGiaMua.setEditable(false);
        jComboBoxLoaiSP.setSelectedIndex(0);
        jTable_DanhSachSanPham.clearSelection();
        jTable_ChiTietPhieuNhap.clearSelection();
        jTextFieldChange.setText("");
    }

    private boolean kiemTraHopLe() {
        int row = jTable_DanhSachSanPham.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần nhập");
            return false;
        }
        if (jTextFieldDonGiaMua.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đơn giá mua sản phẩm cần nhập");
            return false;
        }

        if (jTextFieldSoLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng sản phẩm cần nhập");
            return false;
        }

        try {
            double donGiaMua = Double.parseDouble(jTextFieldDonGiaMua.getText());
            if (donGiaMua <= 0) {
                JOptionPane.showMessageDialog(null, "Đơn giá mua phải lớn hơn 0");
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đơn giá mua phải là 1 con số lớn hơn 0");
            return false;
        }

        try {
            int soLuong = Integer.parseInt(jTextFieldSoLuong.getText());
            if (soLuong < 1) {
                JOptionPane.showMessageDialog(null, "Số lượng phải từ 1 trở lên");
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Số lượng phải là 1 con số lớn hơn 0");
            return false;
        }
        return true;
    }

    private boolean kiemTraHopLeNhapHang() {
        if (jTable_ChiTietPhieuNhap.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa có thông tin sản phẩm nhập");
            return false;
        }

        return true;
    }

    private void xuatPhieuNhap(PhieuNhap pn, ArrayList<ChiTietPhieuNhap> listCTPN) {
        try {
            File file = new File("");
            String path = file.getAbsolutePath();
            String pathFull = "/" + path + "/" + pn.getMaPhieuNhap() + ".pdf";
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(pathFull));
            document.open();

            Font font = FontFactory.getFont("src/Font/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Paragraph paragraph = new Paragraph("Phiếu nhập hàng", font);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));

            // Bảng phiếu nhập
            PdfPTable tablePhieuNhap = new PdfPTable(1);
            tablePhieuNhap.setWidthPercentage(100);
            tablePhieuNhap.setSpacingBefore(10f);
            tablePhieuNhap.setSpacingAfter(10f);

            float[] columnWidths = {1f};
            tablePhieuNhap.setWidths(columnWidths);

            PdfPCell cellMaHD = new PdfPCell(new Paragraph("Mã phiếu nhập : " + pn.getMaPhieuNhap(), font));
            cellMaHD.setBorderColor(BaseColor.WHITE);
            tablePhieuNhap.addCell(cellMaHD);

            PdfPCell cellNgayLapHD = new PdfPCell(new Paragraph("Ngầy nhập : " + pn.getNgayNhap(), font));
            cellNgayLapHD.setBorderColor(BaseColor.WHITE);
            tablePhieuNhap.addCell(cellNgayLapHD);

            PdfPCell cellTongTien = new PdfPCell(new Paragraph("Tồng tiền : " + String.valueOf(tongTien), font));
            cellTongTien.setBorderColor(BaseColor.WHITE);
            tablePhieuNhap.addCell(cellTongTien);

            PdfPCell cellTitleCTPN = new PdfPCell(new Paragraph("Chi tiết phiếu nhập", font));
            cellTitleCTPN.setBorderColor(BaseColor.WHITE);
            tablePhieuNhap.addCell(cellTitleCTPN);

            document.add(tablePhieuNhap);
            // Bảng chi tiết phiếu nhập
            PdfPTable tableCTHD = new PdfPTable(6);
            tableCTHD.setWidthPercentage(100);
            tableCTHD.setSpacingBefore(10f);
            tableCTHD.setSpacingAfter(10f);
            float[] columnWidths1 = {1f, 1f, 1f, 1f, 1f, 1f};
            tableCTHD.setWidths(columnWidths1);

            PdfPCell cellMaSP = new PdfPCell(new Paragraph("Mã sản phẩm", font));
            cellMaSP.setBorderColor(BaseColor.BLACK);
            tableCTHD.addCell(cellMaSP);

            PdfPCell cellTenSP = new PdfPCell(new Paragraph("Tên sản phẩm", font));
            cellTenSP.setBorderColor(BaseColor.BLACK);
            tableCTHD.addCell(cellTenSP);

            PdfPCell cellLoaiSP = new PdfPCell(new Paragraph("Loại sản phẩm", font));
            cellLoaiSP.setBorderColor(BaseColor.BLACK);
            tableCTHD.addCell(cellLoaiSP);

            PdfPCell cellSoLuong = new PdfPCell(new Paragraph("Số lượng", font));
            cellSoLuong.setBorderColor(BaseColor.BLACK);
            tableCTHD.addCell(cellSoLuong);

            PdfPCell cellDonGia = new PdfPCell(new Paragraph("Đơn giá", font));
            cellDonGia.setBorderColor(BaseColor.BLACK);
            tableCTHD.addCell(cellDonGia);

            PdfPCell cellThanhTien = new PdfPCell(new Paragraph("Thành tiền", font));
            cellThanhTien.setBorderColor(BaseColor.BLACK);
            tableCTHD.addCell(cellThanhTien);
            for (ChiTietPhieuNhap ctpn : listCTPN) {
                PdfPCell cell1 = new PdfPCell(new Paragraph(ctpn.getSanPham().getMaSP(), font));
                cell1.setBorderColor(BaseColor.BLACK);
                cell1.setHorizontalAlignment(5);
                cell1.setVerticalAlignment(5);
                tableCTHD.addCell(cell1);

                PdfPCell cell2 = new PdfPCell(new Paragraph(String.valueOf(ctpn.getSanPham().getTenSP()), font));
                cell2.setBorderColor(BaseColor.BLACK);
                cell2.setHorizontalAlignment(5);
                cell2.setVerticalAlignment(5);
                tableCTHD.addCell(cell2);

                PdfPCell cell3 = new PdfPCell(new Paragraph(String.valueOf(ctpn.getSanPham().getLoaiSP()), font));
                cell3.setBorderColor(BaseColor.BLACK);
                cell3.setHorizontalAlignment(5);
                cell3.setVerticalAlignment(5);
                tableCTHD.addCell(cell3);

                PdfPCell cell4 = new PdfPCell(new Paragraph(String.valueOf(ctpn.getSoLuong()), font));
                cell4.setBorderColor(BaseColor.BLACK);
                cell4.setHorizontalAlignment(5);
                cell4.setVerticalAlignment(5);
                tableCTHD.addCell(cell4);

                PdfPCell cell5 = new PdfPCell(new Paragraph(String.valueOf(ctpn.getSanPham().getDonGiaBan() / 2), font));
                cell5.setBorderColor(BaseColor.BLACK);
                cell5.setHorizontalAlignment(5);
                cell5.setVerticalAlignment(5);
                tableCTHD.addCell(cell5);

                PdfPCell cell6 = new PdfPCell(new Paragraph(String.valueOf(ctpn.thanhTien()), font));
                cell6.setBorderColor(BaseColor.BLACK);
                cell6.setHorizontalAlignment(5);
                cell6.setVerticalAlignment(5);
                tableCTHD.addCell(cell6);
            }
            document.add(tableCTHD);
            JOptionPane.showMessageDialog(null, "Nhập hàng thành công");
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void openPhieuNhap(String maPhieuNhap) {
        File file = new File("");
        String path = file.getAbsolutePath();
        File URL = new File("/" + path + "/" + maPhieuNhap + ".pdf");
        try {
            Desktop.getDesktop().open(URL);
        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnNhapHang;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaAll;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonGiam;
    private javax.swing.JButton jButtonGiam1;
    private javax.swing.JButton jButtonGiam2;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonXacNhan;
    private javax.swing.JComboBox<String> jComboBoxLoaiSP;
    private javax.swing.JLabel jLabelDonGiaMua;
    private javax.swing.JLabel jLabelLoaiSP;
    private javax.swing.JLabel jLabelMaPhieuNhap;
    private javax.swing.JLabel jLabelMaPhieuNhap2;
    private javax.swing.JLabel jLabelMaSP;
    private javax.swing.JLabel jLabelNgayNhap;
    private javax.swing.JLabel jLabelQuanLyPhieuNhap;
    private javax.swing.JLabel jLabelTenSP;
    private javax.swing.JLabel jLabelTimKiem;
    private javax.swing.JLabel jLabelTongTien;
    private javax.swing.JPanel jPanelChiTietPhieuNhap;
    private javax.swing.JPanel jPanelDanhSachSanPham;
    private javax.swing.JPanel jPanelThongTinNhap;
    private javax.swing.JScrollPane jScrollPaneChiTietHoaDon;
    private javax.swing.JScrollPane jScrollPaneChiTietPhieuNhap;
    private javax.swing.JTable jTable_ChiTietPhieuNhap;
    private javax.swing.JTable jTable_DanhSachSanPham;
    private javax.swing.JTextField jTextFieldChange;
    private javax.swing.JTextField jTextFieldDonGiaMua;
    private javax.swing.JTextField jTextFieldMaPhieuNhap;
    private javax.swing.JTextField jTextFieldMaSP;
    private javax.swing.JTextField jTextFieldNgayNhap;
    private javax.swing.JTextField jTextFieldSoLuong;
    private javax.swing.JTextField jTextFieldTenSP;
    private javax.swing.JTextField jTextFieldTongTien;
    // End of variables declaration//GEN-END:variables
}
