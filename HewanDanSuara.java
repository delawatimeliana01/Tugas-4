class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}

public class HewanDanSuara {
    public static void main(String[] args) {
        Hewan h1 = new Anjing();
        Hewan h2 = new Kucing();
        h1.suara();
        h2.suara();
    }
}