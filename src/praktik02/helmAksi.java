package praktik02;

public class helmAksi {
    public static void main(String[] args) {
        helm  budi = new helm();
        budi.merek = 20000;
        budi.warna = 15000;
        
        budi.cetakinfo();
        System.out.println("harga helm = "+budi.hitungharga());
        budi.cetakharga();
        
        helm ani = new helm ();
        ani.cetakinfo();
        
        helm tini = new helm(20000,10000);
        tini.cetakinfo();
    }
}
