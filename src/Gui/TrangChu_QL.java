/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

/**
 *
 * @author LENOVO
 */
public class TrangChu_QL extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu_QL() {
        initComponents();
        trangNen.removeAll();
        trangNen tn = new trangNen();
        trangNen.setLayout(this.getLayout());
        trangNen.add(tn);
        trangNen.revalidate();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        trangNen = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hinh-nen.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setForeground(new java.awt.Color(204, 204, 204));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nhan-vien.png"))); // NOI18N
        jLabel16.setText("Quản lý nhân viên");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("F1");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nhan-vien.png"))); // NOI18N
        jLabel5.setText("Quản lý nhân viên");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("F2");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 50));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/book.png"))); // NOI18N
        jLabel4.setText("Quản lý sản phẩm");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("F3");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 50));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setForeground(new java.awt.Color(204, 204, 204));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BanHang_20px.png"))); // NOI18N
        jLabel8.setText("Quản lý bán hàng");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("F4");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 50));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/thong-ke.png"))); // NOI18N
        jLabel9.setText("Quản lý thống kê");
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("F8");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 250, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home2.png"))); // NOI18N
        jLabel3.setText("Trang chủ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("F1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login-icon-16.png"))); // NOI18N
        jLabel18.setText(" Đăng xuất");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 250, 30));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ncc.png"))); // NOI18N
        jLabel7.setText("Quản lý nhà cung cấp");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("F7");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 250, 50));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setForeground(new java.awt.Color(204, 204, 204));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/khach-hang.png"))); // NOI18N
        jLabel6.setText("Quản lý khách hàng");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("F6");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, 50));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setForeground(new java.awt.Color(204, 204, 204));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bill.png"))); // NOI18N
        jLabel20.setText("Quản lý hóa đơn");
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("F5");
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 250, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 700));

        trangNen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(trangNen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 1300, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("PHẦN MỀM QUẢN LÝ HIỆU SÁCH LUCKY");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1300, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        trangNen.removeAll();
        QuanLyNhanVien QuanLyNhanVien = new QuanLyNhanVien();
        trangNen.setLayout(this.getLayout());
        trangNen.add(QuanLyNhanVien);
        trangNen.revalidate();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        trangNen.removeAll();
        trangNen tn = new trangNen();
        trangNen.setLayout(this.getLayout());
        trangNen.add(tn);
        trangNen.revalidate();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        trangNen.removeAll();
        QuanLySanPham QuanLySanPham = new QuanLySanPham();
        trangNen.setLayout(this.getLayout());
        trangNen.add(QuanLySanPham);
        trangNen.revalidate();    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
        trangNen.removeAll();
        QuanLyKhachHang QuanLyKhachHang = new QuanLyKhachHang();
        trangNen.setLayout(this.getLayout());
        trangNen.add(QuanLyKhachHang);
        trangNen.revalidate();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:        
        trangNen.removeAll();
        QuanLyBanHang QuanLyBanHang = new QuanLyBanHang();
        trangNen.setLayout(this.getLayout());
        trangNen.add(QuanLyBanHang);
        trangNen.revalidate();
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
        trangNen.removeAll();
        QuanLyHoaDon QuanLyHoaDon = new QuanLyHoaDon();
        trangNen.setLayout(this.getLayout());
        trangNen.add(QuanLyHoaDon);
        trangNen.revalidate();
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        trangNen.removeAll();
        QuanLyNhaCungCap QuanLyNhaCungCap = new QuanLyNhaCungCap();
        trangNen.setLayout(this.getLayout());
        trangNen.add(QuanLyNhaCungCap);
        trangNen.revalidate();
    }//GEN-LAST:event_jPanel9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TrangChu_QL tc_ql = new TrangChu_QL();
                tc_ql.setVisible(true);
                tc_ql.setTitle("Cửa hàng sách LucKy ");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel trangNen;
    // End of variables declaration//GEN-END:variables
}
