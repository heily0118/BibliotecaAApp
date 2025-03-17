/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.BibliotecaApp.views;

import autonoma.BibliotecaApp.models.Biblioteca;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import autonoma.BibliotecaApp.models.Libro;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import autonoma.BibliotecaApp.models.Autor;
/**
 *
 * @author Heily Yohana Rios Ayala<heilyy.riosa@autonoma.edu.co>
 * * 
 * @version 1.0.0
 * 
 * @since 20250312
 */
 
public class BuscarLibro extends javax.swing.JDialog {
     private Biblioteca biblioteca;

    /**
     * Creates new form BuscarLibro
     */
    public BuscarLibro(java.awt.Frame parent, boolean modal,Biblioteca biblioteca) {
        super(parent, modal);
        initComponents();
        setSize(700, 550);
        setResizable(false);
        this.setLocationRelativeTo(null);
        inicializarComboBox();
        
        this.biblioteca = biblioteca;
         
        try{ 
        this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/BibliotecaApp/images/Biblioteca.png")).getImage());
        }catch(Exception e){
            
        }
         LisLibros.setSelectionBackground(new Color(173, 216, 230)); 
         LisLibros.setSelectionForeground(Color.WHITE);

       
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
        libroBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JPanel();
        buscar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        LisLibros = new javax.swing.JTable();
        btnAceptar = new javax.swing.JToggleButton();
        btnAtras = new javax.swing.JToggleButton();
        btnOpcionLibro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 500));
        setSize(new java.awt.Dimension(650, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 2));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaApp/images/cerrar.png"))); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        libroBuscar.setForeground(new java.awt.Color(204, 204, 204));
        libroBuscar.setText("Ingresa el ID del libro a buscar");
        libroBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        libroBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libroBuscarMouseClicked(evt);
            }
        });
        libroBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 199));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaApp/images/buscar.png"))); // NOI18N

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(libroBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(libroBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 2));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        LisLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        LisLibros.setSelectionBackground(new java.awt.Color(255, 255, 255));
        LisLibros.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(LisLibros);
        if (LisLibros.getColumnModel().getColumnCount() > 0) {
            LisLibros.getColumnModel().getColumn(0).setResizable(false);
            LisLibros.getColumnModel().getColumn(1).setResizable(false);
            LisLibros.getColumnModel().getColumn(2).setResizable(false);
            LisLibros.getColumnModel().getColumn(3).setResizable(false);
        }

        jScrollPane1.setViewportView(jScrollPane2);

        btnAceptar.setBackground(new java.awt.Color(0, 102, 51));
        btnAceptar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(204, 51, 0));
        btnAtras.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnOpcionLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOpcionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnOpcionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnAtras))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
     System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnOpcionLibroPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_btnOpcionLibroPopupMenuWillBecomeVisible
        if (this.btnOpcionLibro.getItemCount() == 0) {

            this.btnOpcionLibro.addItem("Selecciona una opcion");
            this.btnOpcionLibro.addItem("Actualizar");
            this.btnOpcionLibro.addItem("Eliminar");
      
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
            int filaSeleccionada = LisLibros.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona un libro de la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

    long idLibro = Long.parseLong(LisLibros.getValueAt(filaSeleccionada, 1).toString());
    String nuevoTitulo = obtenerTituloDesdeInput();
    String nuevoAutor = obtenerNombreAutorDesdeInput();
    String nuevaEditorial = obtenerEditorialAutorDesdeInput();

    Autor autorActualizado = new Autor(nuevaEditorial, nuevoAutor);
    Libro libroActualizado = new Libro(nuevoTitulo, autorActualizado);
    if (biblioteca.actualizarLibro(idLibro, libroActualizado)) {
        JOptionPane.showMessageDialog(this, "Libro actualizado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        DefaultTableModel modelo = (DefaultTableModel) LisLibros.getModel();
        modelo.setRowCount(0);
        modelo.addRow(new Object[]{libroActualizado.getTitulo(), idLibro, libroActualizado.getAutor().getNombre(), libroActualizado.getAutor().getEditorial()});
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró el libro para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    break;






        case "Eliminar":
            filaSeleccionada = LisLibros.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un libro de la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    idLibro = Long.parseLong(LisLibros.getValueAt(filaSeleccionada, 1).toString());
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar el libro?", "Confirmación", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        if (biblioteca.eliminarLibro(idLibro)) {
            JOptionPane.showMessageDialog(this, "Libro eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel modelo = (DefaultTableModel) LisLibros.getModel();
            modelo.setRowCount(0); // Agregar esta línea
            libroBuscar.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el libro para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    break;




        default:
            JOptionPane.showMessageDialog(this, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            break;
        }
    }//GEN-LAST:event_btnOpcionLibroActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
    DefaultTableModel modelo = (DefaultTableModel) LisLibros.getModel();
    modelo.setRowCount(0);
    String textoId = libroBuscar.getText().trim();
    if (textoId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    try {
        long id = Long.parseLong(textoId);
        Libro libro = biblioteca.obtenerLibroPorId(id);
        if (libro == null) {
            JOptionPane.showMessageDialog(this, "El libro con ID " + textoId + " No se encunetra en nuentra biblioteca.", "Error", JOptionPane.ERROR_MESSAGE);
            libroBuscar.setText(""); 
            return;
        }
        modelo.addRow(new Object[]{ libro.getTitulo(), libro.getId(), libro.getAutor().getNombre(), libro.getAutor().getEditorial() });
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }



    }//GEN-LAST:event_btnBuscarMouseClicked

    private void libroBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroBuscarActionPerformed
        

    }//GEN-LAST:event_libroBuscarActionPerformed

    private void libroBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libroBuscarMouseClicked
        if (libroBuscar.getText().equals("Ingresa el ID del libro a buscar")) {
        libroBuscar.setText("");
        libroBuscar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_libroBuscarMouseClicked
    private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(200,255,255));
        
    }
    private void mouseExited(JPanel panel){
        panel.setBackground(new Color(255,255,255));
    }
    
    private void inicializarComboBox() {
        
    btnOpcionLibro.addItem("Selecciona una opción");
    btnOpcionLibro.addItem("Actualizar");
    btnOpcionLibro.addItem("Eliminar");

    btnOpcionLibro.setSelectedIndex(0); 
}
    private void actualizarTabla(ArrayList<Libro> libros) {
     DefaultTableModel modelo = (DefaultTableModel) LisLibros.getModel();
    modelo.setRowCount(0);
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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LisLibros;
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JToggleButton btnAtras;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JComboBox<String> btnOpcionLibro;
    private javax.swing.JLabel buscar;
    private javax.swing.JToggleButton cerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField libroBuscar;
    // End of variables declaration//GEN-END:variables
}
