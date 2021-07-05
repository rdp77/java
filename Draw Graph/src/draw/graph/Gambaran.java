/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw.graph;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author RDP77
 */
public class Gambaran extends javax.swing.JFrame{

    /**
     * Creates new form 
     */
    public Gambaran() {
        initComponents();
        pilihmerah = String.valueOf(merah.getSelectedItem());
        int selection = merah.getSelectedIndex();
//        switch (selection){
//            case 0:
//                hred=200;
//                break;
//            case 1:
//                hred=210;
//                break;
//        }
        if ("Warna Merah".equals(pilihmerah)){
            hred = 200;
        }else if("Tambah 10".equals(pilihmerah)){
            hred = 500;      
        }
       
    }
    
    static int hred,horange=250,hyellow=300,hgreen=250,hblue=200;
    private final String pilihmerah;
   
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(50, 150, 50, hred);
        
        g.setColor(Color.orange);
        g.fillRect(110, 100, 50, 250);
        
        g.setColor(Color.yellow);
        g.fillRect(170, 50, 50, 300);
        
        g.setColor(Color.green);
        g.fillRect(230, 100, 50, 250);
        
        g.setColor(Color.BLUE);
        g.fillRect(290, 150, 50, 200);
        
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        merah = new javax.swing.JComboBox<>();
        oranye = new javax.swing.JComboBox<>();
        kuning = new javax.swing.JComboBox<>();
        hijau = new javax.swing.JComboBox<>();
        biru = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        merah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Warna Merah", "Tambah 10", "Tambah 20", "Tambah 30", "Tambah 40", "Tambah 50" }));
        merah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                merahMouseClicked(evt);
            }
        });
        merah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merahActionPerformed(evt);
            }
        });

        oranye.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Warna Oranye", "Tambah 10", "Tambah 20", "Tambah 30", "Tambah 40", "Tambah 50" }));

        kuning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Warna Kuning", "Tambah 10", "Tambah 20", "Tambah 30", "Tambah 40", "Tambah 50" }));

        hijau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Warna Hijau", "Tambah 10", "Tambah 20", "Tambah 30", "Tambah 40", "Tambah 50" }));
        hijau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hijauActionPerformed(evt);
            }
        });

        biru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Warna Biru", "Tambah 10", "Tambah 20", "Tambah 30", "Tambah 40", "Tambah 50" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(merah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oranye, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kuning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hijau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(merah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oranye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kuning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hijau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(biru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
   
    }//GEN-LAST:event_formWindowOpened

    private void hijauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hijauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hijauActionPerformed

    private void merahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merahActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_merahActionPerformed

    private void merahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_merahMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_merahMouseClicked

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
            java.util.logging.Logger.getLogger(Gambaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gambaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gambaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gambaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gambaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> biru;
    private javax.swing.JComboBox<String> hijau;
    private javax.swing.JComboBox<String> kuning;
    private javax.swing.JComboBox<String> merah;
    private javax.swing.JComboBox<String> oranye;
    // End of variables declaration//GEN-END:variables

}