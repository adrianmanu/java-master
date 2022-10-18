package ec.edu.espe.virtualgamestore.view;

import ec.edu.espe.virtualgamestore.controller.UserManager;
import java.io.IOException;

/**
 *
 * @author JavaMasters
 */
public class VirtualGameStoreSystem {

    public static void main(String[] args) throws IOException {
        UserManager user = new UserManager();
        user.viewMenu();

    }
}
