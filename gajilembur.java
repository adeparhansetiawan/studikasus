import java.util.Scanner;

public class gajilembur {

    public static double hitungGajiLembur(double gajiBulanan, int jamLembur) {
        int upahLemburPerJam = (int) Math.ceil(gajiBulanan / 173);

        int totalUpahLembur;
        if (jamLembur <= 4) {
            totalUpahLembur = jamLembur * upahLemburPerJam;
        } else {
            totalUpahLembur = (4 * upahLemburPerJam) + ((jamLembur - 4) * 2 * upahLemburPerJam);
        }

        double totalGaji = gajiBulanan + totalUpahLembur;

        System.out.println("Gaji Bulanan: " + gajiBulanan);
        System.out.println("Upah Lembur per Jam: " + upahLemburPerJam);
        System.out.println("Total Upah Lembur: " + totalUpahLembur);
        System.out.println("Total Gaji: " + totalGaji);

        return totalGaji;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Gaji Bulanan: ");
        double gajiBulanan = scanner.nextDouble();

        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = scanner.nextInt();

        hitungGajiLembur(gajiBulanan, jamLembur);

        scanner.close();
    }
}