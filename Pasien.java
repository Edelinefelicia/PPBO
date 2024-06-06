public class Pasien extends Orang {
    private String pekerjaan, domisili;


    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public Pasien(String nama, String tanggal_lahir, JenisKelamin gender, String pekerjaan, String domisili) {
        super(nama, tanggal_lahir, gender);
        this.pekerjaan = pekerjaan;
        this.domisili = domisili;
    }
    public void daftar(RumahSakit rs, String keluhan, String namaDokter, Antrian.TipePasien tipepasien) {
        rs.tambahAntrianPasien(this, keluhan, namaDokter,tipepasien);

    }
    public void periksa(RumahSakit rs){
        rs.kurangipasien(this);
    }
}
