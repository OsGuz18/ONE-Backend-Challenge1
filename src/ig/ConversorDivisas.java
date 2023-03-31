package ig;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import conexion_main.Conexion_API;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import ig.Inicio;

public class ConversorDivisas extends javax.swing.JFrame {
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConvertir;
    private javax.swing.JButton btnReset;
    
    private javax.swing.JComboBox<String> cmbMonedasA;
    public static javax.swing.JComboBox<String> cmbMonedasDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtMontoAConvertir;
    public static javax.swing.JTextField txtMontoConvertido;
    
    String webPageDolar = "";
    String webPageDolar2 = "";
    String webPageEuro = "";
    String webPageEuro2 = "";
    String webPageLibra = "";
    DecimalFormat df = new DecimalFormat("0.00");
    DecimalFormat df2 = new DecimalFormat("0.0000");
    boolean validacion;
    String cotizacionMoneda = "";
    String stringMoneda = "";
    double dobleMoneda = 0;
    double valorFinal = 0;
    String stringDolar = "";
    double dobleDolar = 0;
    String stringDolar2 = "";
    double dobleDolar2 = 0;
    String stringDolar3 = "";
    double dobleDolar3 = 0;
    String stringEuro = "";
    double dobleEuro = 0;
    String stringEuro2 = "";
    double dobleEuro2 = 0;
    String stringEuro3 = "";
    double dobleEuro3 = 0;
    String stringLibra = "";
    double dobleLibra = 0;
    String stringPeso = "";
    double doblePeso = 0;
    double calculo = 0;
    double dobleAuxiliar = 0;
	
	public ConversorDivisas() throws IOException {
        initComponents();
        JOptionPane.showMessageDialog(null,"Aguarde un instante: acualizando datos de cotizaciones online...");
        obtnerCotizaciones();
        txtMontoAConvertir.requestFocus();
    }
	
	
   
	
	
	
	
    private void initComponents() {
    	jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbMonedasDe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbMonedasA = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtMontoAConvertir = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JToggleButton();
        txtMontoConvertido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.DARK_GRAY);
        setPreferredSize(new java.awt.Dimension(526, 426));

        jPanel1.setBackground(Color.DARK_GRAY);

        jLabel5.setFont(new Font("Calibri", Font.BOLD, 32)); // NOI18N
        jLabel5.setForeground(Color.white);
        jLabel5.setText("Conversor de Monedas");

        jLabel6.setText("Cotización del tipo de cambio actualizado online");
        jLabel6.setForeground(Color.white);
        
        jPanel9.setBackground(Color.DARK_GRAY);
        jPanel9.setPreferredSize(new java.awt.Dimension(526, 140));

        jLabel1.setFont(new Font("Calibri", Font.BOLD, 26)); // NOI18N
        jLabel1.setText("De");
        jLabel1.setForeground(Color.white);
        cmbMonedasDe.setFont(new Font("Calibri", Font.BOLD, 22)); // NOI18N
        cmbMonedasDe.setForeground(Color.black);
        cmbMonedasDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GBP",  "MXN" }));
        
        cmbMonedasDe.setToolTipText("Seleciona el tipo de moneda de entrada a convertir");
        

        jLabel2.setFont(new Font("Calibri", Font.BOLD, 26)); // NOI18N
        jLabel2.setText("A");
        jLabel2.setForeground(Color.white);

        cmbMonedasA.setFont(new Font("Calibri", Font.BOLD, 22)); // NOI18N
        cmbMonedasA.setForeground(Color.black);
        cmbMonedasA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MXN",  "GBP", "EUR", "USD" }));
        cmbMonedasA.setToolTipText("Seleciona el tipo de moneda de salida de la conversion / cambio");
        

