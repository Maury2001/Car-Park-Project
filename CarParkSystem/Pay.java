
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */

    public class Pay {

    //pay method
    void pay() {

        //FilesDb.search();
        System.out.println("1.Staff\n2.Student\n3.Visitor");
        int act = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Staff\n2.Student\n3.Visitor", "CAR PARK", JOptionPane.QUESTION_MESSAGE));

        switch (act) {

            case 1:
                staffMethod();
                break;

            case 2:
                studentPay();
                break;

            case 3:
                visitorPay();
                break;

            default:
                JOptionPane.showMessageDialog(null, "!!ERROR!!", "NOT VERIFIED", JOptionPane.ERROR_MESSAGE);
                System.out.println("!!ERROR!!");
                break;

        }

    }

    //student pay
    static void studentPay() {

        LocalTime time = LocalTime.now();
        System.out.println("End Time:" + time);

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter time spent:"));
        int num2 = 50;

        JOptionPane.showMessageDialog(null, num1 * num2);
        JOptionPane.showMessageDialog(null, "Charge:" + num1 * num2 + "Ksh", "CAR PARK", JOptionPane.INFORMATION_MESSAGE);
        System.out.print("Charge:" + num1 * num2 + "Ksh");
    }

    //visitor pay method
    static void visitorPay() {

        LocalTime time = LocalTime.now();
        System.out.println("End Time:" + time);

        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Enter time spent:"));
        int num4 = 70;

        JOptionPane.showMessageDialog(null, num3 * num4);
        JOptionPane.showMessageDialog(null, "Charge:" + num3 * num4 + "Ksh", "CAR PARK", JOptionPane.INFORMATION_MESSAGE);
        System.out.print("Charge:" + num3 * num4 + "Ksh");

    }

    //staff
    static void staffMethod() {

        LocalTime myObj = LocalTime.now();
        System.out.println("End Time:" + myObj);

        JOptionPane.showMessageDialog(null, "No Charge\n" + "End Time:" + myObj, "CAR PARK", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("No Charge");
    }
}