public class Person {
    private String nama;
    private int umur;

    public Person(String nama, int umur) { // Konstruktor
        this.nama = nama;
        this.umur = umur;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String perkenalan() {  // Polimorfisme
        return "Nama saya " + nama + " dan saya berumur " + umur + " tahun.";
    }
}
