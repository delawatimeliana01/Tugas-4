class Bentuk {
    void gambar() {
        System.out.println("Menggambar bentuk umum");
    }
}

class Lingkaran extends Bentuk {
    @Override
    void gambar() {
        System.out.println("Menggambar Lingkaran");
    }
}

class Persegi extends Bentuk {
    @Override
    void gambar() {
        System.out.println("Menggambar Persegi");
    }
}

public class BentukGeometri {
    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran();
        Bentuk b2 = new Persegi();
        b1.gambar();
        b2.gambar();
    }
}