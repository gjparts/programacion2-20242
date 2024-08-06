/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43_gui06;

/**
 *
 * @author Gerardo
 */
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
public class Ejemplo extends javax.swing.JFrame {

    /**
     * Creates new form Ejemplo
     */
    public Ejemplo() {
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

        check1 = new javax.swing.JCheckBox();
        letrero1 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox<>();
        letrero2 = new javax.swing.JLabel();
        letrero3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("20012002049");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        check1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        check1.setSelected(true);
        check1.setText("Soy un checkbox");
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });

        letrero1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        letrero1.setText("jLabel1");

        boton1.setText("evaluar a check1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        combo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sol", "Luna", "Estrella", "Planeta", "Galaxia" }));
        combo1.setSelectedIndex(3);
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        letrero2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        letrero2.setText("jLabel1");

        letrero3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        letrero3.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(letrero1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton1)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(check1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(letrero3)
                            .addComponent(letrero2))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(check1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(letrero1)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(letrero2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(letrero3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
        //si check1 cambia su estado se ejecuta este evento
        if( check1.isSelected() == true )
            letrero1.setText("check1 marcado");
        else
            letrero1.setText("check1 desmarcado");
    }//GEN-LAST:event_check1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //este evento se ejecuta al dibujar el form
        //mandamos a llamar a la funcion/metodo que se
        //dispara cuando cambiamos de estado a check1
        check1ActionPerformed(null);
        
        //llenar el combobox con nuestros propios elementos
        DefaultComboBoxModel modelo1 = new DefaultComboBoxModel();
        modelo1.addElement("Manzana");
        modelo1.addElement("Pera");
        modelo1.addElement("Sandía");
        modelo1.addElement("Uva");
        modelo1.addElement("Naranja");
        modelo1.addElement("Piña");
        //apuntar el modelo creado para usarse en combo1
        combo1.setModel(modelo1);
        
        //disparar el evento de combo1
        combo1ActionPerformed(null);
    }//GEN-LAST:event_formWindowOpened

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        //consultar el valor de check1 desde un evento externo
        JOptionPane.showMessageDialog(this, "El valor de check1 es "+check1.isSelected()  );
    }//GEN-LAST:event_boton1ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        //evento que se dispara cuando cambiamos de item en combo1
        //los item de un modelo de comboBox se numeran de 0 a N-1
        letrero2.setText("indice seleccionado: "+combo1.getSelectedIndex());
        letrero3.setText("texto seleccionado: "+combo1.getSelectedItem());
        
        //si la fruta es Naranja coloreamos el fondo de ese color
        if( combo1.getSelectedItem().equals("Naranja") == true )
            this.getContentPane().setBackground( Color.ORANGE );
        else
            this.getContentPane().setBackground(null); //eliminar color de fondo
    }//GEN-LAST:event_combo1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JCheckBox check1;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JLabel letrero1;
    private javax.swing.JLabel letrero2;
    private javax.swing.JLabel letrero3;
    // End of variables declaration//GEN-END:variables
}
