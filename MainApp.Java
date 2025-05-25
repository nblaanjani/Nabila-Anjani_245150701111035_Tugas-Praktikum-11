public class MainApp {
    public static void main(String[] args) {
        // Data Tim A dan Tim B
        int[] tinggiA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};
        int[] beratA  = {50,  60,  56,  55,  60,  70,  66,  56,  72,  56};
        int[] tinggiB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};
        int[] beratB  = {66,  60,  59,  58,  58,  71,  68,  68,  65,  60};

        Tim timA = new Tim("A");
        Tim timB = new Tim("B");

        for (int i = 0; i < tinggiA.length; i++) {
            timA.tambahPemain(new Pemain(tinggiA[i], beratA[i]));
            timB.tambahPemain(new Pemain(tinggiB[i], beratB[i]));
        }

        System.out.println("===== JAWABAN SOAL NOMOR 1 =====");

        // a. Sorting berdasarkan tinggi badan
        System.out.println("\n1.a. Berdasarkan Tinggi Badan (Ascending):");
        timA.sortTinggi(true);
        timB.sortTinggi(true);
        timA.tampilkan();
        timB.tampilkan();

        System.out.println("\n1.a. Berdasarkan Tinggi Badan (Descending):");
        timA.sortTinggi(false);
        timB.sortTinggi(false);
        timA.tampilkan();
        timB.tampilkan();

        // b. Sorting berdasarkan berat badan
        System.out.println("\n1.b. Berdasarkan Berat Badan (Ascending):");
        timA.sortBerat(true);
        timB.sortBerat(true);
        timA.tampilkan();
        timB.tampilkan();

        System.out.println("\n1.b. Berdasarkan Berat Badan (Descending):");
        timA.sortBerat(false);
        timB.sortBerat(false);
        timA.tampilkan();
        timB.tampilkan();

        // c. Nilai maksimum dan minimum
        System.out.println("\n1.c. Nilai Maksimum dan Minimum:");
        System.out.println("  Tim A - Tinggi Min: " + timA.getMinTinggi());
        System.out.println("  Tim A - Tinggi Max: " + timA.getMaxTinggi());
        System.out.println("  Tim A - Berat Min : " + timA.getMinBerat());
        System.out.println("  Tim A - Berat Max : " + timA.getMaxBerat());

        System.out.println("  Tim B - Tinggi Min: " + timB.getMinTinggi());
        System.out.println("  Tim B - Tinggi Max: " + timB.getMaxTinggi());
        System.out.println("  Tim B - Berat Min : " + timB.getMinBerat());
        System.out.println("  Tim B - Berat Max : " + timB.getMaxBerat());

        // d. Copy anggota Tim B ke Tim C
        Tim timC = Tim.salinTim("C", timB);
        System.out.println("\n1.d. Copy seluruh anggota Tim B ke Tim C:");
        timC.tampilkan();
    }
}
