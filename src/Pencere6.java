package arayuz;

import javax.swing.JOptionPane;

public class Pencere6 extends javax.swing.JFrame {
 public double[][] diziyeDegerGonder= new double[4][4];
    public double[] egimdizisi5=new double[4]; 
    public double[] yolyapisidizisi5=new double[4]; 
    public double[] guvenlikdizisi5=new double[4]; 
    public double[] zamandizisi5=new double[4];   
    public double[]   kriterdizisi=new double[4]; 
    
    public Pencere6() {
       
            diziyeDegerGonder[0][1]=2;
            diziyeDegerGonder[0][2]=2;
            diziyeDegerGonder[0][3]=2;
            diziyeDegerGonder[1][2]=2;
            diziyeDegerGonder[1][3]=2;
            diziyeDegerGonder[2][3]=2;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kriterleri Kendi Aralarında Karşılaştırma Yap", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(19, 46, 215))); // NOI18N

        jLabel1.setText("Göre Karşılaştırılması");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aşırı Kötü", "Çok Kötü", "Kötü", "Çok Az Kötü", "Yakın", "Çok Az İyi", "İyi", "Çok İyi", "Aşırı İyi" }));
        jComboBox1.setSelectedIndex(4);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(80, 76, 76));
        jLabel9.setText("Eğimin Yol Yapısına ");
        jLabel9.setToolTipText("");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aşırı Kötü", "Çok Kötü", "Kötü", "Çok Az Kötü", "Yakın", "Çok Az İyi", "İyi", "Çok İyi", "Aşırı İyi" }));
        jComboBox2.setSelectedIndex(4);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(80, 76, 76));
        jLabel10.setText("Eğimin Güvenlik Durumuna");
        jLabel10.setToolTipText("");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Göre Karşılaştırılması");

        jLabel11.setForeground(new java.awt.Color(80, 76, 76));
        jLabel11.setText("Eğimin Zamana");
        jLabel11.setToolTipText("");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Göre Karşılaştırılması");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aşırı Kötü", "Çok Kötü", "Kötü", "Çok Az Kötü", "Yakın", "Çok Az İyi", "İyi", "Çok İyi", "Aşırı İyi" }));
        jComboBox3.setSelectedIndex(4);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aşırı Kötü", "Çok Kötü", "Kötü", "Çok Az Kötü", "Yakın", "Çok Az İyi", "İyi", "Çok İyi", "Aşırı İyi" }));
        jComboBox4.setSelectedIndex(4);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(80, 76, 76));
        jLabel12.setText("Yol Yapısının Güvelik Durumuna");
        jLabel12.setToolTipText("");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("Göre Karşılaştırılması");

        jLabel13.setForeground(new java.awt.Color(80, 76, 76));
        jLabel13.setText("Yol Yapısının Zamana");
        jLabel13.setToolTipText("");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setText("Göre Karşılaştırılması");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aşırı Kötü", "Çok Kötü", "Kötü", "Çok Az Kötü", "Yakın", "Çok Az İyi", "İyi", "Çok İyi", "Aşırı İyi" }));
        jComboBox5.setSelectedIndex(4);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aşırı Kötü", "Çok Kötü", "Kötü", "Çok Az Kötü", "Yakın", "Çok Az İyi", "İyi", "Çok İyi", "Aşırı İyi" }));
        jComboBox6.setSelectedIndex(4);
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(80, 76, 76));
        jLabel14.setText("Güvenlik Durumunun Zamana");
        jLabel14.setToolTipText("");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setText("Göre Karşılaştırılması");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("TAMAM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton2.setText("Geri Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(138, 138, 138))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(36, 36, 36))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       switch(jComboBox1.getSelectedIndex()){
                case 0:       diziyeDegerGonder[0][1]=0.1111; break;
                case 1:       diziyeDegerGonder[0][1]=0.14285; break;
                case 2:       diziyeDegerGonder[0][1]=0.2; break;
                case 3:       diziyeDegerGonder[0][1]=0.3333; break; 
                case 4:       diziyeDegerGonder[0][1]=2; break;  ///orta değer
                case 5:       diziyeDegerGonder[0][1]=3; break;
                case 6:       diziyeDegerGonder[0][1]=5; break;
                case 7:       diziyeDegerGonder[0][1]=7; break;
                case 8:       diziyeDegerGonder[0][1]=9; break;    
     
            }
   
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      
         switch(jComboBox2.getSelectedIndex()){
                case 0:       diziyeDegerGonder[0][2]=0.1111; break;
                case 1:       diziyeDegerGonder[0][2]=0.14285; break;
                case 2:       diziyeDegerGonder[0][2]=0.2; break;
                case 3:       diziyeDegerGonder[0][2]=0.3333; break; 
                case 4:       diziyeDegerGonder[0][2]=2; break;  ///orta değer
                case 5:       diziyeDegerGonder[0][2]=3; break;
                case 6:       diziyeDegerGonder[0][2]=5; break;
                case 7:       diziyeDegerGonder[0][2]=7; break;
                case 8:       diziyeDegerGonder[0][2]=9; break;    
     
            } 
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       
        switch(jComboBox3.getSelectedIndex()){
                case 0:       diziyeDegerGonder[0][3]=0.1111; break;
                case 1:       diziyeDegerGonder[0][3]=0.14285; break;
                case 2:       diziyeDegerGonder[0][3]=0.2; break;
                case 3:       diziyeDegerGonder[0][3]=0.3333; break; 
                case 4:       diziyeDegerGonder[0][3]=2; break;  ///orta değer
                case 5:       diziyeDegerGonder[0][3]=3; break;
                case 6:       diziyeDegerGonder[0][3]=5; break;
                case 7:       diziyeDegerGonder[0][3]=7; break;
                case 8:       diziyeDegerGonder[0][3]=9; break;     
            }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        
             switch(jComboBox4.getSelectedIndex()){
                case 0:       diziyeDegerGonder[1][2]=0.1111; break;
                case 1:       diziyeDegerGonder[1][2]=0.14285; break;
                case 2:       diziyeDegerGonder[1][2]=0.2; break;
                case 3:       diziyeDegerGonder[1][2]=0.3333; break; 
                case 4:       diziyeDegerGonder[1][2]=2; break;  ///orta değer
                case 5:       diziyeDegerGonder[1][2]=3; break;
                case 6:       diziyeDegerGonder[1][2]=5; break;
                case 7:       diziyeDegerGonder[1][2]=7; break;
                case 8:       diziyeDegerGonder[1][2]=9; break;    
     
            }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        
        switch(jComboBox5.getSelectedIndex()){
                case 0:       diziyeDegerGonder[1][3]=0.1111; break;
                case 1:       diziyeDegerGonder[1][3]=0.14285; break;
                case 2:       diziyeDegerGonder[1][3]=0.2; break;
                case 3:       diziyeDegerGonder[1][3]=0.3333; break; 
                case 4:       diziyeDegerGonder[1][3]=2; break;  ///orta değer
                case 5:       diziyeDegerGonder[1][3]=3; break;
                case 6:       diziyeDegerGonder[1][3]=5; break;
                case 7:       diziyeDegerGonder[1][3]=7; break;
                case 8:       diziyeDegerGonder[1][3]=9; break;    
     
            }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
       
        switch(jComboBox6.getSelectedIndex()){
                case 0:       diziyeDegerGonder[2][3]=0.1111; break;
                case 1:       diziyeDegerGonder[2][3]=0.14285; break;
                case 2:       diziyeDegerGonder[2][3]=0.2; break;
                case 3:       diziyeDegerGonder[2][3]=0.3333; break; 
                case 4:       diziyeDegerGonder[2][3]=2; break;  ///orta değer
                case 5:       diziyeDegerGonder[2][3]=3; break;
                case 6:       diziyeDegerGonder[2][3]=5; break;
                case 7:       diziyeDegerGonder[2][3]=7; break;
                case 8:       diziyeDegerGonder[2][3]=9; break;    
     
            }
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      kriterdizisi= gonder();
  double[][] goreceliOncelikDizisi=new double[4][4];
    
    double[] karsilastirmadizisi=new double[4];
       for(int i=0;i<4;i++){
          
              goreceliOncelikDizisi[i][0]=egimdizisi5[i];
              goreceliOncelikDizisi[i][1]=yolyapisidizisi5[i];
              goreceliOncelikDizisi[i][2]=guvenlikdizisi5[i];
              goreceliOncelikDizisi[i][3]=zamandizisi5[i];
           
       }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
             karsilastirmadizisi[i]=karsilastirmadizisi[i]+goreceliOncelikDizisi[i][j]*kriterdizisi[j];
         
            } 
        }       
       double max = karsilastirmadizisi[0];  //karar vermek için karşılaştırma dizisinden en büyük 
                                            // değerli eleman seçilmelidir. burada önce bunun atanması yapılıyor.
            for(int i=0; i<karsilastirmadizisi.length; i++)
            {
                if(max < karsilastirmadizisi[i])
            {
                max = karsilastirmadizisi[i];
            } 
            }
            for(int i=0;i<karsilastirmadizisi.length;i++){
                if(karsilastirmadizisi[i]==max) JOptionPane.showMessageDialog(null,(i+1)+". yol intikal için seçilmelidir.");
// burada ise en büyük değerin indisi yani yol sayısı seçiliyor.
            }                                     
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new Pencere().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
public double[] gonder(){
  
         double [][]dizi= new double[4][4];///alternatif yol sayısı kadar karşılaştırma yapmak için iki boyutlu diiz oluşturuyoruz.
         double []sutunToplamDizisi= new double[dizi.length]; /// tablo(iki boyutlu dizi) oluşturulduktan sonra yapılacak hesaplamalarda sütun toplamları gerektiği için tutuyoruz.
         double satirBoluSutun=0; // yine hesaplamalarda kullanmak için değer oluşturuyoruz.
         double [][]normalizeEdilmisDizi=new double[4][4]; //yani elemanların ait olduğu sütun toplamlarına bölünmüş değerlerini yeni bir diziye atadık
         double goreceliEleman; 
         double toplamOzdeger=0;
         double []goreceliOncelikDizisi=new double[4];
         double []agirlastirilmisToplamVektor= new double[4];
         //rassallık değerleri sabit ve yöntem tarafından belirlenmiştir. 
         double []rassallikMatrisi={0,0,0.58,0.90,1.12,1.24,1.32,1.41,1.45,1.49,1.51,1.54,1.56,1.57,1.58};
         double tutarlilikOrani=0;
         //tanımlanan değişkenler
         for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi.length;j++){
                if(i<j){
                    dizi[i][j]=diziyeDegerGonder[i][j]; 
                }
                else if(j==i)
                {
                    dizi[i][j]=1; // alternatiflerin kendilerine göre karşılartırmalar 1 olmalı
                }
                else {
                    dizi[i][j]=1/dizi[j][i]; // AHP'nin terslik özelliğinden 
                }
            }
        }  
