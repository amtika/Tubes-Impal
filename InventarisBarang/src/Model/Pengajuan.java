/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.util.Date;

/**
 *
 * @author User
 */
public class Pengajuan {
    private String idPengaju;
    private boolean verif_dekan;
    private long biaya;
    private String tipeBarang;
    private int jumlahBarang;
    private String jenisBarang;
    private String statusPengajuan;
    private File buktiPengajuan;
    private Date timestamp;
    private Barang barang;

    public Pengajuan(String idPengaju, long biaya, String tipeBarang, int jumlahBarang, String jenisBarang) {
        this.idPengaju = idPengaju;
        this.biaya = biaya;
        this.tipeBarang = tipeBarang;
        this.jumlahBarang = jumlahBarang;
        this.jenisBarang = jenisBarang;
    }

    public String getIdPengaju() {
        return idPengaju;
    }

    public void setIdPengaju(String idPengaju) {
        this.idPengaju = idPengaju;
    }

    public boolean isVerif_dekan() {
        return verif_dekan;
    }

    public void setVerif_dekan(boolean verif_dekan) {
        this.verif_dekan = verif_dekan;
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

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
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

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
    public void tambahBarang(Barang barang){
        
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
