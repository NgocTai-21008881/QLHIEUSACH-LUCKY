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
import dao.PhieuNhapDAO;
import entity.ChiTietPhieuNhap;
import entity.PhieuNhap;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author LENOVO
 */
public class Tab_PhieuNhap extends javax.swing.JPanel {

    /**
     * Creates new form Tab_Sach
     */
    private PhieuNhapDAO phieuNhap_DAO = new PhieuNhapDAO();
    private ChiTietPhieuNhapDAO ctpn_DAO = new ChiTietPhieuNhapDAO();
    DefaultTableModel dtm = null;

    public Tab_PhieuNhap() {
        initComponents();
        loadTblPhieuNhap();
    }

    // clear table phiếu nhập
    public void clearTablePhieuNhap() {
        dtm = (DefaultTableModel) jTable_DanhSachPhieuNhap.getModel();
        dtm.setRowCount(0);
    }

    //load table phiếu nhập
    public void loadTblPhieuNhap() {
        clearTablePhieuNhap();
        phieuNhap_DAO = new PhieuNhapDAO();
        dtm = (DefaultTableModel) jTable_DanhSachPhieuNhap.getModel();
        ArrayList<PhieuNhap> listPhieuNhap = phieuNhap_DAO.getAllPhieuNhap();
        for (PhieuNhap phieuNhap : listPhieuNhap) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(phieuNhap.getNgayNhap());
            Object[] rowData = {phieuNhap.getMaPhieuNhap(), date, phieuNhap.tongTien()};
            dtm.addRow(rowData);
        }

    }

    //clear table sản phẩm
    public void clearTableChiTietPhieuNhap() {
        dtm = (DefaultTableModel) jTable_ChiTietPhieuNhap.getModel();
        dtm.setRowCount(0);
    }

    //load table sản phẩm
    public void loadTblChiTietPhieuNhap(String id) {
        clearTableChiTietPhieuNhap();
        dtm = (DefaultTableModel) jTable_ChiTietPhieuNhap.getModel();
        ArrayList<ChiTietPhieuNhap> listCTPN = getListChiTietPhieuNhapByPhieuNhap(id);
        for (ChiTietPhieuNhap chiTietPhieuNhap : listCTPN) {
            Object[] rowData = {chiTietPhieuNhap.getSanPham().getMaSP(), chiTietPhieuNhap.getSanPham().getTenSP(), chiTietPhieuNhap.getSanPham().getLoaiSP(), chiTietPhieuNhap.getSoLuong(), chiTietPhieuNhap.getDonGiaMua(), chiTietPhieuNhap.thanhTien()};
            dtm.addRow(rowData);
        }

    }

    public ArrayList<ChiTietPhieuNhap> getListChiTietPhieuNhapByPhieuNhap(String id) {
        ctpn_DAO = new ChiTietPhieuNhapDAO();
        return ctpn_DAO.getCTPNById(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelQuanLyPhieuNhap = new javax.swing.JLabel();
        jPanelThongTinPhieuNhap = new javax.swing.JPanel();
        jScrollPanePhieuNhap = new javax.swing.JScrollPane();
        jTable_DanhSachPhieuNhap = new javax.swing.JTable();
        jPanelChiTietPhieuNhap = new javax.swing.JPanel();
        jScrollPaneChiTietPhieuNhap = new javax.swing.JScrollPane();
        jTable_ChiTietPhieuNhap = new javax.swing.JTable();
        jPanelThongTinTimKiem = new javax.swing.JPanel();
        jButtonAll = new javax.swing.JButton();
        jLabelFrom = new javax.swing.JLabel();
        jDateChooserFrom = new com.toedter.calendar.JDateChooser();
        jLabelTo = new javax.swing.JLabel();
        jDateChooserTo = new com.toedter.calendar.JDateChooser();
        btnTimKiem = new javax.swing.JButton();
        btnXuatChiTietPhieuNhap = new javax.swing.JButton();
        btnXuatDanhSachPhieuNhap = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1260, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelQuanLyPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));
        jLabelQuanLyPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelQuanLyPhieuNhap.setForeground(new java.awt.Color(255, 51, 0));
        jLabelQuanLyPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQuanLyPhieuNhap.setText("QUẢN LÝ PHIẾU NHẬP");
        add(jLabelQuanLyPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 30));

        jPanelThongTinPhieuNhap.setBorder(javax.swing.BorderFactory.createTitledBorder("THÔNG TIN PHIẾU NHẬP"));
        jPanelThongTinPhieuNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_DanhSachPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ PHIẾU NHẬP", "NGÀY NHẬP", "TỔNG TIỀN"
            }
        ));
        jTable_DanhSachPhieuNhap.setRowHeight(30);
        jTable_DanhSachPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_DanhSachPhieuNhapMousePressed(evt);
            }
        });
        jScrollPanePhieuNhap.setViewportView(jTable_DanhSachPhieuNhap);

        jPanelThongTinPhieuNhap.add(jScrollPanePhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1230, 150));

        add(jPanelThongTinPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1270, 190));

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
        jScrollPaneChiTietPhieuNhap.setViewportView(jTable_ChiTietPhieuNhap);

        jPanelChiTietPhieuNhap.add(jScrollPaneChiTietPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1230, 120));

        add(jPanelChiTietPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1270, 150));

        jPanelThongTinTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        jPanelThongTinTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder("THÔNG TIN TÌM KIẾM"));
        jPanelThongTinTimKiem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAll.setText("ALL");
        jButtonAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });
        jPanelThongTinTimKiem.add(jButtonAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 40));

        jLabelFrom.setText("TỪ NGÀY:");
        jPanelThongTinTimKiem.add(jLabelFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 70, 40));
        jPanelThongTinTimKiem.add(jDateChooserFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 260, 40));

        jLabelTo.setText("ĐẾN NGÀY:");
        jPanelThongTinTimKiem.add(jLabelTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 70, 40));
        jPanelThongTinTimKiem.add(jDateChooserTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 260, 40));

        btnTimKiem.setBackground(new java.awt.Color(255, 153, 0));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("TÌM KIẾM");
        btnTimKiem.setBorder(null);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanelThongTinTimKiem.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 190, 40));

        add(jPanelThongTinTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 910, 130));

        btnXuatChiTietPhieuNhap.setBackground(new java.awt.Color(153, 255, 204));
        btnXuatChiTietPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatChiTietPhieuNhap.setForeground(new java.awt.Color(102, 153, 255));
        btnXuatChiTietPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf-icon.png"))); // NOI18N
        btnXuatChiTietPhieuNhap.setText("XUẤT CHI TIẾT PHIẾU NHẬP");
        btnXuatChiTietPhieuNhap.setBorder(null);
        btnXuatChiTietPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatChiTietPhieuNhapActionPerformed(evt);
            }
        });
        add(btnXuatChiTietPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 280, 40));

        btnXuatDanhSachPhieuNhap.setBackground(new java.awt.Color(153, 255, 204));
        btnXuatDanhSachPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatDanhSachPhieuNhap.setForeground(new java.awt.Color(102, 153, 255));
        btnXuatDanhSachPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_ms_excel_30px.png"))); // NOI18N
        btnXuatDanhSachPhieuNhap.setText("XUẤT DANH SÁCH PHIẾU NHẬP");
        btnXuatDanhSachPhieuNhap.setBorder(null);
        btnXuatDanhSachPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatDanhSachPhieuNhapActionPerformed(evt);
            }
        });
        add(btnXuatDanhSachPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, 280, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_DanhSachPhieuNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DanhSachPhieuNhapMousePressed
        // TODO add your handling code here:
        int row = jTable_DanhSachPhieuNhap.getSelectedRow();

        DefaultTableModel dtm = (DefaultTableModel) jTable_DanhSachPhieuNhap.getModel();
        String id = dtm.getValueAt(row, 0).toString().trim();

        loadTblChiTietPhieuNhap(id);
    }//GEN-LAST:event_jTable_DanhSachPhieuNhapMousePressed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        clearTablePhieuNhap();
        clearTableChiTietPhieuNhap();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String from = formatter.format(jDateChooserFrom.getDate());
        String to = formatter.format(jDateChooserTo.getDate());
        Date ngayBatDau = Date.valueOf(from);
        Date ngayKetThuc = Date.valueOf(to);

        ArrayList<PhieuNhap> listPhieuNhap = phieuNhap_DAO.getPhieuNhapByDate(ngayBatDau, ngayKetThuc);
        DefaultTableModel dtml = (DefaultTableModel) jTable_DanhSachPhieuNhap.getModel();
        for (PhieuNhap phieuNhap : listPhieuNhap) {
            Object[] rowdata = {phieuNhap.getMaPhieuNhap(), phieuNhap.getNgayNhap(), phieuNhap.tongTien()};
            dtml.addRow(rowdata);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXuatChiTietPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatChiTietPhieuNhapActionPerformed
        // TODO add your handling code here:
        try {
            // TIêu đề
            int row = jTable_DanhSachPhieuNhap.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn hoá đơn cần xuất");
            } else {
                dtm = (DefaultTableModel) jTable_DanhSachPhieuNhap.getModel();
                String id = dtm.getValueAt(row, 0).toString();

                ArrayList<ChiTietPhieuNhap> listCTPN = getListChiTietPhieuNhapByPhieuNhap(id);
                JFileChooser pdfFileChooser = new JFileChooser();
                pdfFileChooser.setDialogTitle("Save as");
                FileNameExtensionFilter fnef = new FileNameExtensionFilter("Files", "pdf");
                pdfFileChooser.setFileFilter(fnef);
                int pdfchooser = pdfFileChooser.showSaveDialog(null);
                if (pdfchooser == JFileChooser.APPROVE_OPTION) {
                    Document document = new Document();
                    PdfWriter.getInstance(document, new FileOutputStream(pdfFileChooser.getSelectedFile() + ".pdf"));
                    document.open();

                    Paragraph paragraph = new Paragraph("Phiếu nhập hàng hàng");
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

                    PdfPCell cellMaHD = new PdfPCell(new Paragraph("Mã phiếu nhập : " + dtm.getValueAt(row, 0)));
                    cellMaHD.setBorderColor(BaseColor.WHITE);
                    tablePhieuNhap.addCell(cellMaHD);

                    PdfPCell cellNgayLapHD = new PdfPCell(new Paragraph("Ngầy nhập : " + dtm.getValueAt(row, 1)));
                    cellNgayLapHD.setBorderColor(BaseColor.WHITE);
                    tablePhieuNhap.addCell(cellNgayLapHD);

                    PdfPCell cellTongTien = new PdfPCell(new Paragraph("Tồng tiền : " + dtm.getValueAt(row, 2)));
                    cellTongTien.setBorderColor(BaseColor.WHITE);
                    tablePhieuNhap.addCell(cellTongTien);

                    PdfPCell cellTitleCTPN = new PdfPCell(new Paragraph("Chi tiết phiếu nhập"));
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

                    PdfPCell cellMaSP = new PdfPCell(new Paragraph("Mã sản phẩm"));
                    cellMaSP.setBorderColor(BaseColor.WHITE);
                    tableCTHD.addCell(cellMaSP);

                    PdfPCell cellTenSP = new PdfPCell(new Paragraph("Tên sản phẩm"));
                    cellTenSP.setBorderColor(BaseColor.WHITE);
                    tableCTHD.addCell(cellTenSP);

                    PdfPCell cellLoaiSP = new PdfPCell(new Paragraph("Loại sản phẩm"));
                    cellLoaiSP.setBorderColor(BaseColor.WHITE);
                    tableCTHD.addCell(cellLoaiSP);

                    PdfPCell cellSoLuong = new PdfPCell(new Paragraph("Số lượng"));
                    cellSoLuong.setBorderColor(BaseColor.WHITE);
                    tableCTHD.addCell(cellSoLuong);

                    PdfPCell cellDonGia = new PdfPCell(new Paragraph("Đơn giá"));
                    cellDonGia.setBorderColor(BaseColor.WHITE);
                    tableCTHD.addCell(cellDonGia);

                    PdfPCell cellThanhTien = new PdfPCell(new Paragraph("Thành tiền"));
                    cellThanhTien.setBorderColor(BaseColor.WHITE);
                    tableCTHD.addCell(cellThanhTien);
                    for (ChiTietPhieuNhap ctpn : listCTPN) {
                        PdfPCell cell1 = new PdfPCell(new Paragraph(String.valueOf(ctpn.getSanPham().getMaSP())));
                        cell1.setBorderColor(BaseColor.WHITE);
                        cell1.setHorizontalAlignment(5);
                        cell1.setVerticalAlignment(5);
                        tableCTHD.addCell(cell1);

                        PdfPCell cell2 = new PdfPCell(new Paragraph(String.valueOf(ctpn.getSanPham().getTenSP())));
                        cell2.setBorderColor(BaseColor.WHITE);
                        cell2.setHorizontalAlignment(5);
                        cell2.setVerticalAlignment(5);
                        tableCTHD.addCell(cell2);

                        PdfPCell cell3 = new PdfPCell(new Paragraph(String.valueOf(ctpn.getSanPham().getLoaiSP())));
                        cell3.setBorderColor(BaseColor.WHITE);
                        cell3.setHorizontalAlignment(5);
                        cell3.setVerticalAlignment(5);
                        tableCTHD.addCell(cell3);

                        PdfPCell cell4 = new PdfPCell(new Paragraph(String.valueOf(ctpn.getSoLuong())));
                        cell4.setBorderColor(BaseColor.WHITE);
                        cell4.setHorizontalAlignment(5);
                        cell4.setVerticalAlignment(5);
                        tableCTHD.addCell(cell4);

                        PdfPCell cell5 = new PdfPCell(new Paragraph(String.valueOf(ctpn.getSanPham().getDonGiaBan())));
                        cell5.setBorderColor(BaseColor.WHITE);
                        cell5.setHorizontalAlignment(5);
                        cell5.setVerticalAlignment(5);
                        tableCTHD.addCell(cell5);

                        PdfPCell cell6 = new PdfPCell(new Paragraph(String.valueOf(ctpn.thanhTien())));
                        cell6.setBorderColor(BaseColor.WHITE);
                        cell6.setHorizontalAlignment(5);
                        cell6.setVerticalAlignment(5);
                        tableCTHD.addCell(cell6);
                    }
                    document.add(tableCTHD);
                    JOptionPane.showMessageDialog(null, "Xuất chi tiết phiếu nhập thành công");
                    document.close();
                }

                // Bảng chi tiết hoá đơn
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXuatChiTietPhieuNhapActionPerformed

    private void btnXuatDanhSachPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatDanhSachPhieuNhapActionPerformed
        // TODO add your handling code here:
        String[] Columns = {"MÃ PHIẾU NHẬP", "NGÀY NHẬP", "TỔNG TIỀN"};
        XSSFWorkbook excelJTableExport = new XSSFWorkbook();
        XSSFSheet excelSheet = excelJTableExport.createSheet("Danh sách phiếu nhập");
        BufferedOutputStream excelBos = null;
        try {

            //Chọn nơi lưu
            JFileChooser excelFileChooser = new JFileChooser();
            //Tiêu đề ô save
            excelFileChooser.setDialogTitle("Save As ..");
            //Định dạng chỉ xls, xlsx, xlsm files
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("Files", "xls", "xlsx", "xlsm");
            excelFileChooser.setFileFilter(fnef);
            int chooser = excelFileChooser.showSaveDialog(null);
            XSSFCell excelCell = null;
            //Kiểm tra nút save nhấn chưa
            if (chooser == JFileChooser.APPROVE_OPTION) {
                //Nếu click thì đẩy dữ liệ
                //Tạo tiêu đề
                XSSFRow excelRow = excelSheet.createRow(0);
                for (int j = 0; j < jTable_DanhSachPhieuNhap.getColumnCount(); j++) {
                    excelCell = excelRow.createCell(j);
                    excelCell.setCellValue(Columns[j]);
                }
                //Vòng lặp qua cột và hàng của bảng jtable_DanhSachHoaDon để lấy giá trị
                for (int i = 1; i <= jTable_DanhSachPhieuNhap.getRowCount(); i++) {
                    excelRow = excelSheet.createRow(i);
                    for (int j = 0; j < jTable_DanhSachPhieuNhap.getColumnCount(); j++) {
                        excelCell = excelRow.createCell(j);
                        excelCell.setCellValue(jTable_DanhSachPhieuNhap.getValueAt(i - 1, j).toString());
                    }
                }
                FileOutputStream excelFos = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBos = new BufferedOutputStream(excelFos);
                excelJTableExport.write(excelBos);
                JOptionPane.showMessageDialog(null, "Xuất danh sách phiếu nhập thành công");
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                if (excelBos != null) {
                    excelBos.close();
                }
                if (excelJTableExport != null) {
                    excelJTableExport.close();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnXuatDanhSachPhieuNhapActionPerformed

    private void jButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllActionPerformed
        // TODO add your handling code here:
        loadTblPhieuNhap();
    }//GEN-LAST:event_jButtonAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXuatChiTietPhieuNhap;
    private javax.swing.JButton btnXuatDanhSachPhieuNhap;
    private javax.swing.JButton jButtonAll;
    private com.toedter.calendar.JDateChooser jDateChooserFrom;
    private com.toedter.calendar.JDateChooser jDateChooserTo;
    private javax.swing.JLabel jLabelFrom;
    private javax.swing.JLabel jLabelQuanLyPhieuNhap;
    private javax.swing.JLabel jLabelTo;
    private javax.swing.JPanel jPanelChiTietPhieuNhap;
    private javax.swing.JPanel jPanelThongTinPhieuNhap;
    private javax.swing.JPanel jPanelThongTinTimKiem;
    private javax.swing.JScrollPane jScrollPaneChiTietPhieuNhap;
    private javax.swing.JScrollPane jScrollPanePhieuNhap;
    private javax.swing.JTable jTable_ChiTietPhieuNhap;
    private javax.swing.JTable jTable_DanhSachPhieuNhap;
    // End of variables declaration//GEN-END:variables
}
