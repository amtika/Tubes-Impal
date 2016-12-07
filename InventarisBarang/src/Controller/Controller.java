package Controller;

import Model.Application;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ISAS
 */
public abstract class Controller {
    protected Application app;
    protected JFrame view;
    
    public Controller(Application app, JFrame view){
        this.app = app;
        this.view = view;
        this.start();
    }
    
    public abstract void start();
    public abstract void stop();
}