        jLabel7.setText("                                                              ");
        jLabel7.setForeground(Color.white);
        jLabel8.setText("                                                                                             ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        
        
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(135)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMonedasDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMonedasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMonedasDe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmbMonedasA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel11.setBackground(Color.DARK_GRAY);
        jPanel11.setPreferredSize(new java.awt.Dimension(526, 63));

        txtMontoAConvertir.setFont(new Font("Calibri", Font.BOLD, 26)); // NOI18N
        txtMontoAConvertir.setForeground(Color.black);
        txtMontoAConvertir.setToolTipText("Campo para ingresar el monto a convertir");
        

        btnConvertir.setText("Convertir");
        btnConvertir.setToolTipText("Convierte los valores ingresados a las monedas seleccionada");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               btnConvertirActionPerformed(evt);
            }
        });

        txtMontoConvertido.setEditable(false);
        txtMontoConvertido.setBackground(Color.white);
        txtMontoConvertido.setFont(new Font("Calibri", Font.BOLD, 26)); // NOI18N
        txtMontoConvertido.setForeground(Color.black);
        txtMontoConvertido.setToolTipText("Campo donde se muestra el monto convertido");
        

        jLabel9.setFont(new Font("Calibri", Font.BOLD, 16)); // NOI18N
        jLabel9.setForeground(Color.white);
        jLabel9.setText("Ingrese aquí el monto a convertir");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtMontoAConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConvertir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMontoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMontoAConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConvertir)
                    .addComponent(txtMontoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9))
        );

        jPanel12.setBackground(Color.DARK_GRAY);
        jPanel12.setPreferredSize(new java.awt.Dimension(526, 105));

        btnReset.setFont(new Font("Calibri", Font.BOLD, 16)); // NOI18N
        btnReset.setText("Clean");
        btnReset.setToolTipText("Reinia el conversor desde el principio");
        btnReset.setMaximumSize(new java.awt.Dimension(65, 41));
        btnReset.setMinimumSize(new java.awt.Dimension(65, 41));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               btnResetActionPerformed(evt);
            }
        });

        

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("\"Alura 2023 - Convertidor - Challenge 1\"");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(160)
                .addComponent(jLabel10)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        
                        )))
        );
        
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
            	.addGap(10)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
	
	
	private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMontoAConvertir.setEditable(true);
        btnConvertir.setEnabled(true);
        txtMontoAConvertir.setText("");
        txtMontoConvertido.setText("");
        //cmbMonedasA.setSelectedIndex(0);
        //cmbMonedasDe.setSelectedIndex(0);
        jLabel7.setText("                                                                          ");
        jLabel8.setText("                                                                          ");
        txtMontoAConvertir.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed
	
	
	public void obtnerCotizaciones() {
        
        webPageDolar = "https://www.eleconomista.es/cruce/USDMXN";
        Conexion_API conexion = new Conexion_API();
        conexion.setPagina(webPageDolar);
        try {
            conexion.setHtml(Jsoup.connect(conexion.getPagina()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            
        } catch (IOException ex) {
            //si algo sale mal, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Inicio abrir = new Inicio();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc = Jsoup.parse(conexion.getHtml());
        System.out.println(doc);
        conexion.setElemntos("ultimo_21334 last-value");
        Elements elementos = doc.getElementsByClass(conexion.getElemntos());
        
        elementos.text().substring(0, 5);
        
        stringDolar = String.valueOf(elementos.text().substring(0, 5).replaceAll(",", "."));
       
        System.out.println(stringDolar.replaceAll(",", "."));

// ------------ cotización Euro -----------------------
        webPageEuro = "https://www.eleconomista.es/cruce/EURMXN";
        Conexion_API conexion2 = new Conexion_API();
        conexion2.setPagina(webPageEuro);
        cotizacionMoneda = "";
        stringMoneda = "";
        dobleMoneda = 0;
        try {
            conexion2.setHtml(Jsoup.connect(conexion2.getPagina()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            //con esto hago el scraping para obstener la cotizacion del dólar en la web
        } catch (IOException ex) {
            //si algo sale aml, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Inicio abrir = new Inicio();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc2 = Jsoup.parse(conexion2.getHtml());
        conexion2.setElemntos("ultimo_1261 last-value");
        Elements elementos2 = doc2.getElementsByClass(conexion2.getElemntos());
        

        elementos2.text().substring(0, 5);
        
        stringEuro = String.valueOf(elementos2.text().substring(0, 5).replaceAll(",", "."));
       
        System.out.println(stringEuro.replaceAll(",", "."));

// ------------ cotización Libra -----------------------
        webPageLibra = "https://www.eleconomista.es/cruce/GBPMXN";
        Conexion_API conexion3 = new Conexion_API();
        conexion3.setPagina(webPageLibra);
        cotizacionMoneda = "";
        stringMoneda = "";
        dobleMoneda = 0;
        try {
            conexion3.setHtml(Jsoup.connect(conexion3.getPagina()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            //con esto hago el scraping para obstener la cotizacion del dólar en la web
        } catch (IOException ex) {
            //si algo sale aml, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web"
                    + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Inicio abrir = new Inicio();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc3 = Jsoup.parse(conexion3.getHtml());
        conexion3.setElemntos("ultimo_23092 last-value");
        Elements elementos3 = doc3.getElementsByClass(conexion3.getElemntos());
        
        elementos3.text().substring(0, 5);
        
        stringLibra = String.valueOf(elementos3.text().substring(0, 5).replaceAll(",", "."));
       
        System.out.println(stringLibra.replaceAll(",", "."));
        
    }
	
	
	public boolean esNumeroAceptado(String s) {
        try {
            dobleMoneda = Double.valueOf(stringMoneda);
            if (dobleMoneda < 0 || dobleMoneda == 0) {
                return false;
            }
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
	
	public void finalizarConversion() {
        txtMontoAConvertir.setEditable(false);
        btnConvertir.setEnabled(false);
        stringMoneda = "";
        dobleMoneda = 0;
        dobleAuxiliar = 0;
    }
	
	public void convertirDolarPeso() {
        jLabel7.setText("Cotizacion Dólar: $ " + df.format(Double.valueOf(stringDolar)) + " (*) - Fuente: " + webPageDolar);
        valorFinal = Double.valueOf(stringDolar) * Double.valueOf(dobleMoneda);
        txtMontoConvertido.setText(df.format(valorFinal));
        finalizarConversion();
    }
	
	public void convertirDolarLibra() {
        dobleAuxiliar = Double.valueOf(stringLibra) / Double.valueOf(stringDolar);
        dobleAuxiliar = 1 / dobleAuxiliar;
        valorFinal = dobleAuxiliar * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Dólar: £ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                    ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirDolarEuro() {
        dobleAuxiliar = Double.valueOf(stringEuro) / Double.valueOf(stringDolar);
        dobleAuxiliar = 1 / dobleAuxiliar;
        valorFinal = dobleAuxiliar * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Dólar: € " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    
    public void convertirEuroPeso() {
        valorFinal = Double.valueOf(stringEuro) * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Euro: $ " + df.format(Double.valueOf(stringEuro)) + " - Fuente: " + webPageEuro);
        jLabel8.setText("                                                                         ");
        txtMontoConvertido.setText(df.format(valorFinal));
        finalizarConversion();
    }
       
    public void convertirEuroLibra() {
        dobleAuxiliar = Double.valueOf(stringLibra) / Double.valueOf(stringEuro);
        dobleAuxiliar = 1 / dobleAuxiliar; 
        valorFinal = dobleAuxiliar * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Euro: £ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirEuroDolar() {
        dobleAuxiliar = Double.valueOf(stringEuro) / Double.valueOf(stringDolar);
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Euro: u$s " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    
    public void convertirLibraPeso() {
        valorFinal = Double.valueOf(stringLibra) * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Libra: $ " + df2.format(Double.valueOf(stringLibra)) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                         ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }    
       
    
    public void convertirLibraEuro() {
        dobleAuxiliar = Double.valueOf(stringLibra) / Double.valueOf(stringEuro);
        valorFinal = dobleAuxiliar * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Libra: € " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirLibraDolar() {
        dobleAuxiliar = Double.valueOf(stringLibra) / Double.valueOf(stringDolar);
        valorFinal = dobleAuxiliar * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Libra: u$s " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirPesoLibra() {
        dobleAuxiliar = 1 / Double.valueOf(stringLibra);
        valorFinal = dobleAuxiliar * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Peso: £ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirPesoEuro() {
        dobleAuxiliar = 1 / Double.valueOf(stringEuro);
        valorFinal = dobleAuxiliar * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Peso: € " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageEuro);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirPesoDolar() {
        dobleAuxiliar = 1 / Double.valueOf(stringDolar);
        valorFinal = dobleAuxiliar * Double.valueOf(stringMoneda);
        jLabel7.setText("Cotizacion Peso: u$s " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
	
	
	private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        if (txtMontoAConvertir.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Debes ingresar algún valor del monto a convertir",
                    "Aviso", JOptionPane.OK_OPTION);
            return;
        }
        String opcionDe = cmbMonedasDe.getSelectedItem().toString();
        String opcionA = cmbMonedasA.getSelectedItem().toString();
        stringMoneda = txtMontoAConvertir.getText();
        System.out.println(opcionDe);
        System.out.println(opcionA);
        System.out.println(stringMoneda);
        if (!esNumeroAceptado(stringMoneda)) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor numérico: positivo y distinto de cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtMontoAConvertir.requestFocus();
            txtMontoAConvertir.selectAll();
            return;
        }

        switch (opcionDe) {
            case "USD":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "MXN") {
                    convertirDolarPeso();
                    break;
                }
                if (opcionA == "GBP") {
                    convertirDolarLibra();
                    break;
                }
                if (opcionA == "EUR") {
                    convertirDolarEuro();
                    break;
                }
                break;

            case "EUR":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "MXN") {
                    convertirEuroPeso();
                    break;
                }
                if (opcionA == "GBP") {
                    convertirEuroLibra();
                    break;
                }
                if (opcionA == "USD") {
                    convertirEuroDolar();
                    break;
                }
                break;

           case "GBP":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "MXN") {
                    convertirLibraPeso();
                    break;
                }
                
                if (opcionA == "EUR") {
                    convertirLibraEuro();
                    break;
                }
                if (opcionA == "USD") {
                    convertirLibraDolar();
                    break;
                }
                break;
           
           case "MXN":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                 
                if (opcionA == "GBP") {
                    convertirPesoLibra();
                    break;
                }
                if (opcionA == "EUR") {
                    convertirPesoEuro();
                    break;
                }
                if (opcionA == "USD") {
                    convertirPesoDolar();
                    break;
                }
                break;
        }
    } 

	
	

}
