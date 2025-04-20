package Praktikum_Inheritance;

import java.time.LocalDate;
//Class ini merupakan turunan dari parentnya, yakni Class Pekerja
//jadi class ini bisa mengakses semua method dan properti yang ada di Class Pekerja
public class Manager extends Pekerja{
    private String departemen;

    public Manager (String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen){
        //memanggil atribut dari class Pekerja
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }

    public String getDepartemen(){
        return departemen;
    }

    //memodifikasi method getPendapatan dari Class Pekerja
    //kemudian mengembalikannya dengan nilai baru yakni getPendapatan (dari Pekerja) + 10% dari gaji
    @Override
    public double getPendapatan(){
       return super.getPendapatan() + (0.1 * getGaji());
    }

    //memodifikasi output dari method toString milik dari Class Pekerja, dengan menambahkan output baru dari Class ini
    @Override
    public String toString(){
        return super.toString() + "\nDepartemen       : " + getDepartemen();
    }
}
