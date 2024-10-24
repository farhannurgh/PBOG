//buku
public class Book {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategori;

    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategori = kategori;
    }

    public void printDetails() {
        System.out.println("Detail Buku:");
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Nama Penerbit: " + namaPenerbit);
        System.out.println("Kategori     : " + kategori);
    }
}

//main
public class Main {
    public static void main(String[] args) {
        Book buku1 = new Book("Masakan dapur", "chef dul", 2009, "Around", "Masakan ");
        
        buku1.printDetails();
    }
}