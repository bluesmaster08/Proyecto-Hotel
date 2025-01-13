/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohotel;

import javax.swing.JOptionPane;

/**
 *
 * @author equipo
 */
public class FormularioMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormularioMenu
     */
    public FormularioMenu() {
        initComponents();
    }

    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuReservar = new javax.swing.JMenu();
        submenuReservar = new javax.swing.JMenuItem();
        submenuHistorial = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuReservar.setText("Reservar");

        submenuReservar.setText("Reservar");
        submenuReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuReservarActionPerformed(evt);
            }
        });
        menuReservar.add(submenuReservar);

        submenuHistorial.setText("Historial");
        submenuHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuHistorialActionPerformed(evt);
            }
        });
        menuReservar.add(submenuHistorial);

        jMenuBar1.add(menuReservar);

        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 277, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // 1. Reservar
    private void submenuReservarActionPerformed(java.awt.event.ActionEvent evt) {
        FormularioReservaciones formulario = FormularioReservaciones.obtenerInstancia();
        formulario.setVisible(true);
    }

    // 2. Historial
    private void submenuHistorialActionPerformed(java.awt.event.ActionEvent evt) {
        FormularioHistorial formulario = FormularioHistorial.obtenerInstancia();
        formulario.setVisible(true);
    }

    // 3. Salir
    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de salir?", "Confirmación",
                JOptionPane.YES_NO_OPTION);

        // Comprueba la respuesta del usuario
        if (respuesta == JOptionPane.YES_OPTION) {
            // Realiza las acciones correspondientes a la selección 'Sí'
            System.out.println("El usuario salió de la app");
            System.exit(0);

        } else if (respuesta == JOptionPane.NO_OPTION) {
            // Realiza las acciones correspondientes a la selección 'No'
            System.out.println("El usuario seleccionó 'No'");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuReservar;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem submenuHistorial;
    private javax.swing.JMenuItem submenuReservar;
    // End of variables declaration//GEN-END:variables
}
