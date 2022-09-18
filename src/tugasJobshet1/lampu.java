package tugasJobshet1;

public class lampu {
    private String merek;
    private String Ukuran;
    private int harga;

    public void setMerek(String newMerek){
        merek = newMerek;
    }

    public void setUkuran(String newUkuran){
        Ukuran = newUkuran;
    }

    public void setHarga(int newHarga){
        harga = newHarga;
    }

    public void Tampilkan(){
        System.out.println("Merek    : "+merek);
        System.out.println("Ukuran   : "+Ukuran);
        System.out.println("Harga    : "+harga);
    }
}

