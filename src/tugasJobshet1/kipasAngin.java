package tugasJobshet1;

public class kipasAngin {
    private String merek;
    private int harga;
    private int level;

    public void setMerek(String newMerek){
        merek = newMerek;
    }

    public void setHarga(int newHarga){
        harga = newHarga;
    }

    public void setLevel(int newLevel){
        level = newLevel;
    }

    public void Tampilkan(){
        System.out.println("Merek     : "+merek);
        System.out.println("Harga     : "+harga);
        System.out.println("tingkatan : "+level);
    }
}
