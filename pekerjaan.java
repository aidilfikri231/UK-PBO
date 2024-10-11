public class Pekerjaan {
    protected String profesi;

    public Pekerjaan(String profesi) { // Konstruktor
        this.profesi = profesi;
    }

    public String deskripsiPekerjaan() {  // Polimorfisme
        return "Profesi saya adalah " + profesi + ".";
    }
}
