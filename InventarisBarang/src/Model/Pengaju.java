/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Pengaju extends User {
    private Pengajuan pengajuan;
    private Mutasi mutasi;

    public Pengaju(int idPegawai, String username, String password, String nama, String jabatan) {
        super(idPegawai, username, password, nama, jabatan);
    }

    @Override
    public void setJabatan(String jabatan) {
        
    }
    public void tambahPengajuan(Pengajuan pengajuan){
        
    }
    public void dropPengajuan(){
        
    }
    public void tambahMutasi(Mutasi mutasi){
    
    }
    public void dropMutasi(){
        
    }
}
