package celik.alpay.karakteroyunu;

public class Karakter {
    int kilo;
    int haraketSayisi;
    int saldiriGucu;
    String isim = "Karaktere isim verin!";
    public String yemek(){
        if (haraketSayisi > 0){
            kilo++;
            haraketSayisi--;
            return "yemek yedi ve kilosu arttı.";
        }
        else {
            return "Yeterli hareket yok.";
        }
    }
    public String uyumak(){
        if (haraketSayisi > 0){
            haraketSayisi--;
            return "karakterimiz uyudu.";
        }
        else {
            return "Yeterli hareket yok";
        }
    }
    public String savas() {
        if (haraketSayisi > 0) {
            haraketSayisi--;
            saldiriGucu++;
            return "karakterimiz savastı.";
        } else {
            return "Yeterli hareket yok";
        }
    }
    @Override
    public String toString(){
        return  "Karakterin ismi : " + isim
                + "\nKilo : " + kilo
                + "\nHareket Sayısı : " + haraketSayisi
                + "\nSaldırı Gücü : " + saldiriGucu;
    }
}
