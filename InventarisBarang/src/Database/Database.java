package Database;

import Model.Dekan;
import Model.KoorPengadaan;
import Model.Logistik;
import Model.Pengaju;
import Model.Pengajuan;
import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author User
 */

public class Database {
    
    public Connection connection;
    public Statement statement;
    
    public void connectToDatabase(String URL){
        try {
            System.out.println("Connecting...");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,"root","");
            System.out.println("Connection Success!");
            //return true;
        }
        catch(SQLException e) {
            e.printStackTrace();
            //return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<User> loadUser(){
        try {
            System.out.println("Loading data ...");
            ResultSet resultSet;
            statement = connection.createStatement();
            ArrayList<User> listUser = new ArrayList<>();
            String sqlCommand;
            sqlCommand = "SELECT * FROM USER WHERE JABATAN='PENGAJU'";                     
            resultSet = statement.executeQuery(sqlCommand);
            while(resultSet.next()){
                listUser.add(new Pengaju(
                                resultSet.getInt("idPegawai"),
                                resultSet.getString("username"),
                                resultSet.getString("password"),
                                resultSet.getString("nama"),
                                resultSet.getString("jabatan")
                            ));
            }
            sqlCommand = "SELECT * FROM USER WHERE JABATAN='KOORPENGADAAN'";                     
            resultSet = statement.executeQuery(sqlCommand);
            while(resultSet.next()){
                listUser.add(new KoorPengadaan(
                                resultSet.getInt("idPegawai"),
                                resultSet.getString("username"),
                                resultSet.getString("password"),
                                resultSet.getString("nama"),
                                resultSet.getString("jabatan")
                            ));
            }
            sqlCommand = "SELECT * FROM USER WHERE JABATAN='DEKAN'";                     
            resultSet = statement.executeQuery(sqlCommand);
            while(resultSet.next()){
                listUser.add(new Dekan(
                                resultSet.getInt("idPegawai"),
                                resultSet.getString("username"),
                                resultSet.getString("password"),
                                resultSet.getString("nama"),
                                resultSet.getString("jabatan")
                            ));
            }
            sqlCommand = "SELECT * FROM USER WHERE JABATAN='LOGISTIK'";                     
            resultSet = statement.executeQuery(sqlCommand);
            while(resultSet.next()){
                listUser.add(new Logistik(
                                resultSet.getInt("idPegawai"),
                                resultSet.getString("username"),
                                resultSet.getString("password"),
                                resultSet.getString("nama"),
                                resultSet.getString("jabatan")
                            ));
            }
            System.out.println("Loading success!");
            return listUser;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Loading failed!");
            return null;
        }
    }
    
    public ArrayList<Pengajuan> loadPengajuan(){
        try {
            System.out.println("Loading data ...");
            ResultSet resultSet;
            statement = connection.createStatement();
            ArrayList<Pengajuan> listPengajuan = new ArrayList<>();
            String sqlCommand;
            sqlCommand = "SELECT * FROM PENGAJUAN";                     
            resultSet = statement.executeQuery(sqlCommand);
            while(resultSet.next()){
                listPengajuan.add(new Pengajuan(
                    resultSet.getInt(1),
                    resultSet.getBoolean(2),
                    resultSet.getBoolean(3),    
                    resultSet.getLong(4),
                    resultSet.getString(5),
                    resultSet.getInt(6),
                    resultSet.getString(7),
                    resultSet.getDate(8),    
                    resultSet.getInt(9),
                    resultSet.getString(10),
                    resultSet.getInt(11)    
                ));
            }
            return listPengajuan;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }    
    }

    public void insertPengajuan(Pengajuan pengajuan) {
        try {
            String sqlCommand;
            sqlCommand = "INSERT INTO PENGAJUAN (TIPEBARANG, JUMLAHBARANG, KETERANGAN, STATUSPENGAJUAN , ID_PENGAJU) VALUES ('" +
                    pengajuan.getTipeBarang() + "'," +
                    pengajuan.getJumlahBarang() + ",'" +
                    pengajuan.getKeterangan() + "','" +
                    pengajuan.getStatusPengajuan()+ "'," +
                    pengajuan.getIdPengaju() + ")";
            statement.executeUpdate(sqlCommand);
            System.out.println("Insert success!");
        } catch (SQLException ex) {
            System.out.println("Insert failed!");
            ex.printStackTrace();
        }
    }
}
