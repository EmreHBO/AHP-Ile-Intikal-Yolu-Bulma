package proje;

import java.util.Scanner;

public class Proje {

    
    public static void main(String[] args) {
     
    System.out.println("kaç tane alternatif yol var:");
      Scanner kullanicidanAl=new Scanner(System.in);
      
    int alternatifYolSayisi=kullanicidanAl.nextInt();
    IkiliKarsilastirma egim=new IkiliKarsilastirma();
    IkiliKarsilastirma yolYapisi=new IkiliKarsilastirma(); 
    IkiliKarsilastirma guvenlik=new IkiliKarsilastirma();
    IkiliKarsilastirma zaman=new IkiliKarsilastirma();
    System.out.println("Eğime göre alternatif "+alternatifYolSayisi+" yol için karşılaştırma yap:");
    double[] egimdizi=egim.KarsilastirmaYap(alternatifYolSayisi);
    
    System.out.println("Yolyapısına göre alternatif "+alternatifYolSayisi+" yol için karşılaştırma yap:");
    double[] yolyapisidizi=yolYapisi.KarsilastirmaYap(alternatifYolSayisi);
    
    System.out.println("Güvenliğe göre alternatif "+alternatifYolSayisi+" yol için karşılaştırma yap:"); 
    double[] guvenlikdizi=guvenlik.KarsilastirmaYap(alternatifYolSayisi);
    
    System.out.println("Zamana göre alternatif "+alternatifYolSayisi+" yol için karşılaştırma yap:");
    double[] zamandizi=zaman.KarsilastirmaYap(alternatifYolSayisi);
    
    IkiliKarsilastirma kriterler=new IkiliKarsilastirma(); // kriterlerin nesnesi
    System.out.println("Kriterleri kendi arasında karşılaştır:");
    double[] kriterdizi=kriterler.KarsilastirmaYap(4); // kriterlerin kendi aralarında karşılaştırılması

    double[][] goreceliOncelikDizisi=new double[alternatifYolSayisi][4];
    
    double[] karsilastirmadizisi=new double[alternatifYolSayisi];
       for(int i=0;i<alternatifYolSayisi;i++){
          
              goreceliOncelikDizisi[i][0]=egimdizi[i];
              goreceliOncelikDizisi[i][1]=yolyapisidizi[i];
              goreceliOncelikDizisi[i][2]=guvenlikdizi[i];
              goreceliOncelikDizisi[i][3]=zamandizi[i];
           
       }
        for (int i = 0; i < alternatifYolSayisi; i++) {
            for (int j = 0; j < 4; j++) {
             karsilastirmadizisi[i]=karsilastirmadizisi[i]+goreceliOncelikDizisi[i][j]*kriterdizi[j];
            
            } System.out.println(karsilastirmadizisi[i]);
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
                if(karsilastirmadizisi[i]==max) System.out.println(i+1+". yolu seçilmelidir."); 
// burada ise en büyük değerin indisi yani yol sayısı seçiliyor.
            }         
  
    }
    
/**
 *
 * @author Huseyin6
 */ 


}
    
    
    
    
    
    
    

