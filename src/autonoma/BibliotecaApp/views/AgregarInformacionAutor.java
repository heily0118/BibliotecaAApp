/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.BibliotecaApp.views;

import autonoma.BibliotecaApp.models.Biblioteca;
import autonoma.BibliotecaApp.models.Autor;
import java.awt.Dialog;
import javax.swing.ImageIcon;
import autonoma.BibliotecaApp.models.Libro;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * * 
 * @version 1.0.0
 * 
 * @since 20250312
 */
public class AgregarInformacionAutor extends javax.swing.JDialog {
       
       private Biblioteca biblioteca;
       private Autor autor;

    /**
     * Creates new form AgregarInformacionAutor
     */
    public AgregarInformacionAutor(java.awt.Window parent, boolean modal,  Biblioteca biblioteca,Autor autor) {
    super((Dialog) parent, modal);
    initComponents();
    setSize(700, 550);
    setResizable(false);
    this.setLocationRelativeTo(null);

    this.biblioteca = biblioteca; 
    this.autor = autor;

    try { 
        this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/BibliotecaApp/images/Biblioteca.png")).getImage());
    } catch (NullPointerException e) {
        System.out.println("Imagen no encontrada");
    }

    
    if (autor != null) {
        nombreAutor.setText(autor.getNombre());
        documentoIdentidad.setText(String.valueOf(autor.getDocumentoIdentidad()));
        correoElectronico.setText(autor.getCorreoElectronico());
        editorial.setText(autor.getEditorial());
        profesion.setText(autor.getProfesion());
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cerrar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nombreAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        profesion = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        editorial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        documentoIdentidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 2));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaApp/images/cerrar.png"))); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jLabel1.setText("Información autor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 2));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ingresa el nombre del autor del libro:");

        nombreAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombreAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAutorActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ingresa el nombre de la editorial:");

        profesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        profesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesionActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(0, 102, 51));
        btnAceptar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ingresa la profesion:");

        editorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorialActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Ingresa el documento de identidad:");

        documentoIdentidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        documentoIdentidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        documentoIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoIdentidadActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ingresa el correo electronico:");

        correoElectronico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correoElectronico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        correoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoElectronicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreAutor)
                    .addComponent(profesion)
                    .addComponent(editorial)
                    .addComponent(documentoIdentidad)
                    .addComponent(correoElectronico))
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(92, 92, 92)
                .addComponent(btnAceptar)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAutorActionPerformed

    private void profesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesionActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    String nombre = nombreAutor.getText().trim();
    String profesionAutor = profesion.getText().trim();
    String editorialLibro = editorial.getText().trim();
    String numeroIdentidad = documentoIdentidad.getText().trim();
    String correo = correoElectronico.getText().trim();

    
    if (nombre.isEmpty() || profesionAutor.isEmpty() || editorialLibro.isEmpty() || 
         numeroIdentidad.isEmpty() || correo.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }

    try {
        
        long documento = Long.parseLong(numeroIdentidad);
        if (documento <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "El documento de identidad debe ser un número positivo.");
            return;
        }

        
        if (!correo.contains("@")) {
            javax.swing.JOptionPane.showMessageDialog(this, "El correo electrónico debe contener '@'.");
            return;
        }

        
        if (biblioteca.obtenerAutorPorDocumento(documento) != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un autor con este documento de identidad.");
            return;
        }

         Autor nuevoAutor = new Autor(nombre, documento, correo, editorialLibro, profesionAutor);
          biblioteca.agregarAutor(nuevoAutor);
          this.autor = nuevoAutor; 


        javax.swing.JOptionPane.showMessageDialog(this, "Autor agregado con éxito.");
        System.out.println("Autor guardado: " + nuevoAutor.getNombre() + " - Documento: " + nuevoAutor.getDocumentoIdentidad());

        
        this.dispose(); 
        if (this.getOwner() instanceof javax.swing.JDialog) {
            javax.swing.JDialog ventanaAgregar = (javax.swing.JDialog) this.getOwner();
            ventanaAgregar.dispose();
        }

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "El documento de identidad debe ser un número válido.");
    }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void editorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editorialActionPerformed

    private void documentoIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoIdentidadActionPerformed

    private void correoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoActionPerformed

    public Autor getAutor() {
    return this.autor; 
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JToggleButton cerrar;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JTextField documentoIdentidad;
    private javax.swing.JTextField editorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreAutor;
    private javax.swing.JTextField profesion;
    // End of variables declaration//GEN-END:variables
}
