package Controller;

import Model.Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import view.DekanHomePanel;
import view.DekanLaporanPengajuanPanel;
import view.DekanLaporanStatusBarang;
import view.DekanLaporanTahunanPanel;
import view.DekanView;
import view.PengajuBarangPanel;
import view.PengajuHomePanel;
import view.PengajuMutasiPanel;
import view.PengajuView;

/**
 * @author ISAS
 */

public class DekanController extends Controller {
    public JPanel contentPanel;
    
    public DekanController(Application app){
        super(app, new DekanView());
    }

    @Override
    public void start() {        
        DekanView view = (DekanView) super.view;
        //Card List
        JPanel verifikasiPengajuan = new DekanHomePanel();
        JPanel laporanTahunan = new DekanLaporanTahunanPanel();
        JPanel laporanPengajuan = new DekanLaporanPengajuanPanel();
        JPanel laporanBarang = new DekanLaporanStatusBarang();
        
        contentPanel = view.getContent();        
        contentPanel.add(verifikasiPengajuan, "HOME");
        contentPanel.add(laporanTahunan, "L. TAHUNAN");
        contentPanel.add(laporanPengajuan, "L. PENGAJUAN");
        contentPanel.add(laporanBarang, "L. BARANG");
        view.getCardLayout().show(contentPanel, "HOME");
        view.setVisible(true);
        
        //OnClick
        view.getBtnVerifikasiPengajuan().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getCardLayout().show(contentPanel, "HOME");
                view.setVisible(true);
            }    
        });
        view.getBtnLaporanTahunan().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getCardLayout().show(contentPanel, "L. TAHUNAN");
                view.setVisible(true);
            }    
        });
        view.getBtnLaporanPengajuan().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getCardLayout().show(contentPanel, "L. PENGAJUAN");
                view.setVisible(true);
            }    
        });
        view.getBtnLaporanBarang().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getCardLayout().show(contentPanel, "L. BARANG");
                view.setVisible(true);
            }    
        });
    }

    @Override
    public void stop() {
        super.view.dispose();
    }
}
