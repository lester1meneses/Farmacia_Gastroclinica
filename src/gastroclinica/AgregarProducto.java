/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gastroclinica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo López
 */
public class AgregarProducto extends javax.swing.JFrame {

    Connection conexion;
    int dia=0;int mes=0;int anio=0;
    int idCompra=0;
    int nLote=0;
    int cantidad=0;
    double costo=0;
    double subTotal=0;
    String producto="";
    String presentacion="";String fecha="";
    static boolean actualizarProd=false;
    static boolean actualizarPres=false;
    /**
     * Creates new form IngresoProducto
     */
    public AgregarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        jDialog1.setLocation(this.getLocation().x+65,this.getLocation().y+65);
        jDialog1.setSize(510, 330);   
        establecerConexion();
        cargarProductos();
        cargarPresentaciones();
    }
    public AgregarProducto(int id) {
        initComponents();
        this.setLocationRelativeTo(null);
        jDialog1.setLocation(this.getLocation().x+65,this.getLocation().y+65);
        jDialog1.setSize(510, 330);   
        establecerConexion();
        cargarProductos();
        cargarPresentaciones();
        idCompra=id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jButton8.setText("Aceptar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Producto:");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Presentación:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("No. lote:");

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Costo:");

        jLabel6.setText("Subtotal:");

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cargar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha vencimiento:");

        jButton7.setText("Seleccionar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jTextField5)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton7))
                        .addContainerGap(133, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Producto nuevo=new Producto();
        actualizarProd=false;
        recargarProd.start();
        nuevo.show(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Presentacion nueva=new Presentacion();
        actualizarPres=false;
        recargarPres.start();
        nueva.show(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        // TODO add your handling code here:
//        try {
//            conexion.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(TipoTelefono.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Compra.actualizarDet=true;
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        dia=jCalendar1.getDayChooser().getDay();
        mes=jCalendar1.getMonthChooser().getMonth()+1;
        anio=jCalendar1.getYearChooser().getYear();
        jTextField5.setText(anio+"-"+mes+"-"+dia);
        jDialog1.dispose();jButton7.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jDialog1.show(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handing code here:
        jComboBox1.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jButton7.setEnabled(true);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jLabel8.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().compareTo("") != 0 && jTextField2.getText().compareTo("") != 0 && jTextField3.getText().compareTo("") != 0
                && jTextField5.getText().compareTo("") != 0
                && jComboBox1.getSelectedIndex() != 0 && jComboBox3.getSelectedIndex() != 0) {
            producto = jComboBox1.getSelectedItem().toString();
            presentacion = jComboBox3.getSelectedItem().toString();
            nLote = Integer.parseInt(jTextField1.getText());
            cantidad = Integer.parseInt(jTextField2.getText());
            costo = Double.parseDouble(jTextField3.getText());
            subTotal = costo * cantidad;
            jLabel8.setText(subTotal + "");
            fecha = jTextField5.getText();
            ResultSet obtenerIDProd = devolverResultado("select id From Producto where Nombre=\"" + producto + "\";");
            ResultSet obtenerIDPres = devolverResultado("select id From Presentacion where Presentacion=\"" + presentacion + "\";");
            try {
                obtenerIDProd.next();
                obtenerIDPres.next();
                int idProd = obtenerIDProd.getInt("id");
                int idPres = obtenerIDPres.getInt("id");
                ResultSet validarPP = devolverResultado("select* from Producto_Presentacion where Producto_id=" + idProd + " and Presentacion_id=" + idPres + ";");
                if (validarPP.next() == true) {
                    //Ya existe el producto-Presentacion
                    int idPP = validarPP.getInt("id");
                    int existencias = validarPP.getInt("Existencia_Total");
                    existencias = existencias + cantidad;
                    consultaInsertar("update Producto_Presentacion set Existencia_Total=" + existencias + " where id=" + idPP + ";");
                    String insertarLote = "insert into Lote(Numero,Fecha_Vencimiento,Existencias,Costo,Producto_Presentacion_id)"
                            + "values(" + nLote + ",'" + fecha + "'," + cantidad + "," + costo + "," + idPP + ");";
                    consultaInsertar(insertarLote);
                    ResultSet obtenerIDL = devolverResultado("select id from Lote where Numero=" + nLote + " and Fecha_Vencimiento='" + fecha + "' and Producto_Presentacion_id=" + idPP + ";");
                    obtenerIDL.next();
                    int idLote = obtenerIDL.getInt("id");
                    String insertarDC = "insert into Detalle_Compra(Subtotal,Cantidad,Costo,Compra_id,Lote_id) values"
                            + "(" + subTotal + "," + cantidad + "," + costo + "," + idCompra + "," + idLote + ");";
                    consultaInsertar(insertarDC);
                    JOptionPane.showMessageDialog(null, "Producto cargado a la compra.");
                } else {
                    //No existe el producto-Presentacion
                    double precio_venta = 0;
                    try {
                        precio_venta = Double.parseDouble(JOptionPane.showInputDialog(null, "Precio de venta: ", "Ingresar", JOptionPane.QUESTION_MESSAGE));
                        String insertarPP = "insert into Producto_Presentacion(Producto_id,Presentacion_id,Existencia_Total,Precio_Venta)"
                                + "values(" + idProd + "," + idPres + "," + cantidad + "," + precio_venta + ");";
                        consultaInsertar(insertarPP);
                        ResultSet obtenerIDPP = devolverResultado("select id from Producto_Presentacion where Producto_id=" + idProd + " and Presentacion_id=" + idPres + ";");
                        obtenerIDPP.next();
                        int idNPP = obtenerIDPP.getInt("id");
                        String insertarLote = "insert into Lote(Numero,Fecha_Vencimiento,Existencias,Costo,Producto_Presentacion_id) "
                                + "values(" + nLote + ",'" + fecha + "'," + cantidad + "," + costo + "," + idNPP + ");";
                        consultaInsertar(insertarLote);
                        ResultSet obtenerIDL = devolverResultado("select id from Lote where Numero=" + nLote + " and Fecha_Vencimiento='" + fecha + "' and Producto_Presentacion_id=" + idNPP + ";");
                        obtenerIDL.next();
                        int idLote = obtenerIDL.getInt("id");
                        String insertarDC = "insert into Detalle_Compra(Subtotal,Cantidad,Costo,Compra_id,Lote_id) values"
                                + "(" + subTotal + "," + cantidad + "," + costo + "," + idCompra + "," + idLote + ");";
                        consultaInsertar(insertarDC);
                        JOptionPane.showMessageDialog(null, "Producto cargado a la compra.");

                    } catch (NumberFormatException e) {

                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            Compra.actualizarDet=true;
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "No deje ningun campo vacio.", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cargarProductos(){
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Seleccione un producto");
            ResultSet resultado=devolverResultado("select* from Producto;");
        try {
            while(resultado.next()==true){
                jComboBox1.addItem(resultado.getString("Nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void cargarPresentaciones(){
        jComboBox3.removeAllItems();
        jComboBox3.addItem("Seleccione una presentacion");
        try {
            ResultSet resultado=devolverResultado("select* from Presentacion;");
            while(resultado.next()==true){
                jComboBox3.addItem(resultado.getString("Presentacion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    Timer recargarProd = new Timer (200, new ActionListener () 
    { 
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(actualizarProd==true){
            cargarProductos();
            actualizarProd=false;
            recargarProd.stop();
            
        }
     } 
    }); 
    
    Timer recargarPres = new Timer (200, new ActionListener () 
    { 
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(actualizarPres==true){
            cargarPresentaciones();
            actualizarPres=false;
            recargarPres.stop();
            
        }
     } 
    }); 
    public ResultSet devolverResultado(String consulta){
            ResultSet devolver = null;
        try {
            Statement s=conexion.createStatement();
            devolver=s.executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devolver;
    }
    public void consultaInsertar(String sql){
        try {
            Statement insertar=conexion.createStatement();
            insertar.executeUpdate(sql);
           // JOptionPane.showMessageDialog(null, "Consulta realizada con exito", "", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al momento de almacenar la informacion", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void establecerConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/DBGastroClinica", "root", "ingenieria");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //return false;
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
           // return false;
        }
        //return true;
    }
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
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}