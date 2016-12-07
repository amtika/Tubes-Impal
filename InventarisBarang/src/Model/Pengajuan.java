/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Pengajuan {
    private int idPengajuan;
    private int idPengaju;
    private boolean verif_koorpengadaan;
    private boolean verif_dekan;
    private long biaya;
    private String tipeBarang;
    private int jumlahBarang;
    private String statusPengajuan;
    private File buktiPengajuan;
    private Date timestamp;
    private String keterangan;
    private ArrayList<Barang> barang = new ArrayList<>();

    public Pengajuan(int idPengajuan, String tipeBarang, int jumlahBarang, String keterangan, String status) {
        this.idPengajuan = idPengajuan;
        this.tipeBarang = tipeBarang;
        this.jumlahBarang = jumlahBarang;
        this.keterangan = keterangan;
        this.statusPengajuan = status;
    }

    public Pengajuan(int idPengajuan, boolean verif_koorpengadaan, boolean verif_dekan, long biaya, String tipeBarang, int jumlahBarang, String statusPengajuan, Date date, int idbarang, String keterangan, int idpengaju) {
        this.idPengajuan = idPengajuan;
        this.verif_koorpengadaan = verif_koorpengadaan;
        this.verif_dekan = verif_dekan;
        this.biaya = biaya;
        this.tipeBarang = tipeBarang;
        this.jumlahBarang = jumlahBarang;
        this.statusPengajuan = statusPengajuan;
        this.timestamp = date;
        this.keterangan = keterangan;
        this.idPengaju = idpengaju;
    }

    public int getIdPengaju() {
        return idPengaju;
    }

    public void setIdPengaju(int idPengaju) {
        this.idPengaju = idPengaju;
    }

    public boolean isVerif_dekan() {
        return verif_dekan;
    }

    public void setVerif_dekan(boolean verif_dekan) {
        this.verif_dekan = verif_dekan;
    }
    
    public boolean isVerif_koor() {
        return verif_koorpengadaan;
    }

    public void setVerif_koor(boolean verif_koor) {
        this.verif_koorpengadaan = verif_koor;
    }

    public long getBiaya() {
        return biaya;
    }

    public void setBiaya(long biaya) {
        this.biaya = biaya;
    }

    public String getTipeBarang() {
        return tipeBarang;
    }

    public void setTipeBarang(String tipeBarang) {
        this.tipeBarang = tipeBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String getStatusPengajuan() {
        return statusPengajuan;
    }

    public void setStatusPengajuan(String statusPengajuan) {
        this.statusPengajuan = statusPengajuan;
    }

    public File getBuktiPengajuan() {
        return buktiPengajuan;
    }

    public void setBuktiPengajuan(File buktiPengajuan) {
        this.buktiPengajuan = buktiPengajuan;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /*public void tambahBarang(){
        barang.add(new Barang(barang.size()+1+"",true, jumlahBarang, jenisBarang));
    }*/

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public void inputBuktiPengadaan(){
        
    }
    public void verifDekan(boolean verif_dekan){
    }
    public void verif_koorPengadaan(){
        
    }
    public void updatePengajuan(){
        
    }
}
