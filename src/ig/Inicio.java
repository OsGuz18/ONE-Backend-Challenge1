package ig;


import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabelImg;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel jLabel5;
	//private javax.swing.JButton jButtonExit;
    public javax.swing.JComboBox<String> jOptions;
    private javax.swing.JLabel jLabel1;
    
  
	
	
	
	public Inicio() {
		iniciar();
	}
	

	
	
	private void iniciar() {
		
		jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jOptions = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
		jLabelImg = new javax.swing.JLabel();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		jPanel1.setBackground(Color.DARK_GRAY);
        jPanel1.setPreferredSize(new Dimension(526,426));
        
        jLabel1.setFont(new Font("Calibri", Font.BOLD, 32));
        jLabel1.setForeground(Color.white);
        jLabel1.setText("Convertidor");
        
        
        jLabelImg.setBounds(60,90,500,200);
        ImageIcon Ico = new ImageIcon(getClass().getResource("../img/alura.png"));
        ImageIcon img = new ImageIcon(Ico.getImage().getScaledInstance(jLabelImg.getWidth(), jLabelImg.getHeight(), Image.SCALE_SMOOTH));
        
        jLabelImg.setIcon(img);
        
        
        jLabel2.setFont(new Font("Calibri", Font.BOLD, 32));
        jLabel2.setText("Selecciona un convertidor");

        

        
        jLabel5.setFont(new Font("Calibri", Font.BOLD, 12)); 
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Alura 2023 - Convertidor - Challenge 1");
        
        
        
        jOptions.setFont(new Font("Calibri", Font.BOLD, 20));
        jOptions.setForeground(new java.awt.Color(0, 0, 255));
        jOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "Conversor de divisas" })); // Falta agregar las opciones
        jOptions.setToolTipText("Selector de opciones del conversor");
        jOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	optionSelected(evt);
            }
        });

       
        
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        
        
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(123)
                    .addComponent(jLabel2)
                    .addGap(0, 115, Short.MAX_VALUE))
                
                
                
                
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15)
                        .addComponent(jLabelImg)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                
                
                
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        
                    		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(155))
                        
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110))))
            );
        
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    
                    .addComponent(jLabelImg)
                    .addGap(10)
                    
                    .addComponent(jLabel2)
                    .addGap(10)
                    
                    
                    .addComponent(jOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                    
                    .addComponent(jLabel5)
                    .addGap(2))
            );
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        
        
        pack();
	}
	
	
	
	private void optionSelected(java.awt.event.ActionEvent evt) {
		String seleccion = jOptions.getSelectedItem().toString();
		
		switch(seleccion) {
		
		case "Conversor de divisas":
			
			try {
				ConversorDivisas iniciarDivisas = new ConversorDivisas();
				iniciarDivisas.setVisible(true);
				iniciarDivisas.setLocationRelativeTo(null);
				iniciarDivisas.setResizable(false);
				this.setVisible(false);;
			} catch (Exception e) {
				Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE,null, e);
				JOptionPane.showMessageDialog(null, "Error");
			}
			break;
				
		/*case "Conversor de temperatura":
			
			try {
				ConversorTemperatura iniciarTemperatura = new ConversorTemperatura();
				iniciarTemperatura.setVisible(true);
				iniciarTemperatura.setLocationRelativeTo(null);
				iniciarTemperatura.setResizable(false);
				this.setVisible(false);;
			} catch (Exception e) {
				Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE,null, e);
				JOptionPane.showMessageDialog(null, "Error");
			}
			break;
			
		case "Conversor de medidad":
			
			try {
				ConversorMedidas iniciarMedidas = new ConversorMedidas();
				iniciarMedidas.setVisible(true);
				iniciarMedidas.setLocationRelativeTo(null);
				iniciarMedidas.setResizable(false);
				this.setVisible(false);;
			} catch (Exception e) {
				Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE,null, e);
				JOptionPane.showMessageDialog(null, "Error");
			}
			break;*/
		
		}
		
	}
}
