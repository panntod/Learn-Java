# Persiapan Pra Ukl Java Kelas 10 - SMK TELKOM MALANG

## Deskripsi

Dalam repo ini, berisikan documentation belajar java pribadi saya untuk mempermudah belajar bagi pemula untuk mendalami bahasa pemrograman java, materi ini didapat dari [Materi SMK Telkom Malang](https://www.smktelkom-mlg.sch.id/).

### Installation

Pastikan sudah menginstal Java msi atau download menggunakan link:

[Download Java for Windows](https://javadl.oracle.com/webapps/download/AutoDL?BundleId=249203_b291ca3e0c8548b5a51d5a5f50063037).

### Code Editor

Pastikan sudah menginstal Code editor di laptop masing masing, disini saya menggunakan Apache Netbeans atau download menggunakan link:

[Download Apache Netbeans for Windows v20](https://dlcdn.apache.org/netbeans/netbeans-installers/20/Apache-NetBeans-20r1-bin-windows-x64.exe).

## Pembahasan

- Modifier
- Getter
- Setter
- Constructor
- Polimorphisme

1. sebutkan apa itu `enkapulasi`?
   jawaban:

contoh modifier ada 4 yaitu:
`public` : bisa diakses dimana pun, paling fleksibel
`protected` : hanya bisa diakses dari superclass, subclass, beda file
`no modifier` (kosongan) : bisa diakses disubclass dan class itu sendiri
`private` : hanya bisa diakses dari class itu sendiri (paling introvert)

contoh penerapan:
public:
```java
public static void main(){
    // add Code TODO Here
}
```
protected:
```java
protected String pin(){
    // add Code TODO Here
}
```
no modifier:
```java
void pinpan(){
    // add Code TODO Here
}
```
private:
```java
private relationship(){
    // add Code TODO Here   
}
```

2. apa itu `getter` `setter`?
   jawaban:

dari namanya bisa diketahui bahwa `getter` untuk mendapatkan dan `setter` untuk mengsetting sesuatu. hanya bisa digunakan di private class, karena private class tidak bisa dipanggil dari class lain (istilah gampangnya orang dalam)

contoh penerapan `setter`:
```java
public void setNama(String nama){
this.namaMember.add(nama);
}
```
contoh penerapan `getter`:
```java
public String getNama(int idMember){
return this.namaMember.get(idMember);
}
```

3.apa itu `constructor`?
jawaban:

`constructor` adalah nilai default dari sebuah class, jadi nama constructor harus sesuai dengan nama class yang dimiliki
contoh penerapan:
```java
public class hts{

    public hts(){
        System.out.println("yah kasihan hts mulu ga pernah jadian");
    }
}
```

4.apa itu `polimorphisme`?
jawaban:

`polimorphisme` adalah pewarisan dari sebuah code ke code lain, ada dua `polimorphisme` yaitu interface dan inheritance

`interface` adalah bentuk awal yang abstrak/ tidak berbentuk, supaya code tersebut tidak eror harus dibentuk setiap fungsi yg ada didalamnnya
interface memiliki ciri2 yaitu ada tambahan implements di nama classnya


contoh penerapan:
```java
interface pan{

    *ada dua cara membuat nya yaitu dengan interface/ abstrak
    public interface cina{
        public void marga(String xu);
        public void suku(String hokkian);

        public String getMarga(int idMarga);
    }

    *jika disuruh merubah ke codingan abstract
    public abstract class cina{
        public abstract void marga(String xu);
        public void suku(String hokkian){
            // add Code TODO Here  
        }

        public abstract String getMarga(int idMarga){
            // add Code TODO Here  
        }

    }
}
```

4.apa itu `inheritance`?
jawaban:

`inheritance` adalah cara menumpuk code persis seperti superclass nya (jadi apapun yg ada di indukan juga turun ke anakannya)
`inheritance` memiliki ciri2 yaitu menggunakan extends
contoh penerapan:
```java
public class Luas{
    int luas(){
        System.out.println("Hitung Luas");
        return 0;
    }
}

class persegi extends Luas{
    int sisi;

    public int luas(){
        System.out.println(sisi * sisi)
        return luas;
    }

}
```

contoh penerapan code [ContohSoalPraUKL](https://github.com/panntod/Belajar-Java/blob/main/src/belajarjava/ContohSoalPraUkl.java)