
package interfaz;

import bean.Empleado;
import dao.EmpleadoDAO;


public class Frm_Empleado extends javax.swing.JFrame {

   
    public Frm_Empleado() {
        initComponents();
        setTitle("Empleado");
        setLocationRelativeTo(null);
        setSize(500,400);
        
    }

    
    //Metodos para Capturar Datos.
    
    
    
  
    //Metodo para Limpiar las cajas de texto.
    public void Limpiar_Registrar()
    {
        txt_Nombres_Registar.setText("");
        txt_ApellidoPa_Registar.setText("");
        txt_ApellidoMa_Registar.setText("");
        txt_Cargo_Registar.setText("");
        
    }
     public void Limpiar_Eliminar()
    {
        txt_Codigo_Eliminar.setText("");
        txt_Nombres_Eliminar.setText("");
        txt_ApePa_Eliminar.setText("");
        txt_Apema_Eliminar.setText("");
        txt_Cargo_Eliminar.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_Insertar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombres_Registar = new javax.swing.JTextField();
        btn_Registrar = new javax.swing.JButton();
        txt_ApellidoPa_Registar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Cargo_Registar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_ApellidoMa_Registar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Panel_Eliminar = new javax.swing.JPanel();
        btn_Buscar_Eliminar = new javax.swing.JButton();
        txt_Codigo_Eliminar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_Nombres_Eliminar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_ApePa_Eliminar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Apema_Eliminar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_Cargo_Eliminar = new javax.swing.JTextField();
        btn_Eliminar = new javax.swing.JButton();
        Panel_Modificar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_Codigo_Modificar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Nombres_Modificar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ApePa_Modificar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_ApeMa_Modificar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Cargo_Modificar = new javax.swing.JTextField();
        btn_Buscar_Modificar = new javax.swing.JButton();
        btn_Actualizar_Modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Insertar.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel1.setText("Nombres:");

        txt_Nombres_Registar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_Registrar.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        btn_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btn_Registrar.setText("Registrar");
        btn_Registrar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        txt_ApellidoPa_Registar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel2.setText("Apellido Paterno:");

        txt_Cargo_Registar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel3.setText("Cargo:");

        txt_ApellidoMa_Registar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        javax.swing.GroupLayout Panel_InsertarLayout = new javax.swing.GroupLayout(Panel_Insertar);
        Panel_Insertar.setLayout(Panel_InsertarLayout);
        Panel_InsertarLayout.setHorizontalGroup(
            Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InsertarLayout.createSequentialGroup()
                .addGroup(Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InsertarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(Panel_InsertarLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(46, 46, 46)
                                    .addComponent(txt_Nombres_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel_InsertarLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_ApellidoPa_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel_InsertarLayout.createSequentialGroup()
                                .addGroup(Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Cargo_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ApellidoMa_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Panel_InsertarLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        Panel_InsertarLayout.setVerticalGroup(
            Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InsertarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nombres_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ApellidoPa_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_ApellidoMa_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Cargo_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insertar Empleado", Panel_Insertar);

        Panel_Eliminar.setBackground(new java.awt.Color(204, 204, 255));

        btn_Buscar_Eliminar.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        btn_Buscar_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btn_Buscar_Eliminar.setText("Buscar");
        btn_Buscar_Eliminar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Buscar_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Buscar_EliminarActionPerformed(evt);
            }
        });

        txt_Codigo_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel10.setText("Codigo:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel11.setText("Nombres:");

        txt_Nombres_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Nombres_Eliminar.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel12.setText("Apellido Paterno:");

        txt_ApePa_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_ApePa_Eliminar.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel13.setText("Apellido Materno:");

        txt_Apema_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Apema_Eliminar.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel14.setText("Cargo:");

        txt_Cargo_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Cargo_Eliminar.setEnabled(false);

        btn_Eliminar.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.gif"))); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_EliminarLayout = new javax.swing.GroupLayout(Panel_Eliminar);
        Panel_Eliminar.setLayout(Panel_EliminarLayout);
        Panel_EliminarLayout.setHorizontalGroup(
            Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EliminarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_EliminarLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Cargo_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_EliminarLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Apema_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Panel_EliminarLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_ApePa_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel_EliminarLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(46, 46, 46)
                            .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Codigo_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Nombres_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btn_Buscar_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(Panel_EliminarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_EliminarLayout.setVerticalGroup(
            Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EliminarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_Codigo_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_Nombres_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_ApePa_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_Apema_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_Cargo_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Empleado", Panel_Eliminar);

        Panel_Modificar.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel5.setText("Codigo:");

        txt_Codigo_Modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel6.setText("Nombres:");

        txt_Nombres_Modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Nombres_Modificar.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel7.setText("Apellido Paterno:");

        txt_ApePa_Modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_ApePa_Modificar.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel8.setText("Apellido Materno:");

        txt_ApeMa_Modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_ApeMa_Modificar.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel9.setText("Cargo:");

        txt_Cargo_Modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Cargo_Modificar.setEnabled(false);

        btn_Buscar_Modificar.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        btn_Buscar_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btn_Buscar_Modificar.setText("Buscar");
        btn_Buscar_Modificar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Buscar_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Buscar_ModificarActionPerformed(evt);
            }
        });

        btn_Actualizar_Modificar.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        btn_Actualizar_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reinicializar.png"))); // NOI18N
        btn_Actualizar_Modificar.setText("Actualizar");
        btn_Actualizar_Modificar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Actualizar_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_ModificarLayout = new javax.swing.GroupLayout(Panel_Modificar);
        Panel_Modificar.setLayout(Panel_ModificarLayout);
        Panel_ModificarLayout.setHorizontalGroup(
            Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ModificarLayout.createSequentialGroup()
                        .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_ModificarLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Cargo_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_ModificarLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ApeMa_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_ModificarLayout.createSequentialGroup()
                        .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(Panel_ModificarLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_ApePa_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel_ModificarLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(46, 46, 46)
                                    .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Codigo_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Nombres_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btn_Buscar_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(Panel_ModificarLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btn_Actualizar_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Panel_ModificarLayout.setVerticalGroup(
            Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ModificarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Codigo_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar_Modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Nombres_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ApePa_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_ApeMa_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Cargo_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btn_Actualizar_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Empleado", Panel_Modificar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        
        //Se crea objeto Empleado para encapsular sus campos.
        Empleado emp = new Empleado();
        //Encapsulamos cada campo es como si acomulasemos los datos.
        emp.setNombre(txt_Nombres_Registar.getText());
        emp.setApepat(txt_ApellidoPa_Registar.getText());
        emp.setApemat(txt_ApellidoMa_Registar.getText());
        emp.setCargo(txt_Cargo_Registar.getText());
        
        String m=EmpleadoDAO.Insertar(emp);
        
        
        if(m=="Retorna-Ok")
        {
          
            Limpiar_Registrar();
            txt_Nombres_Registar.requestFocus();
        }
        else
        {
            System.out.println("Error:"+m);
        }
      
        
         
        
        
        
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_Buscar_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscar_EliminarActionPerformed
        int codigo = Integer.parseInt(txt_Codigo_Eliminar.getText());
        
        Empleado emp= EmpleadoDAO.Buscar(codigo);
        
        txt_Nombres_Eliminar.setText(emp.getNombre());
        txt_ApePa_Eliminar.setText(emp.getApepat());
        txt_Apema_Eliminar.setText(emp.getApemat());
        txt_Cargo_Eliminar.setText(emp.getCargo());
        
        
        
    }//GEN-LAST:event_btn_Buscar_EliminarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        
        
        int codigo = Integer.parseInt(txt_Codigo_Eliminar.getText());
        
        
        String m = EmpleadoDAO.Eliminar(codigo);
        
        if(m=="Retorna-Ok")
        {
            Limpiar_Eliminar();
            txt_Codigo_Eliminar.requestFocus();
        }
        else
        {
            System.out.println("Error:"+m);
        }
        
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_Buscar_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscar_ModificarActionPerformed
        
        
        int codigo =Integer.parseInt(txt_Codigo_Modificar.getText());
        Empleado emp = new Empleado();
        emp= EmpleadoDAO.Buscar(codigo);
        
        txt_Nombres_Modificar.setText(emp.getNombre());
        txt_ApePa_Modificar.setText(emp.getApepat());
        txt_ApeMa_Modificar.setText(emp.getApemat());
        txt_Cargo_Modificar.setText(emp.getCargo());
        txt_Nombres_Modificar.setEnabled(true);
        txt_ApePa_Modificar.setEnabled(true);
        txt_ApeMa_Modificar.setEnabled(true);
        txt_Cargo_Modificar.setEnabled(true);
        
    }//GEN-LAST:event_btn_Buscar_ModificarActionPerformed

    private void btn_Actualizar_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_ModificarActionPerformed
        
        Empleado emp = new Empleado();
        emp.setNombre(txt_Nombres_Modificar.getText());
        emp.setApepat(txt_ApePa_Modificar.getText());
        emp.setApemat(txt_ApeMa_Modificar.getText());
        emp.setCargo(txt_Cargo_Modificar.getText());
        emp.setIdempleado(Integer.parseInt(txt_Codigo_Modificar.getText()));
        
        String m=EmpleadoDAO.Actualizar(emp);
        
        if(m=="Retorna-Ok")
        {
            txt_Nombres_Modificar.setText("");
            txt_ApePa_Modificar.setText("");
            txt_ApeMa_Modificar.setText("");
            txt_Cargo_Modificar.setText("");
            txt_Cargo_Modificar.setText("");
            txt_Nombres_Modificar.requestFocus();
            txt_Nombres_Modificar.setEnabled(false);
            txt_ApePa_Modificar.setEnabled(false);
            txt_ApeMa_Modificar.setEnabled(false);
            txt_Cargo_Modificar.setEnabled(false);   
        }
        else
        {
            System.out.println("Error:"+m);
        }
    }//GEN-LAST:event_btn_Actualizar_ModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Eliminar;
    private javax.swing.JPanel Panel_Insertar;
    private javax.swing.JPanel Panel_Modificar;
    private javax.swing.JButton btn_Actualizar_Modificar;
    private javax.swing.JButton btn_Buscar_Eliminar;
    private javax.swing.JButton btn_Buscar_Modificar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt_ApeMa_Modificar;
    private javax.swing.JTextField txt_ApePa_Eliminar;
    private javax.swing.JTextField txt_ApePa_Modificar;
    private javax.swing.JTextField txt_ApellidoMa_Registar;
    private javax.swing.JTextField txt_ApellidoPa_Registar;
    private javax.swing.JTextField txt_Apema_Eliminar;
    private javax.swing.JTextField txt_Cargo_Eliminar;
    private javax.swing.JTextField txt_Cargo_Modificar;
    private javax.swing.JTextField txt_Cargo_Registar;
    private javax.swing.JTextField txt_Codigo_Eliminar;
    private javax.swing.JTextField txt_Codigo_Modificar;
    private javax.swing.JTextField txt_Nombres_Eliminar;
    private javax.swing.JTextField txt_Nombres_Modificar;
    private javax.swing.JTextField txt_Nombres_Registar;
    // End of variables declaration//GEN-END:variables
}
