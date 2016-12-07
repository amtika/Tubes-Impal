package Model;

/**
 * @author User
 */
public class Barang  {
    private String idBarang;
    private boolean status;
    private int jumlah;
    private String namaBarang;

    public Barang(String idBarang, boolean status, int jumlah, String namaBarang) {
        this.idBarang = idBarang;
        this.status = status;
        this.jumlah = jumlah;
        this.namaBarang = namaBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }    
}
