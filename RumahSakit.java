import java.util.ArrayList;

public class RumahSakit {
    private String nama,alamat,noTelepon;
    public static ArrayList<Dokter> listDokter = new ArrayList<Dokter>();
    public static ArrayList<Pasien> listantrianPasien = new ArrayList<Pasien>();
    private  int urutan;
//    private ArrayList<>

    public RumahSakit(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.urutan=0;
    }
    public void cekListDokter() {
        if(listDokter != null) {

            if(listDokter.size() > 0) {
                System.out.println("BERIKUT LIST DOKTER YANG TERSEDIA" + "\n"
                        + "==============================================" +"\n");
                for(Dokter dokter : listDokter) {
                    System.out.println(

                            listDokter.indexOf(dokter)+1 + ". Nama Dokter : " + dokter.getNama() +  ", Dokter spesialis : "
                                    + dokter.getSpesialis()
                    );
                }

            }else {
                System.out.println("BELUM ADA DOKTER YANG TERSEDIA SAAT INI");
            }
        }
    }

    public void tambahDokter(Dokter orangdokter){
        if(!listDokter.contains(orangdokter)){
            listDokter.add(orangdokter);
            orangdokter.setIdDokter("D_"+ orangdokter.getSpesialis() + "_" +(listDokter.indexOf(orangdokter)+1));
            System.out.println("SUKSES");
        }else{
            System.out.println("DOKTER SUDAH TERDAFTAR");
        }

    }
    public void tambahAntrianPasien(Pasien pasien, String keluhan, String namaDokter, Antrian.TipePasien tipepasien){
//        for(Pasien list: Dokter.listPasienku){
//            System.out.println(list.getNama());
//        }
//        if(!Dokter.listPasienku.contains(pasien)){
            for(Dokter dokter:listDokter){
                if(!dokter.listPasienku.contains(pasien)) {

                    if (dokter.getNama() == namaDokter) {
                        listantrianPasien.add(pasien);
                        dokter.listPasienku.add(pasien);
                        System.out.println("SUKSES");
                        break;
                    }
                    if (listDokter.indexOf(dokter) == listDokter.size() - 1) {
                        System.out.println("DOKTER TERSEBUT TIDAK TERSEDIA");
                    }
                }else{
                    System.out.println("PASIEN SUDAH TERDAFTAR");
                }
            }

    }

    public void kurangipasien(Pasien pasien){
        if(listantrianPasien.contains(pasien)){
            for(Dokter dokter:listDokter){
                if(dokter.listPasienku.contains(pasien)){
                    if(dokter.listPasienku.indexOf(pasien)==0){
                        dokter.listPasienku.remove(pasien);
                        listantrianPasien.remove(pasien);
                        System.out.println("SUKSES");
                    }else {
                        System.out.println("BELUM SAAT PERIKSA");
                    }
                }
            }
        }else {
            System.out.println("BELUM TERDAFTAR");
        }

    }

    public void cekAntrianPasien(){
        System.out.println("ANTRIAN RUMAH SAKIT");
        System.out.println("=============================");
        if(listDokter.size() != 0){
            for(Dokter dokter : listDokter) {
                System.out.println("DR." +dokter.getNama());
                if (dokter.listPasienku.size()!= 0) {
                    for(Pasien pasien : dokter.listPasienku) {
                        System.out.println("ID ANTRIAN : " + dokter.getIdDokter() + "_" + (urutan+1) + ", ATAS NAMA : " + pasien.getNama());
                        System.out.println("=============================");
                    }

                }else {
                    System.out.println("ANTRIAN KOSONG");
                    System.out.println("=============================");

                }


            }
        }

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
}
