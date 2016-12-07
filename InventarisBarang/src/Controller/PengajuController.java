package Controller;

import Model.Application;
import Model.Pengajuan;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import view.PengajuBarangPanel;
import view.PengajuHomePanel;
import view.PengajuMutasiPanel;
import view.PengajuView;

/**
 * @author ISAS
 */
public class PengajuController extends Controller {
    
    public JPanel contentPanel;
    
    public PengajuController(Application app){
        super(app, new PengajuView());
    }

    @Override
    public void start() {        
        PengajuView view = (PengajuView) super.view;
        //Card List
        JPanel viewPengajuan = new PengajuHomePanel();
        JPanel pengajuanBarang = new PengajuBarangPanel();
        JPanel pengajuanMutasi = new PengajuMutasiPanel();
        
        contentPanel = view.getContent();        
        contentPanel.add(viewPengajuan, "HOME");
        contentPanel.add(pengajuanBarang, "BARANG");
        contentPanel.add(pengajuanMutasi, "MUTASI");
        view.getCardLayout().show(contentPanel, "HOME");
        view.setVisible(true);
        
        app.setListPengajuan(app.getDatabase().loadPengajuan());
        DefaultTableModel tablePengajuan = (DefaultTableModel) ((PengajuHomePanel) viewPengajuan).getTabelPengajuan().getModel();
        setTableContent(app.getListPengajuan(), tablePengajuan);
        
        //OnClick
        view.getBtnPengajuanBarang().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getCardLayout().show(contentPanel, "BARANG");
                view.setVisible(true);
            }    
        });
        view.getBtnPengajuanMutasi().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getCardLayout().show(contentPanel, "MUTASI");
                view.setVisible(true);
            }    
        });
        view.getBtnViewPengajuan().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                app.setListPengajuan(app.getDatabase().loadPengajuan());
                setTableContent(app.getListPengajuan(), tablePengajuan);
                view.getCardLayout().show(contentPanel, "HOME");
                view.setVisible(true);
            }    
        });
        ((PengajuBarangPanel) pengajuanBarang).getSubmitButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Pengajuan newPengajuan = new Pengajuan(app.getAuthUser().getIdPegawai(),
                    ((PengajuBarangPanel) pengajuanBarang).getKategoriBarang(),
                    ((PengajuBarangPanel) pengajuanBarang).getJumlahBarang(),
                    ((PengajuBarangPanel) pengajuanBarang).getKeterangan(),
                    "VERIFIKASI KOORDINATOR");
                app.getDatabase().insertPengajuan(newPengajuan);
            }
        });
    }

    @Override
    public void stop() {
        super.view.dispose();
    }
    
    public void setTableContent(ArrayList<Pengajuan> listPengajuan, DefaultTableModel tableModel){
        tableModel.setRowCount(0); //clearing all row before
        if(listPengajuan.size() > 0){
            for(Pengajuan pengajuan : listPengajuan){
                //System.out.println(app.getAuthUser().getIdPegawai()+"ASD");
                if(app.getAuthUser().getIdPegawai() == pengajuan.getIdPengaju()){                    
                    String ver_koor = "Belum";
                    String ver_dekan = "Belum";
                    if(pengajuan.isVerif_koor()) ver_koor = "Sudah";
                    if(pengajuan.isVerif_dekan()) ver_dekan = "Sudah";
                    tableModel.addRow(new Object[]{
                        String.valueOf(pengajuan.getIdPengaju()),
                        String.valueOf(pengajuan.getTipeBarang()),
                        ver_koor,
                        ver_dekan
                    });
                }
            }
        }
    }
    
}
