
package programa;

import java.sql.Connection;
import modelo.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        grupoBotones.add(radioBotonMujer);
        grupoBotones.add(radioBotonHombre);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        casillaBeisbol = new javax.swing.JCheckBox();
        casillaNatacion = new javax.swing.JCheckBox();
        casillaTennis = new javax.swing.JCheckBox();
        casillaBasquet = new javax.swing.JCheckBox();
        casillaFutbol = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numeroEdad = new javax.swing.JSpinner();
        radioBotonHombre = new javax.swing.JRadioButton();
        radioBotonMujer = new javax.swing.JRadioButton();
        botonInsertar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        casillaBeisbol.setText("Beisbol");
        casillaBeisbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaBeisbolActionPerformed(evt);
            }
        });

        casillaNatacion.setText("Natación");

        casillaTennis.setText("Tennis");

        casillaBasquet.setText("Basquet");

        casillaFutbol.setText("Fútbol");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Formulario");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione Género:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("¿Cuál es su edad?");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Seleccione sus deportes favoritos:");

        radioBotonHombre.setText("Hombre");

        radioBotonMujer.setText("Mujer");

        botonInsertar.setText("Insertar Registro");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(radioBotonHombre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBotonMujer, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(98, 98, 98))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(casillaFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(casillaBasquet, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(casillaTennis, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(casillaNatacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(casillaBeisbol, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(botonInsertar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numeroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBotonHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBotonMujer)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numeroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(casillaFutbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(casillaBasquet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(casillaTennis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(casillaNatacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(casillaBeisbol)
                .addGap(18, 18, 18)
                .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casillaBeisbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaBeisbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillaBeisbolActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        
        String genero="";
        int edad;
        boolean futbol=false,basquet=false,tennis=false,natacion=false,beisbol=false;
        
        //Radio Botones - JRadioButton
        if(radioBotonHombre.isSelected()==true){//si radio boton hombre ha sido seleccionado
            genero="Hombre";
        }
        else if(radioBotonMujer.isSelected()==true){//caso contrario
            genero="Mujer";
        }
        
        //Numero de edad
        edad=(int) numeroEdad.getValue();//obteniendo lo que hay en el spinner
        
        //Casillas de verificacion - JCheckBox
        if(casillaFutbol.isSelected()==true){ //ponemos muchos if porque podemos hacer muchas selecciones
            futbol=true;
        }
        if(casillaBasquet.isSelected()==true){
            basquet=true;
        }
        if(casillaTennis.isSelected()==true){
            tennis=true;
        }
        if(casillaNatacion.isSelected()==true){
            natacion=true;
        }
        if(casillaBeisbol.isSelected()==true){
            beisbol=true;
        }
        
        try{
            
            Connection conexion = con.getConnection();
            
            ps=conexion.prepareStatement("insert into gustospersona (genero,edad,futbol,basquet,tennis,natacion,beisbol) values (?,?,?,?,?,?,?)");
            ps.setString(1, genero);
            ps.setInt(2, edad);
            ps.setBoolean(3, futbol);
            ps.setBoolean(4, basquet);
            ps.setBoolean(5, tennis);
            ps.setBoolean(6, natacion);
            ps.setBoolean(7, beisbol);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
        
            conexion.close();
            
        }catch(Exception ex){
            System.err.println("Error: "+ex);
        }
        
    }//GEN-LAST:event_botonInsertarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JCheckBox casillaBasquet;
    private javax.swing.JCheckBox casillaBeisbol;
    private javax.swing.JCheckBox casillaFutbol;
    private javax.swing.JCheckBox casillaNatacion;
    private javax.swing.JCheckBox casillaTennis;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner numeroEdad;
    private javax.swing.JRadioButton radioBotonHombre;
    private javax.swing.JRadioButton radioBotonMujer;
    // End of variables declaration//GEN-END:variables
}
