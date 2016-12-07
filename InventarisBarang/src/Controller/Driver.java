package Controller;

import Database.Database;
import Model.Application;

/**
 * @author User
 */
public class Driver {
    public static void main(String[] args) {
        Application app = new Application();
        new LoginController(app);
    }
}
