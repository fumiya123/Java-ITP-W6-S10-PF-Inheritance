class Kendaraan { // Superclass (Kelas Induk)
    String merk;
    String pabrik;

    public Kendaraan(String merk, String pabrik) {
        this.merk = merk;
        this.pabrik = pabrik;
    }

    public void info() {
        System.out.println("Merk: " + merk + ", Pabrik: " + pabrik);
    }
}

class MobilFortuner extends Kendaraan { // Subclass (Kelas Turunan)
    String namaMobil;

    public MobilFortuner(String merk, String pabrik, String namaMobil) {
        super(merk, pabrik); // panggil constructor dari superclass
        this.namaMobil = namaMobil;
    }

    // method khusus untuk MobilFortuner
    public void infoMobil() {
        System.out.println("Mobil ini bernama TOYOTA " + namaMobil + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // membuat objek MobilFortuner yang merupakan subclass dari Kendaraan
        MobilFortuner fortuner = new MobilFortuner("Toyota", "Karawang Plant #1", "FORTUNER");

        // kenggunakan method dari superclass
        fortuner.info(); // Output: Merk: Toyota, Pabrik: Karawang Plant #1

        // Menggunakan metode dari subclass
        fortuner.infoMobil(); // Output: Mobil ini bernama TOYOTA FORTUNER.
    }
}
