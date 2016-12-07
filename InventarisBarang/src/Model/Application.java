/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Application {
    
    private ArrayList<User> listUser = new ArrayList<>();
    private ArrayList<Pengajuan> listPengajuan = new ArrayList<>();
    private ArrayList<Barang> listBarang = new ArrayList<>();
    
    private Database database;
    private User authUser;
    
    public Application(){
        database = new Database();
        database.connectToDatabase("jdbc:mysql://localhost:3306/inventaris");
    }
    
    public Database getDatabase(){
        return database;
    }
    
    public void setAuthUser(User user){
        this.authUser = user;
    }
    
    public User getAuthUser(){
        return authUser;
    }
    
    
    
    /*
    public void createFile() {
        try {
            FileOutputStream fos = new FileOutputStream("user.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            fos = new FileOutputStream("barang.txt");
            oos = new ObjectOutputStream(fos);
            
            fos = new FileOutputStream("pengajuan.txt");
            oos = new ObjectOutputStream(fos);
            
        } catch (Exception e) {
            System.out.println("Gagal membuat file");
        }
    }
    
    public void cekFile() {
        File file1 = new File("user.txt");
        File file2 = new File("barang.txt");
        File file3 = new File("pengajuan.txt");
       
        
        if ((!file1.exists()) && (!file2.exists()) && (!file3.exists()) ) {
            createFile();
        }
    }
    
    public boolean cekIdBarang(String id){
        for (int i = 0; i < barang.size(); i++) {
            if (barang.get(i).getIdBarang().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean cekIdUser(int id){
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getIdPegawai() == id) {
                return true;
            }
        }
        return false;
    }
    
    public boolean cekIdPengajuan(String id){
        for (int i = 0; i < pengajuan.size(); i++) {
            if (pengajuan.get(i).getIdPengaju().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    public void saveUserToFile(ArrayList<User> user) {
        try {
            FileOutputStream fos = new FileOutputStream("user.txt",false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.flush();
        } catch (Exception e) {
        }
    }
    
    public void saveBarangToFile(ArrayList<Barang> barang) {
        try {
            FileOutputStream fos = new FileOutputStream("barang.txt",false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.flush();
        } catch (Exception e) {
        }
    }
    
    public void savePengajuanToFile(ArrayList<Pengajuan> pegajuan) {
        try {
            FileOutputStream fos = new FileOutputStream("pengajuan.txt",false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.flush();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Barang> getBarangFromFile() {
        try {
            FileInputStream fis = new FileInputStream("barang.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            return (ArrayList<Barang>) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
    
    public ArrayList<Pengajuan> getPengajuanFromFile() {
        try {
            FileInputStream fis = new FileInputStream("pengajuan.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            return (ArrayList<Pengajuan>) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
    
    public ArrayList<User> getUserFromFile() {
        try {
            FileInputStream fis = new FileInputStream("user.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            return (ArrayList<User>) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
    */

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    public ArrayList<Pengajuan> getListPengajuan() {
        return listPengajuan;
    }

    public void setListPengajuan(ArrayList<Pengajuan> listPengajuan) {
        this.listPengajuan = listPengajuan;
    }

    public ArrayList<Barang> getListBarang() {
        return listBarang;
    }

    public void setListBarang(ArrayList<Barang> listBarang) {
        this.listBarang = listBarang;
    }
}
