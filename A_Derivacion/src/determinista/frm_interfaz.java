/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class frm_interfaz extends javax.swing.JFrame {
    
    DefaultTableModel t_estados;
    
    private void analizar() {
        String estado_inicio = "e0";
        String estado_final = "e4";
        int indice = 0;
        String estado_actual = estado_inicio;
        String entrada = txt_entrada.getText();
        try {
            for (indice = 0; indice < entrada.length(); indice++) {
                char letra = entrada.charAt(indice);
                switch (estado_actual) {
                    case "e0":
                        if (letra == 'a') {
                            estado_actual = "e0";
                            String[] MT = {String.valueOf(letra), estado_actual};
                            t_estados.addRow(MT);
                        } else if (letra == 'e') {
                            estado_actual = "e1";
                            String[] MT = {String.valueOf(letra), estado_actual};
                            t_estados.addRow(MT);
                        } else {
                            estado_actual = "e777";
                            String[] MT = {String.valueOf(letra), "entrada invalido"};
                            t_estados.addRow(MT);
                        }
                        break;
                    
                    case "e1":
                        if (letra == 'e') {
                            estado_actual = "e1";
                            String[] MT = {String.valueOf(letra), estado_actual};
                            t_estados.addRow(MT);
                        } else if (letra == 'i') {
                            estado_actual = "e2";
                            String[] MT = {String.valueOf(letra), estado_actual};
                            t_estados.addRow(MT);
                        } else {
                            estado_actual = "e777";
                            String[] MT = {String.valueOf(letra), "simbolo invalido"};
                            t_estados.addRow(MT);
                        }
                        break;
                    
                    case "e2":
                        if (letra == 'o') {
                            estado_actual = "e3";
                            String[] MT = {String.valueOf(letra), estado_actual};
                            t_estados.addRow(MT);
                        } else {
                            estado_actual = "e777";
                            String[] MT = {String.valueOf(letra), "simbolo invalido"};
                            t_estados.addRow(MT);
                        }
                        break;
                    
                    case "e3":
                        if (letra == 'u') {
                            estado_actual = "e4";
                            String[] MT = {String.valueOf(letra), estado_actual};
                            t_estados.addRow(MT);
                        } else {
                            estado_actual = "e777";
                            String[] MT = {String.valueOf(letra), "simbolo invalido"};
                            t_estados.addRow(MT);
                        }
                        break;
                    
                    case "e4":
                        if (letra == 'u') {
                            estado_actual = "e4";
                            String[] MT = {String.valueOf(letra), estado_actual};
                            t_estados.addRow(MT);
                        } else {
                            estado_actual = "e777";
                            String[] MT = {String.valueOf(letra), "simbolo invalido"};
                            t_estados.addRow(MT);
                        }
                        break;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        if (estado_actual == estado_final) {
            System.out.println("La cadena es valida");
            JOptionPane.showMessageDialog(rootPane, "La cadena: \"" + entrada + "\" es valida", "CADENA VALIDA", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("La cadena no es valida");
            JOptionPane.showMessageDialog(rootPane, "La cadena: \"" + entrada + "\" no es valida", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public frm_interfaz() {
        t_estados = new DefaultTableModel();
        String encabezado[] = {"Simbolo", "Estado Actual"};
        initComponents();
        setLocationRelativeTo(null);
        t_estados.setColumnIdentifiers(encabezado);
        tbl_estados.setModel(t_estados);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel_imagen = new FondoPanel();
        btn_analizar = new javax.swing.JButton();
        txt_entrada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_estados = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("L1 = {a^n e^m i o u^p / n≥0 ; m>0 y p>0 }");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Automata Finito Determinista");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sea: Σ{a,e,i,o,u}");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("L1 = {a^n e^m i o u^p / n≥0 ; m>0 y p>0 }");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("M1D = <{ e0,e1,e2,e3,e4 }, {a,e,i,o,u}, δ1D, e0, {e4}>");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("δ1D esta definido por el siguiente diagrama de transición de estados: ");

        javax.swing.GroupLayout panel_imagenLayout = new javax.swing.GroupLayout(panel_imagen);
        panel_imagen.setLayout(panel_imagenLayout);
        panel_imagenLayout.setHorizontalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_imagenLayout.setVerticalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        btn_analizar.setBackground(new java.awt.Color(255, 51, 0));
        btn_analizar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_analizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_analizar.setText("Analizar");
        btn_analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analizarActionPerformed(evt);
            }
        });

        txt_entrada.setBackground(new java.awt.Color(51, 51, 51));
        txt_entrada.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        txt_entrada.setForeground(new java.awt.Color(255, 255, 255));
        txt_entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_entrada.setText("Ingrese su cadena aquí");
        txt_entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_entradaMouseClicked(evt);
            }
        });
        txt_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_entradaActionPerformed(evt);
            }
        });
        txt_entrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_entradaKeyReleased(evt);
            }
        });

        tbl_estados.setBackground(new java.awt.Color(255, 51, 0));
        tbl_estados.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tbl_estados.setForeground(new java.awt.Color(255, 255, 255));
        tbl_estados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_estados);

        btn_eliminar.setBackground(new java.awt.Color(255, 51, 0));
        btn_eliminar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Limpiar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 270, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(259, 259, 259))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panel_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_entrada))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(btn_analizar)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_analizar)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analizarActionPerformed
        analizar();
        btn_analizar.setEnabled(false);
        btn_eliminar.setEnabled(true);
    }//GEN-LAST:event_btn_analizarActionPerformed

    private void txt_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_entradaActionPerformed

    private void txt_entradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_entradaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_entradaKeyReleased

    private void txt_entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_entradaMouseClicked
        if (txt_entrada.getText().equals("Ingrese su cadena aquí")) {
            txt_entrada.setText("");
        }
    }//GEN-LAST:event_txt_entradaMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        DefaultTableModel tb = (DefaultTableModel) tbl_estados.getModel();
        int a = tbl_estados.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {            
            tb.removeRow(tb.getRowCount() - 1);
        }
        btn_analizar.setEnabled(true);
        btn_eliminar.setEnabled(false);
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_analizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel_imagen;
    private javax.swing.JTable tbl_estados;
    private javax.swing.JTextField txt_entrada;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel extends JPanel {

        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/img_afd.PNG")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
}
