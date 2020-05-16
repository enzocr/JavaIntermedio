/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import negocio.bo.LibroBo;
import negocio.clases.Libro;
import utilities.ValidationUtil;

/**
 *
 * @author enzoq
 */
public class MantLibro extends javax.swing.JFrame {

    private LibroBo lbo;
    private DefaultTableModel modelLibro;

    /**
     * Creates new form MantProfesor
     */
    public MantLibro() {
        initComponents();
        this.lbo = new LibroBo();
        this.modelLibro = new DefaultTableModel();
        fillTable();
    }

    public JTable getTableLibro() {
        return tableLibro;
    }

    public void setTableLibro(JTable tableLibro) {
        this.tableLibro = tableLibro;
    }

    public DefaultTableModel getModelLibro() {
        return modelLibro;
    }

    public void setModelProfesor(DefaultTableModel modelLibro) {
        this.modelLibro = modelLibro;
    }

    public LibroBo getLbo() {
        return lbo;
    }

    public void setLbo(LibroBo lbo) {
        this.lbo = lbo;
    }

    public void fillTable() {

        this.modelLibro = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        this.tableLibro.getTableHeader().setReorderingAllowed(false);
        getModelLibro().setColumnCount(0);
        getModelLibro().addColumn("Codigo");
        getModelLibro().addColumn("Nombre");
        getModelLibro().addColumn("Autor");
        getModelLibro().addColumn("Año");
        getModelLibro().addColumn("Precio");

        List<Libro> list = getLbo().getAll();

        if (list != null) {
            getModelLibro().setNumRows(list.size());

            for (int i = 0; i < list.size(); i++) {
                Libro lib = list.get(i);
                getModelLibro().setValueAt(lib.getCodigo(), i, 0);//i=fila 0=columna
                getModelLibro().setValueAt(lib.getNombre(), i, 1);
                getModelLibro().setValueAt(lib.getAutor(), i, 2);
                getModelLibro().setValueAt(lib.getAno(), i, 3);
                getModelLibro().setValueAt(lib.getPrecio(), i, 4);
            }

        }

        this.tableLibro.setModel(getModelLibro());

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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        autorTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        anioTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        getByIdButton = new javax.swing.JButton();
        getByNameButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLibro = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        precioTextField = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Mantenimiento de libros");

        jLabel2.setText("Código");

        codigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre: ");

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Autor");

        jLabel5.setText("Año");

        addButton.setText("Agregar");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Eliminar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Modificar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cleanButton.setText("Limpiar");
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        getByIdButton.setText("Consultar por código");
        getByIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getByIdButtonActionPerformed(evt);
            }
        });

        getByNameButton.setText("Consultar por nombre");
        getByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getByNameButtonActionPerformed(evt);
            }
        });

        tableLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLibroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableLibro);

        jLabel6.setText("Precio: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigoTextField)
                            .addComponent(autorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreTextField)
                            .addComponent(anioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(getByNameButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(getByIdButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addButton)
                                            .addGap(44, 44, 44)
                                            .addComponent(cleanButton)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(70, 70, 70)
                                            .addComponent(deleteButton)
                                            .addGap(58, 58, 58)
                                            .addComponent(updateButton))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(autorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(anioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(cleanButton))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getByIdButton)
                    .addComponent(getByNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed

    }//GEN-LAST:event_codigoTextFieldActionPerformed
    private boolean validateData() {

        if (this.codigoTextField.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite codigo del libro");
            return false;
        }
        if (this.nombreTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite nombre del libro");
            return false;
        }
        if (this.autorTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite autor del libro");
            return false;
        }
        if (this.anioTextField.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite año del libro");
            return false;

        } else {
            try {
                Double.parseDouble(this.precioTextField.getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Solo se permiten decimales en el precio");
                return false;
            }

        }

        return true;
    }
    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        cleanTextFields();
    }//GEN-LAST:event_cleanButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        if (validateData()) {

            Libro lb = new Libro(
                    Integer.parseInt(this.codigoTextField.getText()),
                    this.nombreTextField.getText(),
                    this.autorTextField.getText(),
                    Integer.parseInt(this.anioTextField.getText()),
                    Double.parseDouble(this.precioTextField.getText()));

            int res = getLbo().insert(lb);

            switch (res) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Libro registrado");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "No se pudo conectar a la BD");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ya existe libro con esta cedula");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Error inesperado");
                    break;
            }

        }
        cleanTextFields();

    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonMouseClicked

    private void tableLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLibroMouseClicked
        if (evt.getClickCount() == 2) {
            int row = tableLibro.getSelectedRow();
            codigoTextField.setText(getTableLibro().getValueAt(row, 0).toString());
            nombreTextField.setText(getTableLibro().getValueAt(row, 1).toString());
            autorTextField.setText(getTableLibro().getValueAt(row, 2).toString());
            anioTextField.setText(getTableLibro().getValueAt(row, 3).toString());
            precioTextField.setText(getTableLibro().getValueAt(row, 4).toString());
            codigoTextField.setEnabled(false);
        }
    }//GEN-LAST:event_tableLibroMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (validateData()) {

            Libro lb = new Libro(
                    Integer.parseInt(this.codigoTextField.getText()),
                    this.nombreTextField.getText(),
                    this.autorTextField.getText(),
                    Integer.parseInt(this.anioTextField.getText()),
                    Double.parseDouble(this.precioTextField.getText()));

            int res = getLbo().update(lb);

            switch (res) {
                case 0:
                    ValidationUtil.showJOptionPane("Libro modificado");
                    break;
                case 1:
                    ValidationUtil.showJOptionPane("No se pudo conectar a la BD");
                    break;
                case 2:
                    ValidationUtil.showJOptionPane("Ya existe libro con este codigo");
                    break;
                case 3:
                    ValidationUtil.showJOptionPane("Error inesperado");
                    break;
            }

        }
        cleanTextFields();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (codigoTextField.getText().trim().equals("")) {
            ValidationUtil.showJOptionPane("Ingresar codigo a eliminar");
        } else {
            try {
                int codigo = Integer.parseInt(codigoTextField.getText());

                Libro lb = new Libro();
                lb.setCodigo(codigo);
                int res = getLbo().delete(lb);

                switch (res) {
                    case 0:
                        ValidationUtil.showJOptionPane("Libro NO eliminado");
                        break;
                    case 1:
                        ValidationUtil.showJOptionPane("Libro ELIMINADO");
                        break;
                    case 2:
                        ValidationUtil.showJOptionPane("NO hubo conexion con base de datos");
                        break;
                    case 3:
                        ValidationUtil.showJOptionPane("Error inesperado");
                        break;
                    case 4:
                        ValidationUtil.showJOptionPane("Libro tiene registros asociados");
                }
                cleanTextFields();

            } catch (NumberFormatException nfe) {
                ValidationUtil.showJOptionPane("Solo se permiten numeros");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void getByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getByNameButtonActionPerformed
        if (!"".equals(this.nombreTextField.getText())) {
            List<Libro> list = getLbo().getByName(this.nombreTextField.getText());
            fillTable(list);
        } else {
            ValidationUtil.showJOptionPane("Digitar nombre para búsqueda");
        }

    }//GEN-LAST:event_getByNameButtonActionPerformed

    private void getByIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getByIdButtonActionPerformed
        if (!this.codigoTextField.getText().matches("[0-9]+")) {
            ValidationUtil.showJOptionPane("NO se permiten letras");
        } else {
            int cedula = Integer.parseInt(this.codigoTextField.getText());
            Libro lb = getLbo().getById(cedula);
            List<Libro> list = new ArrayList<>();
            list.add(lb);
            fillTable(list);
        }

    }//GEN-LAST:event_getByIdButtonActionPerformed
    private void cleanTextFields() {
        this.codigoTextField.setText("");
        this.nombreTextField.setText("");
        this.autorTextField.setText("");
        this.anioTextField.setText("");
        this.precioTextField.setText("");
        codigoTextField.setEnabled(true);
        fillTable();
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
            java.util.logging.Logger.getLogger(MantLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField anioTextField;
    private javax.swing.JTextField autorTextField;
    private javax.swing.JButton cleanButton;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton getByIdButton;
    private javax.swing.JButton getByNameButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField precioTextField;
    private javax.swing.JTable tableLibro;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void fillTable(List<Libro> list) {

        this.modelLibro = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        this.tableLibro.getTableHeader().setReorderingAllowed(false);

        getModelLibro().setColumnCount(0);
        getModelLibro().addColumn("Código");
        getModelLibro().addColumn("Nombre");
        getModelLibro().addColumn("Autor");
        getModelLibro().addColumn("Año");
        getModelLibro().addColumn("Precio");

        if (list != null) {
            getModelLibro().setNumRows(list.size());

            for (int i = 0; i < list.size(); i++) {
                Libro libro = list.get(i);
                getModelLibro().setValueAt(libro.getCodigo(), i, 0);//i=fila 0=columna
                getModelLibro().setValueAt(libro.getNombre(), i, 1);
                getModelLibro().setValueAt(libro.getAutor(), i, 2);
                getModelLibro().setValueAt(libro.getAno(), i, 3);
                getModelLibro().setValueAt(libro.getPrecio(), i, 4);
            }
        }

        this.tableLibro.setModel(getModelLibro());

    }
}
