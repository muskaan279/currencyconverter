/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Khanna Computer
 */
public class My_Currency_Converter extends javax.swing.JFrame {

    /**
     * Creates new form My_Currency_Converter
     */
double Australian_Dollar=1.80;
double US_Dollar= 1.31;
double Nigerian_Naira = 476.57;
double Brazilian_Real = 5.47;
double Canadian_Dollar = 1.71;
double Kenyan_Shilling = 132.53;
double Indonesian_Rupiah = 19554.94;
double Indian_Rupee= 95.21;
double Philippine_Pisco= 71.17;
double Pakistani_Rupee= 162.74;

String[] currencyUnits ={
"units",
    "Australian Dollar",
"US Dollar",
"Nigerian Naira",
"Brazilian Real",
"Canadian Dollar",
"Kenyan Shilling",
"Indonesian Rupiah",
"Indian Rupee",
"Philippine Pisco",
"Pakistani Rupee" 
};
    
    
    

public My_Currency_Converter() {
        initComponents();
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
        image1 = new javax.swing.JLabel();
        heading1 = new javax.swing.JLabel();
        currency1 = new javax.swing.JComboBox();
        currency2 = new javax.swing.JComboBox();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        fromcountry = new javax.swing.JLabel();
        tocountry = new javax.swing.JLabel();
        currencyunits1 = new javax.swing.JLabel();
        currencyunits2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        image2 = new javax.swing.JLabel();
        heading2 = new javax.swing.JLabel();
        currency3 = new javax.swing.JComboBox();
        currency4 = new javax.swing.JComboBox();
        currencyfield3 = new javax.swing.JTextField();
        currencyfield4 = new javax.swing.JTextField();
        fromcountry1 = new javax.swing.JLabel();
        tocountry1 = new javax.swing.JLabel();
        currencyunits3 = new javax.swing.JLabel();
        currencyunits4 = new javax.swing.JLabel();
        reset1 = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        convert1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N

        heading1.setBackground(new java.awt.Color(255, 102, 102));
        heading1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        heading1.setForeground(new java.awt.Color(0, 0, 255));
        heading1.setText("      Currency Converter");

        currency1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        currency1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose One..", "Australian Dollar", "US Dollar", "Nigerian Naira", "Brazilian Real", "Canadian Dollar", "Kenyan Shilling", "Indonesian Rupiah", "Indian Rupee", "Philippine Pisco", "Pakistani Rupee" }));
        currency1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                currency1ItemStateChanged(evt);
            }
        });

        currency2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        currency2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose One..", "Australian Dollar", "US Dollar", "Nigerian Naira", "Brazilian Real", "Canadian Dollar", "Kenyan Shilling", "Indonesian  Rupiah", "Indian Rupee", "Philippine Pisco", "Pakistani Rupee" }));
        currency2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                currency2ItemStateChanged(evt);
            }
        });

        t1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        t2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        fromcountry.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        fromcountry.setText("From Currency");

        tocountry.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        tocountry.setText("To Currency");

        currencyunits1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        currencyunits1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currencyunits1.setText("Units");

        currencyunits2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        currencyunits2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currencyunits2.setText("Units");

        reset.setBackground(new java.awt.Color(51, 51, 255));
        reset.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(51, 51, 255));
        exit.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        convert.setBackground(new java.awt.Color(51, 51, 255));
        convert.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(heading1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(288, 288, 288))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t1)
                                    .addComponent(currency1, 0, 332, Short.MAX_VALUE)
                                    .addComponent(fromcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(currencyunits1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(currency2, 0, 327, Short.MAX_VALUE)
                                    .addComponent(t2)
                                    .addComponent(tocountry, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(currencyunits2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(233, 233, 233)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fromcountry, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(tocountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currency2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currency1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currencyunits1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(currencyunits2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N

        heading2.setBackground(new java.awt.Color(255, 102, 102));
        heading2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        heading2.setForeground(new java.awt.Color(0, 0, 255));
        heading2.setText("      Currency Converter");

        currency3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        currency3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Australian Dollar", "Argentina Peso", "Brazilian Real", "British Pound Sterling", "Canadian Dollar", "Chilean Peso", "Chinese Yuan Renminbi", "Egyptian Pound", "Euro", "Hong Kong Dollar", "Indian Rupee", "Japanese Yen", "Mexican Peso", "New Taiwan Dollar", "New Zealand Dollar", "Norwegian Krone", "Pakistani Rupee", "Romanian Leu", "Russian Ruble", "Singapore Dollar", "South African Rand", "South Korean Won", "Swiss Franc ", "Turkish Lira", "US Dollar " }));

        currency4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        currency4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Australian Dollar", "Argentina Peso", "Brazilian Real", "British Pound Sterling", "Canadian Dollar", "Chilean Peso", "Chinese Yuan Renminbi", "Egyptian Pound", "Euro", "Hong Kong Dollar", "Indian Rupee", "Japanese Yen", "Mexican Peso", "New Taiwan Dollar", "New Zealand Dollar", "Norwegian Krone", "Pakistani Rupee", "Romanian Leu", "Russian Ruble", "Singapore Dollar", "South African Rand", "South Korean Won", "Swiss Franc ", "Turkish Lira", "US Dollar " }));

        currencyfield3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        currencyfield4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        fromcountry1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        fromcountry1.setText("From Country");

        tocountry1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        tocountry1.setText("To Country");

        currencyunits3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        currencyunits3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currencyunits3.setText("Units");

        currencyunits4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        currencyunits4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currencyunits4.setText("Units");

        reset1.setBackground(new java.awt.Color(51, 51, 255));
        reset1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        reset1.setText("Reset");

        exit1.setBackground(new java.awt.Color(51, 51, 255));
        exit1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        exit1.setText("Exit");

        convert1.setBackground(new java.awt.Color(51, 51, 255));
        convert1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        convert1.setText("Convert");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(heading2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(image2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(288, 288, 288))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(currencyfield3)
                                    .addComponent(currency3, 0, 332, Short.MAX_VALUE)
                                    .addComponent(fromcountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(currencyunits3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(currency4, 0, 327, Short.MAX_VALUE)
                                    .addComponent(currencyfield4)
                                    .addComponent(tocountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(currencyunits4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(convert1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(233, 233, 233)
                                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                                .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(148, 148, 148))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(heading2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fromcountry1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(tocountry1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currency4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currency3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currencyfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyfield4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currencyunits3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(currencyunits4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convert1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currency1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_currency1ItemStateChanged
        // TODO add your handling code here:
        currencyunits1.setText(currencyUnits[currency1.getSelectedIndex()]);
    }//GEN-LAST:event_currency1ItemStateChanged

    private void currency2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_currency2ItemStateChanged
        // TODO add your handling code here:
       
        currencyunits2.setText(currencyUnits[currency2.getSelectedIndex()]);
    }//GEN-LAST:event_currency2ItemStateChanged

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        // TODO add your handling code here:
        double amountToChange= Double.parseDouble(t1.getText());
        double amountInPounds = 0.0;
        double amountChanged = 0.0;
        switch(currency1.getSelectedItem().toString()){
            case "Australian Dollar": 
                amountInPounds = amountToChange / Australian_Dollar ;
                break;
            case "US Dollar": 
                amountInPounds = amountToChange / US_Dollar ;
                break;
            case "Nigerian Naira":amountInPounds = amountToChange/Nigerian_Naira;break;
	case "Brazilian Real":amountInPounds = amountToChange/Brazilian_Real;break;
	case "Canadian Dollar":amountInPounds = amountToChange/Canadian_Dollar;break;
	case "Kenyan Shilling":amountInPounds = amountToChange/Kenyan_Shilling;break;
	case "Indonesian Rupiah":amountInPounds = amountToChange/Indonesian_Rupiah;break;
	case "Indian Rupee":amountInPounds = amountToChange/Indian_Rupee;break;
	case "Philippine Pisco":amountInPounds = amountToChange/Philippine_Pisco;break;
	case "Pakistani Rupee":amountInPounds = amountToChange/Pakistani_Rupee;break;
	default:amountInPounds = 0.0;
        }
         
        switch(currency2.getSelectedItem().toString()){
            case "Australian Dollar": 
                amountInPounds = amountToChange * Australian_Dollar ;
                break;
            case "US Dollar":amountChanged = amountInPounds * US_Dollar;break;
	case "Nigeria Naira":amountChanged = amountInPounds * Nigerian_Naira;break;
	case "Brazilian Real":amountChanged = amountInPounds * Brazilian_Real;break;
	case "Canada Dollar":amountChanged = amountInPounds * Canadian_Dollar;break;
	case "Kenyan Shilling":amountChanged = amountInPounds * Kenyan_Shilling;break;
	case "Indonesian Rupiah":amountChanged = amountInPounds * Indonesian_Rupiah;break;
	case "Indian Rupee":amountChanged = amountInPounds * Indian_Rupee;break;
	case "Philippine Pisco":
            amountChanged = amountInPounds * Philippine_Pisco;break;
	case "Pakistani Rupee":
            amountChanged = amountInPounds * Pakistani_Rupee;break;
	default:amountChanged = amountInPounds * 0.0;
        }
        String value=String.format("%.2f",amountChanged);
        t2.setText(value);
    }//GEN-LAST:event_convertActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        currency1.setSelectedIndex(0);
        currency2.setSelectedIndex(0);
        t1.setText("");
        t2.setText("");
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(My_Currency_Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(My_Currency_Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(My_Currency_Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(My_Currency_Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new My_Currency_Converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JButton convert1;
    private javax.swing.JComboBox currency1;
    private javax.swing.JComboBox currency2;
    private javax.swing.JComboBox currency3;
    private javax.swing.JComboBox currency4;
    private javax.swing.JTextField currencyfield3;
    private javax.swing.JTextField currencyfield4;
    private javax.swing.JLabel currencyunits1;
    private javax.swing.JLabel currencyunits2;
    private javax.swing.JLabel currencyunits3;
    private javax.swing.JLabel currencyunits4;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel fromcountry;
    private javax.swing.JLabel fromcountry1;
    private javax.swing.JLabel heading1;
    private javax.swing.JLabel heading2;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JLabel tocountry;
    private javax.swing.JLabel tocountry1;
    // End of variables declaration//GEN-END:variables
}