/* ikili karşılaştırma matrisine karşılaştırma sayısı kadar değer girip
karşılaştırma işlemini yapıyor ve diğer sayıları giriyor  */
   double toplam=0;
         for(int i=0;i<dizi.length;i++){
                toplam=0;
                for(int j=0;j<dizi.length;j++){ 
                
           toplam= toplam+dizi[j][i];
            
           } // sütunları topluyoruz. daha sonra bu sütunların toplamını bir diziye atıyoruz. 
             // bir alt satırda bu atama yapılıyor.
           sutunToplamDizisi[i]= toplam;               
 }
  
         for(int i=0; i<dizi.length; i++){
             double satirToplam=0; 
/* satırdaki değerler ait oldukları sütun toplamına bölünerek
satır elemanları bu bölünerek toplanır ve eleman sayısına bölünerek
normalize edilmiş dizi oluşturulur. */

   for(int j=0;j<dizi.length;j++){
                satirBoluSutun =(dizi[i][j])/(sutunToplamDizisi[j]);
                normalizeEdilmisDizi[i][j]=satirBoluSutun; 
              
                satirToplam=(satirToplam+normalizeEdilmisDizi[i][j]);     
                }
         goreceliEleman=satirToplam/4;
       goreceliOncelikDizisi[i]=goreceliEleman;

     
            }     

        for(int i=0;i<dizi.length;i++){
                double tutarlilikToplam=0;
               
                for(int j=0;j<dizi.length;j++){
               tutarlilikToplam= tutarlilikToplam+dizi[i][j]*goreceliOncelikDizisi[j];
                
                }
                agirlastirilmisToplamVektor[i]=tutarlilikToplam/goreceliOncelikDizisi[i];
           
               toplamOzdeger=toplamOzdeger+agirlastirilmisToplamVektor[i];
          } 
        
          tutarlilikOrani= (((toplamOzdeger/4)-4)/(4-1))/rassallikMatrisi[4-1];
           if(tutarlilikOrani<0.1){
      JOptionPane.showMessageDialog(null,"İşleminiz tutarlıdır!");
}    else {
              JOptionPane.showMessageDialog(null,"İşleminiz tutarsınız. Geri dönerek tekrardan değerler girebilirsiniz!");
          }
       
           return goreceliOncelikDizisi;
           
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
            java.util.logging.Logger.getLogger(Pencere6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pencere6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pencere6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pencere6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pencere6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
