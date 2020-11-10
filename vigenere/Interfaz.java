
package vigenere;

public class Interfaz extends javax.swing.JFrame {
    
    TextosVigi vigi = new TextosVigi();
    OperacionesVigi operaciones = new OperacionesVigi();
    
    public Interfaz() {
        initComponents();
        tabla.setText(operaciones.OperacionesVigi("a", "a"));
        texto.setEditable(false);
        tabla.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itexto = new javax.swing.JTextField();
        iclave = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 380));
        setName("Vigenere"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        itexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itextoActionPerformed(evt);
            }
        });
        getContentPane().add(itexto);
        itexto.setBounds(19, 60, 174, 20);

        iclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iclaveActionPerformed(evt);
            }
        });
        getContentPane().add(iclave);
        iclave.setBounds(19, 123, 174, 20);

        jButton1.setText("Cifrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(19, 149, 59, 23);

        jButton2.setText("Descifrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(96, 149, 75, 23);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setText("Cifrado Vigenere");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(107, 8, 176, 26);

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(19, 183, 174, 150);

        tabla.setColumns(20);
        tabla.setRows(5);
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(211, 60, 166, 273);

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel2.setText("Texto Claro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 40, 77, 14);

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel3.setText("Clave");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 98, 35, 14);

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel4.setText("Matriz");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(266, 40, 42, 14);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vigenere/zero two2.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 390, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String textoClaro = itexto.getText().toLowerCase();
        String clave = operaciones.Longitud(iclave.getText().toLowerCase(), textoClaro);
        
        String textoCifrado = vigi.encryptTextoClaro(textoClaro, clave);
        texto.setText(textoCifrado);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String textoCifrado = itexto.getText().toLowerCase();
        String clave = operaciones.Longitud(iclave.getText().toLowerCase(), textoCifrado);
        String textoClaro = vigi.desencryptTextoCifrado(textoCifrado, clave);
        texto.setText(textoClaro);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void itextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itextoActionPerformed
        
    }//GEN-LAST:event_itextoActionPerformed

    private void iclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iclaveActionPerformed
        
    }//GEN-LAST:event_iclaveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iclave;
    private javax.swing.JTextField itexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tabla;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
