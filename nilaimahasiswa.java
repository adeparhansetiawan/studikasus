import java.util.ArrayList;
import java.util.Scanner;

public class nilaimahasiswa {
    static ArrayList<String> matkul = new ArrayList<>();
    static ArrayList<Integer> sks = new ArrayList<>();
    static ArrayList<Integer> nilai = new ArrayList<>();
    static ArrayList<String> hurufMutu = new ArrayList<>();
    static ArrayList<Double> bobotMutu = new ArrayList<>();
    static int totalSKS = 0;
    static double totalBobotSKS = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Semester: ");
        int semester = sc.nextInt();
        sc.nextLine();

        String lanjut;
        do {
            System.out.print("Mata Kuliah: ");
            matkul.add(sc.nextLine());

            System.out.print("SKS: ");
            int sksMatkul = sc.nextInt();
            sks.add(sksMatkul);

            System.out.print("Nilai: ");
            int nilaiMatkul = sc.nextInt();
            nilai.add(nilaiMatkul);
            sc.nextLine();

            double bobot = hitungBobot(nilaiMatkul);
            String mutu = hitungMutu(nilaiMatkul);

            hurufMutu.add(mutu);
            bobotMutu.add(bobot);
            totalBobotSKS += bobot * sksMatkul;
            totalSKS += sksMatkul;

            System.out.print("Input data lagi? (y/n): ");
            lanjut = sc.nextLine().toLowerCase();
        } while (lanjut.equals("y"));

        tampilkanTranskrip(nama, semester);
        sc.close();
    }

    private static double hitungBobot(int nilai) {
        if (nilai <= 40)
            return 0.0;
        if (nilai <= 50)
            return 1.0;
        if (nilai <= 54)
            return 1.7;
        if (nilai <= 59)
            return 2.0;
        if (nilai <= 64)
            return 2.3;
        if (nilai <= 69)
            return 2.7;
        if (nilai <= 74)
            return 3.0;
        if (nilai <= 79)
            return 3.3;
        if (nilai <= 84)
            return 3.7;
        return 4.0;
    }

    private static String hitungMutu(int nilai) {
        if (nilai <= 40)
            return "E";
        if (nilai <= 50)
            return "D";
        if (nilai <= 54)
            return "C-";
        if (nilai <= 59)
            return "C";
        if (nilai <= 64)
            return "C+";
        if (nilai <= 69)
            return "B-";
        if (nilai <= 74)
            return "B";
        if (nilai <= 79)
            return "B+";
        if (nilai <= 84)
            return "A-";
        return "A";
    }

    private static void tampilkanTranskrip(String nama, int semester) {
        System.out.println("\nTranskrip Nilai");
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
        System.out.printf("%-5s %-15s %-5s %-10s %-5s %-5s%n", "No", "Mata Kuliah", "SKS", "Huruf Mutu", "Bobot",
                "Nilai");

        for (int i = 0; i < matkul.size(); i++) {
            System.out.printf("%-5d %-15s %-5d %-10s %-5.1f %-5d%n",
                    i + 1, matkul.get(i), sks.get(i), hurufMutu.get(i), bobotMutu.get(i), nilai.get(i));
        }

        System.out.printf("Jumlah SKS: %d%n", totalSKS);
        System.out.printf("IP Semester: %.2f%n", totalBobotSKS / totalSKS);
        System.out.println("Jumlah SKS yang bisa diambil semester depan: 24");
    }
}
