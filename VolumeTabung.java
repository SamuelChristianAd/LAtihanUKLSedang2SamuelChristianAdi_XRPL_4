import java.util.Scanner;

public class VolumeTabung {
    
    static int hitungVolume(int jariJari, int tinggi) {
        int phi = 314; 
        int volume = phi * jariJari * jariJari * tinggi / 100;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jari-jari tabung (cm): ");
        int r = input.nextInt();

        System.out.print("Masukkan tinggi tabung (cm): ");
        int t = input.nextInt();

        
        int hasil = hitungVolume(r, t);

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jari-jari : " + r + " cm");
        System.out.println("Tinggi    : " + t + " cm");
        System.out.println("Volume    : " + hasil + " cm3");
    }
}
