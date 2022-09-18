package tugasJobshet1;

public class demoTugas {
    public static void main(String args[]){
        tvLed tl = new tvLed();
        tv tp = new tv();
        kipasAngin kps = new kipasAngin();
        lampu lmp = new lampu();

        System.out.println("| JATI WAHYU KUSUMA |");
        System.out.println("| 10                |");
        System.out.println("|SIB 2E             |");
        
        System.out.println("-----------------");  
        tp.setMerek("Samsung");
        tp.setWarna("Silver");
        tp.setHarga(1500000);
        tp.Tampilkan();

        System.out.println("-----------------");       
        System.out.println("-----------------");

        kps.setMerek("polytron");
        kps.setLevel( 3);
        kps.setHarga(50000);
        kps.Tampilkan();

        System.out.println("-----------------");       
        System.out.println("-----------------");

        lmp.setMerek("Philips");
        lmp.setHarga(45000);
        lmp.setUkuran("34 watt");
        lmp.Tampilkan();

        System.out.println("-----------------");
        System.out.println("-----------------");
        tl.setHarga(45000);
        tl.setMerek("Panasonic");
        tl.setWarna("hitam doff");
        tl.Tampilkan();
        tl.ukuran("30 inch");
        tl.tampilkann();

        System.out.println("-----------------");
        System.out.println("-----------------");


    }
}
