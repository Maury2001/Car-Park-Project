
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class login {
    //login method

    void login() {

        String user, pass;

        user = JOptionPane.showInputDialog(null, "ENTER USERNAME:", "CAR PARK", JOptionPane.QUESTION_MESSAGE);
        pass = JOptionPane.showInputDialog(null, "ENTER PASSWORD:", "CAR PARK", JOptionPane.QUESTION_MESSAGE);

        FilesDb log = new FilesDb();
        log.verify(user, pass);

    }

//registration method
    void reg() {

        String user, pass;

        user = JOptionPane.showInputDialog(null, "ENTER USERNAME:", "CAR PARK", JOptionPane.QUESTION_MESSAGE);
        pass = JOptionPane.showInputDialog(null, "ENTER PASSWORD:", "CAR PARK", JOptionPane.QUESTION_MESSAGE);

        FilesDb log = new FilesDb();
        log.createFile(user, pass);

    }
}
