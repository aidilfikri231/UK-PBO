public class Mahasiswa extends Person {
    private String nim;

    public Mahasiswa(String nama, int umur, String nim) {  // Overloading Konstruktor
        super(nama, umur);
        this.nim = nim;
    }

    // Getter dan Setter untuk nim
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String perkenalan() {  // Overriding Method
        return "Nama saya " + getNama() + ", saya berumur " + getUmur() + " tahun dan saya seorang mahasiswa. NIM saya adalah " + nim + ".";
    }
}
