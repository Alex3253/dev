package ProyectoMatriculas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Proyecto extends javax.swing.JFrame {

    private int filaSeleccionada = -1;
    
public Proyecto() {
    // Constructor de la clase Proyecto
    initComponents(); // Inicializa los componentes de la interfaz gráfica

    // Configura el modelo del combo box de nivel con las opciones disponibles
    cboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Inicial", "Primaria", "Secundaria"}));
    
    // Selecciona "Inicial" por defecto en el combo box de nivel
    cboNivel.setSelectedItem("Inicial"); 
    
    // Actualiza los combo boxes de grado y edad según el nivel seleccionado
    updateGradoAndEdad();

    // Inicializa el modelo de la tabla tblSalida
    tblSalida.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][]{}, // Inicialmente no hay filas
        new String[]{"Nombre", "Nivel", "Grado", "Edad"} // Títulos de las columnas
    ));
}

// Método para actualizar los combos de grado y edad según el nivel seleccionado
private void updateGradoAndEdad() {
    // Obtiene el nivel seleccionado en el combo box
    String nivelSeleccionado = (String) cboNivel.getSelectedItem();
    
    // Establece el modelo del combo box de grado según el nivel seleccionado
    cboGrado.setModel(new javax.swing.DefaultComboBoxModel<>(datos(nivelSeleccionado)));
    
    // Establece el modelo del combo box de edad según el nivel seleccionado
    cboEdad.setModel(new javax.swing.DefaultComboBoxModel<>(edades(nivelSeleccionado)));
}

// Método para obtener los grados según el nivel seleccionado
public String[] datos(String nivel) {
    switch (nivel) {
        case "Inicial":
            // Devuelve los grados para nivel Inicial
            return new String[]{"3", "4", "5"};
        case "Primaria":
            // Devuelve los grados para nivel Primaria
            return new String[]{"1", "2", "3", "4", "5", "6"};
        case "Secundaria":
            // Devuelve los grados para nivel Secundaria
            return new String[]{"1", "2", "3", "4", "5"};
        default:
            // Retorna un arreglo vacío si el nivel no es válido
            return new String[]{};
    }
}

// Método para obtener las edades según el nivel seleccionado
public String[] edades(String nivel) {
    switch (nivel) {
        case "Inicial":
            // Devuelve las edades para nivel Inicial
            return new String[]{"3", "4", "5"};
        case "Primaria":
            // Devuelve las edades para nivel Primaria
            return new String[]{"6", "7", "8", "9", "10", "11"};
        case "Secundaria":
            // Devuelve las edades para nivel Secundaria
            return new String[]{"12", "13", "14", "15", "16", "17"};
        default:
            // Retorna un arreglo vacío si el nivel no es válido
            return new String[]{};
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboNivel = new javax.swing.JComboBox<>();
        cboGrado = new javax.swing.JComboBox<>();
        cboEdad = new javax.swing.JComboBox<>();
        txtNOMBRE = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalida = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Nivel");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Grado");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Nombre");

        cboNivel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inicial", "Primaria", "Secundaria", " " }));
        cboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivelActionPerformed(evt);
            }
        });

        cboGrado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cboGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", " " }));

        cboEdad.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cboEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", " " }));

        txtNOMBRE.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        btnProcesar.setBackground(new java.awt.Color(0, 255, 255));
        btnProcesar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(java.awt.Color.red);
        btnBorrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(java.awt.Color.green);
        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(java.awt.Color.yellow);
        btnModificar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tblSalida.setBackground(java.awt.Color.yellow);
        tblSalida.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tblSalida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblSalida);

        jLabel5.setBackground(java.awt.Color.red);
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("Proyecto matriculas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(71, 71, 71)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(378, 378, 378)
                            .addComponent(cboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel5)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcesar)
                    .addComponent(btnBorrar)
                    .addComponent(btnEditar)
                    .addComponent(btnModificar))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

    // Declaración de datos
    int grado = 0; 
    int edad = 0;  
    String nombre = ""; 
    String nivel = ""; 
    String opcionSeleccionada, gradoT, edadT; 

    // Obtener datos de entrada de los componentes de la interfaz
    opcionSeleccionada = (String) cboNivel.getSelectedItem(); 
    gradoT = (String) cboGrado.getSelectedItem(); 
    edadT = (String) cboEdad.getSelectedItem(); 
    nombre = txtNOMBRE.getText().trim(); 

    // Verificar si todos los datos necesarios están ingresados
    if (opcionSeleccionada == null || gradoT == null || edadT == null || nombre.isEmpty()) {
        // Muestra un mensaje si falta algún dato
        JOptionPane.showMessageDialog(this, "Por favor, ingresa todos los datos: nivel, grado, nombre y edad.");
        return; 
    }

    // Convertir el texto del grado y edad a entero
    try {
        grado = Integer.parseInt(gradoT); 
        edad = Integer.parseInt(edadT); 
    } catch (NumberFormatException e) {
        // Muestra un mensaje si hay un error en la conversión
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un grado y edad válidos.");
        return; 
    }

    // Proceso de validación según el nivel seleccionado
    boolean esValido = false; // para validar
    switch (opcionSeleccionada) {
        case "Inicial":
            // Valida rango de grado y edad para nivel Inicial
            esValido = (grado >= 3 && grado <= 5 && edad >= 3 && edad <= 5);
            nivel = "Inicial"; 
            break;
        case "Primaria":
            // Valida rango de grado y edad para nivel Primaria
            esValido = (grado >= 1 && grado <= 6 && edad >= 6 && edad <= 11);
            nivel = "Primaria"; 
            break;
        case "Secundaria":
            // Valida rango de grado y edad para nivel Secundaria
            esValido = (grado >= 1 && grado <= 5 && edad >= 12 && edad <= 17);
            nivel = "Secundaria"; 
            break;
        default:
            // Muestra un mensaje si el nivel no es válido
            JOptionPane.showMessageDialog(this, "Nivel no válido.");
            return; 
    }

    // Mostrar mensaje de error si no es válido
    if (!esValido) {
        // Muestra un mensaje si la validación falla
        JOptionPane.showMessageDialog(this, "Grado o edad no válido para " + nivel + ".");
        return; 
    }

    // Llenar la tabla con los datos
    DefaultTableModel model = (DefaultTableModel) tblSalida.getModel(); 
    model.addRow(new Object[]{nombre, nivel, grado, edad}); 

    // Limpiar los campos después de procesar
    cboNivel.setSelectedIndex(0); 
    cboGrado.setSelectedIndex(0); 
    cboEdad.setSelectedIndex(0); 
    txtNOMBRE.setText(""); 
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
    // Obtener la fila seleccionada
    int filaSeleccionada = tblSalida.getSelectedRow(); 

    // Verificar si se ha seleccionado alguna fila
    if (filaSeleccionada == -1) { 
        // Muestra un mensaje si no se ha seleccionado ninguna fila
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para borrar.");
        return; 
    }
    
