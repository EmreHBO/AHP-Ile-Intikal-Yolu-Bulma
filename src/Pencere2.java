package arayuz;

public class Pencere2 extends javax.swing.JFrame {
        
    public double[][] diziyeDegerGonder= new double[4][4];
    public double[] egimdizi= new double[4];
    public int sayi;
    public Pencere2() {
        

        initComponents();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yol Eğim Değerleri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(19, 46, 215))); // NOI18N

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("TAMAM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Yolların ortalama eğim değerlerini giriniz");

        jLabel1.setText("1.Yol Eğim Derecesi(°)");

        jLabel3.setText("2.Yol Eğim Derecesi(°)");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("3.Yol Eğim Derecesi(°)");

        jLabel5.setText("4.Yol Eğim Derecesi(°)");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, jLabel5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, jLabel5});

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double sayi1=Double.parseDouble(jTextField1.getText())-Double.parseDouble(jTextField2.getText());
        double sayi2=Double.parseDouble(jTextField1.getText())-Double.parseDouble(jTextField3.getText());
        double sayi3=Double.parseDouble(jTextField1.getText())-Double.parseDouble(jTextField4.getText());   
        double sayi4=Double.parseDouble(jTextField2.getText())-Double.parseDouble(jTextField3.getText());
        double sayi5=Double.parseDouble(jTextField2.getText())-Double.parseDouble(jTextField4.getText());
        double sayi6=Double.parseDouble(jTextField3.getText())-Double.parseDouble(jTextField4.getText()); 
        if(sayi1<=-50)                        diziyeDegerGonder[0][1]=9;
            else if(sayi1>-50&&sayi1<=-40)    diziyeDegerGonder[0][1]=7;
            else if(sayi1>-40&&sayi1<=-20)    diziyeDegerGonder[0][1]=5;
            else if(sayi1>-20&&sayi1<=-10)    diziyeDegerGonder[0][1]=3;
            else if(sayi1>-10&&sayi1<=10)     diziyeDegerGonder[0][1]=2;
            else if(sayi1>10&&sayi1<=20)      diziyeDegerGonder[0][1]=0.3333;
            else if(sayi1>20&&sayi1<=40)      diziyeDegerGonder[0][1]=0.2;
            else if(sayi1>40&&sayi1<=50)      diziyeDegerGonder[0][1]=0.14285;
            else if(sayi1>50)                 diziyeDegerGonder[0][1]=0.1111;
            
          if(sayi2<=-50)                      diziyeDegerGonder[0][2]=9;
            else if(sayi2>-50&&sayi2<=-40)    diziyeDegerGonder[0][2]=7;
            else if(sayi2>-40&&sayi2<=-20)    diziyeDegerGonder[0][2]=5;
            else if(sayi2>-20&&sayi2<=-10)    diziyeDegerGonder[0][2]=3;
            else if (sayi2>-10&&sayi2<=10)    diziyeDegerGonder[0][2]=2;
            else if(sayi2>10&&sayi2<=20)      diziyeDegerGonder[0][2]=0.3333;
            else if(sayi2>20&&sayi2<=40)      diziyeDegerGonder[0][2]=0.2;
            else if(sayi2>40&&sayi2<=50)      diziyeDegerGonder[0][2]=0.14285;
            else if(sayi2>50)                 diziyeDegerGonder[0][2]=0.1111;
            
        // daha kısa ise zaman açısından daha iyidir .
          if(sayi3<=-50)                      diziyeDegerGonder[0][3]=9;
            else if(sayi3>-50&&sayi3<=-40)    diziyeDegerGonder[0][3]=7;
            else if(sayi3>-40&&sayi3<=-20)    diziyeDegerGonder[0][3]=5;
            else if(sayi3>-20&&sayi3<=-10)    diziyeDegerGonder[0][3]=3;
            else if (sayi3>-10&&sayi3<=10)    diziyeDegerGonder[0][3]=2; 
            else if(sayi3>10 && sayi3<=20)    diziyeDegerGonder[0][3]=0.3333;
            else if(sayi3>20 && sayi3<=40)    diziyeDegerGonder[0][3]=0.2;
            else if(sayi3>40 && sayi3<=50)    diziyeDegerGonder[0][3]=0.14285;
            else if(sayi3>50)                 diziyeDegerGonder[0][3]=0.1111;
          
        if(sayi4<=-50)                        diziyeDegerGonder[1][2]=9;
            else if(sayi4>-50&&sayi4<=-40)    diziyeDegerGonder[1][2]=7;
            else if(sayi4>-40&&sayi4<=-20)    diziyeDegerGonder[1][2]=5;
            else if(sayi4>-20&&sayi4<=-10)    diziyeDegerGonder[1][2]=3;
            else if(sayi4>-10&&sayi4<=10)     diziyeDegerGonder[1][2]=2;
            else if(sayi4>10&&sayi4<=20)      diziyeDegerGonder[1][2]=0.3333;
            else if(sayi4>20&&sayi4<=40)      diziyeDegerGonder[1][2]=0.2;
            else if(sayi4>40&&sayi4<=50)      diziyeDegerGonder[1][2]=0.14285;
            else if(sayi4>50)                 diziyeDegerGonder[1][2]=0.1111;
            
          if(sayi5<=-50)                      diziyeDegerGonder[1][3]=9;
            else if(sayi5>-50&&sayi5<=-40)    diziyeDegerGonder[1][3]=7;
            else if(sayi5>-40&&sayi5<=-20)    diziyeDegerGonder[1][3]=5;
            else if(sayi5>-20&&sayi5<=-10)    diziyeDegerGonder[1][3]=3;
            else if (sayi5>-10&&sayi5<=10)    diziyeDegerGonder[1][3]=2;
            else if(sayi5>10&&sayi5<=20)      diziyeDegerGonder[1][3]=0.3333;
            else if(sayi5>20&&sayi5<=40)      diziyeDegerGonder[1][3]=0.2;
            else if(sayi5>40&&sayi5<=50)      diziyeDegerGonder[1][3]=0.14285;
            else if(sayi5>50)                 diziyeDegerGonder[1][3]=0.1111;
            
        // daha kısa ise zaman açısından daha iyidir .
          if(sayi6<=-50)                      diziyeDegerGonder[2][3]=9;
            else if(sayi6>-50&&sayi6<=-40)    diziyeDegerGonder[2][3]=7;
            else if(sayi6>-40&&sayi6<=-20)    diziyeDegerGonder[2][3]=5;
            else if(sayi6>-20&&sayi6<=-10)    diziyeDegerGonder[2][3]=3;
            else if (sayi6>-10&&sayi6<=10)    diziyeDegerGonder[2][3]=2; 
            else if(sayi6>10 && sayi6<=20)    diziyeDegerGonder[2][3]=0.3333;
            else if(sayi6>20 && sayi6<=40)    diziyeDegerGonder[2][3]=0.2;
            else if(sayi6>40 && sayi6<=50)    diziyeDegerGonder[2][3]=0.14285;
            else if(sayi6>50)                 diziyeDegerGonder[2][3]=0.1111;
       egimdizi=gonder();
       yolYapisiIcinNesneOlustur();
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed
public double[] gonder(){
    int n=sayi;
    double [][]dizi= new double[n][n];///alternatif yol sayısı kadar karşılaştırma yapmak için iki boyutlu diiz oluşturuyoruz.
         double []sutunToplamDizisi= new double[dizi.length]; /// tablo(iki boyutlu dizi) oluşturulduktan sonra yapılacak hesaplamalarda sütun toplamları gerektiği için tutuyoruz.
         double satirBoluSutun=0; // yine hesaplamalarda kullanmak için değer oluşturuyoruz.
         double [][]normalizeEdilmisDizi=new double[n][n]; //yani elemanların ait olduğu sütun toplamlarına bölünmüş değerlerini yeni bir diziye atadık
         double goreceliEleman; 
         double toplamOzdeger=0;
         double []goreceliOncelikDizisi=new double[n];

         double []agirlastirilmisToplamVektor= new double[n];
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
         goreceliEleman=satirToplam/n;
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
        
          tutarlilikOrani= (((toplamOzdeger/n)-n)/(n-1))/rassallikMatrisi[n-1];
          // System.out.print("tutarlılık oranı:"+tutarlilikOrani);
            //System.out.println(" ");
           return goreceliOncelikDizisi;
}
public void yolYapisiIcinNesneOlustur(){
    Pencere3 nesne3=new Pencere3();
    nesne3.setVisible(true);
    for(int i=0;i<4;i++){
        nesne3.egimdizisi[i]=egimdizi[i];
            }
}  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
