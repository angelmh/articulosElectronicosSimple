package Formularios;

import Paneles.PanelMenu;
import java.awt.BorderLayout;
import Formularios.*;


public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
         PanelMenu pm =new PanelMenu();
        this.add(pm,BorderLayout.CENTER);
        pm.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuClienYEmp = new javax.swing.JMenu();
        JMenuIClientes = new javax.swing.JMenuItem();
        JMenuIEmpleados = new javax.swing.JMenuItem();
        JMenuProductos = new javax.swing.JMenu();
        JMenuIProductos = new javax.swing.JMenuItem();
        JMenuAcerca = new javax.swing.JMenu();
        JMenuIAcerca = new javax.swing.JMenuItem();
        JMenuISalir = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem10.setText("jMenuItem10");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA PARA ARTICULOS ELECTRONICOS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JMenuClienYEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        JMenuClienYEmp.setText("Clientes y Empleados");

        JMenuIClientes.setText("Clientes");
        JMenuIClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuIClientesActionPerformed(evt);
            }
        });
        JMenuClienYEmp.add(JMenuIClientes);

        JMenuIEmpleados.setText("Empleados");
        JMenuIEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuIEmpleadosActionPerformed(evt);
            }
        });
        JMenuClienYEmp.add(JMenuIEmpleados);

        jMenuBar1.add(JMenuClienYEmp);

        JMenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        JMenuProductos.setText("Productos");

        JMenuIProductos.setText("Productos");
        JMenuIProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuIProductosActionPerformed(evt);
            }
        });
        JMenuProductos.add(JMenuIProductos);

        jMenuBar1.add(JMenuProductos);

        JMenuAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icn_informacion.png"))); // NOI18N
        JMenuAcerca.setText("Acerca de ");
        JMenuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuAcercaActionPerformed(evt);
            }
        });

        JMenuIAcerca.setText("Acerca de");
        JMenuIAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuIAcercaActionPerformed(evt);
            }
        });
        JMenuAcerca.add(JMenuIAcerca);

        JMenuISalir.setText("Salir");
        JMenuISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuISalirActionPerformed(evt);
            }
        });
        JMenuAcerca.add(JMenuISalir);

        jMenuBar1.add(JMenuAcerca);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(143, 143, 143)
                .add(jLabel1)
                .addContainerGap(942, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(1030, 1030, 1030)
                .add(jLabel1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuIClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuIClientesActionPerformed
        JDClientes jclientes=new JDClientes(this, rootPaneCheckingEnabled);
        jclientes.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMenuIClientesActionPerformed

    private void JMenuIEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuIEmpleadosActionPerformed
       JDEmpleados jempleados=new JDEmpleados(this, rootPaneCheckingEnabled);
       jempleados.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMenuIEmpleadosActionPerformed

    private void JMenuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuAcercaActionPerformed

    }//GEN-LAST:event_JMenuAcercaActionPerformed

    private void JMenuIAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuIAcercaActionPerformed
        JDAcercade jacerca= new JDAcercade(this, rootPaneCheckingEnabled);
        jacerca.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMenuIAcercaActionPerformed

    private void JMenuISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuISalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_JMenuISalirActionPerformed

    private void JMenuIProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuIProductosActionPerformed
        // TODO add your handling code here:
        JDProductos p= new JDProductos(this, rootPaneCheckingEnabled);
        p.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_JMenuIProductosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuAcerca;
    private javax.swing.JMenu JMenuClienYEmp;
    private javax.swing.JMenuItem JMenuIAcerca;
    private javax.swing.JMenuItem JMenuIClientes;
    private javax.swing.JMenuItem JMenuIEmpleados;
    private javax.swing.JMenuItem JMenuIProductos;
    private javax.swing.JMenuItem JMenuISalir;
    private javax.swing.JMenu JMenuProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
