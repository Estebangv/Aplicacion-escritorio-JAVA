/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Clases.CRUDUSUARIO;
import Clases.Usuario;
import Conexion.Database;

/**
 *
 * @author usuario
 */
public class VerUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form VerUsuarios
     */
    public VerUsuarios() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbnUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbnUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Rut", "Pass", "Nombre", "Paterno", "Materno", "FechaIngreso", "Mail", "Fono", "Habilitado", "Nacionalidad", "TipoUsuario", "Unidad"
            }
        ));
        tbnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbnUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnUsuariosMouseClicked
            int fila = tbnUsuarios.getSelectedRow();
            
            
            String rut=tbnUsuarios.getValueAt(fila, 0).toString();
            String pass=tbnUsuarios.getValueAt(fila, 1).toString();   
            String nombre=tbnUsuarios.getValueAt(fila, 2).toString();
            String paterno=tbnUsuarios.getValueAt(fila, 3).toString();
            String materno=tbnUsuarios.getValueAt(fila, 4).toString();
            String fechaIngreso=tbnUsuarios.getValueAt(fila, 5).toString();
            String correo=tbnUsuarios.getValueAt(fila, 6).toString();
            String fono=tbnUsuarios.getValueAt(fila, 7).toString(); 
           int habilitado = Integer.parseInt(tbnUsuarios.getValueAt(fila, 8).toString());
            String nacionalidad=tbnUsuarios.getValueAt(fila, 9).toString();
            int id_tipoUsuario = Integer.parseInt(tbnUsuarios.getValueAt(fila, 10).toString());
            int id_Unidad= Integer.parseInt(tbnUsuarios.getValueAt(fila, 11).toString());
                    
  
            
                   // TODO add your handling code here:
    }//GEN-LAST:event_tbnUsuariosMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbnUsuarios;
    // End of variables declaration//GEN-END:variables
}