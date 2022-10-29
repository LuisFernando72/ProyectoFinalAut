package a_derivacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;


/* @author Luis Fernando Paxel
 */
public class myframe extends JFrame {

    fondopanel fondo1 = new fondopanel();
    ArrayList<String> Array_reglas = new ArrayList<>();
    ArrayList<String> prueba = new ArrayList<>();

    public HashMap<Integer, String> no_terminales = new HashMap<>();
    public HashMap<Integer, String> H_terminal = new HashMap<>();

    DefaultTableModel modelo2;
    private int filasTabla;

    arb_derivacion arb = new arb_derivacion();
    Operaciones_der derecha = new Operaciones_der();
    ArrayList<String> derivacion_derecha = derecha.getArb_derivacion_dere();
    ArrayList<String> Izquierda = arb.getArb_derivacion();

    public myframe() {
        this.setContentPane(fondo1);
        initComponents();
        pintar();
        setLocationRelativeTo(null);
        //  this.text_resultado.append("Z=>OPQ\nQ=>RST\nT=>a\nS=>i\nP=>Vni\nR=>eU\nO=>ing\nU=>r\nV=>e");
        //  this.text_resultado.append("Z=>ASB\nA=>b\naaA=>aaBB\nS=>d\nA=>aA\nB=>dcd");}
        radio_derecha.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        PanelAgregar = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        txt_regla = new javax.swing.JTextField();
        PanelTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_reglas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboEj = new javax.swing.JComboBox<>();
        btn_anadir = new javax.swing.JButton();
        PanelResultado = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_resultado = new javax.swing.JTextArea();
        btn_limpiar = new javax.swing.JButton();
        PanelAnalizar = new javax.swing.JPanel();
        radio_derecha = new javax.swing.JRadioButton();
        izquierda = new javax.swing.JRadioButton();
        btn_analizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.darkGray);

        PanelAgregar.setBackground(new java.awt.Color(255, 255, 255));
        PanelAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        PanelAgregar.setForeground(new java.awt.Color(0, 204, 51));
        PanelAgregar.setOpaque(false);

