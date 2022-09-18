package tugasJobshet1;

public class tv{
    private String merek;
    private String warna;
    private int harga;

    public void setMerek(String newMerek){
        merek = newMerek;
    }

    public void setWarna(String newWarna){
        warna = newWarna;
    }

    public void setHarga(int newHarga){
        harga = newHarga;
    }

    public void Tampilkan(){
        System.out.println("Merek    : "+merek);
        System.out.println("Warna    : "+warna);
        System.out.println("Harga    : "+harga);
    }
}
