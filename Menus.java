/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Menus extends javax.swing.JFrame {

    static Login home = new Login();
   
    
    public Menus() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblenunciao = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        btnUnidad = new javax.swing.JButton();
        btnPermiso = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        fondoAdmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRADOR");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblenunciao.setFont(new java.awt.Font("Mangal", 1, 24)); // NOI18N
        lblenunciao.setForeground(new java.awt.Color(102, 102, 102));
        lblenunciao.setText("ADMINISTRACIÓN VISTA HERMOSA.");
        lblenunciao.setAlignmentX(0.5F);
        lblenunciao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblenunciao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblenunciao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 470, 50));

        btnUsuario.setBackground(new java.awt.Color(153, 153, 255));
        btnUsuario.setFont(new java.awt.Font("Mangal", 0, 11)); // NOI18N
        btnUsuario.setText("REGISTRO USUARIOS");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 265, 38));

        btnUnidad.setBackground(new java.awt.Color(153, 153, 255));
        btnUnidad.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnUnidad.setText("CREAR UNIDAD");
        btnUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 265, 38));

        btnPermiso.setBackground(new java.awt.Color(153, 153, 255));
        btnPermiso.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnPermiso.setText("CREAR MOTIVO");
        btnPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermisoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPermiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 265, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 70, -1));

        fondoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaHermosa.jpg"))); // NOI18N
        getContentPane().add(fondoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 220, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vistas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        new AgregarUsuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Al hacer click en salir, se cerrará la sesión, ¿desea salir?", "SI/NO", JOptionPane.YES_NO_OPTION);
if (a==0){
        new Login().setVisible(true);
        this.dispose();}
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidadActionPerformed
        new CrearUnidad().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUnidadActionPerformed

    private void btnPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermisoActionPerformed
       new CrearMotivo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPermisoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPermiso;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUnidad;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel fondoAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblenunciao;
    // End of variables declaration//GEN-END:variables
}
