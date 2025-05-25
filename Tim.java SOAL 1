import java.util.*;

public class Tim {
    private String nama;
    private List<Pemain> pemainList;

    public Tim(String nama) {
        this.nama = nama;
        this.pemainList = new ArrayList<>();
    }

    public void tambahPemain(Pemain p) {
        pemainList.add(p);
    }

    public void tampilkan() {
        System.out.println("Daftar Pemain Tim " + nama + ":");
        for (Pemain p : pemainList) {
            System.out.println("  " + p);
        }
    }

    public void sortTinggi(boolean ascending) {
        pemainList.sort(Comparator.comparingInt(Pemain::getTinggi)
            .reversed().reversed());
        if (!ascending) Collections.reverse(pemainList);
    }

    public void sortBerat(boolean ascending) {
        pemainList.sort(Comparator.comparingInt(Pemain::getBerat)
            .reversed().reversed());
        if (!ascending) Collections.reverse(pemainList);
    }

    public Pemain getMinTinggi() {
        return Collections.min(pemainList, Comparator.comparingInt(Pemain::getTinggi));
    }

    public Pemain getMaxTinggi() {
        return Collections.max(pemainList, Comparator.comparingInt(Pemain::getTinggi));
    }

    public Pemain getMinBerat() {
        return Collections.min(pemainList, Comparator.comparingInt(Pemain::getBerat));
    }

    public Pemain getMaxBerat() {
        return Collections.max(pemainList, Comparator.comparingInt(Pemain::getBerat));
    }

    public static Tim salinTim(String namaBaru, Tim asal) {
        Tim salinan = new Tim(namaBaru);
        for (Pemain p : asal.pemainList) {
            salinan.tambahPemain(new Pemain(p.getTinggi(), p.getBerat()));
        }
        return salinan;
    }
}
