package Controller;

import Model.Application;
import Model.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.LoginView;

/**
 *
 * @author ISAS
 */
public class LoginController extends Controller {
    
    public LoginController(Application app) {
        super(app, new LoginView());
    }
    
    @Override
    public void start(){
        super.view.setVisible(true);
        app.setListUser(app.getDatabase().loadUser());
        LoginView view = (LoginView) super.view;
        view.getBtnLogin().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = view.getTxtUsername().getText();
                String password = new String(view.getTxtPassword().getPassword());
                User tryLogin = doLogin(app.getListUser(),username,password);
                if(tryLogin == null) JOptionPane.showMessageDialog(view, "Username atau Password salah!");
                else {
                    app.setAuthUser(tryLogin);
                    if(tryLogin.getJabatan().equals("PENGAJU")) new PengajuController(app);
                    else if(tryLogin.getJabatan().equals("KOORPENGADAAN")) new DekanController(app);
                    else if(tryLogin.getJabatan().equals("DEKAN")) new DekanController(app);
                    else if(tryLogin.getJabatan().equals("LOGISTIK")) new DekanController(app);
                    stop();
                }
            }            
        });
    }

    @Override
    public void stop() {
        super.view.dispose();
    }
    
    public User doLogin(ArrayList<User> listUser, String username, String password){
        System.out.println(username + password);
        for(User user : listUser){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){ 
                return user;
            }
        }
        return null;
    }
}
