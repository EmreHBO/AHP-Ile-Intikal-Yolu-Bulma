package arayuz;
public class Pencere10 extends javax.swing.JFrame {
public double[][] diziyeDegerGonder= new double[3][3];
    public double[] egimdizisi4=new double[3]; 
    public double[] yolyapisidizisi4=new double[3]; 
    public double[] guvenlikdizisi4=new double[3]; 
    public double[] zamandizi=new double[3];
    public Pencere10() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yol Uzunluk Değerleri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(17, 108, 242))); // NOI18N

        jLabel1.setText("1. Yol(KM)");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("2.Yol(KM)");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("3.Yol(KM)");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("TAMAM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Yolların uzunluk değerlerini(km) giriniz ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jTextField1, jTextField2, jTextField3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jTextField1, jTextField2, jTextField3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double sayi1=Double.parseDouble(jTextField1.getText())-Double.parseDouble(jTextField2.getText());
        double sayi2=Double.parseDouble(jTextField1.getText())-Double.parseDouble(jTextField3.getText());
        double sayi3=Double.parseDouble(jTextField2.getText())-Double.parseDouble(jTextField3.getText());   
          // daha kısa ise zaman açısından daha iyidir .
            if(sayi1<=-8)                   diziyeDegerGonder[0][1]=9;
            else if(sayi1>-8&&sayi1<=-6)    diziyeDegerGonder[0][1]=7;
            else if(sayi1>-6&&sayi1<=-4)    diziyeDegerGonder[0][1]=5;
            else if(sayi1>-4&&sayi1<=-2)    diziyeDegerGonder[0][1]=3;
            else if (sayi1>-2&&sayi1<=2)    diziyeDegerGonder[0][1]=2;
            else if(sayi1>2&&sayi1<=4)      diziyeDegerGonder[0][1]=0.3333;
            else if(sayi1>4&&sayi1<=6)      diziyeDegerGonder[0][1]=0.2;
            else if(sayi1>6&&sayi1<=8)      diziyeDegerGonder[0][1]=0.14285;
            else if(sayi1>8)                diziyeDegerGonder[0][1]=0.1111;
            
          if(sayi2<=-8)                     diziyeDegerGonder[0][2]=9;
            else if(sayi2>-8&&sayi2<=-6)    diziyeDegerGonder[0][2]=7;
            else if(sayi2>-6&&sayi2<=-4)    diziyeDegerGonder[0][2]=5;
            else if(sayi2>-4&&sayi2<=-2)    diziyeDegerGonder[0][2]=3;
            else if (sayi2>-2&&sayi2<=2)    diziyeDegerGonder[0][2]=2;
            else if(sayi2>2&&sayi2<=4)      diziyeDegerGonder[0][2]=0.3333;
            else if(sayi2>4&&sayi2<=6)      diziyeDegerGonder[0][2]=0.2;
            else if(sayi2>6&&sayi2<=8)      diziyeDegerGonder[0][2]=0.14285;
            else if(sayi2>8)                diziyeDegerGonder[0][2]=0.1111;
            
        // daha kısa ise zaman açısından daha iyidir .
          if(sayi3<=-8)                     diziyeDegerGonder[1][2]=9;
            else if(sayi3>-8&&sayi3<=-6)    diziyeDegerGonder[1][2]=7;
            else if(sayi3>-6&&sayi3<=-4)    diziyeDegerGonder[1][2]=5;
            else if(sayi3>-4&&sayi3<=-2)    diziyeDegerGonder[1][2]=3;
            else if (sayi3>-2&&sayi3<=2)    diziyeDegerGonder[1][2]=2; 
            else if(sayi3>2 && sayi3<=4)    diziyeDegerGonder[1][2]=0.3333;
            else if(sayi3>4 && sayi3<=6)    diziyeDegerGonder[1][2]=0.2;
            else if(sayi3>6 && sayi3<=8)    diziyeDegerGonder[1][2]=0.14285;
            else if(sayi3>8)                diziyeDegerGonder[1][2]=0.1111;
               
                 zamandizi=gonder();
        sonrakiIcinNesneOlustur();
        this.setVisible(false);
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
public double[] gonder(){
    
    double [][]dizi= new double[3][3];///alternatif yol sayısı kadar karşılaştırma yapmak için iki boyutlu diiz oluşturuyoruz.
         double []sutunToplamDizisi= new double[dizi.length]; /// tablo(iki boyutlu dizi) oluşturulduktan sonra yapılacak hesaplamalarda sütun toplamları gerektiği için tutuyoruz.
         double satirBoluSutun=0; // yine hesaplamalarda kullanmak için değer oluşturuyoruz.
         double [][]normalizeEdilmisDizi=new double[3][3]; //yani elemanların ait olduğu sütun toplamlarına bölünmüş değerlerini yeni bir diziye atadık
         double goreceliEleman; 
         double toplamOzdeger=0;
         double []goreceliOncelikDizisi=new double[3];

         double []agirlastirilmisToplamVektor= new double[3];
         double []rassallikMatrisi={0,0,0.58,0.90,1.12,1.24,1.32,1.41,1.45,1.49,1.51,1.54,1.56,1.57,1.58};
         double tutarlilikOrani=0;
         ////tanımlanan değişkenler
         
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
            
           } /// sütunları topluyoruz. daha sonra bu sütunların toplamını bir diziye atıyoruz. 
             // bir alt satırda bu atama yapılıyor.
           sutunToplamDizisi[i]= toplam;    
           //System.out.print(sutunToplamDizisi[i]+"\t");
                   
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
         goreceliEleman=satirToplam/3;
       goreceliOncelikDizisi[i]=goreceliEleman;

       //    System.out.print(goreceliEleman+"\t");
            }     

        for(int i=0;i<dizi.length;i++){
                double tutarlilikToplam=0;
               
                for(int j=0;j<dizi.length;j++){
               tutarlilikToplam= tutarlilikToplam+dizi[i][j]*goreceliOncelikDizisi[j];
                
                }
                agirlastirilmisToplamVektor[i]=tutarlilikToplam/goreceliOncelikDizisi[i];
              // System.out.print(agirlastirilmisToplamVektor[i]+"\t");
               toplamOzdeger=toplamOzdeger+agirlastirilmisToplamVektor[i];
          } 
        
          tutarlilikOrani= (((toplamOzdeger/3)-3)/(3-1))/rassallikMatrisi[3-1];
          // System.out.print("tutarlılık oranı:"+tutarlilikOrani);
            //System.out.println(" ");
           
            
           return goreceliOncelikDizisi;
}
public void sonrakiIcinNesneOlustur(){
    Pencere11 nesne11=new Pencere11();
    nesne11.setVisible(true);
    for(int i=0;i<3;i++){
        nesne11.egimdizisi5[i]=egimdizisi4[i];
        nesne11.yolyapisidizisi5[i]=yolyapisidizisi4[i];
        nesne11.guvenlikdizisi5[i]=guvenlikdizisi4[i];
        nesne11.zamandizisi5[i]=zamandizi[i];
            }
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
            java.util.logging.Logger.getLogger(Pencere10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pencere10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pencere10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pencere10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pencere10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
