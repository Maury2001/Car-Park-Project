import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */

public class CarParkSystem {

    //main method
    public static void main(String args[]) {

        System.out.println("WELCOME!!");
        int action = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose action:\n 1.LOGIN\n 2.REGISTER\n", "CAR PARK ", JOptionPane.QUESTION_MESSAGE));

        switch (action) {
            case 1:
                login user = new login();
                user.login();
                break;

            case 2:
                login nUser = new login();
                nUser.reg();
                break;

            default:
                JOptionPane.showMessageDialog(null, "!!ERROR!!", "NOT VERIFIED", JOptionPane.ERROR_MESSAGE);
                System.out.print("!!ERROR!!");
                break;

        }

    }
}
