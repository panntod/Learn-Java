package belajarjava;

public class ContohSoalPraUkl {
    // disini tidak mengandung apa pun hanya supaya tidak eror disaat disuruh
    // praktek
    // penerapan modifier

    public void pan() {
    }

    protected int pin() {
        return 0;
    }

    void pinpan() {
    }

    private void relationship() {
    }

    // penerapan getter setter
    public void setNama(String nama) {
    }

    public int getNama(int idUser) {
        return 0;
    }

    // penerapan constructor
    // cari apa nama file ini
    public ContohSoalPraUkl() {
        int x = 0;
        double pi = 2.14;
        System.out.println("Belajar untuk pra ukl" + x + pi);
    }
}

// ini contoh dari interface
interface cina {
    public void marga(String xu);

    public String getMarga(int idMarga);
}

// ini kalau disuruh buat jadi abstract
abstract class chinese {
    public abstract void marga(String xu);

    public void suku(String hokkian) {
    }

    public int getMarga(int idMarga) {
        return 0;
    }
}

// inheritance
class luas {
    int luas() {
        System.out.println("Hitung Luas");
        return 0;
    }

    public void setName(String nama, int duit, double tinggi, char grade) {
    }
}

class persegi extends luas {
    int s;

    @Override
    public int luas() {
        System.out.println(s * s);
        return luas();
    }

}