import java.util.ArrayList;

public class Dokter extends Orang {
    private String idDokter, nomorSTR, spesialis;
    public ArrayList<Pasien> listPasienku;


    public Dokter(String nama, String tanggal_lahir, JenisKelamin gender,  String nomorSTR, String spesialis) {
        super(nama, tanggal_lahir, gender);
        this.nomorSTR = nomorSTR;
        this.spesialis = spesialis;
        listPasienku = new ArrayList<Pasien>();
    }
    public void daftar(RumahSakit rs){
        rs.tambahDokter(this);

    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getNomorSTR() {
        return nomorSTR;
    }

    public void setNomorSTR(String nomorSTR) {
        this.nomorSTR = nomorSTR;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
}
