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
public abstract class User {
    private int idPegawai;
    private String username;
    private String password;
    private String nama;
    private String jabatan;

    public User(int idPegawai, String username, String password, String nama, String jabatan) {
        this.idPegawai = idPegawai;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public abstract void setJabatan(String jabatan);
}
