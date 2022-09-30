
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author DELL
 */


public class Park {

    //park method
    static void park() {     


          
        String name, id, vehicle, plate, slot;
        //time
        LocalTime time = LocalTime.now();

        name = JOptionPane.showInputDialog("ENTER NAME:");
        id = JOptionPane.showInputDialog("ENTER ID:");
        vehicle = JOptionPane.showInputDialog("ENTER VEHICLE:");
        plate = JOptionPane.showInputDialog("ENTER NO.PLATE:");
        slot = JOptionPane.showInputDialog("ENTER PARKING SLOT:");     

        JOptionPane.showMessageDialog(null, "Name:  " + name + "\n" + "Identification:  " + id + "\n" + "Vehicle Model:  " + vehicle + "\n" + "no. Plate:  " + plate + "\n" + "Parking Slot:  " + slot + "\n" + "Arrival Time:  " + time + "\n", "PARKING GRANTED", JOptionPane.INFORMATION_MESSAGE);

        System.out.println("Name:" + name);
        System.out.println("Identification:" + id);
        System.out.println("Vehicle Model:" + vehicle);
        System.out.println("no. Plate:" + plate);
        System.out.println("Parking Slot:" + slot);

    }
}