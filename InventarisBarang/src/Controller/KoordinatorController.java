package Controller;

import Model.Application;
import Model.Pengajuan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import view.KoordinatorHomePanel;
import view.KoordinatorView;

/**
 *
 * @author ISAS
 */
public class KoordinatorController extends Controller{

    public JPanel contentPanel;
    
    public KoordinatorController(Application app){
        super(app, new KoordinatorView());
    }

    @Override
    public void start() {        
        KoordinatorView view = (KoordinatorView) super.view;
        //Card List
        JPanel viewPengajuan = new KoordinatorHomePanel();
        //JPanel pengajuanBarang = new KoordinatorBarangPanel();
        //JPanel pengajuanMutasi = new KoordinatorMutasiPanel();
        
        contentPanel = view.getContent();        
        contentPanel.add(viewPengajuan, "HOME");
        //contentPanel.add(pengajuanBarang, "BARANG");
        //contentPanel.add(pengajuanMutasi, "MUTASI");
        view.getCardLayout().show(contentPanel, "HOME");
        view.setVisible(true);
        
        app.setListPengajuan(app.getDatabase().loadPengajuan());
        DefaultTableModel tablePengajuan = (DefaultTableModel) ((KoordinatorHomePanel) viewPengajuan).getTable().getModel();
        setTableContent(app.getListPengajuan(), tablePengajuan);
        
        //OnClick
        view.getBtnUpdateStatus().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                app.setListPengajuan(app.getDatabase().loadPengajuan());
                setTableContent(app.getListPengajuan(), tablePengajuan);
                view.getCardLayout().show(contentPanel, "HOME");
                view.setVisible(true);
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
                if(!pengajuan.isVerif_koor()){                    
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
