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
public class Dekan extends User {

    public Dekan(int idPegawai, String username, String password, String nama, String jabatan) {
        super(idPegawai, username, password, nama, jabatan);
    }

    @Override
    public void setJabatan(String jabatan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
