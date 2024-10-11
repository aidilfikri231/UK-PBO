public class Staf extends Person {
    private String departemen;
    private String profesi;

    public Staf(String nama, int umur, String profesi, String departemen) {
        super(nama, umur);
        this.profesi = profesi;  // Mengambil inheritance dari kelas Pekerjaan
        this.departemen = departemen;
    }

    // Getter dan Setter untuk departemen
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public String perkenalan() {  // Overriding Method
        return "Nama saya " + getNama() + ", saya bekerja di departemen " + departemen + ", dan profesi saya adalah " + profesi + ".";
    }
}