        btn_agregar.setBackground(new java.awt.Color(0, 204, 51));
        btn_agregar.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-button.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.setDefaultCapable(false);
        btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_agregar.setIconTextGap(6);
        btn_agregar.setSelected(true);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txt_regla.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        txt_regla.setForeground(new java.awt.Color(0, 0, 0));
        txt_regla.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        PanelTable.setBackground(new java.awt.Color(0, 0, 0));
        PanelTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PanelTable.setLayout(null);

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(200, 406));

        table_reglas.setBackground(new java.awt.Color(255, 255, 255));
        table_reglas.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        table_reglas.setForeground(new java.awt.Color(0, 0, 0));
        table_reglas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Regla", ""
            }
        ));
        table_reglas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_reglas.setGridColor(new java.awt.Color(0, 0, 0));
        table_reglas.setRowHeight(22);
        table_reglas.setRowMargin(2);
        table_reglas.setSelectionBackground(new java.awt.Color(255, 0, 51));
        table_reglas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        table_reglas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_reglasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_reglas);

        PanelTable.add(jScrollPane3);
        jScrollPane3.setBounds(0, 30, 270, 260);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         Reglas de Producción");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelTable.add(jLabel1);
        jLabel1.setBounds(0, 0, 270, 30);

        comboEj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ejemplo1", "Ejemplo2", "Ejemplo3" }));

        btn_anadir.setText("Añadir");
        btn_anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addComponent(txt_regla, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addComponent(comboEj, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_regla)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_anadir))
                .addGap(17, 17, 17))
        );

        PanelResultado.setBackground(new java.awt.Color(255, 255, 255));
        PanelResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        PanelResultado.setOpaque(false);

        text_resultado.setEditable(false);
        text_resultado.setBackground(new java.awt.Color(255, 255, 255));
        text_resultado.setColumns(20);
        text_resultado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        text_resultado.setForeground(new java.awt.Color(0, 0, 0));
        text_resultado.setRows(5);
        text_resultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        text_resultado.setCaretColor(new java.awt.Color(255, 102, 102));
        text_resultado.setSelectedTextColor(new java.awt.Color(0, 0, 204));
        jScrollPane2.setViewportView(text_resultado);

        btn_limpiar.setBackground(new java.awt.Color(204, 0, 0));
        btn_limpiar.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpiar.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelResultadoLayout = new javax.swing.GroupLayout(PanelResultado);
        PanelResultado.setLayout(PanelResultadoLayout);
        PanelResultadoLayout.setHorizontalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelResultadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelResultadoLayout.createSequentialGroup()
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        PanelResultadoLayout.setVerticalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        PanelAnalizar.setBackground(new java.awt.Color(255, 255, 255));
        PanelAnalizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        PanelAnalizar.setOpaque(false);

        radio_derecha.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radio_derecha);
        radio_derecha.setFont(new java.awt.Font("Open Sans", 3, 14)); // NOI18N
        radio_derecha.setForeground(new java.awt.Color(0, 0, 0));
        radio_derecha.setText("Derecha");
        radio_derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_derechaActionPerformed(evt);
            }
        });

        izquierda.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(izquierda);
        izquierda.setFont(new java.awt.Font("Open Sans", 3, 14)); // NOI18N
        izquierda.setForeground(new java.awt.Color(0, 0, 0));
        izquierda.setText("Izquierda");
        izquierda.setIconTextGap(12);
        izquierda.setMargin(new java.awt.Insets(4, 4, 4, 4));
        izquierda.setOpaque(true);

        btn_analizar.setBackground(new java.awt.Color(0, 51, 204));
        btn_analizar.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        btn_analizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_analizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archivo.png"))); // NOI18N
        btn_analizar.setText("Analizar");
        btn_analizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_analizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_analizar.setHideActionText(true);
        btn_analizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_analizar.setIconTextGap(12);
        btn_analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAnalizarLayout = new javax.swing.GroupLayout(PanelAnalizar);
        PanelAnalizar.setLayout(PanelAnalizarLayout);
        PanelAnalizarLayout.setHorizontalGroup(
            PanelAnalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAnalizarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(radio_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(izquierda)
                .addGap(23, 23, 23))
            .addGroup(PanelAnalizarLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btn_analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAnalizarLayout.setVerticalGroup(
            PanelAnalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAnalizarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelAnalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(izquierda)
                    .addComponent(radio_derecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_analizar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Open Sans", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Árbol de Derivación o Parseo");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio_derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_derechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_derechaActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        modelo2 = (DefaultTableModel) this.table_reglas.getModel();

        String separator = "=>";
        boolean emptyStrings = true;
        int contador = 0;
        String produccion = this.txt_regla.getText();
        if (produccion.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor no dejar el campo vacio", "Error :(", HEIGHT, new ImageIcon("src/img/error.png"));
        } else {

            if (produccion != null && produccion.length() > 0) {

                int index1 = 0;
                int index2 = produccion.indexOf(separator);
                int sepLen = separator.length();
                while (index2 >= 0) {
                    String token = produccion.substring(index1, index2);
                    if (!token.isEmpty() || emptyStrings) {

                        for (int i = 0; i < token.length(); i++) {
                            if (Character.isLowerCase(token.charAt(i))) {
                                contador++;
                            }
                        }
                    }
                    index1 = index2 + sepLen;
                    index2 = produccion.indexOf(separator, index1);

                }

                if (contador > 0) {
                    filasTabla = modelo2.getRowCount() + 1;
                    modelo2.addRow(new Object[]{filasTabla, produccion, "Eliminar"});

                    this.txt_regla.setText("");
                } else {
                    Agregar(produccion);

                    this.txt_regla.setText("");
                }
            }
        }

    }//GEN-LAST:event_btn_agregarActionPerformed

    public void prueba(int caso) {

        switch (caso) {
            case 1:
                prueba.add("Z=>ASB");
                prueba.add("A=>b");
                prueba.add("S=>d");
                prueba.add("A=>aA");
                prueba.add("B=>dcd");

                for (int i = 0; i < prueba.size(); i++) {
                    System.out.println(i + ". " + prueba.get(i));
                }
                break;

            case 2:
                prueba.add("Z=>OPQ");
                prueba.add("Q=>RST");
                prueba.add("T=>a");
                prueba.add("S=>i");
                prueba.add("P=>Vni");
                prueba.add("R=>eU");
                prueba.add("O=>ing");
                prueba.add("U=>r");
                prueba.add("V=>e");
                for (int i = 0; i < prueba.size(); i++) {
                    System.out.println(i + ". " + prueba.get(i));
                }
                break;

            case 3:
                prueba.add("Z=>LSM");
                prueba.add("L=>f");
                prueba.add("S=>g");
                prueba.add("L=>lghL");
                prueba.add("M=>ijN");
                prueba.add("N=>jk");
                for (int i = 0; i < prueba.size(); i++) {
                    System.out.println(i + ". " + prueba.get(i));
                }
                break;

        }

    }


    private void btn_analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analizarActionPerformed
        if (Array_reglas.size() == 0 || this.table_reglas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "HEEE, CAMPOS VACIOS >:l", "Error :(", HEIGHT, new ImageIcon("src/img/error.png"));

        } else {

            this.text_resultado.setText("");
            for (int i = 0; i < arb.getReglas_produccion().size(); i++) {
                fastSplit2(arb.getReglas_produccion().get(i), i, "=>", true);
            }

            if (buttonGroup1.getSelection().equals(radio_derecha.getModel())) {
                System.out.println("----------------------------------- DERIVACION A LA DERECHA------------------------------------");
                this.text_resultado.append("[ ------------------------   Derivación mas a la derecha   ------------------------ ]\n");
                anazalizando();
                this.text_resultado.append("\n\nDerivando en... " + arb.getReglas_produccion().get(0));

                derecha.setH_noterminal(no_terminales);
                derecha.setH_terminal(H_terminal);
                derecha.mostrarDerecha();
                this.text_resultado.append("\n" + derivacion_derecha);
                Resultado_Derecha();

            } else {
                System.out.println("--------------------------------------- DERIVACION A LA IZQUIERDA----------------------------------------");
                this.text_resultado.append("[ ------------------------   Derivación mas a la izquierda   ------------------------]\n\n");
                anazalizando();
                this.text_resultado.append("\n\nDerivando en... " + arb.getReglas_produccion().get(0));

                this.text_resultado.append("\n\n" + arb.getReglas_produccion().get(0));
                arb.Mostrar_datos();
                this.text_resultado.append("\n" + Izquierda);
                Resultado_Izquierda();

            }

            letra();
        }
    }//GEN-LAST:event_btn_analizarActionPerformed

    public void Resultado_Izquierda() {
        ArrayList<String> derivacion_Hojas = arb.getHojas();
        String resultado = "";
        this.text_resultado.append("\n\n" + "Respuesta: " + "\n");
        for (int i = 0; i < derivacion_Hojas.size(); i++) {
            String hoja = derivacion_Hojas.get(i);
            //this.text_resultado.append("\n" + hoja);
            char[] myChars = hoja.toCharArray();
            for (int f = 0; f < myChars.length; f++) {
                if (Character.isLowerCase(hoja.charAt(f))) {
                    resultado = String.valueOf(hoja.charAt(f));
                    this.text_resultado.append("" + resultado);

                }
            }
        }
    }

    public void Resultado_Derecha() {
        ArrayList<String> derivacion_Derecha = derecha.getHojas();
        String resultado = "";
        this.text_resultado.append("\n\n" + "Respuesta: ");
        for (int i = 0; i < derivacion_Derecha.size(); i++) {
            String hoja = derivacion_Derecha.get(i);
            //this.text_resultado.append("\n" + hoja);
            char[] myChars = hoja.toCharArray();
            for (int f = 0; f < myChars.length; f++) {
                if (Character.isLowerCase(hoja.charAt(f))) {
                    resultado += String.valueOf(hoja.charAt(f));

                }
            }
        }
        String resultadoDer = resultado;
        StringBuilder stringBuilder = new StringBuilder(resultadoDer);
        String invertida = stringBuilder.reverse().toString();
        this.text_resultado.append(invertida);
    }

    public void anazalizando() {
        this.text_resultado.append("\nNO TERMINALES");

        arb.getH_noterminal().forEach((k, v) -> {
            this.text_resultado.append("\n Key = " + k + ", Value = " + v);
        });

        this.text_resultado.append("\n\nTERMINALES");

        arb.getH_terminal().forEach((Integer k, String v) -> {
            this.text_resultado.append("\n Key = " + k + " , Value = " + v);
        });

    }

///VERIFICAR CUANDO AGREGAGAMOS ALGO DE INICIAL MINUSCULA ESO TRAE PROBLEMA
    public int fastSplit2(final String text, final int contador, final String separator, final boolean emptyStrings) {

        if (text != null && text.length() > 0) {
            int index1 = 0;
            int index2 = text.indexOf(separator);
            int sepLen = separator.length();
            while (index2 >= 0) {
                String token = text.substring(index1, index2);
                if (!token.isEmpty() || emptyStrings) {

                    no_terminales.put(contador, token);
                    arb.setH_noterminal(no_terminales);
                }
                index1 = index2 + sepLen;
                index2 = text.indexOf(separator, index1);
            }

            H_terminal.put(contador, text.substring(index1));

            arb.setH_terminal(H_terminal);
        }

        return 0;
    }


    private void table_reglasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_reglasMouseClicked

        modelo2 = (DefaultTableModel) this.table_reglas.getModel();
        int fila = table_reglas.rowAtPoint(evt.getPoint());

        System.out.println("Fila: " + fila);
        modelo2.removeRow(fila);
        this.Array_reglas.remove(fila);
        ActualizarNo();
        //   result1.clear();
        //    result2.clear();
        no_terminales.keySet().removeIf(key -> key != fila);
        H_terminal.keySet().removeIf(key -> key != fila);

    }//GEN-LAST:event_table_reglasMouseClicked

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        if (Array_reglas.size() == 0 || modelo2.getRowCount() == 0) {

        } else {
            modelo2 = (DefaultTableModel) this.table_reglas.getModel();
            Array_reglas.clear();
            modelo2.setRowCount(0);
            no_terminales.clear();
            prueba.clear();
            derivacion_derecha.clear();
            Izquierda.clear();
            arb.vaciar();
            derecha.vaciar();
            txt_regla.setText("");
            this.text_resultado.setText("");

        }

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anadirActionPerformed
        int caso = this.comboEj.getSelectedIndex() + 1;

        prueba(caso);
        for (int u = 0; u < prueba.size(); u++) {
            Agregar(prueba.get(u));
        }
    }//GEN-LAST:event_btn_anadirActionPerformed

    public int ActualizarNo() {
        modelo2 = (DefaultTableModel) this.table_reglas.getModel();
        int filas = modelo2.getRowCount();
        int c = 0;
        for (int i = 0; i < filas; i++) {
            c++;
            modelo2.setValueAt(c, i, 0);
        }

        return 0;
    }
    int error = 0;

    public int Agregar(String regla) {

        modelo2 = (DefaultTableModel) this.table_reglas.getModel();
        filasTabla = modelo2.getRowCount() + 1;
        if (regla.matches("[a-z|A-Z]{1,5}+[=]+[>]+[a-z|A-Z]{1,5}")) {
            try {

                modelo2.addRow(new Object[]{filasTabla, regla, "Eliminar"});
                Array_reglas.add(regla);
                arb.setReglas_produccion(Array_reglas);
            } catch (Exception ex) {
                System.out.println("Error " + ex.getMessage());
            }

        } else {
            error++;
            System.out.println(error + ". (ERROR 404) " + regla);

            JOptionPane.showMessageDialog(null, "Cadena de producción invalida ._.", "Error :(", HEIGHT, new ImageIcon("src/img/error.png"));
        }

        return 0;
    }

    public void pintar() {
        ColorearTable color = new ColorearTable(1);
        table_reglas.getColumnModel().getColumn(2).setCellRenderer(color);
        table_reglas.getColumnModel().getColumn(0).setPreferredWidth(14);
        table_reglas.getColumnModel().getColumn(2).setPreferredWidth(18);
        table_reglas.getTableHeader().setBackground(new Color(51, 51, 51));
        table_reglas.getTableHeader().setForeground(Color.WHITE);

    }

    public void letra() {
        String letras = this.text_resultado.getText();
        System.out.println("" + letras);

    }

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
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myframe().setVisible(true);
            }
        });
    }

    class fondopanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("fondo7.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JPanel PanelAnalizar;
    private javax.swing.JPanel PanelResultado;
    private javax.swing.JPanel PanelTable;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_anadir;
    private javax.swing.JButton btn_analizar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> comboEj;
    private javax.swing.JRadioButton izquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radio_derecha;
    private javax.swing.JTable table_reglas;
    private javax.swing.JTextArea text_resultado;
    private javax.swing.JTextField txt_regla;
    // End of variables declaration//GEN-END:variables
}
