public class Guru extends Person {
    private String mataPelajaran;
    private String profesi;

    public Guru(String nama, int umur, String profesi, String mataPelajaran) {
        super(nama, umur);
        this.profesi = profesi;  // Mengambil inheritance dari kelas Pekerjaan
        this.mataPelajaran = mataPelajaran;
    }

    // Getter dan Setter untuk mataPelajaran
    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    @Override
    public String perkenalan() {  // Overriding Method
        return "Nama saya " + getNama() + ", saya mengajar " + mataPelajaran + ", dan profesi saya adalah " + profesi + ".";
    }
}
