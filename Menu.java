/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.ProyectoInterfaces.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Michael Santiago Jara Castro DAW º1
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenu = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        textFormulario1 = new javax.swing.JLabel();
        textFormulario2 = new javax.swing.JLabel();
        textSistema = new javax.swing.JLabel();
        ingresarRecibo = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        ingresarInforme = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setMaximumSize(new java.awt.Dimension(990, 477));
        setMinimumSize(new java.awt.Dimension(990, 477));
        setName("Menu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(990, 477));
        setResizable(false);
        setSize(new java.awt.Dimension(990, 477));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMenu.setBackground(new java.awt.Color(102, 102, 102));
        tituloMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tituloMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloMenu.setText("SISTEMA DE REPORTE DE EMPLEADOS");
        tituloMenu.setOpaque(true);
        getContentPane().add(tituloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 470, 60));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/ProyectoInterfaces/vista/Imagenes/icons8-búsqueda-30.png"))); // NOI18N
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 30, 40));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/ProyectoInterfaces/vista/Imagenes/icons8-búsqueda-30.png"))); // NOI18N
        getContentPane().add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 30, 40));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/ProyectoInterfaces/vista/Imagenes/icons8-búsqueda-30.png"))); // NOI18N
        getContentPane().add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 30, 40));

        textFormulario1.setText("Formulario");
        getContentPane().add(textFormulario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 60, -1));

        textFormulario2.setText("Formulario");
        getContentPane().add(textFormulario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 60, -1));

        textSistema.setText("Sistema");
        getContentPane().add(textSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        ingresarRecibo.setText("RECIBO");
        ingresarRecibo.setBorderPainted(false);
        ingresarRecibo.setContentAreaFilled(false);
        ingresarRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarReciboActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 100, 50));

        botonSalir.setText("SALIR");
        botonSalir.setBorderPainted(false);
        botonSalir.setContentAreaFilled(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 90, 50));

        ingresarInforme.setText("INFORME");
        ingresarInforme.setBorderPainted(false);
        ingresarInforme.setContentAreaFilled(false);
        ingresarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarInformeActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarInforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Cerrar Sesión");
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 140, 40));

        fondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/ProyectoInterfaces/vista/Imagenes/FondoMedac.png"))); // NOI18N
        fondoMenu.setText("jLabel2");
        fondoMenu.setMaximumSize(new java.awt.Dimension(990, 477));
        fondoMenu.setMinimumSize(new java.awt.Dimension(990, 477));
        fondoMenu.setPreferredSize(new java.awt.Dimension(990, 477));
        getContentPane().add(fondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1000, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ingresarReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarReciboActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Recibo rec = new Recibo();
        rec.setVisible(true);
    }//GEN-LAST:event_ingresarReciboActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            dispose();
        }else{
        }
    }//GEN-LAST:event_botonSalirActionPerformed

    private void ingresarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarInformeActionPerformed
        setVisible(false);
        Informe info = new Informe();
        info.setVisible(true);
    }//GEN-LAST:event_ingresarInformeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Inicio in = new Inicio();
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fondoMenu;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JButton ingresarInforme;
    private javax.swing.JButton ingresarRecibo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel textFormulario1;
    private javax.swing.JLabel textFormulario2;
    private javax.swing.JLabel textSistema;
    private javax.swing.JLabel tituloMenu;
    // End of variables declaration//GEN-END:variables
}
