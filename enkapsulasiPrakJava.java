package tugas_enkapsulasi;
import java.util.Scanner;

class MainKinetic {
    private double massa;
    private double kecepatan;

    // Setter untuk massa
    public void setMassa(double massa) {
        this.massa = massa;
    }

    // Getter untuk massa
    public double getMassa() {
        return massa;
    }

    // Setter untuk kecepatan
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Getter untuk kecepatan
    public double getKecepatan() {
        return kecepatan;
    }

    // Metode untuk menghitung energi kinetik
    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
}


class EnergiKinetik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainKinetic kinetic = new MainKinetic();

        // Input dari user
        System.out.print("Masukkan massa object (kg): ");
        kinetic.setMassa(scanner.nextDouble());

        System.out.print("Masukkan kecepatan object (m/s): ");
        kinetic.setKecepatan(scanner.nextDouble());

        // Menampilkan hasil perhitungan
        System.out.println("\nEnergi Kinetik: " + kinetic.hitungEnergiKinetik() + " Joule");

        scanner.close();
    }
}