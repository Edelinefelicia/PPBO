public class Orang {
    private String nama, tanggal_lahir;
    enum JenisKelamin{
        LAKI_LAKI, PEREMPUAN;
    }
    private JenisKelamin gender;

    public Orang(String nama, String tanggal_lahir, JenisKelamin gender) {
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public JenisKelamin getGender() {
        return gender;
    }

    public void setGender(JenisKelamin gender) {
        this.gender = gender;
    }
}
