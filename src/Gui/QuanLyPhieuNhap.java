/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

/**
 *
 * @author trana
 */
public class QuanLyPhieuNhap extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public QuanLyPhieuNhap() {
        initComponents();
        Tab_PhieuNhap tab_PhieuNhap = new Tab_PhieuNhap();
        jPanel2.removeAll();
        jPanel2.add(tab_PhieuNhap);
        jPanel2.revalidate();
        jPanel2.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu17 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jInternalFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        jMenuBar7.setBackground(new java.awt.Color(0, 0, 0));

        jMenu17.setText("Phiếu nhập");
        jMenu17.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu17MenuSelected(evt);
            }
        });
        jMenuBar7.add(jMenu17);

        jMenu15.setText("Nhập hàng");
        jMenu15.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu15MenuSelected(evt);
            }
        });
        jMenuBar7.add(jMenu15);

        jInternalFrame1.setJMenuBar(jMenuBar7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu17MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu17MenuSelected
        // TODO add your handling code here:
        Tab_PhieuNhap tab_PhieuNhap = new Tab_PhieuNhap();
        jPanel2.removeAll();
        jPanel2.add(tab_PhieuNhap);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_jMenu17MenuSelected

    private void jMenu15MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu15MenuSelected
        // TODO add your handling code here:
        Tab_NhapHang tab_NhapHang = new Tab_NhapHang();
        jPanel2.removeAll();
        jPanel2.add(tab_NhapHang);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_jMenu15MenuSelected


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
