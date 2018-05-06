package praktik02;
public class helm {
    double merek;
    double warna;

    public helm() {
        merek=5;
        warna=2;
    }

    public helm(double warna, double merek) {
        this.merek = merek;
        this.warna = warna;
    }
    
    
   void cetakinfo(){
        System.out.println("===================");
        System.out.println("warna : "+warna);
        System.out.println("merek : "+merek);
        System.out.println("===================");
        
    }
   double hitungharga() {
       double harga;
       harga=merek*warna;return harga;
   }
   
   void cetakharga() {
       System.out.println("harganya adalah = "+hitungharga());
      
   }
}

