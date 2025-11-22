public class Mahasiswa { private String nama; private String nim;

    public Mahasiswa(String nama, String nim) {
        this.setNama(nama);
        this.setNim(nim);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim.matches("\\d{11}")) {
            this.nim = nim;
        } else {
            System.out.println("Data Mahasiswa");
        }
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa("Angeli Khairunissa", "32602400073");
        System.out.println("Nama : " + m.getNama());
        System.out.println("NIM  : " + m.getNim());
    }

}

