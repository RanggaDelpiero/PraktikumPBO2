package praktikumPBO;

public class Mahasiswa {

    String Nama;
    String NIM;
    String alamat;
    String gender;
    String Prodi;
    int NA;
    private final int kkm = 80;
    private static int count = 0;

    public Mahasiswa(String Nama, String NIM, String Prodi) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
        count++;
    }
    public Mahasiswa(String Nama,String NIM, String Prodi, String gender, String alamat, int NA) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
        this.gender = gender;
        this.alamat = alamat;
        this.NA = NA;
        count++;
    }

    public Mahasiswa() {
        count++;
    }

    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getProdi() {
        return Prodi;
    }
    public void setProdi(String prodi) {
        Prodi = prodi;
    }
    public int getNA() {
        return NA;
    }
    public void setNA(int NA) {
        this.NA = NA;
    }

    public static int getCount() {
        return count;
    }
    public static void totalMahasiswa() {
        System.out.println("Jumlah mahasiswa yang terdaftar : " + Mahasiswa.getCount());
    }

    public void kelulusan() {
        if (this.NA >= 85 ) {
            System.out.println("Mahasiswa ini lulus");
        } else if (this.NA < 85) {
            System.out.println("Mahasiswa ini tidak lulus");
        }
    }

    public String toString() {
        return "Nama \t\t\t: " + this.getNama()+
                "\nNIM \t\t\t: " + this.getNIM()+
                "\nProgram Studi \t: " + this.getProdi()+
                "\nAlamat \t\t\t: " + this.getAlamat()+
                "\nJenis Kelamin \t: " + this.getGender()+
                "\nNilai Akhir \t: " + this.getNA();
    }

}
