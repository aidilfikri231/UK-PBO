public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Alice", 20, "S12345");
        System.out.println(mahasiswa1.perkenalan());

        // Membuat objek Guru
        Guru guru1 = new Guru("Bob", 35, "Guru", "Matematika");
        System.out.println(guru1.perkenalan());

        // Membuat objek Staf
        Staf staf1 = new Staf("Charlie", 40, "Administrator", "HRD");
        System.out.println(staf1.perkenalan());

        // Demonstrasi Overloading Konstruktor dan Setter/Getter
        mahasiswa1.setNama("Alicia");
        System.out.println(mahasiswa1.getNama());

        guru1.setMataPelajaran("IPA");
        System.out.println(guru1.getMataPelajaran());

        staf1.setDepartemen("Keuangan");
        System.out.println(staf1.getDepartemen());
    }
}