// Mensaje de confirmación antes de borrar
int confirmacion = JOptionPane.showConfirmDialog(this, 
    "¿Estás seguro de que deseas borrar esta fila?", // Mensaje a mostrar
    "Confirmar Borrado", // Título del cuadro de diálogo
    JOptionPane.YES_NO_OPTION); // Opciones de respuesta (Sí/No)

// Verifica la respuesta del usuario
if (confirmacion != JOptionPane.YES_OPTION) {
    // Si el usuario no selecciona "Sí", sale del método sin hacer nada
    return; 
}


    // Eliminar la fila seleccionada del modelo de la tabla
    DefaultTableModel model = (DefaultTableModel) tblSalida.getModel();
    model.removeRow(filaSeleccionada); 

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void cboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivelActionPerformed
        // TODO add your handling code here:
        updateGradoAndEdad();
    }//GEN-LAST:event_cboNivelActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    // Obtiene el índice de la fila seleccionada en la tabla
    filaSeleccionada = tblSalida.getSelectedRow(); 

    // Verifica si no se ha seleccionado ninguna fila
    if (filaSeleccionada == -1) {
        // Muestra un mensaje de advertencia
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila de la tabla para editar.");
        return; 
    }

    try {
        // Carga los datos de la fila seleccionada en los campos de entrada
        // Se supone que la primera columna contiene el nombre
        txtNOMBRE.setText((String) tblSalida.getValueAt(filaSeleccionada, 0));
        
        // Se establece el nivel seleccionado en el combo box
        cboNivel.setSelectedItem(tblSalida.getValueAt(filaSeleccionada, 1));
        
        // Se establece el grado seleccionado en el combo box, convirtiéndolo a cadena
        cboGrado.setSelectedItem(tblSalida.getValueAt(filaSeleccionada, 2).toString());
        
        // Se establece la edad seleccionada en el combo box, convirtiéndola a cadena
        cboEdad.setSelectedItem(tblSalida.getValueAt(filaSeleccionada, 3).toString());
    } catch (Exception e) {
        // Muestra un mensaje de error si ocurre una excepción al cargar los datos
        JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
    }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    // Verifica si hay una fila seleccionada
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Primero debes seleccionar una fila y hacer clic en 'Editar'.");
        return; 
    }

    // Mensaje de confirmación antes de borrar
int confirmacion = JOptionPane.showConfirmDialog(this, 
    "¿Estás seguro de que deseas modificar esta fila?", // Mensaje a mostrar
    "Confirmar Borrado", // Título del cuadro de diálogo
    JOptionPane.YES_NO_OPTION); // Opciones de respuesta (Sí/No)

// Verifica la respuesta del usuario
if (confirmacion != JOptionPane.YES_OPTION) {
    // Si el usuario no selecciona "Sí", sale del método sin hacer nada
    return; 
}
    
    try {
        // Actualiza los datos en la tabla con los valores actuales de los campos
        tblSalida.setValueAt(txtNOMBRE.getText(), filaSeleccionada, 0);
        tblSalida.setValueAt(cboNivel.getSelectedItem(), filaSeleccionada, 1);
        tblSalida.setValueAt(cboGrado.getSelectedItem(), filaSeleccionada, 2);
        tblSalida.setValueAt(cboEdad.getSelectedItem(), filaSeleccionada, 3);
        // Mensaje de confirmación para el usuario
        JOptionPane.showMessageDialog(this, "Los datos han sido actualizados correctamente.");

    } catch (Exception e) {
        // Muestra un mensaje de error si ocurre una excepción al actualizar los datos
        JOptionPane.showMessageDialog(this, "Error al actualizar los datos: " + e.getMessage());
    } finally {
        // Limpia los campos y resetea la fila seleccionada
        limpiarCampos(); 
        filaSeleccionada = -1; 
    }
}

// Método para limpiar los campos después de procesar o modificar
private void limpiarCampos() {
    cboNivel.setSelectedIndex(0);
    cboGrado.setSelectedIndex(0);
    cboEdad.setSelectedIndex(0);
    txtNOMBRE.setText("");
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cboEdad;
    private javax.swing.JComboBox<String> cboGrado;
    private javax.swing.JComboBox<String> cboNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalida;
    private javax.swing.JTextField txtNOMBRE;
    // End of variables declaration//GEN-END:variables
}
