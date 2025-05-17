class HitungLuas {
    double luas(double sisi) {
        return sisi * sisi;
    }

    double luas(double panjang, double lebar) {
        return panjang * lebar;
    }

    double luas(double alas, double tinggi, boolean segitiga) {
        return 0.5 * alas * tinggi;
    }
}

public class Main2{
    public static void main(String[] args) {
        HitungLuas hl = new HitungLuas();
        System.out.println("Luas persegi: " + hl.luas(4));
        System.out.println("Luas persegi panjang: " + hl.luas(4, 6));
        System.out.println("Luas segitiga: " + hl.luas(4, 6, true));
    }
}