/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.BibliotecaApp.views;

import autonoma.BibliotecaApp.models.Biblioteca;
import autonoma.BibliotecaApp.models.Libro;
import autonoma.BibliotecaApp.models.Autor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * * 
 * @version 1.0.0
 * 
 * @since 20250312
 */
public class MostrarLibros extends javax.swing.JDialog {
    private Biblioteca biblioteca;


    /**
     * Creates new form MostrarLibros
     */
    public MostrarLibros(java.awt.Frame parent, boolean modal,Biblioteca biblioteca) {
        super(parent, modal);
        initComponents();
        setSize(700, 550);
        setResizable(false);
        this.setLocationRelativeTo(null);
        inicializarComboBox();
        
        this.biblioteca = biblioteca;
         
        try{ 
        this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/BibliotecaApp/images/Biblioteca.png")).getImage());
        
        }catch(NullPointerException e){
             System.out.println("Imagen no encontrada");
            
        }
        ListLibros.setSelectionBackground(new Color(173, 216, 230)); 
        ListLibros.setSelectionForeground(Color.WHITE);
        actualizarTabla(biblioteca.obtenerTodosLosLibros());
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
        jLabel1 = new javax.swing.JLabel();
        cerrar = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListLibros = new javax.swing.JTable();
        btnAtras = new javax.swing.JToggleButton();
        btnOpcionLibro = new javax.swing.JComboBox<>();
        detalles = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 550));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Libros registrados");

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaApp/images/cerrar.png"))); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 2));

        jScrollPane4.setBorder(null);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ListLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "ID", "Autor", "Editorial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ListLibros);
        if (ListLibros.getColumnModel().getColumnCount() > 0) {
            ListLibros.getColumnModel().getColumn(0).setResizable(false);
            ListLibros.getColumnModel().getColumn(1).setResizable(false);
            ListLibros.getColumnModel().getColumn(2).setResizable(false);
            ListLibros.getColumnModel().getColumn(3).setResizable(false);
        }

        jScrollPane4.setViewportView(jScrollPane3);

        btnAtras.setBackground(new java.awt.Color(204, 51, 0));
        btnAtras.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnOpcionLibro.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                btnOpcionLibroPopupMenuWillBecomeVisible(evt);
            }
        });
        btnOpcionLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionLibroActionPerformed(evt);
            }
        });

        detalles.setBackground(new java.awt.Color(102, 153, 255));
        detalles.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        detalles.setForeground(new java.awt.Color(255, 255, 255));
        detalles.setText("Detalles autor");
        detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detalles)
                            .addComponent(btnOpcionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnOpcionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(detalles))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnOpcionLibroPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_btnOpcionLibroPopupMenuWillBecomeVisible
       if (this.btnOpcionLibro.getItemCount() == 0) {
           
        this.btnOpcionLibro.addItem("Selecciona una opcion");
        this.btnOpcionLibro.addItem("Actualizar");
        this.btnOpcionLibro.addItem("Eliminar");
        this.btnOpcionLibro.addItem("Ordenar A-Z");
        this.btnOpcionLibro.setSelectedIndex(0);
       
    }
    }//GEN-LAST:event_btnOpcionLibroPopupMenuWillBecomeVisible

    private void btnOpcionLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionLibroActionPerformed
      String opcionSeleccionada = (String) btnOpcionLibro.getSelectedItem();
       if (opcionSeleccionada.equals("Selecciona una opción")) {
        return; 
    }

    switch (opcionSeleccionada) {
         case "Actualizar":
            int filaSeleccionada = ListLibros.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona un libro de la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            
            long idLibro = Long.parseLong(ListLibros.getValueAt(filaSeleccionada, 1).toString());

           
            Libro libroExistente = biblioteca.obtenerLibroPorId(idLibro);
            if (libroExistente == null) {
                JOptionPane.showMessageDialog(this, "No se encontró el libro en la biblioteca.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

           
            String nuevoTitulo = obtenerTituloDesdeInput();
            String nuevoNombreAutor = obtenerNombreAutorDesdeInput();
            String nuevaEditorialAutor = obtenerEditorialAutorDesdeInput();
            
            long nuevaCedula = obtenerCedulaAutorDesdeInput();
            String nuevoCorreo = obtenerCorreoDesdeInput();
            String nuevaProfesion = obtenerProfesionDesdeInput(); 

           Autor autorActualizado = new Autor(nuevoNombreAutor, nuevaCedula, nuevoCorreo, nuevaEditorialAutor, nuevaProfesion);

            
            libroExistente.setTitulo(nuevoTitulo);
            libroExistente.setAutor(autorActualizado);

            
            if (biblioteca.actualizarLibro(idLibro, libroExistente)) {
                JOptionPane.showMessageDialog(this, "Libro actualizado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla(biblioteca.obtenerTodosLosLibros());
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el libro.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            break;
    




        case "Eliminar":
            filaSeleccionada = ListLibros.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona un libro de la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            idLibro = Long.parseLong(ListLibros.getValueAt(filaSeleccionada, 1).toString());
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar el libro?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                if (biblioteca.eliminarLibro(idLibro)) {
                  
                    JOptionPane.showMessageDialog(this, "Libro eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla(biblioteca.obtenerTodosLosLibros());
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el libro para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

        case "Ordenar A-Z":
            if (ListLibros.getRowCount() == 0) {
               JOptionPane.showMessageDialog(this, "No hay libros en la biblioteca para ordenar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
               return;
              }

            ArrayList<Libro> librosOrdenados = biblioteca.obtenerLibrosAlfabeticamente();
            actualizarTabla(librosOrdenados); 
               
          break;

        default:
            JOptionPane.showMessageDialog(this, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            break;
        }

                              
    }//GEN-LAST:event_btnOpcionLibroActionPerformed

    private void detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesActionPerformed
      int filaSeleccionada = ListLibros.getSelectedRow();
    
    
    if (filaSeleccionada == -1) {
       
        JOptionPane.showMessageDialog(
            this,
            "Debe seleccionar un libro primero",
            "Error",
            JOptionPane.WARNING_MESSAGE
        );
        return; 
    }
    
   
    try {
        long idLibro = (long) ListLibros.getValueAt(filaSeleccionada, 1); 
        Autor autorSeleccionado = biblioteca.obtenerAutorPorIdLibro(idLibro); 
        Libro libroSeleccionado = biblioteca.obtenerLibroPorId(idLibro);
        
        JDialog ventanaDetalles = new JDialog(this, "Detalles del Autor", true);
        
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
        
        JLabel lblNombre = new JLabel("Nombre: " + autorSeleccionado.getNombre());
        JLabel lblCorreo = new JLabel("Correo: " + autorSeleccionado.getCorreoElectronico());
        JLabel lblProfesion = new JLabel("Profesión: " + autorSeleccionado.getProfesion());
        JLabel lblDocumento = new JLabel("Documento identidad: " + autorSeleccionado.getDocumentoIdentidad());
        JLabel lblEditorial = new JLabel("Editorial: " + autorSeleccionado.getEditorial());
        
        Font labelFont = new Font("Arial", Font.PLAIN, 14);
        lblNombre.setFont(labelFont);
        lblCorreo.setFont(labelFont);
        lblProfesion.setFont(labelFont);
        lblDocumento.setFont(labelFont);
        lblEditorial.setFont(labelFont);
        
       
        panel.add(lblNombre);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(lblCorreo);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(lblProfesion);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(lblDocumento);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(lblEditorial);
        
       
        ventanaDetalles.add(panel);
        
        ventanaDetalles.setSize(700, 550);
        ventanaDetalles.setLocationRelativeTo(this);
        ventanaDetalles.setVisible(true);
    } catch (Exception e) {
        
        JOptionPane.showMessageDialog(
            this,
            "Error al obtener los detalles: " + e.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE
        );
        
    }



    }//GEN-LAST:event_detallesActionPerformed
    private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(200,255,255));
        
    }
    private void mouseExited(JPanel panel){
    panel.setBackground(new Color(255,255,255));
    }
    private void actualizarTabla(ArrayList<Libro> libros) {
     DefaultTableModel modelo = (DefaultTableModel) ListLibros.getModel();
    modelo.setRowCount(0);

    if (libros == null || libros.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay libros disponibles.", "Información", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    for (Libro libro : libros) {
        modelo.addRow(new Object[]{libro.getTitulo(), libro.getId(), libro.getAutor().getNombre(), libro.getAutor().getEditorial()});
    }
}
    private long obtenerIdDesdeInput(String input) {
    if (input == null || input.trim().isEmpty()) {
        System.out.println("Error: El ID ingresado es nulo o vacío.");
        return -1; 
    }
    
    try {
        return Long.parseLong(input);
    } catch (NumberFormatException e) {
        System.out.println("Error: El ID ingresado no es un número válido.");
        return -1; 
    }
}

private String obtenerTituloDesdeInput() {
    return JOptionPane.showInputDialog("Ingrese el nuevo título:");
}
private String obtenerNombreAutorDesdeInput() {
    return JOptionPane.showInputDialog("Ingrese el nuevo nombre del autor:");
}

private String obtenerEditorialAutorDesdeInput() {
    return JOptionPane.showInputDialog("Ingrese la nueva editorial del autor:");
}

private long obtenerCedulaAutorDesdeInput() {
    String input = JOptionPane.showInputDialog("Ingrese la cédula del autor:");
    return Long.parseLong(input);
}

private String obtenerCorreoDesdeInput() {
    return JOptionPane.showInputDialog("Ingrese el correo del autor:");
}

private String obtenerProfesionDesdeInput() {
    return JOptionPane.showInputDialog("Ingrese la nueva profesión del autor:");
}

   private void inicializarComboBox() {
    btnOpcionLibro.addItem("Selecciona una opción");
    btnOpcionLibro.addItem("Actualizar");
    btnOpcionLibro.addItem("Eliminar");
    btnOpcionLibro.addItem("Ordenar A-Z");

    btnOpcionLibro.setSelectedIndex(0); 
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListLibros;
    private javax.swing.JToggleButton btnAtras;
    private javax.swing.JComboBox<String> btnOpcionLibro;
    private javax.swing.JToggleButton cerrar;
    private javax.swing.JToggleButton detalles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
