package praktikumPBO;

public class SIAM {

    public static void main(String[] args) {

        //Mahasiswa 1
        Mahasiswa mahasiswa1 = new Mahasiswa("Rangga", "205150200111008", "Teknik Informatika");
        mahasiswa1.setAlamat("Jakarta");
        mahasiswa1.setGender("Laki-Laki");
        mahasiswa1.setNA(89);

        //Mahasiswa 2
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNama("Ezra");
        mahasiswa2.setNIM("59839303");
        mahasiswa2.setProdi("Teknik Informatika");
        mahasiswa2.setGender("Laki-Laki");
        mahasiswa2.setAlamat("Malang");;
        mahasiswa2.setNA(70);

        //Mahasiswa 3
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.setNama("Sahla");
        mahasiswa3.setNIM("2385738358");
        mahasiswa3.setProdi("Teknik Komputer");
        mahasiswa3.setGender("Perempuan");
        mahasiswa3.setAlamat("Cengkareng");
        mahasiswa3.setNA(85);

        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.setNama("Faris");
        mahasiswa4.setNIM("2385738358");
        mahasiswa4.setProdi("Kesejahteraan Sosial");
        mahasiswa4.setGender("Laki-Laki");
        mahasiswa4.setAlamat("Joglo");
        mahasiswa4.setNA(80);


        System.out.println("Mahasiswa 1");
        System.out.println(mahasiswa1);
        mahasiswa1.kelulusan();
        System.out.println();

        System.out.println("Mahasiswa 2");
        System.out.println(mahasiswa2);
        mahasiswa2.kelulusan();
        System.out.println();

        System.out.println("Mahasiswa 3");
        System.out.println(mahasiswa3);
        mahasiswa3.kelulusan();
        System.out.println();

        System.out.println("Mahasiswa 4");
        System.out.println(mahasiswa4);
        mahasiswa4.kelulusan();
        System.out.println();

        Mahasiswa.totalMahasiswa();


    }
}
